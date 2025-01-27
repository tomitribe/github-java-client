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
public class RepositoriesPage {

    private List<Repository> repositories;

    private String repositorySelection;

    private Integer totalCount;

    @JsonbProperty("repositories")
    public List<Repository> getRepositories() {
        return this.repositories;
    }

    @JsonbProperty("repository_selection")
    public String getRepositorySelection() {
        return this.repositorySelection;
    }

    @JsonbProperty("total_count")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    @JsonbProperty("repositories")
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @JsonbProperty("repository_selection")
    public void setRepositorySelection(String repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    @JsonbProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
