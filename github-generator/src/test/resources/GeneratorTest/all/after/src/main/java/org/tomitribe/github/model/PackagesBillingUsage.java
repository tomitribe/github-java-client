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
@ComponentId("packages-billing-usage")
public class PackagesBillingUsage {

    private Integer includedGigabytesBandwidth;

    private Integer totalGigabytesBandwidthUsed;

    private Integer totalPaidGigabytesBandwidthUsed;

    @JsonbProperty("included_gigabytes_bandwidth")
    public Integer getIncludedGigabytesBandwidth() {
        return this.includedGigabytesBandwidth;
    }

    @JsonbProperty("total_gigabytes_bandwidth_used")
    public Integer getTotalGigabytesBandwidthUsed() {
        return this.totalGigabytesBandwidthUsed;
    }

    @JsonbProperty("total_paid_gigabytes_bandwidth_used")
    public Integer getTotalPaidGigabytesBandwidthUsed() {
        return this.totalPaidGigabytesBandwidthUsed;
    }

    @JsonbProperty("included_gigabytes_bandwidth")
    public void setIncludedGigabytesBandwidth(Integer includedGigabytesBandwidth) {
        this.includedGigabytesBandwidth = includedGigabytesBandwidth;
    }

    @JsonbProperty("total_gigabytes_bandwidth_used")
    public void setTotalGigabytesBandwidthUsed(Integer totalGigabytesBandwidthUsed) {
        this.totalGigabytesBandwidthUsed = totalGigabytesBandwidthUsed;
    }

    @JsonbProperty("total_paid_gigabytes_bandwidth_used")
    public void setTotalPaidGigabytesBandwidthUsed(Integer totalPaidGigabytesBandwidthUsed) {
        this.totalPaidGigabytesBandwidthUsed = totalPaidGigabytesBandwidthUsed;
    }
}
