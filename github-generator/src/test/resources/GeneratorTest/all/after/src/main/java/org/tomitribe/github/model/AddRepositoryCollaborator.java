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
public class AddRepositoryCollaborator {

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTypeAdapter(PermissionAdapter.class)
    private Permission permission;

    private String permissions;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("username")
    private String username;

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTypeAdapter(PermissionAdapter.class)
    @JsonbProperty("permission")
    public Permission getPermission() {
        return this.permission;
    }

    @JsonbProperty("permissions")
    public String getPermissions() {
        return this.permissions;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTransient
    @PathParam("username")
    public String getUsername() {
        return this.username;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbProperty("permission")
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @JsonbProperty("permissions")
    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbTransient
    @PathParam("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public enum Permission {

        PULL("pull"), PUSH("push"), ADMIN("admin"), MAINTAIN("maintain"), TRIAGE("triage");

        private final String name;

        Permission(final String name) {
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

    public static class PermissionAdapter extends EnumAdapter<Permission> {

        public PermissionAdapter() {
            super(Permission.class);
        }
    }
}
