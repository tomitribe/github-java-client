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
import java.util.Map;
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
@ComponentId("base-gist")
public class BaseGist {

    private Boolean _public;

    private Integer comments;

    private URI commentsUrl;

    private URI commitsUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String description;

    private Map<String, File> files;

    private List<Forks> forks;

    private URI forksUrl;

    private URI gitPullUrl;

    private URI gitPushUrl;

    private List<History> history;

    private URI htmlUrl;

    private String id;

    private String nodeId;

    private SimpleUser owner;

    private Boolean truncated;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("comments")
    public Integer getComments() {
        return this.comments;
    }

    @JsonbProperty("comments_url")
    public URI getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("commits_url")
    public URI getCommitsUrl() {
        return this.commitsUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("files")
    public Map<String, File> getFiles() {
        return this.files;
    }

    @JsonbProperty("forks")
    public List<Forks> getForks() {
        return this.forks;
    }

    @JsonbProperty("forks_url")
    public URI getForksUrl() {
        return this.forksUrl;
    }

    @JsonbProperty("git_pull_url")
    public URI getGitPullUrl() {
        return this.gitPullUrl;
    }

    @JsonbProperty("git_push_url")
    public URI getGitPushUrl() {
        return this.gitPushUrl;
    }

    @JsonbProperty("history")
    public List<History> getHistory() {
        return this.history;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("owner")
    public SimpleUser getOwner() {
        return this.owner;
    }

    @JsonbProperty("truncated")
    public Boolean getTruncated() {
        return this.truncated;
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

    @JsonbProperty("user")
    public SimpleUser getUser() {
        return this.user;
    }

    @JsonbProperty("public")
    public Boolean get_public() {
        return this._public;
    }

    @JsonbProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("commits_url")
    public void setCommitsUrl(URI commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("files")
    public void setFiles(Map<String, File> files) {
        this.files = files;
    }

    @JsonbProperty("forks")
    public void setForks(List<Forks> forks) {
        this.forks = forks;
    }

    @JsonbProperty("forks_url")
    public void setForksUrl(URI forksUrl) {
        this.forksUrl = forksUrl;
    }

    @JsonbProperty("git_pull_url")
    public void setGitPullUrl(URI gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    @JsonbProperty("git_push_url")
    public void setGitPushUrl(URI gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    @JsonbProperty("history")
    public void setHistory(List<History> history) {
        this.history = history;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("owner")
    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    @JsonbProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }

    @JsonbProperty("public")
    public void set_public(Boolean _public) {
        this._public = _public;
    }
}
