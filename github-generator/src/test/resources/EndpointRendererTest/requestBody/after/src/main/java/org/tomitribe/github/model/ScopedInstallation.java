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
@ComponentId("scoped-installation")
public class ScopedInstallation {

    private SimpleUser account;

    private URI repositoriesUrl;

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    private RepositorySelection repositorySelection;

    private String singleFileName;

    @JsonbProperty("account")
    public SimpleUser getAccount() {
        return this.account;
    }

    @JsonbProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return this.repositoriesUrl;
    }

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    @JsonbProperty("repository_selection")
    public RepositorySelection getRepositorySelection() {
        return this.repositorySelection;
    }

    @JsonbProperty("single_file_name")
    public String getSingleFileName() {
        return this.singleFileName;
    }

    @JsonbProperty("account")
    public void setAccount(SimpleUser account) {
        this.account = account;
    }

    @JsonbProperty("repositories_url")
    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    @JsonbProperty("repository_selection")
    public void setRepositorySelection(RepositorySelection repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    @JsonbProperty("single_file_name")
    public void setSingleFileName(String singleFileName) {
        this.singleFileName = singleFileName;
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
