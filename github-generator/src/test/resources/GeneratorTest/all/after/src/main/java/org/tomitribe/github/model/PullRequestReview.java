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
@ComponentId("pull-request-review")
public class PullRequestReview {

    private String authorAssociation;

    private String body;

    private String bodyHtml;

    private String bodyText;

    private String commitId;

    private URI htmlUrl;

    private Integer id;

    private Links links;

    private String nodeId;

    private URI pullRequestUrl;

    private String state;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date submittedAt;

    private SimpleUser user;

    @JsonbProperty("author_association")
    public String getAuthorAssociation() {
        return this.authorAssociation;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("body_html")
    public String getBodyHtml() {
        return this.bodyHtml;
    }

    @JsonbProperty("body_text")
    public String getBodyText() {
        return this.bodyText;
    }

    @JsonbProperty("commit_id")
    public String getCommitId() {
        return this.commitId;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return this.pullRequestUrl;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("submitted_at")
    public Date getSubmittedAt() {
        return this.submittedAt;
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

    @JsonbProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @JsonbProperty("body_text")
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    @JsonbProperty("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("pull_request_url")
    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("submitted_at")
    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }
}
