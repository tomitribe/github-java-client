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
public class UpdateRepositoryInvitation {

    @JsonbTransient
    @PathParam("invitation_id")
    private Integer invitationId;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTypeAdapter(PermissionsAdapter.class)
    private Permissions permissions;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("invitation_id")
    public Integer getInvitationId() {
        return this.invitationId;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTypeAdapter(PermissionsAdapter.class)
    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @PathParam("invitation_id")
    public void setInvitationId(Integer invitationId) {
        this.invitationId = invitationId;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    public enum Permissions {

        READ("read"), WRITE("write"), MAINTAIN("maintain"), TRIAGE("triage"), ADMIN("admin");

        private final String name;

        Permissions(final String name) {
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

    public static class PermissionsAdapter extends EnumAdapter<Permissions> {

        public PermissionsAdapter() {
            super(Permissions.class);
        }
    }
}
