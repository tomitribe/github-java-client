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
@ComponentId("marketplace-purchase")
public class MarketplacePurchase {

    private String billingCycle;

    private String freeTrialEndsOn;

    private Integer id;

    private Boolean isInstalled;

    private String login;

    private MarketplacePendingChange marketplacePendingChange;

    private MarketplacePurchase marketplacePurchase;

    private String nextBillingDate;

    private Boolean onFreeTrial;

    private String organizationBillingEmail;

    private MarketplaceListingPlan plan;

    private String type;

    private Integer unitCount;

    private String updatedAt;

    private String url;

    @JsonbProperty("billing_cycle")
    public String getBillingCycle() {
        return this.billingCycle;
    }

    @JsonbProperty("free_trial_ends_on")
    public String getFreeTrialEndsOn() {
        return this.freeTrialEndsOn;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("is_installed")
    public Boolean getIsInstalled() {
        return this.isInstalled;
    }

    @JsonbProperty("login")
    public String getLogin() {
        return this.login;
    }

    @JsonbProperty("marketplace_pending_change")
    public MarketplacePendingChange getMarketplacePendingChange() {
        return this.marketplacePendingChange;
    }

    @JsonbProperty("marketplace_purchase")
    public MarketplacePurchase getMarketplacePurchase() {
        return this.marketplacePurchase;
    }

    @JsonbProperty("next_billing_date")
    public String getNextBillingDate() {
        return this.nextBillingDate;
    }

    @JsonbProperty("on_free_trial")
    public Boolean getOnFreeTrial() {
        return this.onFreeTrial;
    }

    @JsonbProperty("organization_billing_email")
    public String getOrganizationBillingEmail() {
        return this.organizationBillingEmail;
    }

    @JsonbProperty("plan")
    public MarketplaceListingPlan getPlan() {
        return this.plan;
    }

    @JsonbProperty("type")
    public String getType() {
        return this.type;
    }

    @JsonbProperty("unit_count")
    public Integer getUnitCount() {
        return this.unitCount;
    }

    @JsonbProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    @JsonbProperty("url")
    public String getUrl() {
        return this.url;
    }

    @JsonbProperty("billing_cycle")
    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    @JsonbProperty("free_trial_ends_on")
    public void setFreeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("is_installed")
    public void setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    @JsonbProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonbProperty("marketplace_pending_change")
    public void setMarketplacePendingChange(MarketplacePendingChange marketplacePendingChange) {
        this.marketplacePendingChange = marketplacePendingChange;
    }

    @JsonbProperty("marketplace_purchase")
    public void setMarketplacePurchase(MarketplacePurchase marketplacePurchase) {
        this.marketplacePurchase = marketplacePurchase;
    }

    @JsonbProperty("next_billing_date")
    public void setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    @JsonbProperty("on_free_trial")
    public void setOnFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    @JsonbProperty("organization_billing_email")
    public void setOrganizationBillingEmail(String organizationBillingEmail) {
        this.organizationBillingEmail = organizationBillingEmail;
    }

    @JsonbProperty("plan")
    public void setPlan(MarketplaceListingPlan plan) {
        this.plan = plan;
    }

    @JsonbProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonbProperty("unit_count")
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    @JsonbProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonbProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
}
