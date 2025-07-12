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
 */
package org.tomitribe.github.gen.openapi.normalize;

import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Path;
import org.tomitribe.github.gen.openapi.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class InlineResponseRefs implements Function<OpenApi, OpenApi> {

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi.getComponents() == null) return openApi;
        if (openApi.getComponents().getResponses() == null) return openApi;

        final Map<String, Response> responsesIndex = new HashMap<>(openApi.getComponents().getResponses());

        final Function<Response, Response> resolve = response -> {
            if (response.getRef() == null) return response;
            final String name = response.getRef().replaceAll(".*/", "");
            final Response result = responsesIndex.getOrDefault(name, response);
            final Response copy = new Response();
            copy.setContent(result.getContent());
            copy.setDescription(result.getDescription());
            copy.setHeaders(result.getHeaders());
            return copy;
        };

        openApi.getPaths().values().stream()
                .flatMap(Path::getMethods)
                .filter(method -> method.getResponses() != null)
                .forEach(method -> {
                    final Map<String, Response> updated = new HashMap<>();
                    method.getResponses().forEach((status, response) -> {
                        final Response value = resolve.apply(response);
                        value.setName(status);
                        updated.put(status, value);
                    });
                    method.setResponses(updated);
                });

        responsesIndex.clear();
        openApi.getComponents().setResponses(null);

        return openApi;
    }
}