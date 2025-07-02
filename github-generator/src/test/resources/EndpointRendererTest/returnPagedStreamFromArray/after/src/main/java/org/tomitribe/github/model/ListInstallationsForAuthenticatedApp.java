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
public class ListInstallationsForAuthenticatedApp {

    @JsonbTransient
    @QueryParam("outdated")
    private String outdated;

    @JsonbTransient
    @QueryParam("page")
    private Integer page;

    @JsonbTransient
    @QueryParam("per_page")
    private Integer perPage;

    @JsonbTransient
    @QueryParam("since")
    private String since;

    @JsonbTransient
    @QueryParam("outdated")
    public String getOutdated() {
        return this.outdated;
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
    @QueryParam("since")
    public String getSince() {
        return this.since;
    }

    @JsonbTransient
    @QueryParam("outdated")
    public void setOutdated(String outdated) {
        this.outdated = outdated;
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
    @QueryParam("since")
    public void setSince(String since) {
        this.since = since;
    }
}
