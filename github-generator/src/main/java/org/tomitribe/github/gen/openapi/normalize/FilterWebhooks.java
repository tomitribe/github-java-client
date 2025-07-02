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
import org.tomitribe.github.gen.openapi.OpenApi;
import org.tomitribe.github.gen.openapi.Webhook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FilterWebhooks implements Function<OpenApi, OpenApi> {

    private final Pattern include;
    private final Pattern exclude;

    @Override
    public OpenApi apply(final OpenApi openApi) {
        if (openApi.getWebhooks() == null) return openApi;

        final Predicate<String> included = include.asPredicate();
        final Predicate<String> excluded = (exclude == null) ? entry -> false : exclude.asPredicate();

        final Map<String, Webhook> webhooks = openApi.getWebhooks().entrySet().stream()
                .filter(entry -> included.test(entry.getKey()))
                .filter(entry -> !excluded.test(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        openApi.setWebhooks(webhooks);

        return openApi;
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final List<String> includes = new ArrayList<>();
        private final List<String> excludes = new ArrayList<>();

        public Builder include(final String regex) {
            this.includes.add(regex);
            return this;
        }

        public Builder exclude(final String regex) {
            this.excludes.add(regex);
            return this;
        }

        public FilterWebhooks build() {
            final Pattern includePattern = Pattern.compile(includes.isEmpty() ? ".*" : String.join("|", includes));
            final Pattern excludePattern = excludes.isEmpty() ? null : Pattern.compile(String.join("|", excludes));
            return new FilterWebhooks(includePattern, excludePattern);
        }
    }
}
