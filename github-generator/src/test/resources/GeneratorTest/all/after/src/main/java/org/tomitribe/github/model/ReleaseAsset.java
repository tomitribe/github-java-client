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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.net.URI;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("release-asset")
public class ReleaseAsset {

    private URI browserDownloadUrl;

    private String contentType;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Integer downloadCount;

    private Integer id;

    private String label;

    private String name;

    private String nodeId;

    private Integer size;

    @JsonbTypeAdapter(StateAdapter.class)
    private State state;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    private SimpleUser uploader;

    private URI url;

    @JsonbProperty("browser_download_url")
    public URI getBrowserDownloadUrl() {
        return this.browserDownloadUrl;
    }

    @JsonbProperty("content_type")
    public String getContentType() {
        return this.contentType;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("download_count")
    public Integer getDownloadCount() {
        return this.downloadCount;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("label")
    public String getLabel() {
        return this.label;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("size")
    public Integer getSize() {
        return this.size;
    }

    @JsonbTypeAdapter(StateAdapter.class)
    @JsonbProperty("state")
    public State getState() {
        return this.state;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("uploader")
    public SimpleUser getUploader() {
        return this.uploader;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("browser_download_url")
    public void setBrowserDownloadUrl(URI browserDownloadUrl) {
        this.browserDownloadUrl = browserDownloadUrl;
    }

    @JsonbProperty("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("download_count")
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonbProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("uploader")
    public void setUploader(SimpleUser uploader) {
        this.uploader = uploader;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum State {

        UPLOADED("uploaded");

        private final String name;

        State(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class StateAdapter extends EnumAdapter<State> {

        public StateAdapter() {
            super(State.class);
        }
    }
}
