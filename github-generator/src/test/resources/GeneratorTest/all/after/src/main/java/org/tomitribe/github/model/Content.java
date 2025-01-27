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
public class Content {

    private String downloadUrl;

    private String gitUrl;

    private String htmlUrl;

    private Links links;

    private String name;

    private String path;

    private String sha;

    private Integer size;

    private String type;

    private String url;

    @JsonbProperty("download_url")
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    @JsonbProperty("git_url")
    public String getGitUrl() {
        return this.gitUrl;
    }

    @JsonbProperty("html_url")
    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("size")
    public Integer getSize() {
        return this.size;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonbProperty("git_url")
    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
