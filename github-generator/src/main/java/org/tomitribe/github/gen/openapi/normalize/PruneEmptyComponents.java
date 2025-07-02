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

import org.tomitribe.github.gen.openapi.OpenApi;

import java.util.Map;
import java.util.function.Function;

public class PruneEmptyComponents implements Function<OpenApi, OpenApi> {

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi.getComponents() == null) return openApi;
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
}
