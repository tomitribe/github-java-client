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

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckRunsPage {

    private List<CheckRun> checkRuns;

    private Integer totalCount;

    @JsonbProperty("check_runs")
    public List<CheckRun> getCheckRuns() {
        return this.checkRuns;
    }

    @JsonbProperty("total_count")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    @JsonbProperty("check_runs")
    public void setCheckRuns(List<CheckRun> checkRuns) {
        this.checkRuns = checkRuns;
    }

    @JsonbProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
