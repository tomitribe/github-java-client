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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListTeamMembers {

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTransient
    @QueryParam("role")
    @JsonbTypeAdapter(RoleAdapter.class)
    private Role role;

    @JsonbTransient
    @PathParam("team_slug")
    private String teamSlug;

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbTypeAdapter(RoleAdapter.class)
    @JsonbTransient
    @QueryParam("role")
    public Role getRole() {
        return this.role;
    }

    @JsonbTransient
    @PathParam("team_slug")
    public String getTeamSlug() {
        return this.teamSlug;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonbTransient
    @QueryParam("role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonbTransient
    @PathParam("team_slug")
    public void setTeamSlug(String teamSlug) {
        this.teamSlug = teamSlug;
    }

    public enum Role {

        MEMBER("member"), MAINTAINER("maintainer"), ALL("all");

        private final String name;

        Role(final String name) {
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

    public static class RoleAdapter extends EnumAdapter<Role> {

        public RoleAdapter() {
            super(Role.class);
        }
    }
}
