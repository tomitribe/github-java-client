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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
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
public class CreateOrUpdateOrganizationSecret {

    private String encryptedValue;

    private String keyId;

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTransient
    @PathParam("secret_name")
    private String secretName;

    private List<String> selectedRepositoryIds;

    @JsonbTypeAdapter(VisibilityAdapter.class)
    private Visibility visibility;

    @JsonbProperty("encrypted_value")
    public String getEncryptedValue() {
        return this.encryptedValue;
    }

    @JsonbProperty("key_id")
    public String getKeyId() {
        return this.keyId;
    }

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbTransient
    @PathParam("secret_name")
    public String getSecretName() {
        return this.secretName;
    }

    @JsonbProperty("selected_repository_ids")
    public List<String> getSelectedRepositoryIds() {
        return this.selectedRepositoryIds;
    }

    @JsonbTypeAdapter(VisibilityAdapter.class)
    @JsonbProperty("visibility")
    public Visibility getVisibility() {
        return this.visibility;
    }

    @JsonbProperty("encrypted_value")
    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    @JsonbProperty("key_id")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonbTransient
    @PathParam("secret_name")
    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    @JsonbProperty("selected_repository_ids")
    public void setSelectedRepositoryIds(List<String> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
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
