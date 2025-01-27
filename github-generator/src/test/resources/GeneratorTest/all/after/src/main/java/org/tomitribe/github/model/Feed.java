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
@ComponentId("feed")
public class Feed {

    private String currentUserActorUrl;

    private String currentUserOrganizationUrl;

    private List<URI> currentUserOrganizationUrls;

    private String currentUserPublicUrl;

    private String currentUserUrl;

    private Links links;

    private String securityAdvisoriesUrl;

    private String timelineUrl;

    private String userUrl;

    @JsonbProperty("current_user_actor_url")
    public String getCurrentUserActorUrl() {
        return this.currentUserActorUrl;
    }

    @JsonbProperty("current_user_organization_url")
    public String getCurrentUserOrganizationUrl() {
        return this.currentUserOrganizationUrl;
    }

    @JsonbProperty("current_user_organization_urls")
    public List<URI> getCurrentUserOrganizationUrls() {
        return this.currentUserOrganizationUrls;
    }

    @JsonbProperty("current_user_public_url")
    public String getCurrentUserPublicUrl() {
        return this.currentUserPublicUrl;
    }

    @JsonbProperty("current_user_url")
    public String getCurrentUserUrl() {
        return this.currentUserUrl;
    }

    @JsonbProperty("_links")
    public Links getLinks() {
        return this.links;
    }

    @JsonbProperty("security_advisories_url")
    public String getSecurityAdvisoriesUrl() {
        return this.securityAdvisoriesUrl;
    }

    @JsonbProperty("timeline_url")
    public String getTimelineUrl() {
        return this.timelineUrl;
    }

    @JsonbProperty("user_url")
    public String getUserUrl() {
        return this.userUrl;
    }

    @JsonbProperty("current_user_actor_url")
    public void setCurrentUserActorUrl(String currentUserActorUrl) {
        this.currentUserActorUrl = currentUserActorUrl;
    }

    @JsonbProperty("current_user_organization_url")
    public void setCurrentUserOrganizationUrl(String currentUserOrganizationUrl) {
        this.currentUserOrganizationUrl = currentUserOrganizationUrl;
    }

    @JsonbProperty("current_user_organization_urls")
    public void setCurrentUserOrganizationUrls(List<URI> currentUserOrganizationUrls) {
        this.currentUserOrganizationUrls = currentUserOrganizationUrls;
    }

    @JsonbProperty("current_user_public_url")
    public void setCurrentUserPublicUrl(String currentUserPublicUrl) {
        this.currentUserPublicUrl = currentUserPublicUrl;
    }

    @JsonbProperty("current_user_url")
    public void setCurrentUserUrl(String currentUserUrl) {
        this.currentUserUrl = currentUserUrl;
    }

    @JsonbProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonbProperty("security_advisories_url")
    public void setSecurityAdvisoriesUrl(String securityAdvisoriesUrl) {
        this.securityAdvisoriesUrl = securityAdvisoriesUrl;
    }

    @JsonbProperty("timeline_url")
    public void setTimelineUrl(String timelineUrl) {
        this.timelineUrl = timelineUrl;
    }

    @JsonbProperty("user_url")
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }
}
