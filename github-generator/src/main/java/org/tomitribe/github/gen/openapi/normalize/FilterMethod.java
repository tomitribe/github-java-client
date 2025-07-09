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

import lombok.AllArgsConstructor;
import org.tomitribe.github.gen.openapi.Method;
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Path;
import org.tomitribe.github.gen.openapi.Resource;
import org.tomitribe.github.gen.openapi.Webhook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class FilterMethod implements Function<OpenApi, OpenApi> {

    protected final Filter filter;


    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (filter == null) return openApi;

        if (openApi.getPaths() != null) {
            openApi.setPaths(filter(openApi::getPaths, Path::new));
        }

        if (openApi.getWebhooks() != null) {
            openApi.setWebhooks(filter(openApi::getWebhooks, Webhook::new));
        }

        return openApi;
    }

    private <PathOrWebhook extends Resource> Map<String, PathOrWebhook> filter(final Supplier<Map<String, PathOrWebhook>> resources,
                                                                               final Supplier<PathOrWebhook> supplier) {
        final Map<String, PathOrWebhook> filteredResources = new HashMap<>();

        for (final Map.Entry<String, PathOrWebhook> entry : resources.get().entrySet()) {
            final PathOrWebhook pathOrWebhook = entry.getValue();

            final List<Method> matching = pathOrWebhook.getMethods()
                    .filter(this::matches)
                    .collect(Collectors.toList());

            if (matching.isEmpty()) continue;

            final PathOrWebhook copy = supplier.get();

            copy.setName(entry.getKey());

            for (final Method method : matching) {
                copy.set(method.getName(), method);
            }

            filteredResources.put(entry.getKey(), copy);
        }

        return filteredResources;
    }

    protected abstract boolean matches(final Method method);


}
