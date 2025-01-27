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

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("scim-user-list")
public class ScimUserList {

    private Integer itemsPerPage;

    private List<ScimUser> resources;

    private List<String> schemas;

    private Integer startIndex;

    private Integer totalResults;

    @JsonbProperty("itemsPerPage")
    public Integer getItemsPerPage() {
        return this.itemsPerPage;
    }

    @JsonbProperty("Resources")
    public List<ScimUser> getResources() {
        return this.resources;
    }

    @JsonbProperty("schemas")
    public List<String> getSchemas() {
        return this.schemas;
    }

    @JsonbProperty("startIndex")
    public Integer getStartIndex() {
        return this.startIndex;
    }

    @JsonbProperty("totalResults")
    public Integer getTotalResults() {
        return this.totalResults;
    }

    @JsonbProperty("itemsPerPage")
    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    @JsonbProperty("Resources")
    public void setResources(List<ScimUser> resources) {
        this.resources = resources;
    }

    @JsonbProperty("schemas")
    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @JsonbProperty("startIndex")
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    @JsonbProperty("totalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
}
