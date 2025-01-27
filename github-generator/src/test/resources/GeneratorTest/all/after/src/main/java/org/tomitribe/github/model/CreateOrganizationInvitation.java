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
public class CreateOrganizationInvitation {

    private String email;

    private Integer inviteeId;

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTypeAdapter(RoleAdapter.class)
    private Role role;

    private List<Integer> teamIds;

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("invitee_id")
    public Integer getInviteeId() {
        return this.inviteeId;
    }

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbTypeAdapter(RoleAdapter.class)
    @JsonbProperty("role")
    public Role getRole() {
        return this.role;
    }

    @JsonbProperty("team_ids")
    public List<Integer> getTeamIds() {
        return this.teamIds;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("invitee_id")
    public void setInviteeId(Integer inviteeId) {
        this.inviteeId = inviteeId;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonbProperty("role")
    public void setRole(Role role) {
        this.role = role;
    }

    @JsonbProperty("team_ids")
    public void setTeamIds(List<Integer> teamIds) {
        this.teamIds = teamIds;
    }

    public enum Role {

        ADMIN("admin"), DIRECT_MEMBER("direct_member"), BILLING_MANAGER("billing_manager");

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
