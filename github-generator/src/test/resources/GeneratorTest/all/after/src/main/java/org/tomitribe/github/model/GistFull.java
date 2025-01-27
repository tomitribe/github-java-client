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
@ComponentId("gist-full")
public class GistFull {

    private Integer comments;

    private String commentsUrl;

    private String commitsUrl;

    private String createdAt;

    private String description;

    private GistSimple forkOf;

    private List<Forks> forks;

    private String forksUrl;

    private String gitPullUrl;

    private String gitPushUrl;

    private List<History> history;

    private String htmlUrl;

    private String id;

    private String nodeId;

    private String updatedAt;

    private String url;

    @JsonbProperty("comments")
    public Integer getComments() {
        return this.comments;
    }

    @JsonbProperty("comments_url")
    public String getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("commits_url")
    public String getCommitsUrl() {
        return this.commitsUrl;
    }

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("fork_of")
    public GistSimple getForkOf() {
        return this.forkOf;
    }

    @JsonbProperty("forks")
    public List<Forks> getForks() {
        return this.forks;
    }

    @JsonbProperty("forks_url")
    public String getForksUrl() {
        return this.forksUrl;
    }

    @JsonbProperty("git_pull_url")
    public String getGitPullUrl() {
        return this.gitPullUrl;
    }

    @JsonbProperty("git_push_url")
    public String getGitPushUrl() {
        return this.gitPushUrl;
    }

    @JsonbProperty("history")
    public List<History> getHistory() {
        return this.history;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
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

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("fork_of")
    public void setForkOf(GistSimple forkOf) {
        this.forkOf = forkOf;
    }

    @JsonbProperty("forks")
    public void setForks(List<Forks> forks) {
        this.forks = forks;
    }

    @JsonbProperty("forks_url")
    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    @JsonbProperty("git_pull_url")
    public void setGitPullUrl(String gitPullUrl) {
        this.gitPullUrl = gitPullUrl;
    }

    @JsonbProperty("git_push_url")
    public void setGitPushUrl(String gitPushUrl) {
        this.gitPushUrl = gitPushUrl;
    }

    @JsonbProperty("history")
    public void setHistory(List<History> history) {
        this.history = history;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
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

    @JsonbProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
