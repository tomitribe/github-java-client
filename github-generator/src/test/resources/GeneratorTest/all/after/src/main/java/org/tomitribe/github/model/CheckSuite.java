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
@ComponentId("check-suite")
public class CheckSuite {

    private String after;

    private Integration app;

    private String before;

    private String checkRunsUrl;

    private String conclusion;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String headBranch;

    private SimpleCommit headCommit;

    private String headSha;

    private Integer id;

    private Integer latestCheckRunsCount;

    private String nodeId;

    private List<PullRequestMinimal> pullRequests;

    private MinimalRepository repository;

    private String status;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private String url;

    @JsonbProperty("after")
    public String getAfter() {
        return this.after;
    }

    @JsonbProperty("app")
    public Integration getApp() {
        return this.app;
    }

    @JsonbProperty("before")
    public String getBefore() {
        return this.before;
    }

    @JsonbProperty("check_runs_url")
    public String getCheckRunsUrl() {
        return this.checkRunsUrl;
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

    @JsonbProperty("head_branch")
    public String getHeadBranch() {
        return this.headBranch;
    }

    @JsonbProperty("head_commit")
    public SimpleCommit getHeadCommit() {
        return this.headCommit;
    }

    @JsonbProperty("head_sha")
    public String getHeadSha() {
        return this.headSha;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("latest_check_runs_count")
    public Integer getLatestCheckRunsCount() {
        return this.latestCheckRunsCount;
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

    @JsonbProperty("after")
    public void setAfter(String after) {
        this.after = after;
    }

    @JsonbProperty("app")
    public void setApp(Integration app) {
        this.app = app;
    }

    @JsonbProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonbProperty("check_runs_url")
    public void setCheckRunsUrl(String checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
    }

    @JsonbProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("head_branch")
    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    @JsonbProperty("head_commit")
    public void setHeadCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
    }

    @JsonbProperty("head_sha")
    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("latest_check_runs_count")
    public void setLatestCheckRunsCount(Integer latestCheckRunsCount) {
        this.latestCheckRunsCount = latestCheckRunsCount;
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
}
