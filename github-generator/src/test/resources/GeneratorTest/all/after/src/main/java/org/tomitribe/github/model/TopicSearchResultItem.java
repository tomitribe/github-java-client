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
@ComponentId("topic-search-result-item")
public class TopicSearchResultItem {

    private List<Aliases> aliases;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date createdAt;

    private String createdBy;

    private Boolean curated;

    private String description;

    private String displayName;

    private Boolean featured;

    private URI logoUrl;

    private String name;

    private List<Related> related;

    private String released;

    private Integer repositoryCount;

    private Integer score;

    private String shortDescription;

    private List<SearchResultTextMatches> textMatches;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    @JsonbProperty("aliases")
    public List<Aliases> getAliases() {
        return this.aliases;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("created_at")
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("created_by")
    public String getCreatedBy() {
        return this.createdBy;
    }

    @JsonbProperty("curated")
    public Boolean getCurated() {
        return this.curated;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("display_name")
    public String getDisplayName() {
        return this.displayName;
    }

    @JsonbProperty("featured")
    public Boolean getFeatured() {
        return this.featured;
    }

    @JsonbProperty("logo_url")
    public URI getLogoUrl() {
        return this.logoUrl;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("related")
    public List<Related> getRelated() {
        return this.related;
    }

    @JsonbProperty("released")
    public String getReleased() {
        return this.released;
    }

    @JsonbProperty("repository_count")
    public Integer getRepositoryCount() {
        return this.repositoryCount;
    }

    @JsonbProperty("score")
    public Integer getScore() {
        return this.score;
    }

    @JsonbProperty("short_description")
    public String getShortDescription() {
        return this.shortDescription;
    }

    @JsonbProperty("text_matches")
    public List<SearchResultTextMatches> getTextMatches() {
        return this.textMatches;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("aliases")
    public void setAliases(List<Aliases> aliases) {
        this.aliases = aliases;
    }

    @JsonbProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("created_by")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonbProperty("curated")
    public void setCurated(Boolean curated) {
        this.curated = curated;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonbProperty("featured")
    public void setFeatured(Boolean featured) {
        this.featured = featured;
    }

    @JsonbProperty("logo_url")
    public void setLogoUrl(URI logoUrl) {
        this.logoUrl = logoUrl;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("related")
    public void setRelated(List<Related> related) {
        this.related = related;
    }

    @JsonbProperty("released")
    public void setReleased(String released) {
        this.released = released;
    }

    @JsonbProperty("repository_count")
    public void setRepositoryCount(Integer repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    @JsonbProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonbProperty("short_description")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @JsonbProperty("text_matches")
    public void setTextMatches(List<SearchResultTextMatches> textMatches) {
        this.textMatches = textMatches;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
