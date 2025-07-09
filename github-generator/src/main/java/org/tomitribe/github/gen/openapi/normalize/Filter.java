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

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

@Builder(builderClassName = "Builder")
public class Filter implements Predicate<String> {

    private final Predicate<String> included;
    private final Predicate<String> excluded;

    public Filter(final Pattern include, final Pattern exclude) {
        this.included = (include == null) ? entry -> true : include.asPredicate();
        this.excluded = (exclude == null) ? entry -> false : exclude.asPredicate();
    }

    @Override
    public boolean test(final String s) {
        return included.test(s) && !excluded.test(s);
    }

    public Predicate<String> getExcluded() {
        return excluded;
    }

    public Predicate<String> getIncluded() {
        return included;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final List<String> includes = new ArrayList<>();
        private final List<String> excludes = new ArrayList<>();

        public Filter.Builder include(final String regex) {
            this.includes.add(regex);
            return this;
        }

        public Filter.Builder exclude(final String regex) {
            this.excludes.add(regex);
            return this;
        }

        public Filter build() {
            final Pattern includePattern = includes.isEmpty() ? null : Pattern.compile(String.join("|", includes));
            final Pattern excludePattern = excludes.isEmpty() ? null : Pattern.compile(String.join("|", excludes));
            return new Filter(includePattern, excludePattern);
        }
    }
}
