/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.github.gen;

import lombok.Builder;
import lombok.Data;
import org.tomitribe.github.gen.code.endpoint.Endpoint;
import org.tomitribe.github.gen.code.model.ArrayClazz;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.VoidClazz;
import org.tomitribe.github.gen.code.source.Renderer;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.normalize.Filter;
import org.tomitribe.github.gen.openapi.normalize.Normalizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Data
@Builder(builderClassName = "Builder")
public class Generator {

    private final String modelPackage;
    private final String clientPackage;
    private final String webhookPackage;
    private final boolean generateModel;
    private final boolean generateClient;
    private final boolean generateWebhooks;
    private final Project project;
    private final OpenApi openApi;
    private final Filter webhooks;
    private final Filter paths;
    private final Filter categories;
    private final Filter subcategories;
    private final Filter operationId;

    public void generate() {
        final Generate generate = new Generate();

        if (generateClient) {
            generate.client();
        }

        if (generateWebhooks) {
            generate.webooks();
        }

        if (generateModel) {
            generate.model();
        }
    }

    class Generate {

        private final EndpointGenerator endpointGenerator = new EndpointGenerator(clientPackage, new ModelGenerator(modelPackage));
        private final List<Endpoint> endpointList;
        private final Renderer renderer;

        Generate() {

            final OpenApi normalized = Normalizer.builder()
                    .categories(categories)
                    .subcategories(subcategories)
                    .paths(paths)
                    .webhooks(webhooks)
                    .operationId(operationId)
                    .build().apply(openApi);

            this.endpointList = endpointGenerator.build(normalized);
            this.renderer = Renderer.builder()
                    .clientPackage(clientPackage)
                    .modelPackage(modelPackage)
                    .webhookPackage(webhookPackage)
                    .project(project)
                    .build();
        }


        public void client() {
            for (final Endpoint endpoint : endpointList) {
                renderer.render(endpoint);
            }
        }

        public void model() {
            final List<Clazz> classes = new ArrayList<>(endpointGenerator.getModelGenerator().getClasses());
            endpointList.stream()
                    .map(Endpoint::getMethods)
                    .flatMap(Collection::stream)
                    .flatMap(endpointMethod -> Stream.of(endpointMethod.getRequest(), endpointMethod.getResponse()))
                    .filter(Objects::nonNull)
                    .forEach(classes::add);

            classes.stream()
                    .map(this::replaceArrays)
                    .filter(clazz -> !(clazz instanceof VoidClazz))
                    .distinct()
                    .forEach(renderer::render);
        }

        public void webooks() {

        }

        private Clazz replaceArrays(final Clazz clazz) {
            if (clazz instanceof ArrayClazz) {
                final ArrayClazz arrayClazz = (ArrayClazz) clazz;
                return arrayClazz.getOf();
            }
            return clazz;
        }
    }
}
