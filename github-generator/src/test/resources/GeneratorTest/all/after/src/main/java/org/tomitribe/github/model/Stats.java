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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stats {

    private Integer additions;

    private Integer deletions;

    private Integer total;

    @JsonbProperty("additions")
    public Integer getAdditions() {
        return this.additions;
    }

    @JsonbProperty("deletions")
    public Integer getDeletions() {
        return this.deletions;
    }

    @JsonbProperty("total")
    public Integer getTotal() {
        return this.total;
    }

    @JsonbProperty("additions")
    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    @JsonbProperty("deletions")
    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @JsonbProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }
}
