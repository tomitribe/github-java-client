/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tomitribe.github.gen.openapi.normalize;

import org.tomitribe.github.gen.openapi.Content;
import org.tomitribe.github.gen.openapi.Header;
import org.tomitribe.github.gen.openapi.Method;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Parameter;
import org.tomitribe.github.gen.openapi.Path;
import org.tomitribe.github.gen.openapi.Schema;
import org.tomitribe.github.gen.openapi.Webhook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruneUnusedSchema implements Function<OpenApi, OpenApi> {

    static final Logger LOGGER = Logger.getLogger(PruneUnusedSchema.class.getSimpleName());

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi.getComponents() == null) return openApi;
        if (openApi.getComponents().getSchemas() == null) return openApi;
        if (openApi.getComponents().getSchemas().isEmpty()) return openApi;


        final List<Schema> schemas = new ArrayList<>();
        if (openApi.getPaths() != null) {
            openApi.getPaths().values().stream()
                    .flatMap(Path::getMethods)
                    .flatMap(this::getSchemas)
                    .forEach(schemas::add);
        }

        if (openApi.getWebhooks() != null) {
            openApi.getWebhooks().values().stream()
                    .flatMap(Webhook::getMethods)
                    .flatMap(this::getSchemas)
                    .forEach(schemas::add);
        }

        final Map<String, Schema> index = openApi.getComponents().getSchemas();
        final Resolver resolver = new Resolver(index);
        schemas.forEach(resolver::resolve);

        final Map<String, Schema> used = resolver.getRefs().stream()
                .map(this::getName)
                .map(index::get)
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(Schema::getName, Function.identity()));

        openApi.getComponents().setSchemas(used);

        return openApi;
    }

    private Stream<Schema> getSchemas(final Method method) {
        final List<Schema> schemas = new ArrayList<>();

        if (method.getParameters() != null) {
            method.getParameters()
                    .stream()
                    .map(Parameter::getSchema)
                    .filter(Objects::nonNull)
                    .forEach(schemas::add);
        }

        if (method.getRequestBody() != null && method.getRequestBody().getContent() != null) {
            method.getRequestBody().getContent().values().stream()
                    .map(Content::getSchema)
                    .filter(Objects::nonNull)
                    .forEach(schemas::add);
        }


        if (method.getResponses() != null) {
            method.getResponses().values().stream()
                    .filter(response -> response.getContent() != null)
                    .flatMap(response -> response.getContent().values().stream())
                    .map(Content::getSchema)
                    .filter(Objects::nonNull)
                    .forEach(schemas::add);
        }

        if (method.getResponses() != null) {
            method.getResponses().values().stream()
                    .filter(response -> response.getHeaders() != null)
                    .flatMap(response -> response.getHeaders().values().stream())
                    .map(Header::getSchema)
                    .filter(Objects::nonNull)
                    .forEach(schemas::add);
        }

        return schemas.stream();
    }

    class Resolver {

        private final Map<String, Schema> schemas;
        private final Set<String> refs = new HashSet<>();
        private final Set<Schema> seen = new HashSet<>();

        public Resolver(final Map<String, Schema> schemas) {
            this.schemas = schemas;
        }

        public Set<String> getRefs() {
            return refs;
        }

        public void resolve(final Schema schema) {
            if (seen.contains(schema)) {
                return;
            }
            seen.add(schema);

            if (schema.getRef() != null) {
                if (refs.contains(schema.getRef())) return;
                refs.add(schema.getRef());

                final String name = getName(schema.getRef());
                final Schema ref = schemas.get(name);
                if (ref == null) {
                    LOGGER.warning("Schema " + name + " not found");
                } else {
                    resolve(ref);
                }
            }

            collectSchemas(schema).forEach(this::resolve);
        }

        public Set<Schema> collectSchemas(final Schema root) {
            final Set<Schema> result = new LinkedHashSet<>();
            collectSchemas(root, result);
            return result;
        }

        private void collectSchemas(final Schema schema, final Set<Schema> result) {
            if (schema == null || result.contains(schema)) return;
            result.add(schema);

            // Recurse into properties
            if (schema.getProperties() != null) {
                for (Schema property : schema.getProperties().values()) {
                    collectSchemas(property, result);
                }
            }

            // Recurse into items (arrays)
            collectSchemas(schema.getItems(), result);

            // Recurse into additionalProperties
            if (schema.getAdditionalProperties() instanceof Schema) {
                collectSchemas((Schema) schema.getAdditionalProperties(), result);
            }

            if (schema.getAdditionalProperties() instanceof Map) {
                final Map<String, Object> additionalProperties = (Map<String, Object>) schema.getAdditionalProperties();
                if (additionalProperties.containsKey("$ref")) {
                    final Schema ref = Schema.builder()
                            .ref((String) additionalProperties.get("$ref"))
                            .build();
                    collectSchemas(ref, result);
                }
            }

            // allOf / anyOf / oneOf / not
            if (schema.getAllOf() != null) schema.getAllOf().forEach(s -> collectSchemas(s, result));
            if (schema.getAnyOf() != null) schema.getAnyOf().forEach(s -> collectSchemas(s, result));
            if (schema.getOneOf() != null) schema.getOneOf().forEach(s -> collectSchemas(s, result));
        }
    }

    private String getName(final String ref) {
        return ref.replaceAll(".*/", "");
    }
}
