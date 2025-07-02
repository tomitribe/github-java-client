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
import org.tomitribe.github.gen.openapi.Path;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FilterPaths implements Function<OpenApi, OpenApi> {

    private final Pattern include;
    private final Pattern exclude;

    @Override
    public OpenApi apply(final OpenApi openApi) {

        final Predicate<String> included = include.asPredicate();
        final Predicate<String> excluded = (exclude == null) ? entry -> false : exclude.asPredicate();

        final Map<String, Path> paths = openApi.getPaths().entrySet().stream()
                .filter(entry -> included.test(entry.getKey()))
                .filter(entry -> !excluded.test(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        openApi.setPaths(paths);

        return openApi;
    }


    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Pattern include = Pattern.compile(".*");
        private Pattern exclude;

        Builder() {
        }

        public Builder include(final Pattern include) {
            this.include = include;
            return this;
        }

        public Builder include(final String includeRegex) {
            return include(Pattern.compile(includeRegex));
        }

        public Builder exclude(final Pattern exclude) {
            this.exclude = exclude;
            return this;
        }

        public Builder exclude(final String excludeRegex) {
            return exclude(Pattern.compile(excludeRegex));
        }

        public FilterPaths build() {
            return new FilterPaths(this.include, this.exclude);
        }

        public String toString() {
            return "FilterPaths.Builder(include=" + this.include + ", exclude=" + this.exclude + ")";
        }
    }
}
