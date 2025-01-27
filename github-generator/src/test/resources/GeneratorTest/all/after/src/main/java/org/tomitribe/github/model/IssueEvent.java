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
@ComponentId("issue-event")
public class IssueEvent {

    private SimpleUser actor;

    private SimpleUser assignee;

    private SimpleUser assigner;

    private String authorAssociation;

    private String commitId;

    private String commitUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private IssueEventDismissedReview dismissedReview;

    private String event;

    private Integer id;

    private IssueSimple issue;

    private IssueEventLabel label;

    private String lockReason;

    private IssueEventMilestone milestone;

    private String nodeId;

    private IssueEventProjectCard projectCard;

    private IssueEventRename rename;

    private SimpleUser requestedReviewer;

    private Team requestedTeam;

    private SimpleUser reviewRequester;

    private URI url;

    @JsonbProperty("actor")
    public SimpleUser getActor() {
        return this.actor;
    }

    @JsonbProperty("assignee")
    public SimpleUser getAssignee() {
        return this.assignee;
    }

    @JsonbProperty("assigner")
    public SimpleUser getAssigner() {
        return this.assigner;
    }

    @JsonbProperty("author_association")
    public String getAuthorAssociation() {
        return this.authorAssociation;
    }

    @JsonbProperty("commit_id")
    public String getCommitId() {
        return this.commitId;
    }

    @JsonbProperty("commit_url")
    public String getCommitUrl() {
        return this.commitUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("dismissed_review")
    public IssueEventDismissedReview getDismissedReview() {
        return this.dismissedReview;
    }

    @JsonbProperty("event")
    public String getEvent() {
        return this.event;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("issue")
    public IssueSimple getIssue() {
        return this.issue;
    }

    @JsonbProperty("label")
    public IssueEventLabel getLabel() {
        return this.label;
    }

    @JsonbProperty("lock_reason")
    public String getLockReason() {
        return this.lockReason;
    }

    @JsonbProperty("milestone")
    public IssueEventMilestone getMilestone() {
        return this.milestone;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("project_card")
    public IssueEventProjectCard getProjectCard() {
        return this.projectCard;
    }

    @JsonbProperty("rename")
    public IssueEventRename getRename() {
        return this.rename;
    }

    @JsonbProperty("requested_reviewer")
    public SimpleUser getRequestedReviewer() {
        return this.requestedReviewer;
    }

    @JsonbProperty("requested_team")
    public Team getRequestedTeam() {
        return this.requestedTeam;
    }

    @JsonbProperty("review_requester")
    public SimpleUser getReviewRequester() {
        return this.reviewRequester;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("actor")
    public void setActor(SimpleUser actor) {
        this.actor = actor;
    }

    @JsonbProperty("assignee")
    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    @JsonbProperty("assigner")
    public void setAssigner(SimpleUser assigner) {
        this.assigner = assigner;
    }

    @JsonbProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
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
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("dismissed_review")
    public void setDismissedReview(IssueEventDismissedReview dismissedReview) {
        this.dismissedReview = dismissedReview;
    }

    @JsonbProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("issue")
    public void setIssue(IssueSimple issue) {
        this.issue = issue;
    }

    @JsonbProperty("label")
    public void setLabel(IssueEventLabel label) {
        this.label = label;
    }

    @JsonbProperty("lock_reason")
    public void setLockReason(String lockReason) {
        this.lockReason = lockReason;
    }

    @JsonbProperty("milestone")
    public void setMilestone(IssueEventMilestone milestone) {
        this.milestone = milestone;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("project_card")
    public void setProjectCard(IssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    @JsonbProperty("rename")
    public void setRename(IssueEventRename rename) {
        this.rename = rename;
    }

    @JsonbProperty("requested_reviewer")
    public void setRequestedReviewer(SimpleUser requestedReviewer) {
        this.requestedReviewer = requestedReviewer;
    }

    @JsonbProperty("requested_team")
    public void setRequestedTeam(Team requestedTeam) {
        this.requestedTeam = requestedTeam;
    }

    @JsonbProperty("review_requester")
    public void setReviewRequester(SimpleUser reviewRequester) {
        this.reviewRequester = reviewRequester;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
