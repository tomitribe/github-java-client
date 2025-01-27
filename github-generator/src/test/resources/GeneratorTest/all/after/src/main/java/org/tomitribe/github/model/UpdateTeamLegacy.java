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
public class UpdateTeamLegacy {

    private String description;

    private String name;

    private Integer parentTeamId;

    @JsonbTypeAdapter(PermissionAdapter.class)
    private Permission permission;

    @JsonbTypeAdapter(PrivacyAdapter.class)
    private Privacy privacy;

    @JsonbTransient
    @PathParam("team-id")
    private Integer teamId;

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("parent_team_id")
    public Integer getParentTeamId() {
        return this.parentTeamId;
    }

    @JsonbTypeAdapter(PermissionAdapter.class)
    @JsonbProperty("permission")
    public Permission getPermission() {
        return this.permission;
    }

    @JsonbTypeAdapter(PrivacyAdapter.class)
    @JsonbProperty("privacy")
    public Privacy getPrivacy() {
        return this.privacy;
    }

    @JsonbTransient
    @PathParam("team-id")
    public Integer getTeamId() {
        return this.teamId;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("parent_team_id")
    public void setParentTeamId(Integer parentTeamId) {
        this.parentTeamId = parentTeamId;
    }

    @JsonbProperty("permission")
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @JsonbProperty("privacy")
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    @JsonbTransient
    @PathParam("team-id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public enum Permission {

        PULL("pull"), PUSH("push"), ADMIN("admin");

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

    public enum Privacy {

        SECRET("secret"), CLOSED("closed");

        private final String name;

        Privacy(final String name) {
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

    public static class PrivacyAdapter extends EnumAdapter<Privacy> {

        public PrivacyAdapter() {
            super(Privacy.class);
        }
    }
}
