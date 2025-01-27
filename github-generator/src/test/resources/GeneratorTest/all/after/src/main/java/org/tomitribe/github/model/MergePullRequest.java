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
public class MergePullRequest {

    private String commitMessage;

    private String commitTitle;

    @JsonbTypeAdapter(MergeMethodAdapter.class)
    private MergeMethod mergeMethod;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("pull-number")
    private Integer pullNumber;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private String sha;

    @JsonbProperty("commit_message")
    public String getCommitMessage() {
        return this.commitMessage;
    }

    @JsonbProperty("commit_title")
    public String getCommitTitle() {
        return this.commitTitle;
    }

    @JsonbTypeAdapter(MergeMethodAdapter.class)
    @JsonbProperty("merge_method")
    public MergeMethod getMergeMethod() {
        return this.mergeMethod;
    }

    @JsonbTransient
    @PathParam("owner")
    public String getOwner() {
        return this.owner;
    }

    @JsonbTransient
    @PathParam("pull-number")
    public Integer getPullNumber() {
        return this.pullNumber;
    }

    @JsonbTransient
    @PathParam("repo")
    public String getRepo() {
        return this.repo;
    }

    @JsonbProperty("sha")
    public String getSha() {
        return this.sha;
    }

    @JsonbProperty("commit_message")
    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    @JsonbProperty("commit_title")
    public void setCommitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
    }

    @JsonbProperty("merge_method")
    public void setMergeMethod(MergeMethod mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    @JsonbTransient
    @PathParam("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonbTransient
    @PathParam("pull-number")
    public void setPullNumber(Integer pullNumber) {
        this.pullNumber = pullNumber;
    }

    @JsonbTransient
    @PathParam("repo")
    public void setRepo(String repo) {
        this.repo = repo;
    }

    @JsonbProperty("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    public enum MergeMethod {

        MERGE("merge"), SQUASH("squash"), REBASE("rebase");

        private final String name;

        MergeMethod(final String name) {
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

    public static class MergeMethodAdapter extends EnumAdapter<MergeMethod> {

        public MergeMethodAdapter() {
            super(MergeMethod.class);
        }
    }
}
