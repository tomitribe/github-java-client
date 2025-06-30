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

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.tomitribe.github.gen.openapi.Components;
import org.tomitribe.github.gen.openapi.Method;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Parameter;
import org.tomitribe.github.gen.openapi.Path;
import org.tomitribe.github.gen.openapi.Schema;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GraduateEnumsFromParameters implements Function<OpenApi, OpenApi> {
    @Override
    public OpenApi apply(final OpenApi openApi) {
        final List<Parameter> parameters = openApi.getPaths().values().stream()
                .flatMap(Path::getMethods)
                .map(Method::getParameters)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .filter(parameter -> parameter.getSchema() != null)
                .filter(this::isEnum)
                .collect(Collectors.toList());
        /*
         * No enums, nothing for us to do
         */
        if (parameters.isEmpty()) return openApi;

        if (openApi.getComponents() == null) openApi.setComponents(new Components());
        if (openApi.getComponents().getSchemas() == null) openApi.getComponents().setSchemas(new HashMap<>());

        final Map<String, Schema> schemas = openApi.getComponents().getSchemas();

        final Set<Enum> enums = schemas.values().stream()
                .filter(this::isEnum)
                .map(Enum::from)
                .collect(Collectors.toSet());

        for (final Parameter parameter : parameters) {
            final Enum enumm = Enum.from(parameter.getName(), parameter.getSchema());
            if (enums.contains(enumm)) {
                parameter.setSchema(Schema.builder()
                        .ref(enumm.getRef())
                        .build());
            } else if (!schemas.containsKey(enumm.getRef())) {
                schemas.put(enumm.getName(), enumm.asSchema());
                enums.add(enumm);
                parameter.setSchema(Schema.builder()
                        .ref(enumm.getRef())
                        .build());
            }
        }

        return openApi;
    }

    private @NotNull Map<String, @NotNull Enum> getEnums(final OpenApi openApi) {
        if (openApi.getComponents() == null) return new HashMap<>();
        if (openApi.getComponents().getSchemas() == null) return new HashMap<>();
        return openApi.getComponents().getSchemas().values().stream()
                .filter(this::isEnum)
                .map(Enum::from)
                .collect(Collectors.toMap(Enum::getName, Function.identity()));
    }

    private boolean isEnum(final Parameter parameter) {
        return isEnum(parameter.getSchema());
    }

    private boolean isEnum(final Schema schema) {
        return schema.getEnumValues() != null && !schema.getEnumValues().isEmpty();
    }

    @Data
    private static class Enum {
        private final String name;
        private final List<String> enumValues;

        public Enum(final String name, final List<String> enumValues) {
            this.enumValues = new ArrayList<>(enumValues);
            Collections.sort(enumValues);
            this.name = name;
        }

        public String getRef() {
            return "#/components/schemas/" + name;
        }

        public static Enum from(final Schema schema) {
            return new Enum(schema.getName(), schema.getEnumValues());
        }

        public static Enum from(final String name, final Schema schema) {
            return new Enum(name, schema.getEnumValues());
        }

        public Schema asSchema() {
            return Schema.builder()
                    .name(name)
                    .enumValues(enumValues)
                    .type("string")
                    .build();
        }
    }
}
