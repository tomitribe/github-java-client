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
public class SubmitReviewForPullRequest {

    private String body;

    @JsonbTypeAdapter(EventAdapter.class)
    private Event event;

    @JsonbTransient
    @PathParam("owner")
    private String owner;

    @JsonbTransient
    @PathParam("pull-number")
    private Integer pullNumber;

    @JsonbTransient
    @PathParam("repo")
    private String repo;

    @JsonbTransient
    @PathParam("review_id")
    private Integer reviewId;

    @JsonbProperty("body")
    public String getBody() {
        return this.body;
    }

    @JsonbTypeAdapter(EventAdapter.class)
    @JsonbProperty("event")
    public Event getEvent() {
        return this.event;
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

    @JsonbTransient
    @PathParam("review_id")
    public Integer getReviewId() {
        return this.reviewId;
    }

    @JsonbProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonbProperty("event")
    public void setEvent(Event event) {
        this.event = event;
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

    @JsonbTransient
    @PathParam("review_id")
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public enum Event {

        APPROVE("APPROVE"), REQUEST_CHANGES("REQUEST_CHANGES"), COMMENT("COMMENT");

        private final String name;

        Event(final String name) {
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

    public static class EventAdapter extends EnumAdapter<Event> {

        public EventAdapter() {
            super(Event.class);
        }
    }
}
