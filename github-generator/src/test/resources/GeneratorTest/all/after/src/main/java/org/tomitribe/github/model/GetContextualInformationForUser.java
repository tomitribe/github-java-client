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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetContextualInformationForUser {

    @JsonbTransient
    @QueryParam("subject_id")
    private String subjectId;

    @JsonbTransient
    @QueryParam("subject_type")
    @JsonbTypeAdapter(SubjectTypeAdapter.class)
    private SubjectType subjectType;

    @JsonbTransient
    @PathParam("username")
    private String username;

    @JsonbTransient
    @QueryParam("subject_id")
    public String getSubjectId() {
        return this.subjectId;
    }

    @JsonbTypeAdapter(SubjectTypeAdapter.class)
    @JsonbTransient
    @QueryParam("subject_type")
    public SubjectType getSubjectType() {
        return this.subjectType;
    }

    @JsonbTransient
    @PathParam("username")
    public String getUsername() {
        return this.username;
    }

    @JsonbTransient
    @QueryParam("subject_id")
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @JsonbTransient
    @QueryParam("subject_type")
    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    @JsonbTransient
    @PathParam("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public enum SubjectType {

        ORGANIZATION("organization"), REPOSITORY("repository"), ISSUE("issue"), PULL_REQUEST("pull_request");

        private final String name;

        SubjectType(final String name) {
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

    public static class SubjectTypeAdapter extends EnumAdapter<SubjectType> {

        public SubjectTypeAdapter() {
            super(SubjectType.class);
        }
    }
}
