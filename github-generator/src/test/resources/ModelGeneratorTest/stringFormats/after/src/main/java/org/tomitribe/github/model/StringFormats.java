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
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.InstantAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StringFormats {

    private URI avatarUrl;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant createdAt;

    private String displayLogin;

    private String gravatarId;

    private Integer id;

    private String login;

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant updatedAt;

    private URI url;

    @JsonbProperty("avatar_url")
    public URI getAvatarUrl() {
        return this.avatarUrl;
    }

    @JsonbProperty("created_at")
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("display_login")
    public String getDisplayLogin() {
        return this.displayLogin;
    }

    @JsonbProperty("gravatar_id")
    public String getGravatarId() {
        return this.gravatarId;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("updated_at")
    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("avatar_url")
    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("display_login")
    public void setDisplayLogin(String displayLogin) {
        this.displayLogin = displayLogin;
    }

    @JsonbProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
