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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("protected-branch-pull-request-review")
public class ProtectedBranchPullRequestReview {

    private Boolean dismissStaleReviews;

    private DismissalRestrictions dismissalRestrictions;

    private Boolean requireCodeOwnerReviews;

    private Integer requiredApprovingReviewCount;

    private URI url;

    @JsonbProperty("dismiss_stale_reviews")
    public Boolean getDismissStaleReviews() {
        return this.dismissStaleReviews;
    }

    @JsonbProperty("dismissal_restrictions")
    public DismissalRestrictions getDismissalRestrictions() {
        return this.dismissalRestrictions;
    }

    @JsonbProperty("require_code_owner_reviews")
    public Boolean getRequireCodeOwnerReviews() {
        return this.requireCodeOwnerReviews;
    }

    @JsonbProperty("required_approving_review_count")
    public Integer getRequiredApprovingReviewCount() {
        return this.requiredApprovingReviewCount;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("dismiss_stale_reviews")
    public void setDismissStaleReviews(Boolean dismissStaleReviews) {
        this.dismissStaleReviews = dismissStaleReviews;
    }

    @JsonbProperty("dismissal_restrictions")
    public void setDismissalRestrictions(DismissalRestrictions dismissalRestrictions) {
        this.dismissalRestrictions = dismissalRestrictions;
    }

    @JsonbProperty("require_code_owner_reviews")
    public void setRequireCodeOwnerReviews(Boolean requireCodeOwnerReviews) {
        this.requireCodeOwnerReviews = requireCodeOwnerReviews;
    }

    @JsonbProperty("required_approving_review_count")
    public void setRequiredApprovingReviewCount(Integer requiredApprovingReviewCount) {
        this.requiredApprovingReviewCount = requiredApprovingReviewCount;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
