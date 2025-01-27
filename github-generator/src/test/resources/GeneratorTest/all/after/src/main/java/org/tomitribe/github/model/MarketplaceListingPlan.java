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
import java.net.URI;
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
@ComponentId("marketplace-listing-plan")
public class MarketplaceListingPlan {

    private URI accountsUrl;

    private List<String> bullets;

    private String description;

    private Boolean hasFreeTrial;

    private Integer id;

    private Integer monthlyPriceInCents;

    private String name;

    private Integer number;

    private String priceModel;

    private String state;

    private String unitName;

    private URI url;

    private Integer yearlyPriceInCents;

    @JsonbProperty("accounts_url")
    public URI getAccountsUrl() {
        return this.accountsUrl;
    }

    @JsonbProperty("bullets")
    public List<String> getBullets() {
        return this.bullets;
    }

    @JsonbProperty("description")
    public String getDescription() {
        return this.description;
    }

    @JsonbProperty("has_free_trial")
    public Boolean getHasFreeTrial() {
        return this.hasFreeTrial;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return this.id;
    }

    @JsonbProperty("monthly_price_in_cents")
    public Integer getMonthlyPriceInCents() {
        return this.monthlyPriceInCents;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("number")
    public Integer getNumber() {
        return this.number;
    }

    @JsonbProperty("price_model")
    public String getPriceModel() {
        return this.priceModel;
    }

    @JsonbProperty("state")
    public String getState() {
        return this.state;
    }

    @JsonbProperty("unit_name")
    public String getUnitName() {
        return this.unitName;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("yearly_price_in_cents")
    public Integer getYearlyPriceInCents() {
        return this.yearlyPriceInCents;
    }

    @JsonbProperty("accounts_url")
    public void setAccountsUrl(URI accountsUrl) {
        this.accountsUrl = accountsUrl;
    }

    @JsonbProperty("bullets")
    public void setBullets(List<String> bullets) {
        this.bullets = bullets;
    }

    @JsonbProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonbProperty("has_free_trial")
    public void setHasFreeTrial(Boolean hasFreeTrial) {
        this.hasFreeTrial = hasFreeTrial;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("monthly_price_in_cents")
    public void setMonthlyPriceInCents(Integer monthlyPriceInCents) {
        this.monthlyPriceInCents = monthlyPriceInCents;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonbProperty("price_model")
    public void setPriceModel(String priceModel) {
        this.priceModel = priceModel;
    }

    @JsonbProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonbProperty("unit_name")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    @JsonbProperty("yearly_price_in_cents")
    public void setYearlyPriceInCents(Integer yearlyPriceInCents) {
        this.yearlyPriceInCents = yearlyPriceInCents;
    }
}
