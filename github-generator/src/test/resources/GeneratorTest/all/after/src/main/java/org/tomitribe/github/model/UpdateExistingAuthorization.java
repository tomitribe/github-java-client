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
public class UpdateExistingAuthorization {

    private List<String> addScopes;

    @JsonbTransient
    @PathParam("authorization_id")
    private Integer authorizationId;

    private String fingerprint;

    private String note;

    private String noteUrl;

    private List<String> removeScopes;

    private List<String> scopes;

    @JsonbProperty("add_scopes")
    public List<String> getAddScopes() {
        return this.addScopes;
    }

    @JsonbTransient
    @PathParam("authorization_id")
    public Integer getAuthorizationId() {
        return this.authorizationId;
    }

    @JsonbProperty("fingerprint")
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

    @JsonbProperty("remove_scopes")
    public List<String> getRemoveScopes() {
        return this.removeScopes;
    }

    @JsonbProperty("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }

    @JsonbProperty("add_scopes")
    public void setAddScopes(List<String> addScopes) {
        this.addScopes = addScopes;
    }

    @JsonbTransient
    @PathParam("authorization_id")
    public void setAuthorizationId(Integer authorizationId) {
        this.authorizationId = authorizationId;
    }

    @JsonbProperty("fingerprint")
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

    @JsonbProperty("remove_scopes")
    public void setRemoveScopes(List<String> removeScopes) {
        this.removeScopes = removeScopes;
    }

    @JsonbProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
}
