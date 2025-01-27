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
@ComponentId("credential-authorization")
public class CredentialAuthorization {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date credentialAccessedAt;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date credentialAuthorizedAt;

    private Integer credentialId;

    private String credentialType;

    private String fingerprint;

    private String login;

    private List<String> scopes;

    private String tokenLastEight;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("credential_accessed_at")
    public Date getCredentialAccessedAt() {
        return this.credentialAccessedAt;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("credential_authorized_at")
    public Date getCredentialAuthorizedAt() {
        return this.credentialAuthorizedAt;
    }

    @JsonbProperty("credential_id")
    public Integer getCredentialId() {
        return this.credentialId;
    }

    @JsonbProperty("credential_type")
    public String getCredentialType() {
        return this.credentialType;
    }

    @JsonbProperty("fingerprint")
    public String getFingerprint() {
        return this.fingerprint;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }

    @JsonbProperty("token_last_eight")
    public String getTokenLastEight() {
        return this.tokenLastEight;
    }

    @JsonbProperty("credential_accessed_at")
    public void setCredentialAccessedAt(Date credentialAccessedAt) {
        this.credentialAccessedAt = credentialAccessedAt;
    }

    @JsonbProperty("credential_authorized_at")
    public void setCredentialAuthorizedAt(Date credentialAuthorizedAt) {
        this.credentialAuthorizedAt = credentialAuthorizedAt;
    }

    @JsonbProperty("credential_id")
    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    @JsonbProperty("credential_type")
    public void setCredentialType(String credentialType) {
        this.credentialType = credentialType;
    }

    @JsonbProperty("fingerprint")
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonbProperty("token_last_eight")
    public void setTokenLastEight(String tokenLastEight) {
        this.tokenLastEight = tokenLastEight;
    }
}
