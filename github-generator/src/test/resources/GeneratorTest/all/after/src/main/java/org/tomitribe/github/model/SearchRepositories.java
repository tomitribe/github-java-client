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
package org.tomitribe.github.model;

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchRepositories {

    @JsonbTransient
    @QueryParam("order")
    private Order order;

    @JsonbTransient
    @QueryParam("q")
    private String q;

    @JsonbTransient
    @QueryParam("sort")
    @JsonbTypeAdapter(SortAdapter.class)
    private Sort sort;

    @JsonbTransient
    @QueryParam("order")
    public Order getOrder() {
        return this.order;
    }

    @JsonbTransient
    @QueryParam("q")
    public String getQ() {
        return this.q;
    }

    @JsonbTypeAdapter(SortAdapter.class)
    @JsonbTransient
    @QueryParam("sort")
    public Sort getSort() {
        return this.sort;
    }

    @JsonbTransient
    @QueryParam("order")
    public void setOrder(Order order) {
        this.order = order;
    }

    @JsonbTransient
    @QueryParam("q")
    public void setQ(String q) {
        this.q = q;
    }

    @JsonbTransient
    @QueryParam("sort")
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public enum Sort {

        STARS("stars"), FORKS("forks"), HELP_WANTED_ISSUES("help-wanted-issues"), UPDATED("updated");

        private final String name;

        Sort(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class SortAdapter extends EnumAdapter<Sort> {

        public SortAdapter() {
            super(Sort.class);
        }
    }
}
