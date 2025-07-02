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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.net.URI;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.InstantAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("issue-simple")
public class IssueSimple {

    private String activeLockReason;

    private SimpleUser assignee;

    private List<SimpleUser> assignees;

    private String authorAssociation;

    private String body;

    private String bodyHtml;

    private String bodyText;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant closedAt;

    private Integer comments;

    private URI commentsUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant createdAt;

    private URI eventsUrl;

    private URI htmlUrl;

    private Integer id;

    private List<Labels> labels;

    private String labelsUrl;

    private Boolean locked;

    private Milestone milestone;

    private String nodeId;

    private Integer number;

    private Integration performedViaGithubApp;

    private PullRequest pullRequest;

    private Repository repository;

    private URI repositoryUrl;

    private String state;

    private URI timelineUrl;

    private String title;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant updatedAt;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("active_lock_reason")
    public String getActiveLockReason() {
        return this.activeLockReason;
    }

    @JsonbProperty("assignee")
    public SimpleUser getAssignee() {
        return this.assignee;
    }

    @JsonbProperty("assignees")
    public List<SimpleUser> getAssignees() {
        return this.assignees;
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

    @JsonbProperty("closed_at")
    public Instant getClosedAt() {
        return this.closedAt;
    }

    @JsonbProperty("comments")
    public Integer getComments() {
        return this.comments;
    }

    @JsonbProperty("comments_url")
    public URI getCommentsUrl() {
        return this.commentsUrl;
    }

    @JsonbProperty("created_at")
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("events_url")
    public URI getEventsUrl() {
        return this.eventsUrl;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("labels")
    public List<Labels> getLabels() {
        return this.labels;
    }

    @JsonbProperty("labels_url")
    public String getLabelsUrl() {
        return this.labelsUrl;
    }

    @JsonbProperty("locked")
    public Boolean getLocked() {
        return this.locked;
    }

    @JsonbProperty("milestone")
    public Milestone getMilestone() {
        return this.milestone;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("performed_via_github_app")
    public Integration getPerformedViaGithubApp() {
        return this.performedViaGithubApp;
    }

    @JsonbProperty("pull_request")
    public PullRequest getPullRequest() {
        return this.pullRequest;
    }

    @JsonbProperty("repository")
    public Repository getRepository() {
        return this.repository;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("timeline_url")
    public URI getTimelineUrl() {
        return this.timelineUrl;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("updated_at")
    public Instant getUpdatedAt() {
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

    @JsonbProperty("active_lock_reason")
    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    @JsonbProperty("assignee")
    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    @JsonbProperty("assignees")
    public void setAssignees(List<SimpleUser> assignees) {
        this.assignees = assignees;
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

    @JsonbProperty("closed_at")
    public void setClosedAt(Instant closedAt) {
        this.closedAt = closedAt;
    }

    @JsonbProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonbProperty("comments_url")
    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("events_url")
    public void setEventsUrl(URI eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("labels")
    public void setLabels(List<Labels> labels) {
        this.labels = labels;
    }

    @JsonbProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @JsonbProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonbProperty("milestone")
    public void setMilestone(Milestone milestone) {
        this.milestone = milestone;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("performed_via_github_app")
    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    @JsonbProperty("pull_request")
    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    @JsonbProperty("repository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("timeline_url")
    public void setTimelineUrl(URI timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Instant updatedAt) {
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
