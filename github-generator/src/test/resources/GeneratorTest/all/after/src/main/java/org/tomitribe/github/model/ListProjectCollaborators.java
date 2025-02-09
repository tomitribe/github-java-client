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
public class ListProjectCollaborators {

    @JsonbTransient
    @QueryParam("affiliation")
    @JsonbTypeAdapter(AffiliationAdapter.class)
    private Affiliation affiliation;

    @JsonbTransient
    @PathParam("project-id")
    private Integer projectId;

    @JsonbTypeAdapter(AffiliationAdapter.class)
    @JsonbTransient
    @QueryParam("affiliation")
    public Affiliation getAffiliation() {
        return this.affiliation;
    }

    @JsonbTransient
    @PathParam("project-id")
    public Integer getProjectId() {
        return this.projectId;
    }

    @JsonbTransient
    @QueryParam("affiliation")
    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    @JsonbTransient
    @PathParam("project-id")
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public enum Affiliation {

        OUTSIDE("outside"), DIRECT("direct"), ALL("all");

        private final String name;

        Affiliation(final String name) {
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

    public static class AffiliationAdapter extends EnumAdapter<Affiliation> {

        public AffiliationAdapter() {
            super(Affiliation.class);
        }
    }
}
