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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("actions-public-key")
public class ActionsPublicKey {

    private String createdAt;

    private Integer id;

    private String key;

    private String keyId;

    private String title;

    private String url;

    @JsonbProperty("created_at")
    public String getCreatedAt() {
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

    @JsonbProperty("title")
    public String getTitle() {
        return this.title;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(String createdAt) {
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

    @JsonbProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
