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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("pull-request-review-comment")
public class PullRequestReviewComment {

    private String authorAssociation;

    private String body;

    private String bodyHtml;

    private String bodyText;

    private String commitId;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String diffHunk;

    private URI htmlUrl;

    private Integer id;

    private Integer inReplyToId;

    private Integer line;

    private Links links;

    private String nodeId;

    private String originalCommitId;

    private Integer originalLine;

    private Integer originalPosition;

    private Integer originalStartLine;

    private String path;

    private Integer position;

    private Integer pullRequestReviewId;

    private URI pullRequestUrl;

    private ReactionRollup reactions;

    @JsonbTypeAdapter(SideAdapter.class)
    private Side side;

    private Integer startLine;

    @JsonbTypeAdapter(StartSideAdapter.class)
    private StartSide startSide;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private String url;

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

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("diff_hunk")
    public String getDiffHunk() {
        return this.diffHunk;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("in_reply_to_id")
    public Integer getInReplyToId() {
        return this.inReplyToId;
    }

    @JsonbProperty("line")
    public Integer getLine() {
        return this.line;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("original_commit_id")
    public String getOriginalCommitId() {
        return this.originalCommitId;
    }

    @JsonbProperty("original_line")
    public Integer getOriginalLine() {
        return this.originalLine;
    }

    @JsonbProperty("original_position")
    public Integer getOriginalPosition() {
        return this.originalPosition;
    }

    @JsonbProperty("original_start_line")
    public Integer getOriginalStartLine() {
        return this.originalStartLine;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("position")
    public Integer getPosition() {
        return this.position;
    }

    @JsonbProperty("pull_request_review_id")
    public Integer getPullRequestReviewId() {
        return this.pullRequestReviewId;
    }

    @JsonbProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return this.pullRequestUrl;
    }

    @JsonbProperty("reactions")
    public ReactionRollup getReactions() {
        return this.reactions;
    }

    @JsonbTypeAdapter(SideAdapter.class)
    @JsonbProperty("side")
    public Side getSide() {
        return this.side;
    }

    @JsonbProperty("start_line")
    public Integer getStartLine() {
        return this.startLine;
    }

    @JsonbTypeAdapter(StartSideAdapter.class)
    @JsonbProperty("start_side")
    public StartSide getStartSide() {
        return this.startSide;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
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

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("diff_hunk")
    public void setDiffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("in_reply_to_id")
    public void setInReplyToId(Integer inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    @JsonbProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("original_commit_id")
    public void setOriginalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
    }

    @JsonbProperty("original_line")
    public void setOriginalLine(Integer originalLine) {
        this.originalLine = originalLine;
    }

    @JsonbProperty("original_position")
    public void setOriginalPosition(Integer originalPosition) {
        this.originalPosition = originalPosition;
    }

    @JsonbProperty("original_start_line")
    public void setOriginalStartLine(Integer originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonbProperty("pull_request_review_id")
    public void setPullRequestReviewId(Integer pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    @JsonbProperty("pull_request_url")
    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    @JsonbProperty("reactions")
    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    @JsonbProperty("side")
    public void setSide(Side side) {
        this.side = side;
    }

    @JsonbProperty("start_line")
    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    @JsonbProperty("start_side")
    public void setStartSide(StartSide startSide) {
        this.startSide = startSide;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public enum Side {

        LEFT("LEFT"), RIGHT("RIGHT");

        private final String name;

        Side(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class SideAdapter extends EnumAdapter<Side> {

        public SideAdapter() {
            super(Side.class);
        }
    }

    public enum StartSide {

        LEFT("LEFT"), RIGHT("RIGHT");

        private final String name;

        StartSide(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class StartSideAdapter extends EnumAdapter<StartSide> {

        public StartSideAdapter() {
            super(StartSide.class);
        }
    }
}
