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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Config {

    private String address;

    private String contentType;

    private String digest;

    private String email;

    private String insecureSsl;

    private String password;

    private String room;

    private String secret;

    private String subdomain;

    private String token;

    private String url;

    private String username;

    @JsonbProperty("address")
    public String getAddress() {
        return this.address;
    }

    @JsonbProperty("content_type")
    public String getContentType() {
        return this.contentType;
    }

    @JsonbProperty("digest")
    public String getDigest() {
        return this.digest;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("insecure_ssl")
    public String getInsecureSsl() {
        return this.insecureSsl;
    }

    @JsonbProperty("password")
    public String getPassword() {
        return this.password;
    }

    @JsonbProperty("room")
    public String getRoom() {
        return this.room;
    }

    @JsonbProperty("secret")
    public String getSecret() {
        return this.secret;
    }

    @JsonbProperty("subdomain")
    public String getSubdomain() {
        return this.subdomain;
    }

    @JsonbProperty("token")
    public String getToken() {
        return this.token;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("username")
    public String getUsername() {
        return this.username;
    }

    @JsonbProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonbProperty("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonbProperty("digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("insecure_ssl")
    public void setInsecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    @JsonbProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonbProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    @JsonbProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @JsonbProperty("subdomain")
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    @JsonbProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }
}
