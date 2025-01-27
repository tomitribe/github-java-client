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
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("org-membership")
public class OrgMembership {

    private OrganizationSimple organization;

    private URI organizationUrl;

    private Permissions permissions;

    private String role;

    private String state;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("organization")
    public OrganizationSimple getOrganization() {
        return this.organization;
    }

    @JsonbProperty("organization_url")
    public URI getOrganizationUrl() {
        return this.organizationUrl;
    }

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("role")
    public String getRole() {
        return this.role;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("user")
    public SimpleUser getUser() {
        return this.user;
    }

    @JsonbProperty("organization")
    public void setOrganization(OrganizationSimple organization) {
        this.organization = organization;
    }

    @JsonbProperty("organization_url")
    public void setOrganizationUrl(URI organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("user")
    public void setUser(SimpleUser user) {
        this.user = user;
    }
}
