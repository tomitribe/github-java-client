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
public class CreateReactionForTeamDiscussion {

    @JsonbTypeAdapter(ContentAdapter.class)
    private Content content;

    @JsonbTransient
    @PathParam("discussion-number")
    private Integer discussionNumber;

    @JsonbTransient
    @PathParam("org")
    private String org;

    @JsonbTransient
    @PathParam("team_slug")
    private String teamSlug;

    @JsonbTypeAdapter(ContentAdapter.class)
    @JsonbProperty("content")
    public Content getContent() {
        return this.content;
    }

    @JsonbTransient
    @PathParam("discussion-number")
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

    @JsonbProperty("content")
    public void setContent(Content content) {
        this.content = content;
    }

    @JsonbTransient
    @PathParam("discussion-number")
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

    public enum Content {

        PLUS_ONE("+1"),
        MINUS_ONE("-1"),
        LAUGH("laugh"),
        CONFUSED("confused"),
        HEART("heart"),
        HOORAY("hooray"),
        ROCKET("rocket"),
        EYES("eyes");

        private final String name;

        Content(final String name) {
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

    public static class ContentAdapter extends EnumAdapter<Content> {

        public ContentAdapter() {
            super(Content.class);
        }
    }
}
