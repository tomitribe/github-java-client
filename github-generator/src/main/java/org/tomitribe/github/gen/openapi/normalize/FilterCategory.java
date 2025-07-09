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

import org.tomitribe.github.gen.openapi.Method;

public class FilterCategory extends FilterMethod {

    public FilterCategory(final Filter filter) {
        super(filter);
    }

    @Override
    protected boolean matches(final Method method) {
        if (method == null) return false;
        if (method.getGithub() == null) return false;
        if (method.getGithub().getCategory() == null) return false;

        return filter.test(method.getGithub().getCategory());
    }
}
