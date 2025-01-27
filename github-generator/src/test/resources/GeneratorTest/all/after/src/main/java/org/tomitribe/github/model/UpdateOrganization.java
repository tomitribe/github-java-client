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
public class UpdateOrganization {

    private String billingEmail;

    private String blog;

    private String company;

    @JsonbTypeAdapter(DefaultRepositoryPermissionAdapter.class)
    private DefaultRepositoryPermission defaultRepositoryPermission;

    private String description;

    private String email;

    private Boolean hasOrganizationProjects;

    private Boolean hasRepositoryProjects;

    private String location;

    @JsonbTypeAdapter(MembersAllowedRepositoryCreationTypeAdapter.class)
    private MembersAllowedRepositoryCreationType membersAllowedRepositoryCreationType;

    private Boolean membersCanCreateInternalRepositories;

    private Boolean membersCanCreatePrivateRepositories;

    private Boolean membersCanCreatePublicRepositories;

    private Boolean membersCanCreateRepositories;

    private String name;

    @JsonbTransient
    @PathParam("org")
    private String org;

    private String twitterUsername;

    @JsonbProperty("billing_email")
    public String getBillingEmail() {
        return this.billingEmail;
    }

    @JsonbProperty("blog")
    public String getBlog() {
        return this.blog;
    }

    @JsonbProperty("company")
    public String getCompany() {
        return this.company;
    }

    @JsonbTypeAdapter(DefaultRepositoryPermissionAdapter.class)
    @JsonbProperty("default_repository_permission")
    public DefaultRepositoryPermission getDefaultRepositoryPermission() {
        return this.defaultRepositoryPermission;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("has_organization_projects")
    public Boolean getHasOrganizationProjects() {
        return this.hasOrganizationProjects;
    }

    @JsonbProperty("has_repository_projects")
    public Boolean getHasRepositoryProjects() {
        return this.hasRepositoryProjects;
    }

    @JsonbProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonbTypeAdapter(MembersAllowedRepositoryCreationTypeAdapter.class)
    @JsonbProperty("members_allowed_repository_creation_type")
    public MembersAllowedRepositoryCreationType getMembersAllowedRepositoryCreationType() {
        return this.membersAllowedRepositoryCreationType;
    }

    @JsonbProperty("members_can_create_internal_repositories")
    public Boolean getMembersCanCreateInternalRepositories() {
        return this.membersCanCreateInternalRepositories;
    }

    @JsonbProperty("members_can_create_private_repositories")
    public Boolean getMembersCanCreatePrivateRepositories() {
        return this.membersCanCreatePrivateRepositories;
    }

    @JsonbProperty("members_can_create_public_repositories")
    public Boolean getMembersCanCreatePublicRepositories() {
        return this.membersCanCreatePublicRepositories;
    }

    @JsonbProperty("members_can_create_repositories")
    public Boolean getMembersCanCreateRepositories() {
        return this.membersCanCreateRepositories;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbProperty("twitter_username")
    public String getTwitterUsername() {
        return this.twitterUsername;
    }

    @JsonbProperty("billing_email")
    public void setBillingEmail(String billingEmail) {
        this.billingEmail = billingEmail;
    }

    @JsonbProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    @JsonbProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonbProperty("default_repository_permission")
    public void setDefaultRepositoryPermission(DefaultRepositoryPermission defaultRepositoryPermission) {
        this.defaultRepositoryPermission = defaultRepositoryPermission;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("has_organization_projects")
    public void setHasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    @JsonbProperty("has_repository_projects")
    public void setHasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    @JsonbProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonbProperty("members_allowed_repository_creation_type")
    public void setMembersAllowedRepositoryCreationType(MembersAllowedRepositoryCreationType membersAllowedRepositoryCreationType) {
        this.membersAllowedRepositoryCreationType = membersAllowedRepositoryCreationType;
    }

    @JsonbProperty("members_can_create_internal_repositories")
    public void setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) {
        this.membersCanCreateInternalRepositories = membersCanCreateInternalRepositories;
    }

    @JsonbProperty("members_can_create_private_repositories")
    public void setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) {
        this.membersCanCreatePrivateRepositories = membersCanCreatePrivateRepositories;
    }

    @JsonbProperty("members_can_create_public_repositories")
    public void setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) {
        this.membersCanCreatePublicRepositories = membersCanCreatePublicRepositories;
    }

    @JsonbProperty("members_can_create_repositories")
    public void setMembersCanCreateRepositories(Boolean membersCanCreateRepositories) {
        this.membersCanCreateRepositories = membersCanCreateRepositories;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonbProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public enum DefaultRepositoryPermission {

        READ("read"), WRITE("write"), ADMIN("admin"), NONE("none");

        private final String name;

        DefaultRepositoryPermission(final String name) {
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

    public static class DefaultRepositoryPermissionAdapter extends EnumAdapter<DefaultRepositoryPermission> {

        public DefaultRepositoryPermissionAdapter() {
            super(DefaultRepositoryPermission.class);
        }
    }

    public enum MembersAllowedRepositoryCreationType {

        ALL("all"), PRIVATE("private"), NONE("none");

        private final String name;

        MembersAllowedRepositoryCreationType(final String name) {
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

    public static class MembersAllowedRepositoryCreationTypeAdapter extends EnumAdapter<MembersAllowedRepositoryCreationType> {

        public MembersAllowedRepositoryCreationTypeAdapter() {
            super(MembersAllowedRepositoryCreationType.class);
        }
    }
}
