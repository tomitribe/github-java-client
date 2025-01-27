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
@ComponentId("git-commit")
public class GitCommit {

    private Author author;

    private Committer committer;

    private URI htmlUrl;

    private String message;

    private String nodeId;

    private List<Parents> parents;

    private String sha;

    private Tree tree;

    private URI url;

    private Verification verification;

    @JsonbProperty("author")
    public Author getAuthor() {
        return this.author;
    }

    @JsonbProperty("committer")
    public Committer getCommitter() {
        return this.committer;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("parents")
    public List<Parents> getParents() {
        return this.parents;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("tree")
    public Tree getTree() {
        return this.tree;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("verification")
    public Verification getVerification() {
        return this.verification;
    }

    @JsonbProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonbProperty("committer")
    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("parents")
    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("tree")
    public void setTree(Tree tree) {
        this.tree = tree;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("verification")
    public void setVerification(Verification verification) {
        this.verification = verification;
    }
}
