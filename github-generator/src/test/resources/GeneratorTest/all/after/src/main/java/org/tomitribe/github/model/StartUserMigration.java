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
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StartUserMigration {

    @JsonbTypeAdapter(ExcludeAdapter.class)
    private List<Exclude> exclude;

    private Boolean excludeAttachments;

    private Boolean lockRepositories;

    private List<String> repositories;

    @JsonbTypeAdapter(ExcludeAdapter.class)
    @JsonbProperty("exclude")
    public List<Exclude> getExclude() {
        return this.exclude;
    }

    @JsonbProperty("exclude_attachments")
    public Boolean getExcludeAttachments() {
        return this.excludeAttachments;
    }

    @JsonbProperty("lock_repositories")
    public Boolean getLockRepositories() {
        return this.lockRepositories;
    }

    @JsonbProperty("repositories")
    public List<String> getRepositories() {
        return this.repositories;
    }

    @JsonbProperty("exclude")
    public void setExclude(List<Exclude> exclude) {
        this.exclude = exclude;
    }

    @JsonbProperty("exclude_attachments")
    public void setExcludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
    }

    @JsonbProperty("lock_repositories")
    public void setLockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
    }

    @JsonbProperty("repositories")
    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    public enum Exclude {

        REPOSITORIES("repositories");

        private final String name;

        Exclude(final String name) {
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

    public static class ExcludeAdapter extends EnumAdapter<Exclude> {

        public ExcludeAdapter() {
            super(Exclude.class);
        }
    }
}
