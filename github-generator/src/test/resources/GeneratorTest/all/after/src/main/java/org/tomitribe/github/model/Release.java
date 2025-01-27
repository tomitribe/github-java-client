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
@ComponentId("release")
public class Release {

    private List<ReleaseAsset> assets;

    private URI assetsUrl;

    private SimpleUser author;

    private String body;

    private String bodyHtml;

    private String bodyText;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private Boolean draft;

    private URI htmlUrl;

    private Integer id;

    private String name;

    private String nodeId;

    private Boolean prerelease;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date publishedAt;

    private String tagName;

    private URI tarballUrl;

    private String targetCommitish;

    private String uploadUrl;

    private URI url;

    private URI zipballUrl;

    @JsonbProperty("assets")
    public List<ReleaseAsset> getAssets() {
        return this.assets;
    }

    @JsonbProperty("assets_url")
    public URI getAssetsUrl() {
        return this.assetsUrl;
    }

    @JsonbProperty("author")
    public SimpleUser getAuthor() {
        return this.author;
    }

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbProperty("body_html")
    public String getBodyHtml() {
        return this.bodyHtml;
    }

    @JsonbProperty("body_text")
    public String getBodyText() {
        return this.bodyText;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("draft")
    public Boolean getDraft() {
        return this.draft;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("node_id")
    public String getNodeId() {
        return this.nodeId;
    }

    @JsonbProperty("prerelease")
    public Boolean getPrerelease() {
        return this.prerelease;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("published_at")
    public Date getPublishedAt() {
        return this.publishedAt;
    }

    @JsonbProperty("tag_name")
    public String getTagName() {
        return this.tagName;
    }

    @JsonbProperty("tarball_url")
    public URI getTarballUrl() {
        return this.tarballUrl;
    }

    @JsonbProperty("target_commitish")
    public String getTargetCommitish() {
        return this.targetCommitish;
    }

    @JsonbProperty("upload_url")
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("zipball_url")
    public URI getZipballUrl() {
        return this.zipballUrl;
    }

    @JsonbProperty("assets")
    public void setAssets(List<ReleaseAsset> assets) {
        this.assets = assets;
    }

    @JsonbProperty("assets_url")
    public void setAssetsUrl(URI assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    @JsonbProperty("author")
    public void setAuthor(SimpleUser author) {
        this.author = author;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @JsonbProperty("body_text")
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonbProperty("prerelease")
    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    @JsonbProperty("published_at")
    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonbProperty("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @JsonbProperty("tarball_url")
    public void setTarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    @JsonbProperty("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    @JsonbProperty("upload_url")
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("zipball_url")
    public void setZipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
    }
}
