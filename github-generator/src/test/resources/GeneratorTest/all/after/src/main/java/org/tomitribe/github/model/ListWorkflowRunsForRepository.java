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

import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListWorkflowRunsForRepository {

    @JsonbTransient
    @QueryParam("actor")
    private String actor;

    @JsonbTransient
    @QueryParam("event")
    private String event;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @QueryParam("workflow-run-branch")
    private String workflowRunBranch;

    @JsonbTransient
    @QueryParam("workflow-run-status")
    private WorkflowRunStatus workflowRunStatus;

    @JsonbTransient
    @QueryParam("actor")
    public String getActor() {
        return this.actor;
    }

    @JsonbTransient
    @QueryParam("event")
    public String getEvent() {
        return this.event;
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

    @JsonbTransient
    @QueryParam("workflow-run-branch")
    public String getWorkflowRunBranch() {
        return this.workflowRunBranch;
    }

    @JsonbTransient
    @QueryParam("workflow-run-status")
    public WorkflowRunStatus getWorkflowRunStatus() {
        return this.workflowRunStatus;
    }

    @JsonbTransient
    @QueryParam("actor")
    public void setActor(String actor) {
        this.actor = actor;
    }

    @JsonbTransient
    @QueryParam("event")
    public void setEvent(String event) {
        this.event = event;
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

    @JsonbTransient
    @QueryParam("workflow-run-branch")
    public void setWorkflowRunBranch(String workflowRunBranch) {
        this.workflowRunBranch = workflowRunBranch;
    }

    @JsonbTransient
    @QueryParam("workflow-run-status")
    public void setWorkflowRunStatus(WorkflowRunStatus workflowRunStatus) {
        this.workflowRunStatus = workflowRunStatus;
    }
}
