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
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("actions-billing-usage")
public class ActionsBillingUsage {

    private Integer includedMinutes;

    private MinutesUsedBreakdown minutesUsedBreakdown;

    private Integer totalMinutesUsed;

    private Integer totalPaidMinutesUsed;

    @JsonbProperty("included_minutes")
    public Integer getIncludedMinutes() {
        return this.includedMinutes;
    }

    @JsonbProperty("minutes_used_breakdown")
    public MinutesUsedBreakdown getMinutesUsedBreakdown() {
        return this.minutesUsedBreakdown;
    }

    @JsonbProperty("total_minutes_used")
    public Integer getTotalMinutesUsed() {
        return this.totalMinutesUsed;
    }

    @JsonbProperty("total_paid_minutes_used")
    public Integer getTotalPaidMinutesUsed() {
        return this.totalPaidMinutesUsed;
    }

    @JsonbProperty("included_minutes")
    public void setIncludedMinutes(Integer includedMinutes) {
        this.includedMinutes = includedMinutes;
    }

    @JsonbProperty("minutes_used_breakdown")
    public void setMinutesUsedBreakdown(MinutesUsedBreakdown minutesUsedBreakdown) {
        this.minutesUsedBreakdown = minutesUsedBreakdown;
    }

    @JsonbProperty("total_minutes_used")
    public void setTotalMinutesUsed(Integer totalMinutesUsed) {
        this.totalMinutesUsed = totalMinutesUsed;
    }

    @JsonbProperty("total_paid_minutes_used")
    public void setTotalPaidMinutesUsed(Integer totalPaidMinutesUsed) {
        this.totalPaidMinutesUsed = totalPaidMinutesUsed;
    }
}
