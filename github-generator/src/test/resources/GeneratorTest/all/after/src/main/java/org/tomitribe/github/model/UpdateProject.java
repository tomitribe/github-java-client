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
public class UpdateProject {

    private Boolean _private;

    private String body;

    private String name;

    @JsonbTypeAdapter(OrganizationPermissionAdapter.class)
    private OrganizationPermission organizationPermission;

    @JsonbTransient
    @PathParam("project-id")
    private Integer projectId;

    private String state;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbTypeAdapter(OrganizationPermissionAdapter.class)
    @JsonbProperty("organization_permission")
    public OrganizationPermission getOrganizationPermission() {
        return this.organizationPermission;
    }

    @JsonbTransient
    @PathParam("project-id")
    public Integer getProjectId() {
        return this.projectId;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("organization_permission")
    public void setOrganizationPermission(OrganizationPermission organizationPermission) {
        this.organizationPermission = organizationPermission;
    }

    @JsonbTransient
    @PathParam("project-id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("private")
    public void set_private(Boolean _private) {
        this._private = _private;
    }

    public enum OrganizationPermission {

        READ("read"), WRITE("write"), ADMIN("admin"), NONE("none");

        private final String name;

        OrganizationPermission(final String name) {
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

    public static class OrganizationPermissionAdapter extends EnumAdapter<OrganizationPermission> {

        public OrganizationPermissionAdapter() {
            super(OrganizationPermission.class);
        }
    }
}
