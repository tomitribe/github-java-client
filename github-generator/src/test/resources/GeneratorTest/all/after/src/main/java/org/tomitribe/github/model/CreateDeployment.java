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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateDeployment {

    private Boolean autoMerge;

    private String createdAt;

    private String description;

    private String environment;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    private String payload;

    private Boolean productionEnvironment;

    private String ref;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private List<String> requiredContexts;

    private String task;

    private Boolean transientEnvironment;

    @JsonbProperty("auto_merge")
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    @JsonbProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("environment")
    public String getEnvironment() {
        return this.environment;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbProperty("payload")
    public String getPayload() {
        return this.payload;
    }

    @JsonbProperty("production_environment")
    public Boolean getProductionEnvironment() {
        return this.productionEnvironment;
    }

    @JsonbProperty("ref")
    public String getRef() {
        return this.ref;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("required_contexts")
    public List<String> getRequiredContexts() {
        return this.requiredContexts;
    }

    @JsonbProperty("task")
    public String getTask() {
        return this.task;
    }

    @JsonbProperty("transient_environment")
    public Boolean getTransientEnvironment() {
        return this.transientEnvironment;
    }

    @JsonbProperty("auto_merge")
    public void setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("payload")
    public void setPayload(String payload) {
        this.payload = payload;
    }

    @JsonbProperty("production_environment")
    public void setProductionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    @JsonbProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("required_contexts")
    public void setRequiredContexts(List<String> requiredContexts) {
        this.requiredContexts = requiredContexts;
    }

    @JsonbProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    @JsonbProperty("transient_environment")
    public void setTransientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }
}
