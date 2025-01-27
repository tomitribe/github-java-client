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
public class ListDeployments {

    @JsonbTransient
    @QueryParam("environment")
    private String environment;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @QueryParam("ref")
    private String ref;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @QueryParam("sha")
    private String sha;

    @JsonbTransient
    @QueryParam("task")
    private String task;

    @JsonbTransient
    @QueryParam("environment")
    public String getEnvironment() {
        return this.environment;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @QueryParam("ref")
    public String getRef() {
        return this.ref;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @QueryParam("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbTransient
    @QueryParam("task")
    public String getTask() {
        return this.task;
    }

    @JsonbTransient
    @QueryParam("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @QueryParam("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbTransient
    @QueryParam("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbTransient
    @QueryParam("task")
    public void setTask(String task) {
        this.task = task;
    }
}
