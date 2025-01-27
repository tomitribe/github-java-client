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
@ComponentId("team-discussion")
public class TeamDiscussion {

    private Boolean _private;

    private SimpleUser author;

    private String body;

    private String bodyHtml;

    private String bodyVersion;

    private Integer commentsCount;

    private URI commentsUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private URI htmlUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date lastEditedAt;

    private String nodeId;

    private Integer number;

    private Boolean pinned;

    private ReactionRollup reactions;

    private URI teamUrl;

    private String title;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("author")
    public SimpleUser getAuthor() {
        return this.author;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("body_html")
    public String getBodyHtml() {
        return this.bodyHtml;
    }

    @JsonbProperty("body_version")
    public String getBodyVersion() {
        return this.bodyVersion;
    }

    @JsonbProperty("comments_count")
    public Integer getCommentsCount() {
        return this.commentsCount;
    }

    @JsonbProperty("comments_url")
    public URI getCommentsUrl() {
        return this.commentsUrl;
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

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("last_edited_at")
    public Date getLastEditedAt() {
        return this.lastEditedAt;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("pinned")
    public Boolean getPinned() {
        return this.pinned;
    }

    @JsonbProperty("reactions")
    public ReactionRollup getReactions() {
        return this.reactions;
    }

    @JsonbProperty("team_url")
    public URI getTeamUrl() {
        return this.teamUrl;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
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

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("author")
    public void setAuthor(SimpleUser author) {
        this.author = author;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @JsonbProperty("body_version")
    public void setBodyVersion(String bodyVersion) {
        this.bodyVersion = bodyVersion;
    }

    @JsonbProperty("comments_count")
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("last_edited_at")
    public void setLastEditedAt(Date lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonbProperty("reactions")
    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    @JsonbProperty("team_url")
    public void setTeamUrl(URI teamUrl) {
        this.teamUrl = teamUrl;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("private")
    public void set_private(Boolean _private) {
        this._private = _private;
    }
}
