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
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SearchRepositories {

    @JsonbTransient
    @QueryParam("order")
    private Order order;

    @JsonbTransient
    @QueryParam("page")
    private Integer page;

    @JsonbTransient
    @QueryParam("per_page")
    private Integer perPage;

    @JsonbTransient
    @QueryParam("q")
    private String q;

    @JsonbTransient
    @QueryParam("sort")
    private Sort sort;

    @JsonbTransient
    @QueryParam("order")
    public Order getOrder() {
        return this.order;
    }

    @JsonbTransient
    @QueryParam("page")
    public Integer getPage() {
        return this.page;
    }

    @JsonbTransient
    @QueryParam("per_page")
    public Integer getPerPage() {
        return this.perPage;
    }

    @JsonbTransient
    @QueryParam("q")
    public String getQ() {
        return this.q;
    }

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
    @QueryParam("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonbTransient
    @QueryParam("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
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
}
