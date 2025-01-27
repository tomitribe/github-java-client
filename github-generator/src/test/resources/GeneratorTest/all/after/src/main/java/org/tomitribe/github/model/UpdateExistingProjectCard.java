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
import jakarta.ws.rs.PathParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExistingProjectCard {

    private Boolean archived;

    @JsonbTransient
    @PathParam("card_id")
    private Integer cardId;

    private String note;

    @JsonbProperty("archived")
    public Boolean getArchived() {
        return this.archived;
    }

    @JsonbTransient
    @PathParam("card_id")
    public Integer getCardId() {
        return this.cardId;
    }

    @JsonbProperty("note")
    public String getNote() {
        return this.note;
    }

    @JsonbProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonbTransient
    @PathParam("card_id")
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    @JsonbProperty("note")
    public void setNote(String note) {
        this.note = note;
    }
}
