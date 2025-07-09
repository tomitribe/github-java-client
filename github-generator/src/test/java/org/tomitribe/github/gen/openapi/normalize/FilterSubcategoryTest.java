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

import org.junit.Test;

public class FilterSubcategoryTest {
    @Test
    public void includeAllExcludeNone() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .build()));
    }

    @Test
    public void includeAllExcludeAdmin() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .exclude("^admin.*")
                .build()));
    }

    @Test
    public void includeUsersExcludeAdmin() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .include("^users.*")
                .exclude("^admin.*")
                .build()));
    }

    @Test
    public void includeAdminExcludeNone() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .include("^admin.*")
                .build()));
    }

    @Test
    public void includeUsersPartial() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .include("users")
                .build()));
    }

    @Test
    public void includeAdminExcludeAdminConfig() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .include("^admin.*")
                .exclude("^adminConfig")
                .build()));
    }

    @Test
    public void excludeUsersPartial() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .exclude("users")
                .build()));
    }

    @Test
    public void excludeList() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .exclude("Id")
                .exclude("Config")
                .build()));
    }

    @Test
    public void includeList() throws Exception {
        Normalizations.assertScenario(new FilterSubcategory(Filter.builder()
                .include("Id")
                .include("Config")
                .build()));
    }


}