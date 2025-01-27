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
public class ListProjectCards {

    @JsonbTransient
    @QueryParam("archived_state")
    @JsonbTypeAdapter(ArchivedStateAdapter.class)
    private ArchivedState archivedState;

    @JsonbTransient
    @PathParam("column_id")
    private Integer columnId;

    @JsonbTypeAdapter(ArchivedStateAdapter.class)
    @JsonbTransient
    @QueryParam("archived_state")
    public ArchivedState getArchivedState() {
        return this.archivedState;
    }

    @JsonbTransient
    @PathParam("column_id")
    public Integer getColumnId() {
        return this.columnId;
    }

    @JsonbTransient
    @QueryParam("archived_state")
    public void setArchivedState(ArchivedState archivedState) {
        this.archivedState = archivedState;
    }

    @JsonbTransient
    @PathParam("column_id")
    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public enum ArchivedState {

        ALL("all"), ARCHIVED("archived"), NOT_ARCHIVED("not_archived");

        private final String name;

        ArchivedState(final String name) {
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

    public static class ArchivedStateAdapter extends EnumAdapter<ArchivedState> {

        public ArchivedStateAdapter() {
            super(ArchivedState.class);
        }
    }
}
