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
@ComponentId("code-search-result-item")
public class CodeSearchResultItem {

    private Integer fileSize;

    private URI gitUrl;

    private URI htmlUrl;

    private String language;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date lastModifiedAt;

    private List<String> lineNumbers;

    private String name;

    private String path;

    private MinimalRepository repository;

    private Integer score;

    private String sha;

    private List<SearchResultTextMatches> textMatches;

    private URI url;

    @JsonbProperty("file_size")
    public Integer getFileSize() {
        return this.fileSize;
    }

    @JsonbProperty("git_url")
    public URI getGitUrl() {
        return this.gitUrl;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("language")
    public String getLanguage() {
        return this.language;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("last_modified_at")
    public Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @JsonbProperty("line_numbers")
    public List<String> getLineNumbers() {
        return this.lineNumbers;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("path")
    public String getPath() {
        return this.path;
    }

    @JsonbProperty("repository")
    public MinimalRepository getRepository() {
        return this.repository;
    }

    @JsonbProperty("score")
    public Integer getScore() {
        return this.score;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("text_matches")
    public List<SearchResultTextMatches> getTextMatches() {
        return this.textMatches;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("file_size")
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    @JsonbProperty("git_url")
    public void setGitUrl(URI gitUrl) {
        this.gitUrl = gitUrl;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonbProperty("last_modified_at")
    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    @JsonbProperty("line_numbers")
    public void setLineNumbers(List<String> lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonbProperty("repository")
    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    @JsonbProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    @JsonbProperty("text_matches")
    public void setTextMatches(List<SearchResultTextMatches> textMatches) {
        this.textMatches = textMatches;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
