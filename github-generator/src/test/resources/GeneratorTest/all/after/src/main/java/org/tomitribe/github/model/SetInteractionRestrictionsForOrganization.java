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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetInteractionRestrictionsForOrganization {

    @JsonbTypeAdapter(LimitAdapter.class)
    private Limit limit;

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTypeAdapter(LimitAdapter.class)
    @JsonbProperty("limit")
    public Limit getLimit() {
        return this.limit;
    }

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbProperty("limit")
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    public enum Limit {

        EXISTING_USERS("existing_users"), CONTRIBUTORS_ONLY("contributors_only"), COLLABORATORS_ONLY("collaborators_only");

        private final String name;

        Limit(final String name) {
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

    public static class LimitAdapter extends EnumAdapter<Limit> {

        public LimitAdapter() {
            super(Limit.class);
        }
    }
}
