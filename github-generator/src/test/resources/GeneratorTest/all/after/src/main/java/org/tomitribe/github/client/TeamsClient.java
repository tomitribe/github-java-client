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
import org.tomitribe.github.core.GithubCloudOnly;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.model.AddOrUpdateTeamMembershipForUser;
import org.tomitribe.github.model.AddOrUpdateTeamMembershipForUserLegacy;
import org.tomitribe.github.model.AddOrUpdateTeamProjectPermissions;
import org.tomitribe.github.model.AddOrUpdateTeamProjectPermissionsLegacy;
import org.tomitribe.github.model.AddOrUpdateTeamRepositoryPermissions;
import org.tomitribe.github.model.AddOrUpdateTeamRepositoryPermissionsLegacy;
import org.tomitribe.github.model.AddTeamMemberLegacy;
import org.tomitribe.github.model.CheckTeamPermissionsForProject;
import org.tomitribe.github.model.CheckTeamPermissionsForProjectLegacy;
import org.tomitribe.github.model.CheckTeamPermissionsForRepository;
import org.tomitribe.github.model.CheckTeamPermissionsForRepositoryLegacy;
import org.tomitribe.github.model.CreateDiscussion;
import org.tomitribe.github.model.CreateDiscussionComment;
import org.tomitribe.github.model.CreateDiscussionCommentLegacy;
import org.tomitribe.github.model.CreateDiscussionLegacy;
import org.tomitribe.github.model.CreateOrUpdateIdPGroupConnections;
import org.tomitribe.github.model.CreateOrUpdateIdPGroupConnectionsLegacy;
import org.tomitribe.github.model.CreateTeam;
import org.tomitribe.github.model.DeleteDiscussion;
import org.tomitribe.github.model.DeleteDiscussionComment;
import org.tomitribe.github.model.DeleteDiscussionCommentLegacy;
import org.tomitribe.github.model.DeleteDiscussionLegacy;
import org.tomitribe.github.model.DeleteTeam;
import org.tomitribe.github.model.DeleteTeamLegacy;
import org.tomitribe.github.model.GetDiscussion;
import org.tomitribe.github.model.GetDiscussionComment;
import org.tomitribe.github.model.GetDiscussionCommentLegacy;
import org.tomitribe.github.model.GetDiscussionLegacy;
import org.tomitribe.github.model.GetTeamByName;
import org.tomitribe.github.model.GetTeamLegacy;
import org.tomitribe.github.model.GetTeamMemberLegacy;
import org.tomitribe.github.model.GetTeamMembershipForUser;
import org.tomitribe.github.model.GetTeamMembershipForUserLegacy;
import org.tomitribe.github.model.GroupMapping;
import org.tomitribe.github.model.ListChildTeams;
import org.tomitribe.github.model.ListChildTeamsLegacy;
import org.tomitribe.github.model.ListDiscussionComments;
import org.tomitribe.github.model.ListDiscussionCommentsLegacy;
import org.tomitribe.github.model.ListDiscussions;
import org.tomitribe.github.model.ListDiscussionsLegacy;
import org.tomitribe.github.model.ListIdPGroupsForOrganization;
import org.tomitribe.github.model.ListIdPGroupsForTeam;
import org.tomitribe.github.model.ListIdPGroupsForTeamLegacy;
import org.tomitribe.github.model.ListPendingTeamInvitations;
import org.tomitribe.github.model.ListPendingTeamInvitationsLegacy;
import org.tomitribe.github.model.ListTeamMembers;
import org.tomitribe.github.model.ListTeamMembersLegacy;
import org.tomitribe.github.model.ListTeamProjects;
import org.tomitribe.github.model.ListTeamProjectsLegacy;
import org.tomitribe.github.model.ListTeamRepositories;
import org.tomitribe.github.model.ListTeamRepositoriesLegacy;
import org.tomitribe.github.model.ListTeams;
import org.tomitribe.github.model.MinimalRepository;
import org.tomitribe.github.model.OrganizationInvitation;
import org.tomitribe.github.model.RemoveProjectFromTeam;
import org.tomitribe.github.model.RemoveProjectFromTeamLegacy;
import org.tomitribe.github.model.RemoveRepositoryFromTeam;
import org.tomitribe.github.model.RemoveRepositoryFromTeamLegacy;
import org.tomitribe.github.model.RemoveTeamMemberLegacy;
import org.tomitribe.github.model.RemoveTeamMembershipForUser;
import org.tomitribe.github.model.RemoveTeamMembershipForUserLegacy;
import org.tomitribe.github.model.SimpleUser;
import org.tomitribe.github.model.Team;
import org.tomitribe.github.model.TeamDiscussion;
import org.tomitribe.github.model.TeamDiscussionComment;
import org.tomitribe.github.model.TeamFull;
import org.tomitribe.github.model.TeamMembership;
import org.tomitribe.github.model.TeamProject;
import org.tomitribe.github.model.UpdateDiscussion;
import org.tomitribe.github.model.UpdateDiscussionComment;
import org.tomitribe.github.model.UpdateDiscussionCommentLegacy;
import org.tomitribe.github.model.UpdateDiscussionLegacy;
import org.tomitribe.github.model.UpdateTeam;
import org.tomitribe.github.model.UpdateTeamLegacy;

public interface TeamsClient {

    @PUT
    @Path("/orgs/{org}/teams/{team_slug}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#add-or-update-team-membership-for-a-user")
    @EnabledForGithubApps
    TeamMembership addOrUpdateTeamMembershipForUser(final AddOrUpdateTeamMembershipForUser addOrUpdateTeamMembershipForUser);

    @PUT
    @Path("/teams/{team_id}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#add-or-update-team-membership-for-a-user-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamMembership addOrUpdateTeamMembershipForUserLegacy(final AddOrUpdateTeamMembershipForUserLegacy addOrUpdateTeamMembershipForUserLegacy);

    @PUT
    @Path("/orgs/{org}/teams/{team_slug}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#add-or-update-team-project-permissions")
    @EnabledForGithubApps
    @Preview("inertia")
    void addOrUpdateTeamProjectPermissions(final AddOrUpdateTeamProjectPermissions addOrUpdateTeamProjectPermissions);

    @PUT
    @Path("/teams/{team_id}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#add-or-update-team-project-permissions-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("inertia")
    void addOrUpdateTeamProjectPermissionsLegacy(final AddOrUpdateTeamProjectPermissionsLegacy addOrUpdateTeamProjectPermissionsLegacy);

    @PUT
    @Path("/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#add-or-update-team-repository-permissions")
    @EnabledForGithubApps
    void addOrUpdateTeamRepositoryPermissions(final AddOrUpdateTeamRepositoryPermissions addOrUpdateTeamRepositoryPermissions);

    @PUT
    @Path("/teams/{team_id}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#add-or-update-team-repository-permissions-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void addOrUpdateTeamRepositoryPermissionsLegacy(final AddOrUpdateTeamRepositoryPermissionsLegacy addOrUpdateTeamRepositoryPermissionsLegacy);

    @PUT
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#add-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void addTeamMemberLegacy(final AddTeamMemberLegacy addTeamMemberLegacy);

    @PUT
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#add-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void addTeamMemberLegacy(@PathParam("team-id") final int teamId, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-project")
    @EnabledForGithubApps
    @Preview("inertia")
    TeamProject checkTeamPermissionsForProject(final CheckTeamPermissionsForProject checkTeamPermissionsForProject);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-project")
    @EnabledForGithubApps
    @Preview("inertia")
    TeamProject checkTeamPermissionsForProject(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("project-id") final int projectId);

    @GET
    @Path("/teams/{team_id}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-project-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("inertia")
    TeamProject checkTeamPermissionsForProjectLegacy(final CheckTeamPermissionsForProjectLegacy checkTeamPermissionsForProjectLegacy);

    @GET
    @Path("/teams/{team_id}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-project-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("inertia")
    TeamProject checkTeamPermissionsForProjectLegacy(@PathParam("team-id") final int teamId, @PathParam("project-id") final int projectId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-repository")
    @EnabledForGithubApps
    void checkTeamPermissionsForRepository(final CheckTeamPermissionsForRepository checkTeamPermissionsForRepository);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-repository")
    @EnabledForGithubApps
    void checkTeamPermissionsForRepository(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/teams/{team_id}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-repository-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void checkTeamPermissionsForRepositoryLegacy(final CheckTeamPermissionsForRepositoryLegacy checkTeamPermissionsForRepositoryLegacy);

    @GET
    @Path("/teams/{team_id}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#check-team-permissions-for-a-repository-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void checkTeamPermissionsForRepositoryLegacy(@PathParam("team-id") final int teamId, @PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @POST
    @Path("/orgs/{org}/teams/{team_slug}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#create-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion createDiscussion(final CreateDiscussion createDiscussion);

    @POST
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#create-a-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment createDiscussionComment(final CreateDiscussionComment createDiscussionComment);

    @POST
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#create-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment createDiscussionCommentLegacy(final CreateDiscussionCommentLegacy createDiscussionCommentLegacy);

    @POST
    @Path("/teams/{team_id}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#create-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion createDiscussionLegacy(final CreateDiscussionLegacy createDiscussionLegacy);

    @PATCH
    @Path("/orgs/{org}/teams/{team_slug}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#create-or-update-idp-group-connections")
    @GithubCloudOnly
    GroupMapping createOrUpdateIdPGroupConnections(final CreateOrUpdateIdPGroupConnections createOrUpdateIdPGroupConnections);

    @PATCH
    @Path("/teams/{team_id}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#create-or-update-idp-group-connections-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @GithubCloudOnly
    GroupMapping createOrUpdateIdPGroupConnectionsLegacy(final CreateOrUpdateIdPGroupConnectionsLegacy createOrUpdateIdPGroupConnectionsLegacy);

    @POST
    @Path("/orgs/{org}/teams")
    @Docs("https://developer.github.com/v3/teams/#create-a-team")
    @EnabledForGithubApps
    TeamFull createTeam(final CreateTeam createTeam);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#delete-a-discussion")
    @EnabledForGithubApps
    void deleteDiscussion(final DeleteDiscussion deleteDiscussion);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#delete-a-discussion")
    @EnabledForGithubApps
    void deleteDiscussion(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#delete-a-discussion-comment")
    @EnabledForGithubApps
    void deleteDiscussionComment(final DeleteDiscussionComment deleteDiscussionComment);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#delete-a-discussion-comment")
    @EnabledForGithubApps
    void deleteDiscussionComment(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @DELETE
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#delete-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteDiscussionCommentLegacy(final DeleteDiscussionCommentLegacy deleteDiscussionCommentLegacy);

    @DELETE
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#delete-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteDiscussionCommentLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @DELETE
    @Path("/teams/{team_id}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#delete-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteDiscussionLegacy(final DeleteDiscussionLegacy deleteDiscussionLegacy);

    @DELETE
    @Path("/teams/{team_id}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#delete-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteDiscussionLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}")
    @Docs("https://developer.github.com/v3/teams/#delete-a-team")
    @EnabledForGithubApps
    void deleteTeam(final DeleteTeam deleteTeam);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}")
    @Docs("https://developer.github.com/v3/teams/#delete-a-team")
    @EnabledForGithubApps
    void deleteTeam(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @DELETE
    @Path("/teams/{team_id}")
    @Docs("https://developer.github.com/v3/teams/#delete-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteTeamLegacy(final DeleteTeamLegacy deleteTeamLegacy);

    @DELETE
    @Path("/teams/{team_id}")
    @Docs("https://developer.github.com/v3/teams/#delete-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void deleteTeamLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#get-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion getDiscussion(final GetDiscussion getDiscussion);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#get-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion getDiscussion(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#get-a-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment getDiscussionComment(final GetDiscussionComment getDiscussionComment);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#get-a-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment getDiscussionComment(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#get-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment getDiscussionCommentLegacy(final GetDiscussionCommentLegacy getDiscussionCommentLegacy);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#get-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment getDiscussionCommentLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber, @PathParam("comment-number") final int commentNumber);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#get-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion getDiscussionLegacy(final GetDiscussionLegacy getDiscussionLegacy);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#get-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion getDiscussionLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}")
    @Docs("https://developer.github.com/v3/teams/#get-a-team-by-name")
    @EnabledForGithubApps
    TeamFull getTeamByName(final GetTeamByName getTeamByName);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}")
    @Docs("https://developer.github.com/v3/teams/#get-a-team-by-name")
    @EnabledForGithubApps
    TeamFull getTeamByName(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}")
    @Docs("https://developer.github.com/v3/teams/#get-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamFull getTeamLegacy(final GetTeamLegacy getTeamLegacy);

    @GET
    @Path("/teams/{team_id}")
    @Docs("https://developer.github.com/v3/teams/#get-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamFull getTeamLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void getTeamMemberLegacy(final GetTeamMemberLegacy getTeamMemberLegacy);

    @GET
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void getTeamMemberLegacy(@PathParam("team-id") final int teamId, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-membership-for-a-user")
    @EnabledForGithubApps
    TeamMembership getTeamMembershipForUser(final GetTeamMembershipForUser getTeamMembershipForUser);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-membership-for-a-user")
    @EnabledForGithubApps
    TeamMembership getTeamMembershipForUser(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("username") final String username);

    @GET
    @Path("/teams/{team_id}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-membership-for-a-user-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamMembership getTeamMembershipForUserLegacy(final GetTeamMembershipForUserLegacy getTeamMembershipForUserLegacy);

    @GET
    @Path("/teams/{team_id}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#get-team-membership-for-a-user-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamMembership getTeamMembershipForUserLegacy(@PathParam("team-id") final int teamId, @PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-child-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listChildTeams(final ListChildTeams listChildTeams);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-child-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listChildTeams(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-child-teams-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listChildTeamsLegacy(final ListChildTeamsLegacy listChildTeamsLegacy);

    @GET
    @Path("/teams/{team_id}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-child-teams-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listChildTeamsLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussionComment[].class)
    Stream<TeamDiscussionComment> listDiscussionComments(final ListDiscussionComments listDiscussionComments);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussionComment[].class)
    Stream<TeamDiscussionComment> listDiscussionComments(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("discussion-number") final int discussionNumber);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussionComment[].class)
    Stream<TeamDiscussionComment> listDiscussionCommentsLegacy(final ListDiscussionCommentsLegacy listDiscussionCommentsLegacy);

    @GET
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#list-discussion-comments-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussionComment[].class)
    Stream<TeamDiscussionComment> listDiscussionCommentsLegacy(@PathParam("team-id") final int teamId, @PathParam("discussion-number") final int discussionNumber);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#list-discussions")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussion[].class)
    Stream<TeamDiscussion> listDiscussions(final ListDiscussions listDiscussions);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#list-discussions")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussion[].class)
    Stream<TeamDiscussion> listDiscussions(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#list-discussions-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussion[].class)
    Stream<TeamDiscussion> listDiscussionsLegacy(final ListDiscussionsLegacy listDiscussionsLegacy);

    @GET
    @Path("/teams/{team_id}/discussions")
    @Docs("https://developer.github.com/v3/teams/discussions/#list-discussions-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(TeamDiscussion[].class)
    Stream<TeamDiscussion> listDiscussionsLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/team-sync/groups")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    GroupMapping listIdPGroupsForOrganization(final ListIdPGroupsForOrganization listIdPGroupsForOrganization);

    @GET
    @Path("/orgs/{org}/team-sync/groups")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    GroupMapping listIdPGroupsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team")
    @GithubCloudOnly
    GroupMapping listIdPGroupsForTeam(final ListIdPGroupsForTeam listIdPGroupsForTeam);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team")
    @GithubCloudOnly
    GroupMapping listIdPGroupsForTeam(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @GithubCloudOnly
    GroupMapping listIdPGroupsForTeamLegacy(final ListIdPGroupsForTeamLegacy listIdPGroupsForTeamLegacy);

    @GET
    @Path("/teams/{team_id}/team-sync/group-mappings")
    @Docs("https://developer.github.com/v3/teams/team_sync/#list-idp-groups-for-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @GithubCloudOnly
    GroupMapping listIdPGroupsForTeamLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/invitations")
    @Docs("https://developer.github.com/v3/teams/members/#list-pending-team-invitations")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingTeamInvitations(final ListPendingTeamInvitations listPendingTeamInvitations);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/invitations")
    @Docs("https://developer.github.com/v3/teams/members/#list-pending-team-invitations")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingTeamInvitations(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/invitations")
    @Docs("https://developer.github.com/v3/teams/members/#list-pending-team-invitations-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingTeamInvitationsLegacy(final ListPendingTeamInvitationsLegacy listPendingTeamInvitationsLegacy);

    @GET
    @Path("/teams/{team_id}/invitations")
    @Docs("https://developer.github.com/v3/teams/members/#list-pending-team-invitations-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(OrganizationInvitation[].class)
    Stream<OrganizationInvitation> listPendingTeamInvitationsLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/members")
    @Docs("https://developer.github.com/v3/teams/members/#list-team-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listTeamMembers(final ListTeamMembers listTeamMembers);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/members")
    @Docs("https://developer.github.com/v3/teams/members/#list-team-members")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listTeamMembers(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/members")
    @Docs("https://developer.github.com/v3/teams/members/#list-team-members-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listTeamMembersLegacy(final ListTeamMembersLegacy listTeamMembersLegacy);

    @GET
    @Path("/teams/{team_id}/members")
    @Docs("https://developer.github.com/v3/teams/members/#list-team-members-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listTeamMembersLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/projects")
    @Docs("https://developer.github.com/v3/teams/#list-team-projects")
    @EnabledForGithubApps
    @Preview("inertia")
    @Paged(TeamProject[].class)
    Stream<TeamProject> listTeamProjects(final ListTeamProjects listTeamProjects);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/projects")
    @Docs("https://developer.github.com/v3/teams/#list-team-projects")
    @EnabledForGithubApps
    @Preview("inertia")
    @Paged(TeamProject[].class)
    Stream<TeamProject> listTeamProjects(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/projects")
    @Docs("https://developer.github.com/v3/teams/#list-team-projects-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("inertia")
    @Paged(TeamProject[].class)
    Stream<TeamProject> listTeamProjectsLegacy(final ListTeamProjectsLegacy listTeamProjectsLegacy);

    @GET
    @Path("/teams/{team_id}/projects")
    @Docs("https://developer.github.com/v3/teams/#list-team-projects-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("inertia")
    @Paged(TeamProject[].class)
    Stream<TeamProject> listTeamProjectsLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/repos")
    @Docs("https://developer.github.com/v3/teams/#list-team-repositories")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listTeamRepositories(final ListTeamRepositories listTeamRepositories);

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/repos")
    @Docs("https://developer.github.com/v3/teams/#list-team-repositories")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listTeamRepositories(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug);

    @GET
    @Path("/teams/{team_id}/repos")
    @Docs("https://developer.github.com/v3/teams/#list-team-repositories-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listTeamRepositoriesLegacy(final ListTeamRepositoriesLegacy listTeamRepositoriesLegacy);

    @GET
    @Path("/teams/{team_id}/repos")
    @Docs("https://developer.github.com/v3/teams/#list-team-repositories-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listTeamRepositoriesLegacy(@PathParam("team-id") final int teamId);

    @GET
    @Path("/orgs/{org}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listTeams(final ListTeams listTeams);

    @GET
    @Path("/orgs/{org}/teams")
    @Docs("https://developer.github.com/v3/teams/#list-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listTeams(@PathParam("org") final String org);

    @GET
    @Path("/user/teams")
    @Docs("https://developer.github.com/v3/teams/#list-teams-for-the-authenticated-user")
    @Paged(TeamFull[].class)
    Stream<TeamFull> listTeamsForAuthenticatedUser();

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-project-from-a-team")
    @EnabledForGithubApps
    void removeProjectFromTeam(final RemoveProjectFromTeam removeProjectFromTeam);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-project-from-a-team")
    @EnabledForGithubApps
    void removeProjectFromTeam(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("project-id") final int projectId);

    @DELETE
    @Path("/teams/{team_id}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-project-from-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeProjectFromTeamLegacy(final RemoveProjectFromTeamLegacy removeProjectFromTeamLegacy);

    @DELETE
    @Path("/teams/{team_id}/projects/{project_id}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-project-from-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeProjectFromTeamLegacy(@PathParam("team-id") final int teamId, @PathParam("project-id") final int projectId);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-repository-from-a-team")
    @EnabledForGithubApps
    void removeRepositoryFromTeam(final RemoveRepositoryFromTeam removeRepositoryFromTeam);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-repository-from-a-team")
    @EnabledForGithubApps
    void removeRepositoryFromTeam(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/teams/{team_id}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-repository-from-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeRepositoryFromTeamLegacy(final RemoveRepositoryFromTeamLegacy removeRepositoryFromTeamLegacy);

    @DELETE
    @Path("/teams/{team_id}/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/teams/#remove-a-repository-from-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeRepositoryFromTeamLegacy(@PathParam("team-id") final int teamId, @PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeTeamMemberLegacy(final RemoveTeamMemberLegacy removeTeamMemberLegacy);

    @DELETE
    @Path("/teams/{team_id}/members/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-member-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeTeamMemberLegacy(@PathParam("team-id") final int teamId, @PathParam("username") final String username);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-membership-for-a-user")
    @EnabledForGithubApps
    void removeTeamMembershipForUser(final RemoveTeamMembershipForUser removeTeamMembershipForUser);

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-membership-for-a-user")
    @EnabledForGithubApps
    void removeTeamMembershipForUser(@PathParam("org") final String org, @PathParam("team_slug") final String teamSlug, @PathParam("username") final String username);

    @DELETE
    @Path("/teams/{team_id}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-membership-for-a-user-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeTeamMembershipForUserLegacy(final RemoveTeamMembershipForUserLegacy removeTeamMembershipForUserLegacy);

    @DELETE
    @Path("/teams/{team_id}/memberships/{username}")
    @Docs("https://developer.github.com/v3/teams/members/#remove-team-membership-for-a-user-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    void removeTeamMembershipForUserLegacy(@PathParam("team-id") final int teamId, @PathParam("username") final String username);

    @PATCH
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#update-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion updateDiscussion(final UpdateDiscussion updateDiscussion);

    @PATCH
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#update-a-discussion-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment updateDiscussionComment(final UpdateDiscussionComment updateDiscussionComment);

    @PATCH
    @Path("/teams/{team_id}/discussions/{discussion_number}/comments/{comment_number}")
    @Docs("https://developer.github.com/v3/teams/discussion_comments/#update-a-discussion-comment-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussionComment updateDiscussionCommentLegacy(final UpdateDiscussionCommentLegacy updateDiscussionCommentLegacy);

    @PATCH
    @Path("/teams/{team_id}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#update-a-discussion-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    TeamDiscussion updateDiscussionLegacy(final UpdateDiscussionLegacy updateDiscussionLegacy);

    @PATCH
    @Path("/orgs/{org}/teams/{team_slug}")
    @Docs("https://developer.github.com/v3/teams/#update-a-team")
    @EnabledForGithubApps
    TeamFull updateTeam(final UpdateTeam updateTeam);

    @PATCH
    @Path("/teams/{team_id}")
    @Docs("https://developer.github.com/v3/teams/#update-a-team-legacy")
    @RemovalDate("2021-02-01")
    @DeprecationDate("2020-01-21")
    @EnabledForGithubApps
    TeamFull updateTeamLegacy(final UpdateTeamLegacy updateTeamLegacy);
}
