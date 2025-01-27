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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.net.URI;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("project")
public class Project {

    private Boolean _private;

    private String body;

    private URI cardsUrl;

    private URI columnsUrl;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private SimpleUser creator;

    private URI htmlUrl;

    private Integer id;

    private String name;

    private String nodeId;

    private Integer number;

    @JsonbTypeAdapter(OrganizationPermissionAdapter.class)
    private OrganizationPermission organizationPermission;

    private URI ownerUrl;

    private Permissions permissions;

    private String state;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("cards_url")
    public URI getCardsUrl() {
        return this.cardsUrl;
    }

    @JsonbProperty("columns_url")
    public URI getColumnsUrl() {
        return this.columnsUrl;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("creator")
    public SimpleUser getCreator() {
        return this.creator;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbTypeAdapter(OrganizationPermissionAdapter.class)
    @JsonbProperty("organization_permission")
    public OrganizationPermission getOrganizationPermission() {
        return this.organizationPermission;
    }

    @JsonbProperty("owner_url")
    public URI getOwnerUrl() {
        return this.ownerUrl;
    }

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("cards_url")
    public void setCardsUrl(URI cardsUrl) {
        this.cardsUrl = cardsUrl;
    }

    @JsonbProperty("columns_url")
    public void setColumnsUrl(URI columnsUrl) {
        this.columnsUrl = columnsUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("creator")
    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("organization_permission")
    public void setOrganizationPermission(OrganizationPermission organizationPermission) {
        this.organizationPermission = organizationPermission;
    }

    @JsonbProperty("owner_url")
    public void setOwnerUrl(URI ownerUrl) {
        this.ownerUrl = ownerUrl;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
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
