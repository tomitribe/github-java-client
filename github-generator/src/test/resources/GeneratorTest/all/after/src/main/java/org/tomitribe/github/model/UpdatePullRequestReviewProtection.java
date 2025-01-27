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
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePullRequestReviewProtection {

    @JsonbTransient
    @PathParam("branch")
    private String branch;

    private Boolean dismissStaleReviews;

    private DismissalRestrictions dismissalRestrictions;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    private Boolean requireCodeOwnerReviews;

    private Integer requiredApprovingReviewCount;

    @JsonbTransient
    @PathParam("branch")
    public String getBranch() {
        return this.branch;
    }

    @JsonbProperty("dismiss_stale_reviews")
    public Boolean getDismissStaleReviews() {
        return this.dismissStaleReviews;
    }

    @JsonbProperty("dismissal_restrictions")
    public DismissalRestrictions getDismissalRestrictions() {
        return this.dismissalRestrictions;
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

    @JsonbProperty("require_code_owner_reviews")
    public Boolean getRequireCodeOwnerReviews() {
        return this.requireCodeOwnerReviews;
    }

    @JsonbProperty("required_approving_review_count")
    public Integer getRequiredApprovingReviewCount() {
        return this.requiredApprovingReviewCount;
    }

    @JsonbTransient
    @PathParam("branch")
    public void setBranch(String branch) {
        this.branch = branch;
    }

    @JsonbProperty("dismiss_stale_reviews")
    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    @JsonbProperty("dismissal_restrictions")
    public void setDismissalRestrictions(DismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
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

    @JsonbProperty("require_code_owner_reviews")
    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    @JsonbProperty("required_approving_review_count")
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }
}
