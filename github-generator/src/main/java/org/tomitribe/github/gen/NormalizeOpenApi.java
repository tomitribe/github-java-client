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
package org.tomitribe.github.gen;

import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Parameter;
import org.tomitribe.github.gen.openapi.Path;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Our final data structure that is generated into Java code is a List of Endpoint and a List Clazz
 * Our goal is to flatten the OpenApi structure to that format as much as possible.
 *
 * Par
 */
public class NormalizeOpenApi {

    public static OpenApi normalize(final OpenApi openApi) {

        return Function.<OpenApi>identity()
                .andThen(NormalizeOpenApi::inlineParameterRefs)
                .andThen(NormalizeOpenApi::pruneComponents)
                .apply(openApi);
    }

    private static OpenApi pruneComponents(final OpenApi openApi) {
        if (isEmpty(openApi.getComponents().getExamples())) openApi.getComponents().setExamples(null);
        if (isEmpty(openApi.getComponents().getHeaders())) openApi.getComponents().setHeaders(null);
        if (isEmpty(openApi.getComponents().getParameters())) openApi.getComponents().setParameters(null);
        if (isEmpty(openApi.getComponents().getResponses())) openApi.getComponents().setResponses(null);
        if (isEmpty(openApi.getComponents().getSchemas())) openApi.getComponents().setSchemas(null);

        if (isEmpty(openApi.getComponents().getParameters()) &&
                isEmpty(openApi.getComponents().getExamples()) &&
                isEmpty(openApi.getComponents().getSchemas()) &&
                isEmpty(openApi.getComponents().getHeaders()) &&
                isEmpty(openApi.getComponents().getResponses())) {
            openApi.setComponents(null);
        }

        return openApi;
    }

    private static boolean isEmpty(final Map<String, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * Inline Parameter refs in methods
     */
    private static OpenApi inlineParameterRefs(final OpenApi openApi) {
        if (openApi.getComponents() == null) return openApi;
        if (openApi.getComponents().getParameters() == null) return openApi;

        final Map<String, Parameter> parametersIndex = openApi.getComponents().getParameters();

        final Function<Parameter, Parameter> resolve = parameter -> {
            final String name = parameter.getRef().replaceAll(".*/", "");
            return parametersIndex.getOrDefault(name, parameter);
        };

        openApi.getPaths().values().stream()
                .flatMap(Path::getMethods)
                .forEach(method -> {
                    method.setParameters(method.getParameters().stream()
                            .map(resolve)
                            .collect(Collectors.toList()));
                });

        parametersIndex.clear();
        openApi.getComponents().setParameters(null);

        return openApi;
    }

}
