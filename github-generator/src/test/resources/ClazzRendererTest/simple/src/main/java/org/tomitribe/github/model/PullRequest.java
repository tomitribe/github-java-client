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
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("pull-request")
@ComponentId("pull-request-minimal")
public class PullRequest {

    private List<String> labels;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private Integer pullRequestNumber;

    private String pullRequestUrl;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String repositoryUrl;

    @JsonbTransient
    @QueryParam("state")
    private State state;

    @JsonbProperty("labels")
    public List<String> getLabels() {
        return this.labels;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("pull_request_number")
    public Integer getPullRequestNumber() {
        return this.pullRequestNumber;
    }

    @JsonbProperty("pull_request_url")
    public String getPullRequestUrl() {
        return this.pullRequestUrl;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("repository_url")
    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbTransient
    @QueryParam("state")
    public State getState() {
        return this.state;
    }

    @JsonbProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("pull_request_number")
    public void setPullRequestNumber(Integer pullRequestNumber) {
        this.pullRequestNumber = pullRequestNumber;
    }

    @JsonbProperty("pull_request_url")
    public void setPullRequestUrl(String pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbTransient
    @QueryParam("state")
    public void setState(State state) {
        this.state = state;
    }
}
