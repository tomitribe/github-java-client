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
import java.util.Date;
import java.util.List;
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
@ComponentId("workflow-run")
public class WorkflowRun {

    private String artifactsUrl;

    private String cancelUrl;

    private String checkSuiteUrl;

    private String conclusion;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String event;

    private String headBranch;

    private SimpleCommit headCommit;

    private MinimalRepository headRepository;

    private Integer headRepositoryId;

    private String headSha;

    private String htmlUrl;

    private Integer id;

    private String jobsUrl;

    private String logsUrl;

    private String nodeId;

    private List<PullRequestMinimal> pullRequests;

    private MinimalRepository repository;

    private String rerunUrl;

    private Integer runNumber;

    private String status;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private String url;

    private Integer workflowId;

    private String workflowUrl;

    @JsonbProperty("artifacts_url")
    public String getArtifactsUrl() {
        return this.artifactsUrl;
    }

    @JsonbProperty("cancel_url")
    public String getCancelUrl() {
        return this.cancelUrl;
    }

    @JsonbProperty("check_suite_url")
    public String getCheckSuiteUrl() {
        return this.checkSuiteUrl;
    }

    @JsonbProperty("conclusion")
    public String getConclusion() {
        return this.conclusion;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("event")
    public String getEvent() {
        return this.event;
    }

    @JsonbProperty("head_branch")
    public String getHeadBranch() {
        return this.headBranch;
    }

    @JsonbProperty("head_commit")
    public SimpleCommit getHeadCommit() {
        return this.headCommit;
    }

    @JsonbProperty("head_repository")
    public MinimalRepository getHeadRepository() {
        return this.headRepository;
    }

    @JsonbProperty("head_repository_id")
    public Integer getHeadRepositoryId() {
        return this.headRepositoryId;
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

    @JsonbProperty("jobs_url")
    public String getJobsUrl() {
        return this.jobsUrl;
    }

    @JsonbProperty("logs_url")
    public String getLogsUrl() {
        return this.logsUrl;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("pull_requests")
    public List<PullRequestMinimal> getPullRequests() {
        return this.pullRequests;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("rerun_url")
    public String getRerunUrl() {
        return this.rerunUrl;
    }

    @JsonbProperty("run_number")
    public Integer getRunNumber() {
        return this.runNumber;
    }

    @JsonbProperty("status")
    public String getStatus() {
        return this.status;
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

    @JsonbProperty("workflow_id")
    public Integer getWorkflowId() {
        return this.workflowId;
    }

    @JsonbProperty("workflow_url")
    public String getWorkflowUrl() {
        return this.workflowUrl;
    }

    @JsonbProperty("artifacts_url")
    public void setArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    @JsonbProperty("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    @JsonbProperty("check_suite_url")
    public void setCheckSuiteUrl(String checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
    }

    @JsonbProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonbProperty("head_branch")
    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    @JsonbProperty("head_commit")
    public void setHeadCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
    }

    @JsonbProperty("head_repository")
    public void setHeadRepository(MinimalRepository headRepository) {
        this.headRepository = headRepository;
    }

    @JsonbProperty("head_repository_id")
    public void setHeadRepositoryId(Integer headRepositoryId) {
        this.headRepositoryId = headRepositoryId;
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

    @JsonbProperty("jobs_url")
    public void setJobsUrl(String jobsUrl) {
        this.jobsUrl = jobsUrl;
    }

    @JsonbProperty("logs_url")
    public void setLogsUrl(String logsUrl) {
        this.logsUrl = logsUrl;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("pull_requests")
    public void setPullRequests(List<PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("rerun_url")
    public void setRerunUrl(String rerunUrl) {
        this.rerunUrl = rerunUrl;
    }

    @JsonbProperty("run_number")
    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }

    @JsonbProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("workflow_id")
    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    @JsonbProperty("workflow_url")
    public void setWorkflowUrl(String workflowUrl) {
        this.workflowUrl = workflowUrl;
    }
}
