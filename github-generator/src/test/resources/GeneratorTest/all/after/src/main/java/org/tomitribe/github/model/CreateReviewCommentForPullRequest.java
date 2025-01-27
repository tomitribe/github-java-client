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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateReviewCommentForPullRequest {

    private String body;

    private String commitId;

    private Integer inReplyTo;

    private Integer line;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private String path;

    private Integer position;

    @JsonbTransient
    @PathParam("pull-number")
    private Integer pullNumber;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTypeAdapter(SideAdapter.class)
    private Side side;

    private Integer startLine;

    @JsonbTypeAdapter(StartSideAdapter.class)
    private StartSide startSide;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("commit_id")
    public String getCommitId() {
        return this.commitId;
    }

    @JsonbProperty("in_reply_to")
    public Integer getInReplyTo() {
        return this.inReplyTo;
    }

    @JsonbProperty("line")
    public Integer getLine() {
        return this.line;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("position")
    public Integer getPosition() {
        return this.position;
    }

    @JsonbTransient
    @PathParam("pull-number")
    public Integer getPullNumber() {
        return this.pullNumber;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
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

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("commit_id")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @JsonbProperty("in_reply_to")
    public void setInReplyTo(Integer inReplyTo) {
        this.inReplyTo = inReplyTo;
    }

    @JsonbProperty("line")
    public void setLine(Integer line) {
        this.line = line;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonbTransient
    @PathParam("pull-number")
    public void setPullNumber(Integer pullNumber) {
        this.pullNumber = pullNumber;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
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

        LEFT("LEFT"), RIGHT("RIGHT"), SIDE("side");

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
