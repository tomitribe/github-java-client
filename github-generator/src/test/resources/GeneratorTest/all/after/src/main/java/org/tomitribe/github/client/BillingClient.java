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
package org.tomitribe.github.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.model.ActionsBillingUsage;
import org.tomitribe.github.model.CombinedBillingUsage;
import org.tomitribe.github.model.GetGitHubActionsBillingForOrganization;
import org.tomitribe.github.model.GetGitHubActionsBillingForUser;
import org.tomitribe.github.model.GetGitHubPackagesBillingForOrganization;
import org.tomitribe.github.model.GetGitHubPackagesBillingForUser;
import org.tomitribe.github.model.GetSharedStorageBillingForOrganization;
import org.tomitribe.github.model.GetSharedStorageBillingForUser;
import org.tomitribe.github.model.PackagesBillingUsage;

public interface BillingClient {

    @GET
    @Path("/orgs/{org}/settings/billing/actions")
    @Docs("https://developer.github.com/v3/billing/#get-github-actions-billing-for-an-organization")
    ActionsBillingUsage getGitHubActionsBillingForOrganization(final GetGitHubActionsBillingForOrganization getGitHubActionsBillingForOrganization);

    @GET
    @Path("/orgs/{org}/settings/billing/actions")
    @Docs("https://developer.github.com/v3/billing/#get-github-actions-billing-for-an-organization")
    ActionsBillingUsage getGitHubActionsBillingForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/users/{username}/settings/billing/actions")
    @Docs("https://developer.github.com/v3/billing/#get-github-actions-billing-for-a-user")
    ActionsBillingUsage getGitHubActionsBillingForUser(final GetGitHubActionsBillingForUser getGitHubActionsBillingForUser);

    @GET
    @Path("/users/{username}/settings/billing/actions")
    @Docs("https://developer.github.com/v3/billing/#get-github-actions-billing-for-a-user")
    ActionsBillingUsage getGitHubActionsBillingForUser(@PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/settings/billing/packages")
    @Docs("https://developer.github.com/v3/billing/#get-github-packages-billing-for-an-organization")
    PackagesBillingUsage getGitHubPackagesBillingForOrganization(final GetGitHubPackagesBillingForOrganization getGitHubPackagesBillingForOrganization);

    @GET
    @Path("/orgs/{org}/settings/billing/packages")
    @Docs("https://developer.github.com/v3/billing/#get-github-packages-billing-for-an-organization")
    PackagesBillingUsage getGitHubPackagesBillingForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/users/{username}/settings/billing/packages")
    @Docs("https://developer.github.com/v3/billing/#get-github-packages-billing-for-a-user")
    PackagesBillingUsage getGitHubPackagesBillingForUser(final GetGitHubPackagesBillingForUser getGitHubPackagesBillingForUser);

    @GET
    @Path("/users/{username}/settings/billing/packages")
    @Docs("https://developer.github.com/v3/billing/#get-github-packages-billing-for-a-user")
    PackagesBillingUsage getGitHubPackagesBillingForUser(@PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/settings/billing/shared-storage")
    @Docs("https://developer.github.com/v3/billing/#get-shared-storage-billing-for-an-organization")
    CombinedBillingUsage getSharedStorageBillingForOrganization(final GetSharedStorageBillingForOrganization getSharedStorageBillingForOrganization);

    @GET
    @Path("/orgs/{org}/settings/billing/shared-storage")
    @Docs("https://developer.github.com/v3/billing/#get-shared-storage-billing-for-an-organization")
    CombinedBillingUsage getSharedStorageBillingForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/users/{username}/settings/billing/shared-storage")
    @Docs("https://developer.github.com/v3/billing/#get-shared-storage-billing-for-a-user")
    CombinedBillingUsage getSharedStorageBillingForUser(final GetSharedStorageBillingForUser getSharedStorageBillingForUser);

    @GET
    @Path("/users/{username}/settings/billing/shared-storage")
    @Docs("https://developer.github.com/v3/billing/#get-shared-storage-billing-for-a-user")
    CombinedBillingUsage getSharedStorageBillingForUser(@PathParam("username") final String username);
}
