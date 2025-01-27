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

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.DeprecationDate;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.model.AddRepositoryToAppInstallation;
import org.tomitribe.github.model.Authorization;
import org.tomitribe.github.model.CheckAuthorization;
import org.tomitribe.github.model.CheckAuthorizationResponse;
import org.tomitribe.github.model.CheckToken;
import org.tomitribe.github.model.ContentReferenceAttachment;
import org.tomitribe.github.model.CreateContentAttachment;
import org.tomitribe.github.model.CreateGitHubAppFromManifest;
import org.tomitribe.github.model.CreateGitHubAppFromManifestResponse;
import org.tomitribe.github.model.CreateInstallationAccessTokenForApp;
import org.tomitribe.github.model.DeleteAppAuthorization;
import org.tomitribe.github.model.DeleteAppToken;
import org.tomitribe.github.model.DeleteInstallationForAuthenticatedApp;
import org.tomitribe.github.model.GetApp;
import org.tomitribe.github.model.GetInstallationForAuthenticatedApp;
import org.tomitribe.github.model.GetOrganizationInstallationForAuthenticatedApp;
import org.tomitribe.github.model.GetRepositoryInstallationForAuthenticatedApp;
import org.tomitribe.github.model.GetSubscriptionPlanForAccount;
import org.tomitribe.github.model.GetSubscriptionPlanForAccountStubbed;
import org.tomitribe.github.model.GetUserInstallationForAuthenticatedApp;
import org.tomitribe.github.model.Installation;
import org.tomitribe.github.model.InstallationToken;
import org.tomitribe.github.model.InstallationsPage;
import org.tomitribe.github.model.Integration;
import org.tomitribe.github.model.ListAccountsForPlan;
import org.tomitribe.github.model.ListAccountsForPlanStubbed;
import org.tomitribe.github.model.ListInstallationsForAuthenticatedApp;
import org.tomitribe.github.model.ListRepositoriesAccessibleToUserAccessToken;
import org.tomitribe.github.model.MarketplaceListingPlan;
import org.tomitribe.github.model.MarketplacePurchase;
import org.tomitribe.github.model.RemoveRepositoryFromAppInstallation;
import org.tomitribe.github.model.RepositoriesPage;
import org.tomitribe.github.model.Repository;
import org.tomitribe.github.model.ResetAuthorization;
import org.tomitribe.github.model.ResetToken;
import org.tomitribe.github.model.RevokeAuthorizationForApplication;
import org.tomitribe.github.model.RevokeGrantForApplication;
import org.tomitribe.github.model.SuspendAppInstallation;
import org.tomitribe.github.model.UnsuspendAppInstallation;
import org.tomitribe.github.model.UserMarketplacePurchase;

public interface AppsClient {

    @PUT
    @Path("/user/installations/{installation_id}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/apps/installations/#add-a-repository-to-an-app-installation")
    @Preview("machine-man")
    void addRepositoryToAppInstallation(final AddRepositoryToAppInstallation addRepositoryToAppInstallation);

    @PUT
    @Path("/user/installations/{installation_id}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/apps/installations/#add-a-repository-to-an-app-installation")
    @Preview("machine-man")
    void addRepositoryToAppInstallation(@PathParam("installation_id") final int installationId, @PathParam("repository_id") final int repositoryId);

    @GET
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#check-an-authorization")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    CheckAuthorizationResponse checkAuthorization(final CheckAuthorization checkAuthorization);

    @GET
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#check-an-authorization")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    CheckAuthorizationResponse checkAuthorization(@PathParam("client-id") final String clientId, @PathParam("access-token") final String accessToken);

    @POST
    @Path("/applications/{client_id}/token")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#check-a-token")
    Authorization checkToken(final CheckToken checkToken);

    @POST
    @Path("/content_references/{content_reference_id}/attachments")
    @Docs("https://developer.github.com/v3/apps/installations/#create-a-content-attachment")
    @EnabledForGithubApps
    @Preview("corsair")
    ContentReferenceAttachment createContentAttachment(final CreateContentAttachment createContentAttachment);

    @POST
    @Path("/app-manifests/{code}/conversions")
    @Docs("https://developer.github.com/v3/apps/#create-a-github-app-from-a-manifest")
    CreateGitHubAppFromManifestResponse createGitHubAppFromManifest(final CreateGitHubAppFromManifest createGitHubAppFromManifest);

    @POST
    @Path("/app-manifests/{code}/conversions")
    @Docs("https://developer.github.com/v3/apps/#create-a-github-app-from-a-manifest")
    CreateGitHubAppFromManifestResponse createGitHubAppFromManifest(@PathParam("code") final String code);

    @POST
    @Path("/app/installations/{installation_id}/access_tokens")
    @Docs("https://developer.github.com/v3/apps/#create-an-installation-access-token-for-an-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    InstallationToken createInstallationAccessTokenForApp(final CreateInstallationAccessTokenForApp createInstallationAccessTokenForApp);

    @DELETE
    @Path("/applications/{client_id}/grant")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#delete-an-app-authorization")
    void deleteAppAuthorization(final DeleteAppAuthorization deleteAppAuthorization);

    @DELETE
    @Path("/applications/{client_id}/token")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#delete-an-app-token")
    void deleteAppToken(final DeleteAppToken deleteAppToken);

    @DELETE
    @Path("/app/installations/{installation_id}")
    @Docs("https://developer.github.com/v3/apps/#delete-an-installation-for-the-authenticated-app")
    @Preview("machine-man")
    void deleteInstallationForAuthenticatedApp(final DeleteInstallationForAuthenticatedApp deleteInstallationForAuthenticatedApp);

    @DELETE
    @Path("/app/installations/{installation_id}")
    @Docs("https://developer.github.com/v3/apps/#delete-an-installation-for-the-authenticated-app")
    @Preview("machine-man")
    void deleteInstallationForAuthenticatedApp(@PathParam("installation_id") final int installationId);

    @GET
    @Path("/apps/{app_slug}")
    @Docs("https://developer.github.com/v3/apps/#get-an-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    Integration getApp(final GetApp getApp);

    @GET
    @Path("/apps/{app_slug}")
    @Docs("https://developer.github.com/v3/apps/#get-an-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    Integration getApp(@PathParam("app_slug") final String appSlug);

    @GET
    @Path("/app")
    @Docs("https://developer.github.com/v3/apps/#get-the-authenticated-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    Integration getAuthenticatedApp();

    @GET
    @Path("/app/installations/{installation_id}")
    @Docs("https://developer.github.com/v3/apps/#get-an-installation-for-the-authenticated-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    Installation getInstallationForAuthenticatedApp(final GetInstallationForAuthenticatedApp getInstallationForAuthenticatedApp);

    @GET
    @Path("/app/installations/{installation_id}")
    @Docs("https://developer.github.com/v3/apps/#get-an-installation-for-the-authenticated-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    Installation getInstallationForAuthenticatedApp(@PathParam("installation_id") final int installationId);

    @GET
    @Path("/orgs/{org}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-an-organization-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getOrganizationInstallationForAuthenticatedApp(final GetOrganizationInstallationForAuthenticatedApp getOrganizationInstallationForAuthenticatedApp);

    @GET
    @Path("/orgs/{org}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-an-organization-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getOrganizationInstallationForAuthenticatedApp(@PathParam("org") final String org);

    @GET
    @Path("/repos/{owner}/{repo}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-a-repository-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getRepositoryInstallationForAuthenticatedApp(final GetRepositoryInstallationForAuthenticatedApp getRepositoryInstallationForAuthenticatedApp);

    @GET
    @Path("/repos/{owner}/{repo}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-a-repository-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getRepositoryInstallationForAuthenticatedApp(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/marketplace_listing/accounts/{account_id}")
    @Docs("https://developer.github.com/v3/apps/marketplace/#get-a-subscription-plan-for-an-account")
    MarketplacePurchase getSubscriptionPlanForAccount(final GetSubscriptionPlanForAccount getSubscriptionPlanForAccount);

    @GET
    @Path("/marketplace_listing/accounts/{account_id}")
    @Docs("https://developer.github.com/v3/apps/marketplace/#get-a-subscription-plan-for-an-account")
    MarketplacePurchase getSubscriptionPlanForAccount(@PathParam("account_id") final int accountId);

    @GET
    @Path("/marketplace_listing/stubbed/accounts/{account_id}")
    @Docs("https://developer.github.com/v3/apps/marketplace/#get-a-subscription-plan-for-an-account-stubbed")
    MarketplacePurchase getSubscriptionPlanForAccountStubbed(final GetSubscriptionPlanForAccountStubbed getSubscriptionPlanForAccountStubbed);

    @GET
    @Path("/marketplace_listing/stubbed/accounts/{account_id}")
    @Docs("https://developer.github.com/v3/apps/marketplace/#get-a-subscription-plan-for-an-account-stubbed")
    MarketplacePurchase getSubscriptionPlanForAccountStubbed(@PathParam("account_id") final int accountId);

    @GET
    @Path("/users/{username}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-a-user-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getUserInstallationForAuthenticatedApp(final GetUserInstallationForAuthenticatedApp getUserInstallationForAuthenticatedApp);

    @GET
    @Path("/users/{username}/installation")
    @Docs("https://developer.github.com/v3/apps/#get-a-user-installation-for-the-authenticated-app")
    @Preview("machine-man")
    Installation getUserInstallationForAuthenticatedApp(@PathParam("username") final String username);

    @GET
    @Path("/marketplace_listing/plans/{plan_id}/accounts")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan")
    @Paged(MarketplacePurchase[].class)
    Stream<MarketplacePurchase> listAccountsForPlan(final ListAccountsForPlan listAccountsForPlan);

    @GET
    @Path("/marketplace_listing/plans/{plan_id}/accounts")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan")
    @Paged(MarketplacePurchase[].class)
    Stream<MarketplacePurchase> listAccountsForPlan(@PathParam("plan_id") final int planId);

    @GET
    @Path("/marketplace_listing/stubbed/plans/{plan_id}/accounts")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan-stubbed")
    @Paged(MarketplacePurchase[].class)
    Stream<MarketplacePurchase> listAccountsForPlanStubbed(final ListAccountsForPlanStubbed listAccountsForPlanStubbed);

    @GET
    @Path("/marketplace_listing/stubbed/plans/{plan_id}/accounts")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-accounts-for-a-plan-stubbed")
    @Paged(MarketplacePurchase[].class)
    Stream<MarketplacePurchase> listAccountsForPlanStubbed(@PathParam("plan_id") final int planId);

    @GET
    @Path("/user/installations")
    @Docs("https://developer.github.com/v3/apps/installations/#list-app-installations-accessible-to-the-user-access-token")
    @Preview("machine-man")
    @Paged(InstallationsPage.class)
    Stream<Installation> listAppInstallationsAccessibleToUserAccessToken();

    @GET
    @Path("/app/installations")
    @Docs("https://developer.github.com/v3/apps/#list-installations-for-the-authenticated-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Paged(Installation[].class)
    Stream<Installation> listInstallationsForAuthenticatedApp(final ListInstallationsForAuthenticatedApp listInstallationsForAuthenticatedApp);

    @GET
    @Path("/marketplace_listing/plans")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-plans")
    @Paged(MarketplaceListingPlan[].class)
    Stream<MarketplaceListingPlan> listPlans();

    @GET
    @Path("/marketplace_listing/stubbed/plans")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-plans-stubbed")
    @Paged(MarketplaceListingPlan[].class)
    Stream<MarketplaceListingPlan> listPlansStubbed();

    @GET
    @Path("/installation/repositories")
    @Docs("https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-app-installation")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Preview("mercy")
    @Paged(RepositoriesPage.class)
    Stream<Repository> listRepositoriesAccessibleToAppInstallation();

    @GET
    @Path("/user/installations/{installation_id}/repositories")
    @Docs("https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-user-access-token")
    @Preview("machine-man")
    @Preview("mercy")
    @Paged(RepositoriesPage.class)
    Stream<Repository> listRepositoriesAccessibleToUserAccessToken(final ListRepositoriesAccessibleToUserAccessToken listRepositoriesAccessibleToUserAccessToken);

    @GET
    @Path("/user/installations/{installation_id}/repositories")
    @Docs("https://developer.github.com/v3/apps/installations/#list-repositories-accessible-to-the-user-access-token")
    @Preview("machine-man")
    @Preview("mercy")
    @Paged(RepositoriesPage.class)
    Stream<Repository> listRepositoriesAccessibleToUserAccessToken(@PathParam("installation_id") final int installationId);

    @GET
    @Path("/user/marketplace_purchases")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-subscriptions-for-the-authenticated-user")
    @Paged(UserMarketplacePurchase[].class)
    Stream<UserMarketplacePurchase> listSubscriptionsForAuthenticatedUser();

    @GET
    @Path("/user/marketplace_purchases/stubbed")
    @Docs("https://developer.github.com/v3/apps/marketplace/#list-subscriptions-for-the-authenticated-user-stubbed")
    @Paged(UserMarketplacePurchase[].class)
    Stream<UserMarketplacePurchase> listSubscriptionsForAuthenticatedUserStubbed();

    @DELETE
    @Path("/user/installations/{installation_id}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/apps/installations/#remove-a-repository-from-an-app-installation")
    @Preview("machine-man")
    void removeRepositoryFromAppInstallation(final RemoveRepositoryFromAppInstallation removeRepositoryFromAppInstallation);

    @DELETE
    @Path("/user/installations/{installation_id}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/apps/installations/#remove-a-repository-from-an-app-installation")
    @Preview("machine-man")
    void removeRepositoryFromAppInstallation(@PathParam("installation_id") final int installationId, @PathParam("repository_id") final int repositoryId);

    @POST
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#reset-an-authorization")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    Authorization resetAuthorization(final ResetAuthorization resetAuthorization);

    @POST
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#reset-an-authorization")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    Authorization resetAuthorization(@PathParam("client-id") final String clientId, @PathParam("access-token") final String accessToken);

    @PATCH
    @Path("/applications/{client_id}/token")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#reset-a-token")
    Authorization resetToken(final ResetToken resetToken);

    @DELETE
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#revoke-an-authorization-for-an-application")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    void revokeAuthorizationForApplication(final RevokeAuthorizationForApplication revokeAuthorizationForApplication);

    @DELETE
    @Path("/applications/{client_id}/tokens/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#revoke-an-authorization-for-an-application")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    void revokeAuthorizationForApplication(@PathParam("client-id") final String clientId, @PathParam("access-token") final String accessToken);

    @DELETE
    @Path("/applications/{client_id}/grants/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#revoke-a-grant-for-an-application")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    void revokeGrantForApplication(final RevokeGrantForApplication revokeGrantForApplication);

    @DELETE
    @Path("/applications/{client_id}/grants/{access_token}")
    @Docs("https://developer.github.com/v3/apps/oauth_applications/#revoke-a-grant-for-an-application")
    @RemovalDate("2021-05-05")
    @DeprecationDate("2020-02-14")
    void revokeGrantForApplication(@PathParam("client-id") final String clientId, @PathParam("access-token") final String accessToken);

    @DELETE
    @Path("/installation/token")
    @Docs("https://developer.github.com/v3/apps/installations/#revoke-an-installation-access-token")
    @EnabledForGithubApps
    void revokeInstallationAccessToken();

    @PUT
    @Path("/app/installations/{installation_id}/suspended")
    @Docs("https://developer.github.com/v3/apps/#suspend-an-app-installation")
    void suspendAppInstallation(final SuspendAppInstallation suspendAppInstallation);

    @PUT
    @Path("/app/installations/{installation_id}/suspended")
    @Docs("https://developer.github.com/v3/apps/#suspend-an-app-installation")
    void suspendAppInstallation(@PathParam("installation_id") final int installationId);

    @DELETE
    @Path("/app/installations/{installation_id}/suspended")
    @Docs("https://developer.github.com/v3/apps/#unsuspend-an-app-installation")
    void unsuspendAppInstallation(final UnsuspendAppInstallation unsuspendAppInstallation);

    @DELETE
    @Path("/app/installations/{installation_id}/suspended")
    @Docs("https://developer.github.com/v3/apps/#unsuspend-an-app-installation")
    void unsuspendAppInstallation(@PathParam("installation_id") final int installationId);
}
