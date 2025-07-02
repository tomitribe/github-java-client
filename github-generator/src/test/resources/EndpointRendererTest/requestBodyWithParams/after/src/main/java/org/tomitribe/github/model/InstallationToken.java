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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("installation-token")
public class InstallationToken {

    private String expiresAt;

    private List<Repository> repositories;

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    private RepositorySelection repositorySelection;

    private String singleFile;

    private String token;

    @JsonbProperty("expires_at")
    public String getExpiresAt() {
        return this.expiresAt;
    }

    @JsonbProperty("repositories")
    public List<Repository> getRepositories() {
        return this.repositories;
    }

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    @JsonbProperty("repository_selection")
    public RepositorySelection getRepositorySelection() {
        return this.repositorySelection;
    }

    @JsonbProperty("single_file")
    public String getSingleFile() {
        return this.singleFile;
    }

    @JsonbProperty("token")
    public String getToken() {
        return this.token;
    }

    @JsonbProperty("expires_at")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    @JsonbProperty("repositories")
    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    @JsonbProperty("repository_selection")
    public void setRepositorySelection(RepositorySelection repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    @JsonbProperty("single_file")
    public void setSingleFile(String singleFile) {
        this.singleFile = singleFile;
    }

    @JsonbProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    public enum RepositorySelection {

        ALL("all"), SELECTED("selected");

        private final String name;

        RepositorySelection(final String name) {
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

    public static class RepositorySelectionAdapter extends EnumAdapter<RepositorySelection> {

        public RepositorySelectionAdapter() {
            super(RepositorySelection.class);
        }
    }
}
