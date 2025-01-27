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
import java.util.List;
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
@ComponentId("installation")
public class Installation {

    private URI accessTokensUrl;

    private Object account;

    private Integer appId;

    private String appSlug;

    private String contactEmail;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private List<String> events;

    private URI htmlUrl;

    private Integer id;

    private Permissions permissions;

    private URI repositoriesUrl;

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    private RepositorySelection repositorySelection;

    private String singleFileName;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date suspendedAt;

    private SimpleUser suspendedBy;

    private Integer targetId;

    private String targetType;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    @JsonbProperty("access_tokens_url")
    public URI getAccessTokensUrl() {
        return this.accessTokensUrl;
    }

    @JsonbProperty("account")
    public Object getAccount() {
        return this.account;
    }

    @JsonbProperty("app_id")
    public Integer getAppId() {
        return this.appId;
    }

    @JsonbProperty("app_slug")
    public String getAppSlug() {
        return this.appSlug;
    }

    @JsonbProperty("contact_email")
    public String getContactEmail() {
        return this.contactEmail;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("events")
    public List<String> getEvents() {
        return this.events;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("permissions")
    public Permissions getPermissions() {
        return this.permissions;
    }

    @JsonbProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return this.repositoriesUrl;
    }

    @JsonbTypeAdapter(RepositorySelectionAdapter.class)
    @JsonbProperty("repository_selection")
    public RepositorySelection getRepositorySelection() {
        return this.repositorySelection;
    }

    @JsonbProperty("single_file_name")
    public String getSingleFileName() {
        return this.singleFileName;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("suspended_at")
    public Date getSuspendedAt() {
        return this.suspendedAt;
    }

    @JsonbProperty("suspended_by")
    public SimpleUser getSuspendedBy() {
        return this.suspendedBy;
    }

    @JsonbProperty("target_id")
    public Integer getTargetId() {
        return this.targetId;
    }

    @JsonbProperty("target_type")
    public String getTargetType() {
        return this.targetType;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("access_tokens_url")
    public void setAccessTokensUrl(URI accessTokensUrl) {
        this.accessTokensUrl = accessTokensUrl;
    }

    @JsonbProperty("account")
    public void setAccount(Object account) {
        this.account = account;
    }

    @JsonbProperty("app_id")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @JsonbProperty("app_slug")
    public void setAppSlug(String appSlug) {
        this.appSlug = appSlug;
    }

    @JsonbProperty("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonbProperty("repositories_url")
    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    @JsonbProperty("repository_selection")
    public void setRepositorySelection(RepositorySelection repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    @JsonbProperty("single_file_name")
    public void setSingleFileName(String singleFileName) {
        this.singleFileName = singleFileName;
    }

    @JsonbProperty("suspended_at")
    public void setSuspendedAt(Date suspendedAt) {
        this.suspendedAt = suspendedAt;
    }

    @JsonbProperty("suspended_by")
    public void setSuspendedBy(SimpleUser suspendedBy) {
        this.suspendedBy = suspendedBy;
    }

    @JsonbProperty("target_id")
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    @JsonbProperty("target_type")
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public enum RepositorySelection {

        ALL("all"), SELECTED("selected");

        private final String name;

        RepositorySelection(final String name) {
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

    public static class RepositorySelectionAdapter extends EnumAdapter<RepositorySelection> {

        public RepositorySelectionAdapter() {
            super(RepositorySelection.class);
        }
    }
}
