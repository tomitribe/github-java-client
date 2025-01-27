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
import java.util.Date;
import java.util.List;
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
@ComponentId("job")
public class Job {

    private String checkRunUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date completedAt;

    private String conclusion;

    private String headSha;

    private String htmlUrl;

    private Integer id;

    private String name;

    private String nodeId;

    private Integer runId;

    private String runUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date startedAt;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    private List<Steps> steps;

    private String url;

    @JsonbProperty("check_run_url")
    public String getCheckRunUrl() {
        return this.checkRunUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("completed_at")
    public Date getCompletedAt() {
        return this.completedAt;
    }

    @JsonbProperty("conclusion")
    public String getConclusion() {
        return this.conclusion;
    }

    @JsonbProperty("head_sha")
    public String getHeadSha() {
        return this.headSha;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("run_id")
    public Integer getRunId() {
        return this.runId;
    }

    @JsonbProperty("run_url")
    public String getRunUrl() {
        return this.runUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("started_at")
    public Date getStartedAt() {
        return this.startedAt;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("steps")
    public List<Steps> getSteps() {
        return this.steps;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("check_run_url")
    public void setCheckRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
    }

    @JsonbProperty("completed_at")
    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    @JsonbProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @JsonbProperty("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("run_id")
    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    @JsonbProperty("run_url")
    public void setRunUrl(String runUrl) {
        this.runUrl = runUrl;
    }

    @JsonbProperty("started_at")
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonbProperty("steps")
    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
