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
public class MarketplacePendingChange {

    private String effectiveDate;

    private Integer id;

    private Boolean isInstalled;

    private MarketplaceListingPlan plan;

    private Integer unitCount;

    @JsonbProperty("effective_date")
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("is_installed")
    public Boolean getIsInstalled() {
        return this.isInstalled;
    }

    @JsonbProperty("plan")
    public MarketplaceListingPlan getPlan() {
        return this.plan;
    }

    @JsonbProperty("unit_count")
    public Integer getUnitCount() {
        return this.unitCount;
    }

    @JsonbProperty("effective_date")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("is_installed")
    public void setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    @JsonbProperty("plan")
    public void setPlan(MarketplaceListingPlan plan) {
        this.plan = plan;
    }

    @JsonbProperty("unit_count")
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }
}
