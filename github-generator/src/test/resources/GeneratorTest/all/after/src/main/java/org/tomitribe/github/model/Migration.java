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
import java.util.List;
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
@ComponentId("migration")
public class Migration {

    private URI archiveUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private List<Exclude> exclude;

    private Boolean excludeAttachments;

    private String guid;

    private Integer id;

    private Boolean lockRepositories;

    private String nodeId;

    private SimpleUser owner;

    private List<Repository> repositories;

    private String state;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("archive_url")
    public URI getArchiveUrl() {
        return this.archiveUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("exclude")
    public List<Exclude> getExclude() {
        return this.exclude;
    }

    @JsonbProperty("exclude_attachments")
    public Boolean getExcludeAttachments() {
        return this.excludeAttachments;
    }

    @JsonbProperty("guid")
    public String getGuid() {
        return this.guid;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("lock_repositories")
    public Boolean getLockRepositories() {
        return this.lockRepositories;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("owner")
    public SimpleUser getOwner() {
        return this.owner;
    }

    @JsonbProperty("repositories")
    public List<Repository> getRepositories() {
        return this.repositories;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
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

    @JsonbProperty("archive_url")
    public void setArchiveUrl(URI archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("exclude")
    public void setExclude(List<Exclude> exclude) {
        this.exclude = exclude;
    }

    @JsonbProperty("exclude_attachments")
    public void setExcludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
    }

    @JsonbProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("lock_repositories")
    public void setLockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("owner")
    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    @JsonbProperty("repositories")
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
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
