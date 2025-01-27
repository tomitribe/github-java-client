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
public class CreateCheckRun {

    private List<Actions> actions;

    private String completedAt;

    @JsonbTypeAdapter(ConclusionAdapter.class)
    private Conclusion conclusion;

    private String detailsUrl;

    private String externalId;

    private String headSha;

    private String name;

    private Output output;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String startedAt;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    @JsonbProperty("actions")
    public List<Actions> getActions() {
        return this.actions;
    }

    @JsonbProperty("completed_at")
    public String getCompletedAt() {
        return this.completedAt;
    }

    @JsonbTypeAdapter(ConclusionAdapter.class)
    @JsonbProperty("conclusion")
    public Conclusion getConclusion() {
        return this.conclusion;
    }

    @JsonbProperty("details_url")
    public String getDetailsUrl() {
        return this.detailsUrl;
    }

    @JsonbProperty("external_id")
    public String getExternalId() {
        return this.externalId;
    }

    @JsonbProperty("head_sha")
    public String getHeadSha() {
        return this.headSha;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("output")
    public Output getOutput() {
        return this.output;
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

    @JsonbProperty("started_at")
    public String getStartedAt() {
        return this.startedAt;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("actions")
    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    @JsonbProperty("completed_at")
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    @JsonbProperty("conclusion")
    public void setConclusion(Conclusion conclusion) {
        this.conclusion = conclusion;
    }

    @JsonbProperty("details_url")
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    @JsonbProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonbProperty("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("output")
    public void setOutput(Output output) {
        this.output = output;
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

    @JsonbProperty("started_at")
    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Conclusion {

        SUCCESS("success"),
        FAILURE("failure"),
        NEUTRAL("neutral"),
        CANCELLED("cancelled"),
        SKIPPED("skipped"),
        TIMED_OUT("timed_out"),
        ACTION_REQUIRED("action_required");

        private final String name;

        Conclusion(final String name) {
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

    public static class ConclusionAdapter extends EnumAdapter<Conclusion> {

        public ConclusionAdapter() {
            super(Conclusion.class);
        }
    }

    public enum Status {

        QUEUED("queued"), IN_PROGRESS("in_progress"), COMPLETED("completed");

        private final String name;

        Status(final String name) {
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

    public static class StatusAdapter extends EnumAdapter<Status> {

        public StatusAdapter() {
            super(Status.class);
        }
    }
}
