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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("user-marketplace-purchase")
public class UserMarketplacePurchase {

    private MarketplaceAccount account;

    private String billingCycle;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date freeTrialEndsOn;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date nextBillingDate;

    private Boolean onFreeTrial;

    private MarketplaceListingPlan plan;

    private Integer unitCount;

    @JsonbTypeAdapter(DateAdapter.class)
    private Date updatedAt;

    @JsonbProperty("account")
    public MarketplaceAccount getAccount() {
        return this.account;
    }

    @JsonbProperty("billing_cycle")
    public String getBillingCycle() {
        return this.billingCycle;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("free_trial_ends_on")
    public Date getFreeTrialEndsOn() {
        return this.freeTrialEndsOn;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("next_billing_date")
    public Date getNextBillingDate() {
        return this.nextBillingDate;
    }

    @JsonbProperty("on_free_trial")
    public Boolean getOnFreeTrial() {
        return this.onFreeTrial;
    }

    @JsonbProperty("plan")
    public MarketplaceListingPlan getPlan() {
        return this.plan;
    }

    @JsonbProperty("unit_count")
    public Integer getUnitCount() {
        return this.unitCount;
    }

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("updated_at")
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("account")
    public void setAccount(MarketplaceAccount account) {
        this.account = account;
    }

    @JsonbProperty("billing_cycle")
    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    @JsonbProperty("free_trial_ends_on")
    public void setFreeTrialEndsOn(Date freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    @JsonbProperty("next_billing_date")
    public void setNextBillingDate(Date nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    @JsonbProperty("on_free_trial")
    public void setOnFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    @JsonbProperty("plan")
    public void setPlan(MarketplaceListingPlan plan) {
        this.plan = plan;
    }

    @JsonbProperty("unit_count")
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
