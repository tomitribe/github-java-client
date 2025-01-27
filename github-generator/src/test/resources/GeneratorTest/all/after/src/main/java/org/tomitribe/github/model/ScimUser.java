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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("scim-user")
public class ScimUser {

    private Boolean active;

    private String displayName;

    private List<Emails> emails;

    private String externalId;

    private List<Groups> groups;

    private String id;

    private Meta meta;

    private Name name;

    private List<Operations> operations;

    private Integer organizationId;

    private List<String> schemas;

    private String userName;

    @JsonbProperty("active")
    public Boolean getActive() {
        return this.active;
    }

    @JsonbProperty("displayName")
    public String getDisplayName() {
        return this.displayName;
    }

    @JsonbProperty("emails")
    public List<Emails> getEmails() {
        return this.emails;
    }

    @JsonbProperty("externalId")
    public String getExternalId() {
        return this.externalId;
    }

    @JsonbProperty("groups")
    public List<Groups> getGroups() {
        return this.groups;
    }

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("meta")
    public Meta getMeta() {
        return this.meta;
    }

    @JsonbProperty("name")
    public Name getName() {
        return this.name;
    }

    @JsonbProperty("operations")
    public List<Operations> getOperations() {
        return this.operations;
    }

    @JsonbProperty("organization_id")
    public Integer getOrganizationId() {
        return this.organizationId;
    }

    @JsonbProperty("schemas")
    public List<String> getSchemas() {
        return this.schemas;
    }

    @JsonbProperty("userName")
    public String getUserName() {
        return this.userName;
    }

    @JsonbProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonbProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonbProperty("emails")
    public void setEmails(List<Emails> emails) {
        this.emails = emails;
    }

    @JsonbProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonbProperty("groups")
    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonbProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonbProperty("operations")
    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    @JsonbProperty("organization_id")
    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @JsonbProperty("schemas")
    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    @JsonbProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
