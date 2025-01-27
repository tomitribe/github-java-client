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
public class File {

    private String content;

    private String filename;

    private String language;

    private String rawUrl;

    private Integer size;

    private Boolean truncated;

    private String type;

    @JsonbProperty("content")
    public String getContent() {
        return this.content;
    }

    @JsonbProperty("filename")
    public String getFilename() {
        return this.filename;
    }

    @JsonbProperty("language")
    public String getLanguage() {
        return this.language;
    }

    @JsonbProperty("raw_url")
    public String getRawUrl() {
        return this.rawUrl;
    }

    @JsonbProperty("size")
    public Integer getSize() {
        return this.size;
    }

    @JsonbProperty("truncated")
    public Boolean getTruncated() {
        return this.truncated;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonbProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonbProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonbProperty("raw_url")
    public void setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
    }

    @JsonbProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonbProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }
}
