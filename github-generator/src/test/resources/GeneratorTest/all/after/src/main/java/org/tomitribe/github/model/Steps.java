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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Steps {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date completedAt;

    private String conclusion;

    private String name;

    private Integer number;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date startedAt;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("completed_at")
    public Date getCompletedAt() {
        return this.completedAt;
    }

    @JsonbProperty("conclusion")
    public String getConclusion() {
        return this.conclusion;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("started_at")
    public Date getStartedAt() {
        return this.startedAt;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("completed_at")
    public void setCompletedAt(Date completedAt) {
        this.completedAt = completedAt;
    }

    @JsonbProperty("conclusion")
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("started_at")
    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {

        QUEUED("queued"), IN_PROGRESS("in_progress"), COMPLETED("completed");

        private final String name;

        Status(final String name) {
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

    public static class StatusAdapter extends EnumAdapter<Status> {

        public StatusAdapter() {
            super(Status.class);
        }
    }
}
