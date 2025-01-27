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
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("authorization")
public class Authorization {

    private App app;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String fingerprint;

    private String hashedToken;

    private Integer id;

    private ScopedInstallation installation;

    private String note;

    private URI noteUrl;

    private List<String> scopes;

    private String token;

    private String tokenLastEight;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    private SimpleUser user;

    @JsonbProperty("app")
    public App getApp() {
        return this.app;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("fingerprint")
    public String getFingerprint() {
        return this.fingerprint;
    }

    @JsonbProperty("hashed_token")
    public String getHashedToken() {
        return this.hashedToken;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("installation")
    public ScopedInstallation getInstallation() {
        return this.installation;
    }

    @JsonbProperty("note")
    public String getNote() {
        return this.note;
    }

    @JsonbProperty("note_url")
    public URI getNoteUrl() {
        return this.noteUrl;
    }

    @JsonbProperty("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }

    @JsonbProperty("token")
    public String getToken() {
        return this.token;
    }

    @JsonbProperty("token_last_eight")
    public String getTokenLastEight() {
        return this.tokenLastEight;
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

    @JsonbProperty("user")
    public SimpleUser getUser() {
        return this.user;
    }

    @JsonbProperty("app")
    public void setApp(App app) {
        this.app = app;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("fingerprint")
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @JsonbProperty("hashed_token")
    public void setHashedToken(String hashedToken) {
        this.hashedToken = hashedToken;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("installation")
    public void setInstallation(ScopedInstallation installation) {
        this.installation = installation;
    }

    @JsonbProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonbProperty("note_url")
    public void setNoteUrl(URI noteUrl) {
        this.noteUrl = noteUrl;
    }

    @JsonbProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonbProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonbProperty("token_last_eight")
    public void setTokenLastEight(String tokenLastEight) {
        this.tokenLastEight = tokenLastEight;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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
