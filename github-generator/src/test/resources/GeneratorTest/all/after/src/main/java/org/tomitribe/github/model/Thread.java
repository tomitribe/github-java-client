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
@ComponentId("thread")
public class Thread {

    private String id;

    private String lastReadAt;

    private String reason;

    private MinimalRepository repository;

    private Subject subject;

    private String subscriptionUrl;

    private Boolean unread;

    private String updatedAt;

    private String url;

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("last_read_at")
    public String getLastReadAt() {
        return this.lastReadAt;
    }

    @JsonbProperty("reason")
    public String getReason() {
        return this.reason;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("subject")
    public Subject getSubject() {
        return this.subject;
    }

    @JsonbProperty("subscription_url")
    public String getSubscriptionUrl() {
        return this.subscriptionUrl;
    }

    @JsonbProperty("unread")
    public Boolean getUnread() {
        return this.unread;
    }

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonbProperty("last_read_at")
    public void setLastReadAt(String lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    @JsonbProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @JsonbProperty("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    @JsonbProperty("unread")
    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
