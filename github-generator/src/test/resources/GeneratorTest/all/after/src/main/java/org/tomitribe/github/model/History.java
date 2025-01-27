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
public class History {

    private ChangeStatus changeStatus;

    private String committedAt;

    private String url;

    private User user;

    private String version;

    @JsonbProperty("change_status")
    public ChangeStatus getChangeStatus() {
        return this.changeStatus;
    }

    @JsonbProperty("committed_at")
    public String getCommittedAt() {
        return this.committedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("user")
    public User getUser() {
        return this.user;
    }

    @JsonbProperty("version")
    public String getVersion() {
        return this.version;
    }

    @JsonbProperty("change_status")
    public void setChangeStatus(ChangeStatus changeStatus) {
        this.changeStatus = changeStatus;
    }

    @JsonbProperty("committed_at")
    public void setCommittedAt(String committedAt) {
        this.committedAt = committedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonbProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonbProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }
}
