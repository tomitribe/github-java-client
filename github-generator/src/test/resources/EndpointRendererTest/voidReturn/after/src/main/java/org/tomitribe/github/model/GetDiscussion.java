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
public class GetDiscussion {

    @JsonbTransient
    @PathParam("discussion_number")
    private Integer discussionNumber;

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTransient
    @PathParam("team_slug")
    private String teamSlug;

    @JsonbTransient
    @PathParam("discussion_number")
    public Integer getDiscussionNumber() {
        return this.discussionNumber;
    }

    @JsonbTransient
    @PathParam("org")
    public String getOrg() {
        return this.org;
    }

    @JsonbTransient
    @PathParam("team_slug")
    public String getTeamSlug() {
        return this.teamSlug;
    }

    @JsonbTransient
    @PathParam("discussion_number")
    public void setDiscussionNumber(Integer discussionNumber) {
        this.discussionNumber = discussionNumber;
    }

    @JsonbTransient
    @PathParam("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonbTransient
    @PathParam("team_slug")
    public void setTeamSlug(String teamSlug) {
        this.teamSlug = teamSlug;
    }
}
