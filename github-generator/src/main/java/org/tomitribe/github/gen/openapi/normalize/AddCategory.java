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

import org.tomitribe.github.gen.openapi.Github;
import org.tomitribe.github.gen.openapi.Method;

import java.util.stream.Stream;

public class AddCategory extends FilterMethod {

    public AddCategory() {
        super(Filter.builder().build());
    }

    /**
     * Our goal here is to fill in the github->category data if it is not present
     *
     * We do not filter or remove Methods, so this always returns true
     *
     * @param method
     * @return
     */
    @Override
    protected boolean matches(final Method method) {
        if (method.getGithub() == null) method.setGithub(new Github());
        if (method.getGithub().getCategory() != null) return true;

        /*
         * Default category based on the first section of operationId
         * Github uses operationIds like `milestone/opened`
         */
        if (method.getOperationId() != null) {
            final String name = method.getOperationId().replaceAll("/.*", "");
            method.getGithub().setCategory(name);
            return true;
        }

        /*
         * As a fallback default category based on the first section of the path
         */
        if (method.getPath() != null) {
            final String name = Stream.of(method.getPath().getName().split("/"))
                    .filter(s -> !s.isEmpty())
                    .findFirst()
                    .orElse("api");

            method.getGithub().setCategory(name);
            return true;
        }

        /*
         * We're out of ideas
         */
        return true;
    }

}
