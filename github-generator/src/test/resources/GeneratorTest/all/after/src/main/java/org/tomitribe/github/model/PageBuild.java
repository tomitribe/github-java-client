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
@ComponentId("page-build")
public class PageBuild {

    private String commit;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Integer duration;

    private Error error;

    private SimpleUser pusher;

    private String status;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private URI url;

    @JsonbProperty("commit")
    public String getCommit() {
        return this.commit;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("duration")
    public Integer getDuration() {
        return this.duration;
    }

    @JsonbProperty("error")
    public Error getError() {
        return this.error;
    }

    @JsonbProperty("pusher")
    public SimpleUser getPusher() {
        return this.pusher;
    }

    @JsonbProperty("status")
    public String getStatus() {
        return this.status;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("commit")
    public void setCommit(String commit) {
        this.commit = commit;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonbProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

    @JsonbProperty("pusher")
    public void setPusher(SimpleUser pusher) {
        this.pusher = pusher;
    }

    @JsonbProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
