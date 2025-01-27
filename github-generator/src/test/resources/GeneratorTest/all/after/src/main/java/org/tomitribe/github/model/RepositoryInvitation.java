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
@ComponentId("repository-invitation")
public class RepositoryInvitation {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String htmlUrl;

    private Integer id;

    private SimpleUser invitee;

    private SimpleUser inviter;

    private String nodeId;

    @JsonbTypeAdapter(PermissionsAdapter.class)
    private Permissions permissions;

    private MinimalRepository repository;

    private String url;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("invitee")
    public SimpleUser getInvitee() {
        return this.invitee;
    }

    @JsonbProperty("inviter")
    public SimpleUser getInviter() {
        return this.inviter;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbTypeAdapter(PermissionsAdapter.class)
    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("invitee")
    public void setInvitee(SimpleUser invitee) {
        this.invitee = invitee;
    }

    @JsonbProperty("inviter")
    public void setInviter(SimpleUser inviter) {
        this.inviter = inviter;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public enum Permissions {

        READ("read"), WRITE("write"), ADMIN("admin");

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
