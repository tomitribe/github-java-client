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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("project-card")
public class ProjectCard {

    private Boolean archived;

    private URI columnUrl;

    private URI contentUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private SimpleUser creator;

    private Integer id;

    private String nodeId;

    private String note;

    private URI projectUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("archived")
    public Boolean getArchived() {
        return this.archived;
    }

    @JsonbProperty("column_url")
    public URI getColumnUrl() {
        return this.columnUrl;
    }

    @JsonbProperty("content_url")
    public URI getContentUrl() {
        return this.contentUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("creator")
    public SimpleUser getCreator() {
        return this.creator;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("note")
    public String getNote() {
        return this.note;
    }

    @JsonbProperty("project_url")
    public URI getProjectUrl() {
        return this.projectUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonbProperty("column_url")
    public void setColumnUrl(URI columnUrl) {
        this.columnUrl = columnUrl;
    }

    @JsonbProperty("content_url")
    public void setContentUrl(URI contentUrl) {
        this.contentUrl = contentUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("creator")
    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonbProperty("project_url")
    public void setProjectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
