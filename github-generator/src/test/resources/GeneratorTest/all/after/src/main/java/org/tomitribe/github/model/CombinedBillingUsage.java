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
@ComponentId("combined-billing-usage")
public class CombinedBillingUsage {

    private Integer daysLeftInBillingCycle;

    private Integer estimatedPaidStorageForMonth;

    private Integer estimatedStorageForMonth;

    @JsonbProperty("days_left_in_billing_cycle")
    public Integer getDaysLeftInBillingCycle() {
        return this.daysLeftInBillingCycle;
    }

    @JsonbProperty("estimated_paid_storage_for_month")
    public Integer getEstimatedPaidStorageForMonth() {
        return this.estimatedPaidStorageForMonth;
    }

    @JsonbProperty("estimated_storage_for_month")
    public Integer getEstimatedStorageForMonth() {
        return this.estimatedStorageForMonth;
    }

    @JsonbProperty("days_left_in_billing_cycle")
    public void setDaysLeftInBillingCycle(Integer daysLeftInBillingCycle) {
        this.daysLeftInBillingCycle = daysLeftInBillingCycle;
    }

    @JsonbProperty("estimated_paid_storage_for_month")
    public void setEstimatedPaidStorageForMonth(Integer estimatedPaidStorageForMonth) {
        this.estimatedPaidStorageForMonth = estimatedPaidStorageForMonth;
    }

    @JsonbProperty("estimated_storage_for_month")
    public void setEstimatedStorageForMonth(Integer estimatedStorageForMonth) {
        this.estimatedStorageForMonth = estimatedStorageForMonth;
    }
}
