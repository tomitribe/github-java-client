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
@ComponentId("gpg-key")
public class GpgKey {

    private Boolean canCertify;

    private Boolean canEncryptComms;

    private Boolean canEncryptStorage;

    private Boolean canSign;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private List<Emails> emails;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date expiresAt;

    private Integer id;

    private String keyId;

    private Integer primaryKeyId;

    private String publicKey;

    private String rawKey;

    private List<Subkeys> subkeys;

    @JsonbProperty("can_certify")
    public Boolean getCanCertify() {
        return this.canCertify;
    }

    @JsonbProperty("can_encrypt_comms")
    public Boolean getCanEncryptComms() {
        return this.canEncryptComms;
    }

    @JsonbProperty("can_encrypt_storage")
    public Boolean getCanEncryptStorage() {
        return this.canEncryptStorage;
    }

    @JsonbProperty("can_sign")
    public Boolean getCanSign() {
        return this.canSign;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("emails")
    public List<Emails> getEmails() {
        return this.emails;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("expires_at")
    public Date getExpiresAt() {
        return this.expiresAt;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("key_id")
    public String getKeyId() {
        return this.keyId;
    }

    @JsonbProperty("primary_key_id")
    public Integer getPrimaryKeyId() {
        return this.primaryKeyId;
    }

    @JsonbProperty("public_key")
    public String getPublicKey() {
        return this.publicKey;
    }

    @JsonbProperty("raw_key")
    public String getRawKey() {
        return this.rawKey;
    }

    @JsonbProperty("subkeys")
    public List<Subkeys> getSubkeys() {
        return this.subkeys;
    }

    @JsonbProperty("can_certify")
    public void setCanCertify(Boolean canCertify) {
        this.canCertify = canCertify;
    }

    @JsonbProperty("can_encrypt_comms")
    public void setCanEncryptComms(Boolean canEncryptComms) {
        this.canEncryptComms = canEncryptComms;
    }

    @JsonbProperty("can_encrypt_storage")
    public void setCanEncryptStorage(Boolean canEncryptStorage) {
        this.canEncryptStorage = canEncryptStorage;
    }

    @JsonbProperty("can_sign")
    public void setCanSign(Boolean canSign) {
        this.canSign = canSign;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("emails")
    public void setEmails(List<Emails> emails) {
        this.emails = emails;
    }

    @JsonbProperty("expires_at")
    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("key_id")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @JsonbProperty("primary_key_id")
    public void setPrimaryKeyId(Integer primaryKeyId) {
        this.primaryKeyId = primaryKeyId;
    }

    @JsonbProperty("public_key")
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @JsonbProperty("raw_key")
    public void setRawKey(String rawKey) {
        this.rawKey = rawKey;
    }

    @JsonbProperty("subkeys")
    public void setSubkeys(List<Subkeys> subkeys) {
        this.subkeys = subkeys;
    }
}
