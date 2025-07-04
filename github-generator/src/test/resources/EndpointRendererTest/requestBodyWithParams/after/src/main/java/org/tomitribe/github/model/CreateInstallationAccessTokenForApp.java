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
public class CreateInstallationAccessTokenForApp {

    @JsonbTransient
    @PathParam("installation_id")
    private Integer installationId;

    private List<String> repositories;

    private List<Integer> repositoryIds;

    @JsonbTransient
    @PathParam("installation_id")
    public Integer getInstallationId() {
        return this.installationId;
    }

    @JsonbProperty("repositories")
    public List<String> getRepositories() {
        return this.repositories;
    }

    @JsonbProperty("repository_ids")
    public List<Integer> getRepositoryIds() {
        return this.repositoryIds;
    }

    @JsonbTransient
    @PathParam("installation_id")
    public void setInstallationId(Integer installationId) {
        this.installationId = installationId;
    }

    @JsonbProperty("repositories")
    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    @JsonbProperty("repository_ids")
    public void setRepositoryIds(List<Integer> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }
}
