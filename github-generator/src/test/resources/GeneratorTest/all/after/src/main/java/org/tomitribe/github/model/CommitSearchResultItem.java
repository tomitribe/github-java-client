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
@ComponentId("commit-search-result-item")
public class CommitSearchResultItem {

    private SimpleUser author;

    private URI commentsUrl;

    private Commit commit;

    private GitUser committer;

    private URI htmlUrl;

    private String nodeId;

    private List<Parents> parents;

    private MinimalRepository repository;

    private Integer score;

    private String sha;

    private List<SearchResultTextMatches> textMatches;

    private URI url;

    @JsonbProperty("author")
    public SimpleUser getAuthor() {
        return this.author;
    }

    @JsonbProperty("comments_url")
    public URI getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("commit")
    public Commit getCommit() {
        return this.commit;
    }

    @JsonbProperty("committer")
    public GitUser getCommitter() {
        return this.committer;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("parents")
    public List<Parents> getParents() {
        return this.parents;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("score")
    public Integer getScore() {
        return this.score;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("text_matches")
    public List<SearchResultTextMatches> getTextMatches() {
        return this.textMatches;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("author")
    public void setAuthor(SimpleUser author) {
        this.author = author;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("commit")
    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    @JsonbProperty("committer")
    public void setCommitter(GitUser committer) {
        this.committer = committer;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("parents")
    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("text_matches")
    public void setTextMatches(List<SearchResultTextMatches> textMatches) {
        this.textMatches = textMatches;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
