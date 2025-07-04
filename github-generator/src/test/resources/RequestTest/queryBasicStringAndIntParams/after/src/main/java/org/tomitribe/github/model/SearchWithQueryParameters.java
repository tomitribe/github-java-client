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
public class SearchWithQueryParameters {

    @JsonbTransient
    @QueryParam("limit")
    private Integer limit;

    @JsonbTransient
    @QueryParam("q")
    private String q;

    @JsonbTransient
    @QueryParam("limit")
    public Integer getLimit() {
        return this.limit;
    }

    @JsonbTransient
    @QueryParam("q")
    public String getQ() {
        return this.q;
    }

    @JsonbTransient
    @QueryParam("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonbTransient
    @QueryParam("q")
    public void setQ(String q) {
        this.q = q;
    }
}
