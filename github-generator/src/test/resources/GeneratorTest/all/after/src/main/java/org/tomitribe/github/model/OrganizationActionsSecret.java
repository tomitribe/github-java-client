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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("organization-actions-secret")
public class OrganizationActionsSecret {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String name;

    private URI selectedRepositoriesUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    @JsonbTypeAdapter(VisibilityAdapter.class)
    private Visibility visibility;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("selected_repositories_url")
    public URI getSelectedRepositoriesUrl() {
        return this.selectedRepositoriesUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbTypeAdapter(VisibilityAdapter.class)
    @JsonbProperty("visibility")
    public Visibility getVisibility() {
        return this.visibility;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("selected_repositories_url")
    public void setSelectedRepositoriesUrl(URI selectedRepositoriesUrl) {
        this.selectedRepositoriesUrl = selectedRepositoriesUrl;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public enum Visibility {

        ALL("all"), PRIVATE("private"), SELECTED("selected");

        private final String name;

        Visibility(final String name) {
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

    public static class VisibilityAdapter extends EnumAdapter<Visibility> {

        public VisibilityAdapter() {
            super(Visibility.class);
        }
    }
}
