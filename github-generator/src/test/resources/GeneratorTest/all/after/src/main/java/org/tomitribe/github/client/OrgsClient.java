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
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.GithubCloudOnly;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.BlockUserFromOrganization;
import org.tomitribe.github.model.CheckIfUserIsBlockedByOrganization;
import org.tomitribe.github.model.CheckOrganizationMembershipForUser;
import org.tomitribe.github.model.CheckPublicOrganizationMembershipForUser;
import org.tomitribe.github.model.ConvertOrganizationMemberToOutsideCollaborator;
import org.tomitribe.github.model.CreateOrganizationInvitation;
import org.tomitribe.github.model.CreateOrganizationWebhook;
import org.tomitribe.github.model.CredentialAuthorization;
import org.tomitribe.github.model.DeleteOrganizationWebhook;
import org.tomitribe.github.model.GetOrganization;
import org.tomitribe.github.model.GetOrganizationMembershipForAuthenticatedUser;
import org.tomitribe.github.model.GetOrganizationMembershipForUser;
import org.tomitribe.github.model.GetOrganizationWebhook;
import org.tomitribe.github.model.Installation;
import org.tomitribe.github.model.InstallationsPage;
import org.tomitribe.github.model.ListAppInstallationsForOrganization;
import org.tomitribe.github.model.ListOrganizationInvitationTeams;
import org.tomitribe.github.model.ListOrganizationMembers;
import org.tomitribe.github.model.ListOrganizationMembershipsForAuthenticatedUser;
import org.tomitribe.github.model.ListOrganizationWebhooks;
import org.tomitribe.github.model.ListOrganizations;
import org.tomitribe.github.model.ListOrganizationsForUser;
import org.tomitribe.github.model.ListOutsideCollaboratorsForOrganization;
import org.tomitribe.github.model.ListPendingOrganizationInvitations;
import org.tomitribe.github.model.ListPublicOrganizationMembers;
import org.tomitribe.github.model.ListSAMLSSOAuthorizationsForOrganization;
import org.tomitribe.github.model.ListUsersBlockedByOrganization;
import org.tomitribe.github.model.OrgHook;
import org.tomitribe.github.model.OrgMembership;
import org.tomitribe.github.model.OrganizationFull;
import org.tomitribe.github.model.OrganizationInvitation;
import org.tomitribe.github.model.OrganizationSimple;
import org.tomitribe.github.model.PingOrganizationWebhook;
import org.tomitribe.github.model.RemoveOrganizationMember;
import org.tomitribe.github.model.RemoveOrganizationMembershipForUser;
import org.tomitribe.github.model.RemoveOutsideCollaboratorFromOrganization;
import org.tomitribe.github.model.RemovePublicOrganizationMembershipForAuthenticatedUser;
import org.tomitribe.github.model.RemoveSAMLSSOAuthorizationForOrganization;
import org.tomitribe.github.model.SetOrganizationMembershipForUser;
import org.tomitribe.github.model.SetPublicOrganizationMembershipForAuthenticatedUser;
import org.tomitribe.github.model.SimpleUser;
import org.tomitribe.github.model.Team;
import org.tomitribe.github.model.UnblockUserFromOrganization;
import org.tomitribe.github.model.UpdateOrganization;
import org.tomitribe.github.model.UpdateOrganizationMembershipForAuthenticatedUser;
import org.tomitribe.github.model.UpdateOrganizationWebhook;

public interface OrgsClient {

    @PUT
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#block-a-user-from-an-organization")
    @EnabledForGithubApps
    void blockUserFromOrganization(final BlockUserFromOrganization blockUserFromOrganization);

    @PUT
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#block-a-user-from-an-organization")
    @EnabledForGithubApps
    void blockUserFromOrganization(@PathParam("org") final String org, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#check-if-a-user-is-blocked-by-an-organization")
    @EnabledForGithubApps
    void checkIfUserIsBlockedByOrganization(final CheckIfUserIsBlockedByOrganization checkIfUserIsBlockedByOrganization);

    @GET
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#check-if-a-user-is-blocked-by-an-organization")
    @EnabledForGithubApps
    void checkIfUserIsBlockedByOrganization(@PathParam("org") final String org, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#check-organization-membership-for-a-user")
    @EnabledForGithubApps
    void checkOrganizationMembershipForUser(final CheckOrganizationMembershipForUser checkOrganizationMembershipForUser);

    @GET
    @Path("/orgs/{org}/members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#check-organization-membership-for-a-user")
    @EnabledForGithubApps
    void checkOrganizationMembershipForUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#check-public-organization-membership-for-a-user")
    @EnabledForGithubApps
    void checkPublicOrganizationMembershipForUser(final CheckPublicOrganizationMembershipForUser checkPublicOrganizationMembershipForUser);

    @GET
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#check-public-organization-membership-for-a-user")
    @EnabledForGithubApps
    void checkPublicOrganizationMembershipForUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @PUT
    @Path("/orgs/{org}/outside_collaborators/{username}")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#convert-an-organization-member-to-outside-collaborator")
    @EnabledForGithubApps
    void convertOrganizationMemberToOutsideCollaborator(final ConvertOrganizationMemberToOutsideCollaborator convertOrganizationMemberToOutsideCollaborator);

    @PUT
    @Path("/orgs/{org}/outside_collaborators/{username}")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#convert-an-organization-member-to-outside-collaborator")
    @EnabledForGithubApps
    void convertOrganizationMemberToOutsideCollaborator(@PathParam("org") final String org, @PathParam("username") final String username);

    @POST
    @Path("/orgs/{org}/invitations")
    @Docs("https://developer.github.com/v3/orgs/members/#create-an-organization-invitation")
    @EnabledForGithubApps
    OrganizationInvitation createOrganizationInvitation(final CreateOrganizationInvitation createOrganizationInvitation);

    @POST
    @Path("/orgs/{org}/hooks")
    @Docs("https://developer.github.com/v3/orgs/hooks/#create-an-organization-webhook")
    @EnabledForGithubApps
    OrgHook createOrganizationWebhook(final CreateOrganizationWebhook createOrganizationWebhook);

    @DELETE
    @Path("/orgs/{org}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/orgs/hooks/#delete-an-organization-webhook")
    @EnabledForGithubApps
    void deleteOrganizationWebhook(final DeleteOrganizationWebhook deleteOrganizationWebhook);

    @DELETE
    @Path("/orgs/{org}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/orgs/hooks/#delete-an-organization-webhook")
    @EnabledForGithubApps
    void deleteOrganizationWebhook(@PathParam("org") final String org, @PathParam("hook-id") final int hookId);

    @GET
    @Path("/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/#get-an-organization")
    @EnabledForGithubApps
    @Preview("surtur")
    OrganizationFull getOrganization(final GetOrganization getOrganization);

    @GET
    @Path("/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/#get-an-organization")
    @EnabledForGithubApps
    @Preview("surtur")
    OrganizationFull getOrganization(@PathParam("org") final String org);

    @GET
    @Path("/user/memberships/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/members/#get-an-organization-membership-for-the-authenticated-user")
    OrgMembership getOrganizationMembershipForAuthenticatedUser(final GetOrganizationMembershipForAuthenticatedUser getOrganizationMembershipForAuthenticatedUser);

    @GET
    @Path("/user/memberships/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/members/#get-an-organization-membership-for-the-authenticated-user")
    OrgMembership getOrganizationMembershipForAuthenticatedUser(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/memberships/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#get-organization-membership-for-a-user")
    @EnabledForGithubApps
    OrgMembership getOrganizationMembershipForUser(final GetOrganizationMembershipForUser getOrganizationMembershipForUser);

    @GET
    @Path("/orgs/{org}/memberships/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#get-organization-membership-for-a-user")
    @EnabledForGithubApps
    OrgMembership getOrganizationMembershipForUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/orgs/hooks/#get-an-organization-webhook")
    @EnabledForGithubApps
    OrgHook getOrganizationWebhook(final GetOrganizationWebhook getOrganizationWebhook);

    @GET
    @Path("/orgs/{org}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/orgs/hooks/#get-an-organization-webhook")
    @EnabledForGithubApps
    OrgHook getOrganizationWebhook(@PathParam("org") final String org, @PathParam("hook-id") final int hookId);

    @GET
    @Path("/orgs/{org}/installations")
    @Docs("https://developer.github.com/v3/orgs/#list-app-installations-for-an-organization")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Paged(InstallationsPage.class)
    Stream<Installation> listAppInstallationsForOrganization(final ListAppInstallationsForOrganization listAppInstallationsForOrganization);

    @GET
    @Path("/orgs/{org}/installations")
    @Docs("https://developer.github.com/v3/orgs/#list-app-installations-for-an-organization")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Paged(InstallationsPage.class)
    Stream<Installation> listAppInstallationsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/invitations/{invitation_id}/teams")
    @Docs("https://developer.github.com/v3/orgs/members/#list-organization-invitation-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listOrganizationInvitationTeams(final ListOrganizationInvitationTeams listOrganizationInvitationTeams);

    @GET
    @Path("/orgs/{org}/invitations/{invitation_id}/teams")
    @Docs("https://developer.github.com/v3/orgs/members/#list-organization-invitation-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listOrganizationInvitationTeams(@PathParam("org") final String org, @PathParam("invitation_id") final int invitationId);

    @GET
    @Path("/orgs/{org}/members")
    @Docs("https://developer.github.com/v3/orgs/members/#list-organization-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listOrganizationMembers(final ListOrganizationMembers listOrganizationMembers);

    @GET
    @Path("/orgs/{org}/members")
    @Docs("https://developer.github.com/v3/orgs/members/#list-organization-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listOrganizationMembers(@PathParam("org") final String org);

    @GET
    @Path("/user/memberships/orgs")
    @Docs("https://developer.github.com/v3/orgs/members/#list-organization-memberships-for-the-authenticated-user")
    @Paged(OrgMembership[].class)
    Stream<OrgMembership> listOrganizationMembershipsForAuthenticatedUser(final ListOrganizationMembershipsForAuthenticatedUser listOrganizationMembershipsForAuthenticatedUser);

    @GET
    @Path("/orgs/{org}/hooks")
    @Docs("https://developer.github.com/v3/orgs/hooks/#list-organization-webhooks")
    @EnabledForGithubApps
    @Paged(OrgHook[].class)
    Stream<OrgHook> listOrganizationWebhooks(final ListOrganizationWebhooks listOrganizationWebhooks);

    @GET
    @Path("/orgs/{org}/hooks")
    @Docs("https://developer.github.com/v3/orgs/hooks/#list-organization-webhooks")
    @EnabledForGithubApps
    @Paged(OrgHook[].class)
    Stream<OrgHook> listOrganizationWebhooks(@PathParam("org") final String org);

    @GET
    @Path("/organizations")
    @Docs("https://developer.github.com/v3/orgs/#list-organizations")
    @EnabledForGithubApps
    @Paged(OrganizationSimple[].class)
    Stream<OrganizationSimple> listOrganizations(final ListOrganizations listOrganizations);

    @GET
    @Path("/user/orgs")
    @Docs("https://developer.github.com/v3/orgs/#list-organizations-for-the-authenticated-user")
    @Paged(OrganizationSimple[].class)
    Stream<OrganizationSimple> listOrganizationsForAuthenticatedUser();

    @GET
    @Path("/users/{username}/orgs")
    @Docs("https://developer.github.com/v3/orgs/#list-organizations-for-a-user")
    @EnabledForGithubApps
    @Paged(OrganizationSimple[].class)
    Stream<OrganizationSimple> listOrganizationsForUser(final ListOrganizationsForUser listOrganizationsForUser);

    @GET
    @Path("/users/{username}/orgs")
    @Docs("https://developer.github.com/v3/orgs/#list-organizations-for-a-user")
    @EnabledForGithubApps
    @Paged(OrganizationSimple[].class)
    Stream<OrganizationSimple> listOrganizationsForUser(@PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/outside_collaborators")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#list-outside-collaborators-for-an-organization")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listOutsideCollaboratorsForOrganization(final ListOutsideCollaboratorsForOrganization listOutsideCollaboratorsForOrganization);

    @GET
    @Path("/orgs/{org}/outside_collaborators")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#list-outside-collaborators-for-an-organization")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listOutsideCollaboratorsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/invitations")
    @Docs("https://developer.github.com/v3/orgs/members/#list-pending-organization-invitations")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingOrganizationInvitations(final ListPendingOrganizationInvitations listPendingOrganizationInvitations);

    @GET
    @Path("/orgs/{org}/invitations")
    @Docs("https://developer.github.com/v3/orgs/members/#list-pending-organization-invitations")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingOrganizationInvitations(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/public_members")
    @Docs("https://developer.github.com/v3/orgs/members/#list-public-organization-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listPublicOrganizationMembers(final ListPublicOrganizationMembers listPublicOrganizationMembers);

    @GET
    @Path("/orgs/{org}/public_members")
    @Docs("https://developer.github.com/v3/orgs/members/#list-public-organization-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listPublicOrganizationMembers(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/credential-authorizations")
    @Docs("https://developer.github.com/v3/orgs/#list-saml-sso-authorizations-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    Stream<CredentialAuthorization> listSAMLSSOAuthorizationsForOrganization(final ListSAMLSSOAuthorizationsForOrganization listSAMLSSOAuthorizationsForOrganization);

    @GET
    @Path("/orgs/{org}/credential-authorizations")
    @Docs("https://developer.github.com/v3/orgs/#list-saml-sso-authorizations-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    Stream<CredentialAuthorization> listSAMLSSOAuthorizationsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/blocks")
    @Docs("https://developer.github.com/v3/orgs/blocking/#list-users-blocked-by-an-organization")
    @EnabledForGithubApps
    Stream<SimpleUser> listUsersBlockedByOrganization(final ListUsersBlockedByOrganization listUsersBlockedByOrganization);

    @GET
    @Path("/orgs/{org}/blocks")
    @Docs("https://developer.github.com/v3/orgs/blocking/#list-users-blocked-by-an-organization")
    @EnabledForGithubApps
    Stream<SimpleUser> listUsersBlockedByOrganization(@PathParam("org") final String org);

    @POST
    @Path("/orgs/{org}/hooks/{hook_id}/pings")
    @Docs("https://developer.github.com/v3/orgs/hooks/#ping-an-organization-webhook")
    @EnabledForGithubApps
    void pingOrganizationWebhook(final PingOrganizationWebhook pingOrganizationWebhook);

    @POST
    @Path("/orgs/{org}/hooks/{hook_id}/pings")
    @Docs("https://developer.github.com/v3/orgs/hooks/#ping-an-organization-webhook")
    @EnabledForGithubApps
    void pingOrganizationWebhook(@PathParam("org") final String org, @PathParam("hook-id") final int hookId);

    @DELETE
    @Path("/orgs/{org}/members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-an-organization-member")
    @EnabledForGithubApps
    void removeOrganizationMember(final RemoveOrganizationMember removeOrganizationMember);

    @DELETE
    @Path("/orgs/{org}/members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-an-organization-member")
    @EnabledForGithubApps
    void removeOrganizationMember(@PathParam("org") final String org, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/memberships/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-organization-membership-for-a-user")
    @EnabledForGithubApps
    void removeOrganizationMembershipForUser(final RemoveOrganizationMembershipForUser removeOrganizationMembershipForUser);

    @DELETE
    @Path("/orgs/{org}/memberships/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-organization-membership-for-a-user")
    @EnabledForGithubApps
    void removeOrganizationMembershipForUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/outside_collaborators/{username}")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#remove-outside-collaborator-from-an-organization")
    @EnabledForGithubApps
    void removeOutsideCollaboratorFromOrganization(final RemoveOutsideCollaboratorFromOrganization removeOutsideCollaboratorFromOrganization);

    @DELETE
    @Path("/orgs/{org}/outside_collaborators/{username}")
    @Docs("https://developer.github.com/v3/orgs/outside_collaborators/#remove-outside-collaborator-from-an-organization")
    @EnabledForGithubApps
    void removeOutsideCollaboratorFromOrganization(@PathParam("org") final String org, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-public-organization-membership-for-the-authenticated-user")
    void removePublicOrganizationMembershipForAuthenticatedUser(final RemovePublicOrganizationMembershipForAuthenticatedUser removePublicOrganizationMembershipForAuthenticatedUser);

    @DELETE
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#remove-public-organization-membership-for-the-authenticated-user")
    void removePublicOrganizationMembershipForAuthenticatedUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/credential-authorizations/{credential_id}")
    @Docs("https://developer.github.com/v3/orgs/#remove-a-saml-sso-authorization-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    void removeSAMLSSOAuthorizationForOrganization(final RemoveSAMLSSOAuthorizationForOrganization removeSAMLSSOAuthorizationForOrganization);

    @DELETE
    @Path("/orgs/{org}/credential-authorizations/{credential_id}")
    @Docs("https://developer.github.com/v3/orgs/#remove-a-saml-sso-authorization-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    void removeSAMLSSOAuthorizationForOrganization(@PathParam("org") final String org, @PathParam("credential_id") final int credentialId);

    @PUT
    @Path("/orgs/{org}/memberships/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#set-organization-membership-for-a-user")
    @EnabledForGithubApps
    OrgMembership setOrganizationMembershipForUser(final SetOrganizationMembershipForUser setOrganizationMembershipForUser);

    @PUT
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#set-public-organization-membership-for-the-authenticated-user")
    void setPublicOrganizationMembershipForAuthenticatedUser(final SetPublicOrganizationMembershipForAuthenticatedUser setPublicOrganizationMembershipForAuthenticatedUser);

    @PUT
    @Path("/orgs/{org}/public_members/{username}")
    @Docs("https://developer.github.com/v3/orgs/members/#set-public-organization-membership-for-the-authenticated-user")
    void setPublicOrganizationMembershipForAuthenticatedUser(@PathParam("org") final String org, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#unblock-a-user-from-an-organization")
    @EnabledForGithubApps
    void unblockUserFromOrganization(final UnblockUserFromOrganization unblockUserFromOrganization);

    @DELETE
    @Path("/orgs/{org}/blocks/{username}")
    @Docs("https://developer.github.com/v3/orgs/blocking/#unblock-a-user-from-an-organization")
    @EnabledForGithubApps
    void unblockUserFromOrganization(@PathParam("org") final String org, @PathParam("username") final String username);

    @PATCH
    @Path("/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/#update-an-organization")
    @EnabledForGithubApps
    @Preview("surtur")
    OrganizationFull updateOrganization(final UpdateOrganization updateOrganization);

    @PATCH
    @Path("/user/memberships/orgs/{org}")
    @Docs("https://developer.github.com/v3/orgs/members/#update-an-organization-membership-for-the-authenticated-user")
    OrgMembership updateOrganizationMembershipForAuthenticatedUser(final UpdateOrganizationMembershipForAuthenticatedUser updateOrganizationMembershipForAuthenticatedUser);

    @PATCH
    @Path("/orgs/{org}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/orgs/hooks/#update-an-organization-webhook")
    @EnabledForGithubApps
    OrgHook updateOrganizationWebhook(final UpdateOrganizationWebhook updateOrganizationWebhook);
}
