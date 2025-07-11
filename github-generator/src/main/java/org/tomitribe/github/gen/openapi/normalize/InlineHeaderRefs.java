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

import org.tomitribe.github.gen.openapi.Header;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Path;
import org.tomitribe.github.gen.openapi.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class InlineHeaderRefs implements Function<OpenApi, OpenApi> {

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi.getComponents() == null || openApi.getComponents().getHeaders() == null) {
            return openApi;
        }

        final Map<String, Header> headerIndex = new HashMap<>(openApi.getComponents().getHeaders());

        openApi.getPaths().values().stream()
                .flatMap(Path::getMethods)
                .flatMap(method -> method.getResponses().values().stream())
                .map(Response::getHeaders)
                .filter(Objects::nonNull)
                .forEach(headers -> headers.replaceAll((name, header) -> {
                    if (header.getRef() == null) return header;

                    final String refName = header.getRef().replaceAll(".*/", "");
                    final Header resolved = headerIndex.get(refName);

                    return resolved != null ? resolved : header;
                }));

        headerIndex.clear();
        openApi.getComponents().setHeaders(null);

        return openApi;
    }
}