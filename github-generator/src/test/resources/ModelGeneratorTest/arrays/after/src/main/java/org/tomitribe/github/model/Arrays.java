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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Arrays {

    private Permissions permissions;

    private List<String> repositories;

    private List<Integer> repositoryIds;

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("repositories")
    public List<String> getRepositories() {
        return this.repositories;
    }

    @JsonbProperty("repository_ids")
    public List<Integer> getRepositoryIds() {
        return this.repositoryIds;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
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
