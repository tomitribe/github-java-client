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
@ComponentId("deployment-status")
public class DeploymentStatus {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private SimpleUser creator;

    private URI deploymentUrl;

    private String description;

    private String environment;

    private URI environmentUrl;

    private Integer id;

    private URI logUrl;

    private String nodeId;

    private Integration performedViaGithubApp;

    private URI repositoryUrl;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    private URI targetUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("creator")
    public SimpleUser getCreator() {
        return this.creator;
    }

    @JsonbProperty("deployment_url")
    public URI getDeploymentUrl() {
        return this.deploymentUrl;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("environment")
    public String getEnvironment() {
        return this.environment;
    }

    @JsonbProperty("environment_url")
    public URI getEnvironmentUrl() {
        return this.environmentUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("log_url")
    public URI getLogUrl() {
        return this.logUrl;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("performed_via_github_app")
    public Integration getPerformedViaGithubApp() {
        return this.performedViaGithubApp;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbProperty("state")
    public State getState() {
        return this.state;
    }

    @JsonbProperty("target_url")
    public URI getTargetUrl() {
        return this.targetUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("creator")
    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    @JsonbProperty("deployment_url")
    public void setDeploymentUrl(URI deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonbProperty("environment_url")
    public void setEnvironmentUrl(URI environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("log_url")
    public void setLogUrl(URI logUrl) {
        this.logUrl = logUrl;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("performed_via_github_app")
    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonbProperty("target_url")
    public void setTargetUrl(URI targetUrl) {
        this.targetUrl = targetUrl;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum State {

        ERROR("error"),
        FAILURE("failure"),
        INACTIVE("inactive"),
        PENDING("pending"),
        SUCCESS("success"),
        QUEUED("queued"),
        IN_PROGRESS("in_progress");

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
