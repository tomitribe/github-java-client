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
import jakarta.ws.rs.PathParam;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetOrCreateAuthorizationForSpecificAppAndFingerprint {

    @JsonbTransient
    @PathParam("client-id")
    private String clientId;

    private String clientSecret;

    @JsonbTransient
    @PathParam("fingerprint")
    private String fingerprint;

    private String note;

    private String noteUrl;

    private List<String> scopes;

    @JsonbTransient
    @PathParam("client-id")
    public String getClientId() {
        return this.clientId;
    }

    @JsonbProperty("client_secret")
    public String getClientSecret() {
        return this.clientSecret;
    }

    @JsonbTransient
    @PathParam("fingerprint")
    public String getFingerprint() {
        return this.fingerprint;
    }

    @JsonbProperty("note")
    public String getNote() {
        return this.note;
    }

    @JsonbProperty("note_url")
    public String getNoteUrl() {
        return this.noteUrl;
    }

    @JsonbProperty("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }

    @JsonbTransient
    @PathParam("client-id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonbProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @JsonbTransient
    @PathParam("fingerprint")
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    @JsonbProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonbProperty("note_url")
    public void setNoteUrl(String noteUrl) {
        this.noteUrl = noteUrl;
    }

    @JsonbProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}
