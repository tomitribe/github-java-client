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
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("issue-event-project-card")
public class IssueEventProjectCard {

    private String columnName;

    private Integer id;

    private String previousColumnName;

    private Integer projectId;

    private URI projectUrl;

    private URI url;

    @JsonbProperty("column_name")
    public String getColumnName() {
        return this.columnName;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("previous_column_name")
    public String getPreviousColumnName() {
        return this.previousColumnName;
    }

    @JsonbProperty("project_id")
    public Integer getProjectId() {
        return this.projectId;
    }

    @JsonbProperty("project_url")
    public URI getProjectUrl() {
        return this.projectUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("column_name")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("previous_column_name")
    public void setPreviousColumnName(String previousColumnName) {
        this.previousColumnName = previousColumnName;
    }

    @JsonbProperty("project_id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonbProperty("project_url")
    public void setProjectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
