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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("issue-event-dismissed-review")
public class IssueEventDismissedReview {

    private String dismissalCommitId;

    private String dismissalMessage;

    private Integer reviewId;

    private String state;

    @JsonbProperty("dismissal_commit_id")
    public String getDismissalCommitId() {
        return this.dismissalCommitId;
    }

    @JsonbProperty("dismissal_message")
    public String getDismissalMessage() {
        return this.dismissalMessage;
    }

    @JsonbProperty("review_id")
    public Integer getReviewId() {
        return this.reviewId;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("dismissal_commit_id")
    public void setDismissalCommitId(String dismissalCommitId) {
        this.dismissalCommitId = dismissalCommitId;
    }

    @JsonbProperty("dismissal_message")
    public void setDismissalMessage(String dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
    }

    @JsonbProperty("review_id")
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }
}
