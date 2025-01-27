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
@ComponentId("key")
public class Key {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Integer id;

    private String key;

    private String keyId;

    private Boolean readOnly;

    private String title;

    private String url;

    private Boolean verified;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("key")
    public String getKey() {
        return this.key;
    }

    @JsonbProperty("key_id")
    public String getKeyId() {
        return this.keyId;
    }

    @JsonbProperty("read_only")
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("verified")
    public Boolean getVerified() {
        return this.verified;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonbProperty("key_id")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @JsonbProperty("read_only")
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
