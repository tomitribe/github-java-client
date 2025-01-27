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
import java.net.URI;
import java.util.Date;
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
@ComponentId("deployment")
public class Deployment {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private SimpleUser creator;

    private String description;

    private String environment;

    private Integer id;

    private String nodeId;

    private String originalEnvironment;

    private Payload payload;

    private Integration performedViaGithubApp;

    private Boolean productionEnvironment;

    private String ref;

    private URI repositoryUrl;

    private String sha;

    private URI statusesUrl;

    private String task;

    private Boolean transientEnvironment;

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

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("environment")
    public String getEnvironment() {
        return this.environment;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("original_environment")
    public String getOriginalEnvironment() {
        return this.originalEnvironment;
    }

    @JsonbProperty("payload")
    public Payload getPayload() {
        return this.payload;
    }

    @JsonbProperty("performed_via_github_app")
    public Integration getPerformedViaGithubApp() {
        return this.performedViaGithubApp;
    }

    @JsonbProperty("production_environment")
    public Boolean getProductionEnvironment() {
        return this.productionEnvironment;
    }

    @JsonbProperty("ref")
    public String getRef() {
        return this.ref;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("statuses_url")
    public URI getStatusesUrl() {
        return this.statusesUrl;
    }

    @JsonbProperty("task")
    public String getTask() {
        return this.task;
    }

    @JsonbProperty("transient_environment")
    public Boolean getTransientEnvironment() {
        return this.transientEnvironment;
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

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("original_environment")
    public void setOriginalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    @JsonbProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @JsonbProperty("performed_via_github_app")
    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    @JsonbProperty("production_environment")
    public void setProductionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    @JsonbProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("statuses_url")
    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @JsonbProperty("task")
    public void setTask(String task) {
        this.task = task;
    }

    @JsonbProperty("transient_environment")
    public void setTransientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
