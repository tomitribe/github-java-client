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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("issue-event-for-issue")
public class IssueEventForIssue {

    private SimpleUser actor;

    private String authorAssociation;

    private String body;

    private String bodyHtml;

    private String bodyText;

    private String commitId;

    private String commitUrl;

    private String createdAt;

    private String event;

    private String htmlUrl;

    private Integer id;

    private String issueUrl;

    private String lockReason;

    private String message;

    private String nodeId;

    private String pullRequestUrl;

    private String sha;

    private String state;

    private String submittedAt;

    private String updatedAt;

    private String url;

    @JsonbProperty("actor")
    public SimpleUser getActor() {
        return this.actor;
    }

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

    @JsonbProperty("commit_url")
    public String getCommitUrl() {
        return this.commitUrl;
    }

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("event")
    public String getEvent() {
        return this.event;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("issue_url")
    public String getIssueUrl() {
        return this.issueUrl;
    }

    @JsonbProperty("lock_reason")
    public String getLockReason() {
        return this.lockReason;
    }

    @JsonbProperty("message")
    public String getMessage() {
        return this.message;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("pull_request_url")
    public String getPullRequestUrl() {
        return this.pullRequestUrl;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("submitted_at")
    public String getSubmittedAt() {
        return this.submittedAt;
    }

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("actor")
    public void setActor(SimpleUser actor) {
        this.actor = actor;
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

    @JsonbProperty("commit_url")
    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("issue_url")
    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    @JsonbProperty("lock_reason")
    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    @JsonbProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("pull_request_url")
    public void setPullRequestUrl(String pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("submitted_at")
    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
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
