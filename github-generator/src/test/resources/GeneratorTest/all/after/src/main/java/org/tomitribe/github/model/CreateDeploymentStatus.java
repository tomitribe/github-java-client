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
public class CreateDeploymentStatus {

    private Boolean autoInactive;

    @JsonbTransient
    @PathParam("deployment_id")
    private Integer deploymentId;

    private String description;

    @JsonbTypeAdapter(EnvironmentAdapter.class)
    private Environment environment;

    private String environmentUrl;

    private String logUrl;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    private String targetUrl;

    @JsonbProperty("auto_inactive")
    public Boolean getAutoInactive() {
        return this.autoInactive;
    }

    @JsonbTransient
    @PathParam("deployment_id")
    public Integer getDeploymentId() {
        return this.deploymentId;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbTypeAdapter(EnvironmentAdapter.class)
    @JsonbProperty("environment")
    public Environment getEnvironment() {
        return this.environment;
    }

    @JsonbProperty("environment_url")
    public String getEnvironmentUrl() {
        return this.environmentUrl;
    }

    @JsonbProperty("log_url")
    public String getLogUrl() {
        return this.logUrl;
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

    @JsonbProperty("target_url")
    public String getTargetUrl() {
        return this.targetUrl;
    }

    @JsonbProperty("auto_inactive")
    public void setAutoInactive(Boolean autoInactive) {
        this.autoInactive = autoInactive;
    }

    @JsonbTransient
    @PathParam("deployment_id")
    public void setDeploymentId(Integer deploymentId) {
        this.deploymentId = deploymentId;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("environment")
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @JsonbProperty("environment_url")
    public void setEnvironmentUrl(String environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    @JsonbProperty("log_url")
    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
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

    @JsonbProperty("target_url")
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public enum Environment {

        PRODUCTION("production"), STAGING("staging"), QA("qa");

        private final String name;

        Environment(final String name) {
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

    public static class EnvironmentAdapter extends EnumAdapter<Environment> {

        public EnvironmentAdapter() {
            super(Environment.class);
        }
    }

    public enum State {

        ERROR("error"),
        FAILURE("failure"),
        INACTIVE("inactive"),
        IN_PROGRESS("in_progress"),
        QUEUED("queued"),
        PENDING("pending"),
        SUCCESS("success");

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
