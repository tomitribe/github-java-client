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
@ComponentId("thread-subscription")
public class ThreadSubscription {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Boolean ignored;

    private String reason;

    private URI repositoryUrl;

    private Boolean subscribed;

    private URI threadUrl;

    private URI url;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("ignored")
    public Boolean getIgnored() {
        return this.ignored;
    }

    @JsonbProperty("reason")
    public String getReason() {
        return this.reason;
    }

    @JsonbProperty("repository_url")
    public URI getRepositoryUrl() {
        return this.repositoryUrl;
    }

    @JsonbProperty("subscribed")
    public Boolean getSubscribed() {
        return this.subscribed;
    }

    @JsonbProperty("thread_url")
    public URI getThreadUrl() {
        return this.threadUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("ignored")
    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    @JsonbProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonbProperty("repository_url")
    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonbProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonbProperty("thread_url")
    public void setThreadUrl(URI threadUrl) {
        this.threadUrl = threadUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
