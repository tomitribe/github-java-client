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
@ComponentId("commit-comment")
public class CommitComment {

    private String authorAssociation;

    private String body;

    private String commitId;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private URI htmlUrl;

    private Integer id;

    private Integer line;

    private String nodeId;

    private String path;

    private Integer position;

    private ReactionRollup reactions;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("author_association")
    public String getAuthorAssociation() {
        return this.authorAssociation;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("commit_id")
    public String getCommitId() {
        return this.commitId;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("line")
    public Integer getLine() {
        return this.line;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("position")
    public Integer getPosition() {
        return this.position;
    }

    @JsonbProperty("reactions")
    public ReactionRollup getReactions() {
        return this.reactions;
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

    @JsonbProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonbProperty("reactions")
    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
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
}
