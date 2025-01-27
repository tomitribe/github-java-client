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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("commit-activity")
public class CommitActivity {

    private List<Integer> days;

    private Integer total;

    private Integer week;

    @JsonbProperty("days")
    public List<Integer> getDays() {
        return this.days;
    }

    @JsonbProperty("total")
    public Integer getTotal() {
        return this.total;
    }

    @JsonbProperty("week")
    public Integer getWeek() {
        return this.week;
    }

    @JsonbProperty("days")
    public void setDays(List<Integer> days) {
        this.days = days;
    }

    @JsonbProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonbProperty("week")
    public void setWeek(Integer week) {
        this.week = week;
    }
}
