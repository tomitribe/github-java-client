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
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRepository {

    private Boolean _private;

    private Boolean allowMergeCommit;

    private Boolean allowRebaseMerge;

    private Boolean allowSquashMerge;

    private Boolean archived;

    private String defaultBranch;

    private Boolean deleteBranchOnMerge;

    private String description;

    private Boolean hasIssues;

    private Boolean hasProjects;

    private Boolean hasWiki;

    private String homepage;

    private Boolean isTemplate;

    private String name;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTypeAdapter(VisibilityAdapter.class)
    private Visibility visibility;

    @JsonbProperty("allow_merge_commit")
    public Boolean getAllowMergeCommit() {
        return this.allowMergeCommit;
    }

    @JsonbProperty("allow_rebase_merge")
    public Boolean getAllowRebaseMerge() {
        return this.allowRebaseMerge;
    }

    @JsonbProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return this.allowSquashMerge;
    }

    @JsonbProperty("archived")
    public Boolean getArchived() {
        return this.archived;
    }

    @JsonbProperty("default_branch")
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    @JsonbProperty("delete_branch_on_merge")
    public Boolean getDeleteBranchOnMerge() {
        return this.deleteBranchOnMerge;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("has_issues")
    public Boolean getHasIssues() {
        return this.hasIssues;
    }

    @JsonbProperty("has_projects")
    public Boolean getHasProjects() {
        return this.hasProjects;
    }

    @JsonbProperty("has_wiki")
    public Boolean getHasWiki() {
        return this.hasWiki;
    }

    @JsonbProperty("homepage")
    public String getHomepage() {
        return this.homepage;
    }

    @JsonbProperty("is_template")
    public Boolean getIsTemplate() {
        return this.isTemplate;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbTypeAdapter(VisibilityAdapter.class)
    @JsonbProperty("visibility")
    public Visibility getVisibility() {
        return this.visibility;
    }

    @JsonbProperty("private")
    public Boolean get_private() {
        return this._private;
    }

    @JsonbProperty("allow_merge_commit")
    public void setAllowMergeCommit(Boolean allowMergeCommit) {
        this.allowMergeCommit = allowMergeCommit;
    }

    @JsonbProperty("allow_rebase_merge")
    public void setAllowRebaseMerge(Boolean allowRebaseMerge) {
        this.allowRebaseMerge = allowRebaseMerge;
    }

    @JsonbProperty("allow_squash_merge")
    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    @JsonbProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonbProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @JsonbProperty("delete_branch_on_merge")
    public void setDeleteBranchOnMerge(Boolean deleteBranchOnMerge) {
        this.deleteBranchOnMerge = deleteBranchOnMerge;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    @JsonbProperty("has_projects")
    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    @JsonbProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    @JsonbProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @JsonbProperty("is_template")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonbProperty("private")
    public void set_private(Boolean _private) {
        this._private = _private;
    }

    public enum Visibility {

        PUBLIC("public"), PRIVATE("private"), VISIBILITY("visibility"), INTERNAL("internal");

        private final String name;

        Visibility(final String name) {
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

    public static class VisibilityAdapter extends EnumAdapter<Visibility> {

        public VisibilityAdapter() {
            super(Visibility.class);
        }
    }
}
