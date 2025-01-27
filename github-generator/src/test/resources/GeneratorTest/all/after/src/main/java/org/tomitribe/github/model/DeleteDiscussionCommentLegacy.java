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
public class DeleteDiscussionCommentLegacy {

    @JsonbTransient
    @PathParam("comment-number")
    private Integer commentNumber;

    @JsonbTransient
    @PathParam("discussion-number")
    private Integer discussionNumber;

    @JsonbTransient
    @PathParam("team-id")
    private Integer teamId;

    @JsonbTransient
    @PathParam("comment-number")
    public Integer getCommentNumber() {
        return this.commentNumber;
    }

    @JsonbTransient
    @PathParam("discussion-number")
    public Integer getDiscussionNumber() {
        return this.discussionNumber;
    }

    @JsonbTransient
    @PathParam("team-id")
    public Integer getTeamId() {
        return this.teamId;
    }

    @JsonbTransient
    @PathParam("comment-number")
    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    @JsonbTransient
    @PathParam("discussion-number")
    public void setDiscussionNumber(Integer discussionNumber) {
        this.discussionNumber = discussionNumber;
    }

    @JsonbTransient
    @PathParam("team-id")
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
}
