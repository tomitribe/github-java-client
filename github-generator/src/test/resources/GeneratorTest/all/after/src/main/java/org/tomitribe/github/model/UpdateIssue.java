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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateIssue {

    private String assignee;

    private List<String> assignees;

    private String body;

    @JsonbTransient
    @PathParam("issue_number")
    private Integer issueNumber;

    private List<Object> labels;

    private Integer milestone;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    private String title;

    @JsonbProperty("assignee")
    public String getAssignee() {
        return this.assignee;
    }

    @JsonbProperty("assignees")
    public List<String> getAssignees() {
        return this.assignees;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbTransient
    @PathParam("issue_number")
    public Integer getIssueNumber() {
        return this.issueNumber;
    }

    @JsonbProperty("labels")
    public List<Object> getLabels() {
        return this.labels;
    }

    @JsonbProperty("milestone")
    public Integer getMilestone() {
        return this.milestone;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbProperty("state")
    public State getState() {
        return this.state;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("assignee")
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @JsonbProperty("assignees")
    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbTransient
    @PathParam("issue_number")
    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    @JsonbProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonbProperty("milestone")
    public void setMilestone(Integer milestone) {
        this.milestone = milestone;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public enum State {

        OPEN("open"), CLOSED("closed");

        private final String name;

        State(final String name) {
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

    public static class StateAdapter extends EnumAdapter<State> {

        public StateAdapter() {
            super(State.class);
        }
    }
}
