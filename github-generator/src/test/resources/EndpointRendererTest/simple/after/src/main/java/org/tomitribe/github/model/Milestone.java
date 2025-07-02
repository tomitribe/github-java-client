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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.EnumAdapter;
import org.tomitribe.github.core.InstantAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("milestone")
public class Milestone {

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant closedAt;

    private Integer closedIssues;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant createdAt;

    private SimpleUser creator;

    private String description;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant dueOn;

    private URI htmlUrl;

    private Integer id;

    private URI labelsUrl;

    private String nodeId;

    private Integer number;

    private Integer openIssues;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    private String title;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant updatedAt;

    private URI url;

    @JsonbProperty("closed_at")
    public Instant getClosedAt() {
        return this.closedAt;
    }

    @JsonbProperty("closed_issues")
    public Integer getClosedIssues() {
        return this.closedIssues;
    }

    @JsonbProperty("created_at")
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("creator")
    public SimpleUser getCreator() {
        return this.creator;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("due_on")
    public Instant getDueOn() {
        return this.dueOn;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("labels_url")
    public URI getLabelsUrl() {
        return this.labelsUrl;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("open_issues")
    public Integer getOpenIssues() {
        return this.openIssues;
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

    @JsonbProperty("updated_at")
    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("closed_at")
    public void setClosedAt(Instant closedAt) {
        this.closedAt = closedAt;
    }

    @JsonbProperty("closed_issues")
    public void setClosedIssues(Integer closedIssues) {
        this.closedIssues = closedIssues;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("creator")
    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("due_on")
    public void setDueOn(Instant dueOn) {
        this.dueOn = dueOn;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("labels_url")
    public void setLabelsUrl(URI labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("open_issues")
    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
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
