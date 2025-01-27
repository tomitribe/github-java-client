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
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.AcceptRepositoryInvitation;
import org.tomitribe.github.model.AddRepositoryCollaborator;
import org.tomitribe.github.model.BranchProtection;
import org.tomitribe.github.model.BranchRestrictionPolicy;
import org.tomitribe.github.model.BranchShort;
import org.tomitribe.github.model.BranchWithProtection;
import org.tomitribe.github.model.CheckIfUserIsRepositoryCollaborator;
import org.tomitribe.github.model.CheckIfVulnerabilityAlertsAreEnabledForRepository;
import org.tomitribe.github.model.CloneTraffic;
import org.tomitribe.github.model.Collaborator;
import org.tomitribe.github.model.CombinedCommitStatus;
import org.tomitribe.github.model.Commit;
import org.tomitribe.github.model.CommitActivity;
import org.tomitribe.github.model.CommitComment;
import org.tomitribe.github.model.CommitComparison;
import org.tomitribe.github.model.CommunityProfile;
import org.tomitribe.github.model.CompareTwoCommits;
import org.tomitribe.github.model.ContentFile;
import org.tomitribe.github.model.ContentTraffic;
import org.tomitribe.github.model.Contributor;
import org.tomitribe.github.model.ContributorActivity;
import org.tomitribe.github.model.CreateCommitComment;
import org.tomitribe.github.model.CreateCommitSignatureProtection;
import org.tomitribe.github.model.CreateCommitStatus;
import org.tomitribe.github.model.CreateDeployKey;
import org.tomitribe.github.model.CreateDeployment;
import org.tomitribe.github.model.CreateDeploymentStatus;
import org.tomitribe.github.model.CreateFork;
import org.tomitribe.github.model.CreateGitHubPagesSite;
import org.tomitribe.github.model.CreateOrUpdateFileContents;
import org.tomitribe.github.model.CreateOrganizationRepository;
import org.tomitribe.github.model.CreateRelease;
import org.tomitribe.github.model.CreateRepositoryDispatchEvent;
import org.tomitribe.github.model.CreateRepositoryForAuthenticatedUser;
import org.tomitribe.github.model.CreateRepositoryUsingTemplate;
import org.tomitribe.github.model.CreateRepositoryWebhook;
import org.tomitribe.github.model.DeclineRepositoryInvitation;
import org.tomitribe.github.model.DeleteAccessRestrictions;
import org.tomitribe.github.model.DeleteAdminBranchProtection;
import org.tomitribe.github.model.DeleteBranchProtection;
import org.tomitribe.github.model.DeleteCommitComment;
import org.tomitribe.github.model.DeleteCommitSignatureProtection;
import org.tomitribe.github.model.DeleteDeployKey;
import org.tomitribe.github.model.DeleteDeployment;
import org.tomitribe.github.model.DeleteFile;
import org.tomitribe.github.model.DeleteGitHubPagesSite;
import org.tomitribe.github.model.DeletePullRequestReviewProtection;
import org.tomitribe.github.model.DeleteRelease;
import org.tomitribe.github.model.DeleteReleaseAsset;
import org.tomitribe.github.model.DeleteRepository;
import org.tomitribe.github.model.DeleteRepositoryInvitation;
import org.tomitribe.github.model.DeleteRepositoryWebhook;
import org.tomitribe.github.model.DeployKey;
import org.tomitribe.github.model.Deployment;
import org.tomitribe.github.model.DeploymentStatus;
import org.tomitribe.github.model.DisableAutomatedSecurityFixes;
import org.tomitribe.github.model.DisableVulnerabilityAlerts;
import org.tomitribe.github.model.EnableAutomatedSecurityFixes;
import org.tomitribe.github.model.EnableVulnerabilityAlerts;
import org.tomitribe.github.model.FileCommit;
import org.tomitribe.github.model.FullRepository;
import org.tomitribe.github.model.GetAccessRestrictions;
import org.tomitribe.github.model.GetAdminBranchProtection;
import org.tomitribe.github.model.GetAllContributorCommitActivity;
import org.tomitribe.github.model.GetAllRepositoryTopics;
import org.tomitribe.github.model.GetAllStatusCheckContexts;
import org.tomitribe.github.model.GetAppsWithAccessToProtectedBranch;
import org.tomitribe.github.model.GetBranch;
import org.tomitribe.github.model.GetBranchProtection;
import org.tomitribe.github.model.GetCombinedStatusForSpecificReference;
import org.tomitribe.github.model.GetCommit;
import org.tomitribe.github.model.GetCommitComment;
import org.tomitribe.github.model.GetCommitSignatureProtection;
import org.tomitribe.github.model.GetCommunityProfileMetrics;
import org.tomitribe.github.model.GetDeployKey;
import org.tomitribe.github.model.GetDeployment;
import org.tomitribe.github.model.GetDeploymentStatus;
import org.tomitribe.github.model.GetGitHubPagesBuild;
import org.tomitribe.github.model.GetGitHubPagesSite;
import org.tomitribe.github.model.GetHourlyCommitCountForEachDay;
import org.tomitribe.github.model.GetLastYearOfCommitActivity;
import org.tomitribe.github.model.GetLatestPagesBuild;
import org.tomitribe.github.model.GetLatestRelease;
import org.tomitribe.github.model.GetPageViews;
import org.tomitribe.github.model.GetRelease;
import org.tomitribe.github.model.GetReleaseAsset;
import org.tomitribe.github.model.GetReleaseByTagName;
import org.tomitribe.github.model.GetRepository;
import org.tomitribe.github.model.GetRepositoryClones;
import org.tomitribe.github.model.GetRepositoryContent;
import org.tomitribe.github.model.GetRepositoryContentResponse;
import org.tomitribe.github.model.GetRepositoryPermissionsForUser;
import org.tomitribe.github.model.GetRepositoryREADME;
import org.tomitribe.github.model.GetRepositoryWebhook;
import org.tomitribe.github.model.GetStatusChecksProtection;
import org.tomitribe.github.model.GetTeamsWithAccessToProtectedBranch;
import org.tomitribe.github.model.GetTopReferralPaths;
import org.tomitribe.github.model.GetTopReferralSources;
import org.tomitribe.github.model.GetUsersWithAccessToProtectedBranch;
import org.tomitribe.github.model.GetWeeklyCommitActivity;
import org.tomitribe.github.model.GetWeeklyCommitCount;
import org.tomitribe.github.model.Hook;
import org.tomitribe.github.model.Integration;
import org.tomitribe.github.model.Language;
import org.tomitribe.github.model.ListBranches;
import org.tomitribe.github.model.ListBranchesForHEADCommit;
import org.tomitribe.github.model.ListCommitComments;
import org.tomitribe.github.model.ListCommitCommentsForRepository;
import org.tomitribe.github.model.ListCommitStatusesForReference;
import org.tomitribe.github.model.ListCommits;
import org.tomitribe.github.model.ListDeployKeys;
import org.tomitribe.github.model.ListDeploymentStatuses;
import org.tomitribe.github.model.ListDeployments;
import org.tomitribe.github.model.ListForks;
import org.tomitribe.github.model.ListGitHubPagesBuilds;
import org.tomitribe.github.model.ListOrganizationRepositories;
import org.tomitribe.github.model.ListPublicRepositories;
import org.tomitribe.github.model.ListPullRequestsAssociatedWithCommit;
import org.tomitribe.github.model.ListReleaseAssets;
import org.tomitribe.github.model.ListReleases;
import org.tomitribe.github.model.ListRepositoriesForAuthenticatedUser;
import org.tomitribe.github.model.ListRepositoriesForUser;
import org.tomitribe.github.model.ListRepositoryCollaborators;
import org.tomitribe.github.model.ListRepositoryContributors;
import org.tomitribe.github.model.ListRepositoryInvitations;
import org.tomitribe.github.model.ListRepositoryLanguages;
import org.tomitribe.github.model.ListRepositoryTags;
import org.tomitribe.github.model.ListRepositoryTeams;
import org.tomitribe.github.model.ListRepositoryWebhooks;
import org.tomitribe.github.model.MergeBranch;
import org.tomitribe.github.model.MinimalRepository;
import org.tomitribe.github.model.Page;
import org.tomitribe.github.model.PageBuild;
import org.tomitribe.github.model.PageBuildStatus;
import org.tomitribe.github.model.ParticipationStats;
import org.tomitribe.github.model.PingRepositoryWebhook;
import org.tomitribe.github.model.ProtectedBranch;
import org.tomitribe.github.model.ProtectedBranchAdminEnforced;
import org.tomitribe.github.model.ProtectedBranchPullRequestReview;
import org.tomitribe.github.model.PullRequestSimple;
import org.tomitribe.github.model.ReferrerTraffic;
import org.tomitribe.github.model.Release;
import org.tomitribe.github.model.ReleaseAsset;
import org.tomitribe.github.model.RemoveRepositoryCollaborator;
import org.tomitribe.github.model.RemoveStatusCheckProtection;
import org.tomitribe.github.model.ReplaceAllRepositoryTopics;
import org.tomitribe.github.model.Repository;
import org.tomitribe.github.model.RepositoryCollaboratorPermission;
import org.tomitribe.github.model.RepositoryInvitation;
import org.tomitribe.github.model.RequestGitHubPagesBuild;
import org.tomitribe.github.model.SetAdminBranchProtection;
import org.tomitribe.github.model.ShortBranch;
import org.tomitribe.github.model.SimpleCommit;
import org.tomitribe.github.model.SimpleUser;
import org.tomitribe.github.model.Status;
import org.tomitribe.github.model.StatusCheckPolicy;
import org.tomitribe.github.model.Tag;
import org.tomitribe.github.model.Team;
import org.tomitribe.github.model.TestPushRepositoryWebhook;
import org.tomitribe.github.model.Topic;
import org.tomitribe.github.model.TransferRepository;
import org.tomitribe.github.model.UpdateBranchProtection;
import org.tomitribe.github.model.UpdateCommitComment;
import org.tomitribe.github.model.UpdateInformationAboutGitHubPagesSite;
import org.tomitribe.github.model.UpdatePullRequestReviewProtection;
import org.tomitribe.github.model.UpdateRelease;
import org.tomitribe.github.model.UpdateReleaseAsset;
import org.tomitribe.github.model.UpdateRepository;
import org.tomitribe.github.model.UpdateRepositoryInvitation;
import org.tomitribe.github.model.UpdateRepositoryWebhook;
import org.tomitribe.github.model.UpdateStatusCheckProtection;
import org.tomitribe.github.model.ViewTraffic;

public interface ReposClient {

    @PATCH
    @Path("/user/repository_invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#accept-a-repository-invitation")
    void acceptRepositoryInvitation(final AcceptRepositoryInvitation acceptRepositoryInvitation);

    @PATCH
    @Path("/user/repository_invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#accept-a-repository-invitation")
    void acceptRepositoryInvitation(@PathParam("invitation_id") final int invitationId);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#add-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> addAppAccessRestrictions(final AddAppAccessRestrictions addAppAccessRestrictions);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#add-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> addAppAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/collaborators/{username}")
    @Docs("https://developer.github.com/v3/repos/collaborators/#add-a-repository-collaborator")
    @EnabledForGithubApps
    RepositoryInvitation addRepositoryCollaborator(final AddRepositoryCollaborator addRepositoryCollaborator);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#add-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> addStatusCheckContexts(final AddStatusCheckContexts addStatusCheckContexts);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#add-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> addStatusCheckContexts(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#add-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> addTeamAccessRestrictions(final AddTeamAccessRestrictions addTeamAccessRestrictions);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#add-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> addTeamAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#add-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> addUserAccessRestrictions(final AddUserAccessRestrictions addUserAccessRestrictions);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#add-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> addUserAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators/{username}")
    @Docs("https://developer.github.com/v3/repos/collaborators/#check-if-a-user-is-a-repository-collaborator")
    @EnabledForGithubApps
    void checkIfUserIsRepositoryCollaborator(final CheckIfUserIsRepositoryCollaborator checkIfUserIsRepositoryCollaborator);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators/{username}")
    @Docs("https://developer.github.com/v3/repos/collaborators/#check-if-a-user-is-a-repository-collaborator")
    @EnabledForGithubApps
    void checkIfUserIsRepositoryCollaborator(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("username") final String username);

    @GET
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#check-if-vulnerability-alerts-are-enabled-for-a-repository")
    @Preview("dorian")
    void checkIfVulnerabilityAlertsAreEnabledForRepository(final CheckIfVulnerabilityAlertsAreEnabledForRepository checkIfVulnerabilityAlertsAreEnabledForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#check-if-vulnerability-alerts-are-enabled-for-a-repository")
    @Preview("dorian")
    void checkIfVulnerabilityAlertsAreEnabledForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/compare/{base}...{head}")
    @Docs("https://developer.github.com/v3/repos/commits/#compare-two-commits")
    @EnabledForGithubApps
    CommitComparison compareTwoCommits(final CompareTwoCommits compareTwoCommits);

    @GET
    @Path("/repos/{owner}/{repo}/compare/{base}...{head}")
    @Docs("https://developer.github.com/v3/repos/commits/#compare-two-commits")
    @EnabledForGithubApps
    CommitComparison compareTwoCommits(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("base") final String base, @PathParam("head") final String head);

    @POST
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/comments")
    @Docs("https://developer.github.com/v3/repos/comments/#create-a-commit-comment")
    @EnabledForGithubApps
    CommitComment createCommitComment(final CreateCommitComment createCommitComment);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#create-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    ProtectedBranchAdminEnforced createCommitSignatureProtection(final CreateCommitSignatureProtection createCommitSignatureProtection);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#create-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    ProtectedBranchAdminEnforced createCommitSignatureProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @POST
    @Path("/repos/{owner}/{repo}/statuses/{sha}")
    @Docs("https://developer.github.com/v3/repos/statuses/#create-a-commit-status")
    @EnabledForGithubApps
    Status createCommitStatus(final CreateCommitStatus createCommitStatus);

    @POST
    @Path("/repos/{owner}/{repo}/keys")
    @Docs("https://developer.github.com/v3/repos/keys/#create-a-deploy-key")
    @EnabledForGithubApps
    DeployKey createDeployKey(final CreateDeployKey createDeployKey);

    @POST
    @Path("/repos/{owner}/{repo}/deployments")
    @Docs("https://developer.github.com/v3/repos/deployments/#create-a-deployment")
    @EnabledForGithubApps
    @Preview("ant-man")
    Deployment createDeployment(final CreateDeployment createDeployment);

    @POST
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}/statuses")
    @Docs("https://developer.github.com/v3/repos/deployments/#create-a-deployment-status")
    @EnabledForGithubApps
    @Preview("flash")
    @Preview("ant-man")
    DeploymentStatus createDeploymentStatus(final CreateDeploymentStatus createDeploymentStatus);

    @POST
    @Path("/repos/{owner}/{repo}/forks")
    @Docs("https://developer.github.com/v3/repos/forks/#create-a-fork")
    @EnabledForGithubApps
    Repository createFork(final CreateFork createFork);

    @POST
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#create-a-github-pages-site")
    @EnabledForGithubApps
    @Preview("switcheroo")
    Page createGitHubPagesSite(final CreateGitHubPagesSite createGitHubPagesSite);

    @PUT
    @Path("/repos/{owner}/{repo}/contents/{path}")
    @Docs("https://developer.github.com/v3/repos/contents/#create-or-update-file-contents")
    @EnabledForGithubApps
    FileCommit createOrUpdateFileContents(final CreateOrUpdateFileContents createOrUpdateFileContents);

    @POST
    @Path("/orgs/{org}/repos")
    @Docs("https://developer.github.com/v3/repos/#create-an-organization-repository")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("baptiste")
    Repository createOrganizationRepository(final CreateOrganizationRepository createOrganizationRepository);

    @POST
    @Path("/repos/{owner}/{repo}/releases")
    @Docs("https://developer.github.com/v3/repos/releases/#create-a-release")
    @EnabledForGithubApps
    Release createRelease(final CreateRelease createRelease);

    @POST
    @Path("/repos/{owner}/{repo}/dispatches")
    @Docs("https://developer.github.com/v3/repos/#create-a-repository-dispatch-event")
    @EnabledForGithubApps
    void createRepositoryDispatchEvent(final CreateRepositoryDispatchEvent createRepositoryDispatchEvent);

    @POST
    @Path("/user/repos")
    @Docs("https://developer.github.com/v3/repos/#create-a-repository-for-the-authenticated-user")
    @Preview("nebula")
    @Preview("baptiste")
    Repository createRepositoryForAuthenticatedUser(final CreateRepositoryForAuthenticatedUser createRepositoryForAuthenticatedUser);

    @POST
    @Path("/repos/{template_owner}/{template_repo}/generate")
    @Docs("https://developer.github.com/v3/repos/#create-a-repository-using-a-template")
    @Preview("baptiste")
    Repository createRepositoryUsingTemplate(final CreateRepositoryUsingTemplate createRepositoryUsingTemplate);

    @POST
    @Path("/repos/{owner}/{repo}/hooks")
    @Docs("https://developer.github.com/v3/repos/hooks/#create-a-repository-webhook")
    @EnabledForGithubApps
    Hook createRepositoryWebhook(final CreateRepositoryWebhook createRepositoryWebhook);

    @DELETE
    @Path("/user/repository_invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#decline-a-repository-invitation")
    void declineRepositoryInvitation(final DeclineRepositoryInvitation declineRepositoryInvitation);

    @DELETE
    @Path("/user/repository_invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#decline-a-repository-invitation")
    void declineRepositoryInvitation(@PathParam("invitation_id") final int invitationId);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-access-restrictions")
    @EnabledForGithubApps
    void deleteAccessRestrictions(final DeleteAccessRestrictions deleteAccessRestrictions);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-access-restrictions")
    @EnabledForGithubApps
    void deleteAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-admin-branch-protection")
    @EnabledForGithubApps
    void deleteAdminBranchProtection(final DeleteAdminBranchProtection deleteAdminBranchProtection);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-admin-branch-protection")
    @EnabledForGithubApps
    void deleteAdminBranchProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-branch-protection")
    @EnabledForGithubApps
    void deleteBranchProtection(final DeleteBranchProtection deleteBranchProtection);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-branch-protection")
    @EnabledForGithubApps
    void deleteBranchProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/repos/comments/#delete-a-commit-comment")
    @EnabledForGithubApps
    void deleteCommitComment(final DeleteCommitComment deleteCommitComment);

    @DELETE
    @Path("/repos/{owner}/{repo}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/repos/comments/#delete-a-commit-comment")
    @EnabledForGithubApps
    void deleteCommitComment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    void deleteCommitSignatureProtection(final DeleteCommitSignatureProtection deleteCommitSignatureProtection);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    void deleteCommitSignatureProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/keys/{key_id}")
    @Docs("https://developer.github.com/v3/repos/keys/#delete-a-deploy-key")
    @EnabledForGithubApps
    void deleteDeployKey(final DeleteDeployKey deleteDeployKey);

    @DELETE
    @Path("/repos/{owner}/{repo}/keys/{key_id}")
    @Docs("https://developer.github.com/v3/repos/keys/#delete-a-deploy-key")
    @EnabledForGithubApps
    void deleteDeployKey(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("key_id") final int keyId);

    @DELETE
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#delete-a-deployment")
    @EnabledForGithubApps
    void deleteDeployment(final DeleteDeployment deleteDeployment);

    @DELETE
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#delete-a-deployment")
    @EnabledForGithubApps
    void deleteDeployment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("deployment_id") final int deploymentId);

    @DELETE
    @Path("/repos/{owner}/{repo}/contents/{path}")
    @Docs("https://developer.github.com/v3/repos/contents/#delete-a-file")
    @EnabledForGithubApps
    FileCommit deleteFile(final DeleteFile deleteFile);

    @DELETE
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#delete-a-github-pages-site")
    @EnabledForGithubApps
    @Preview("switcheroo")
    void deleteGitHubPagesSite(final DeleteGitHubPagesSite deleteGitHubPagesSite);

    @DELETE
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#delete-a-github-pages-site")
    @EnabledForGithubApps
    @Preview("switcheroo")
    void deleteGitHubPagesSite(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-pull-request-review-protection")
    @EnabledForGithubApps
    void deletePullRequestReviewProtection(final DeletePullRequestReviewProtection deletePullRequestReviewProtection);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews")
    @Docs("https://developer.github.com/v3/repos/branches/#delete-pull-request-review-protection")
    @EnabledForGithubApps
    void deletePullRequestReviewProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/releases/{release_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#delete-a-release")
    @EnabledForGithubApps
    void deleteRelease(final DeleteRelease deleteRelease);

    @DELETE
    @Path("/repos/{owner}/{repo}/releases/{release_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#delete-a-release")
    @EnabledForGithubApps
    void deleteRelease(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("release_id") final int releaseId);

    @DELETE
    @Path("/repos/{owner}/{repo}/releases/assets/{asset_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#delete-a-release-asset")
    @EnabledForGithubApps
    void deleteReleaseAsset(final DeleteReleaseAsset deleteReleaseAsset);

    @DELETE
    @Path("/repos/{owner}/{repo}/releases/assets/{asset_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#delete-a-release-asset")
    @EnabledForGithubApps
    void deleteReleaseAsset(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("asset_id") final int assetId);

    @DELETE
    @Path("/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/repos/#delete-a-repository")
    @EnabledForGithubApps
    void deleteRepository(final DeleteRepository deleteRepository);

    @DELETE
    @Path("/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/repos/#delete-a-repository")
    @EnabledForGithubApps
    void deleteRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/repos/{owner}/{repo}/invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#delete-a-repository-invitation")
    @EnabledForGithubApps
    void deleteRepositoryInvitation(final DeleteRepositoryInvitation deleteRepositoryInvitation);

    @DELETE
    @Path("/repos/{owner}/{repo}/invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#delete-a-repository-invitation")
    @EnabledForGithubApps
    void deleteRepositoryInvitation(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("invitation_id") final int invitationId);

    @DELETE
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/repos/hooks/#delete-a-repository-webhook")
    @EnabledForGithubApps
    void deleteRepositoryWebhook(final DeleteRepositoryWebhook deleteRepositoryWebhook);

    @DELETE
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/repos/hooks/#delete-a-repository-webhook")
    @EnabledForGithubApps
    void deleteRepositoryWebhook(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("hook-id") final int hookId);

    @DELETE
    @Path("/repos/{owner}/{repo}/automated-security-fixes")
    @Docs("https://developer.github.com/v3/repos/#disable-automated-security-fixes")
    @EnabledForGithubApps
    @Preview("london")
    void disableAutomatedSecurityFixes(final DisableAutomatedSecurityFixes disableAutomatedSecurityFixes);

    @DELETE
    @Path("/repos/{owner}/{repo}/automated-security-fixes")
    @Docs("https://developer.github.com/v3/repos/#disable-automated-security-fixes")
    @EnabledForGithubApps
    @Preview("london")
    void disableAutomatedSecurityFixes(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#disable-vulnerability-alerts")
    @EnabledForGithubApps
    @Preview("dorian")
    void disableVulnerabilityAlerts(final DisableVulnerabilityAlerts disableVulnerabilityAlerts);

    @DELETE
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#disable-vulnerability-alerts")
    @EnabledForGithubApps
    @Preview("dorian")
    void disableVulnerabilityAlerts(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @PUT
    @Path("/repos/{owner}/{repo}/automated-security-fixes")
    @Docs("https://developer.github.com/v3/repos/#enable-automated-security-fixes")
    @EnabledForGithubApps
    @Preview("london")
    void enableAutomatedSecurityFixes(final EnableAutomatedSecurityFixes enableAutomatedSecurityFixes);

    @PUT
    @Path("/repos/{owner}/{repo}/automated-security-fixes")
    @Docs("https://developer.github.com/v3/repos/#enable-automated-security-fixes")
    @EnabledForGithubApps
    @Preview("london")
    void enableAutomatedSecurityFixes(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @PUT
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#enable-vulnerability-alerts")
    @EnabledForGithubApps
    @Preview("dorian")
    void enableVulnerabilityAlerts(final EnableVulnerabilityAlerts enableVulnerabilityAlerts);

    @PUT
    @Path("/repos/{owner}/{repo}/vulnerability-alerts")
    @Docs("https://developer.github.com/v3/repos/#enable-vulnerability-alerts")
    @EnabledForGithubApps
    @Preview("dorian")
    void enableVulnerabilityAlerts(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions")
    @Docs("https://developer.github.com/v3/repos/branches/#get-access-restrictions")
    @EnabledForGithubApps
    BranchRestrictionPolicy getAccessRestrictions(final GetAccessRestrictions getAccessRestrictions);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions")
    @Docs("https://developer.github.com/v3/repos/branches/#get-access-restrictions")
    @EnabledForGithubApps
    BranchRestrictionPolicy getAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#get-admin-branch-protection")
    @EnabledForGithubApps
    ProtectedBranchAdminEnforced getAdminBranchProtection(final GetAdminBranchProtection getAdminBranchProtection);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#get-admin-branch-protection")
    @EnabledForGithubApps
    ProtectedBranchAdminEnforced getAdminBranchProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/stats/contributors")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-all-contributor-commit-activity")
    @EnabledForGithubApps
    Stream<ContributorActivity> getAllContributorCommitActivity(final GetAllContributorCommitActivity getAllContributorCommitActivity);

    @GET
    @Path("/repos/{owner}/{repo}/stats/contributors")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-all-contributor-commit-activity")
    @EnabledForGithubApps
    Stream<ContributorActivity> getAllContributorCommitActivity(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/topics")
    @Docs("https://developer.github.com/v3/repos/#get-all-repository-topics")
    @EnabledForGithubApps
    @Preview("mercy")
    Topic getAllRepositoryTopics(final GetAllRepositoryTopics getAllRepositoryTopics);

    @GET
    @Path("/repos/{owner}/{repo}/topics")
    @Docs("https://developer.github.com/v3/repos/#get-all-repository-topics")
    @EnabledForGithubApps
    @Preview("mercy")
    Topic getAllRepositoryTopics(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#get-all-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> getAllStatusCheckContexts(final GetAllStatusCheckContexts getAllStatusCheckContexts);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#get-all-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> getAllStatusCheckContexts(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#list-apps-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<Integration> getAppsWithAccessToProtectedBranch(final GetAppsWithAccessToProtectedBranch getAppsWithAccessToProtectedBranch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#list-apps-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<Integration> getAppsWithAccessToProtectedBranch(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}")
    @Docs("https://developer.github.com/v3/repos/branches/#get-a-branch")
    @EnabledForGithubApps
    BranchWithProtection getBranch(final GetBranch getBranch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}")
    @Docs("https://developer.github.com/v3/repos/branches/#get-a-branch")
    @EnabledForGithubApps
    BranchWithProtection getBranch(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection")
    @Docs("https://developer.github.com/v3/repos/branches/#get-branch-protection")
    @EnabledForGithubApps
    @Preview("luke-cage")
    BranchProtection getBranchProtection(final GetBranchProtection getBranchProtection);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection")
    @Docs("https://developer.github.com/v3/repos/branches/#get-branch-protection")
    @EnabledForGithubApps
    @Preview("luke-cage")
    BranchProtection getBranchProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/status")
    @Docs("https://developer.github.com/v3/repos/statuses/#get-the-combined-status-for-a-specific-reference")
    @EnabledForGithubApps
    CombinedCommitStatus getCombinedStatusForSpecificReference(final GetCombinedStatusForSpecificReference getCombinedStatusForSpecificReference);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/status")
    @Docs("https://developer.github.com/v3/repos/statuses/#get-the-combined-status-for-a-specific-reference")
    @EnabledForGithubApps
    CombinedCommitStatus getCombinedStatusForSpecificReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}")
    @Docs("https://developer.github.com/v3/repos/commits/#get-a-commit")
    @EnabledForGithubApps
    Commit getCommit(final GetCommit getCommit);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}")
    @Docs("https://developer.github.com/v3/repos/commits/#get-a-commit")
    @EnabledForGithubApps
    Commit getCommit(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/repos/comments/#get-a-commit-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    CommitComment getCommitComment(final GetCommitComment getCommitComment);

    @GET
    @Path("/repos/{owner}/{repo}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/repos/comments/#get-a-commit-comment")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    CommitComment getCommitComment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("comment_id") final int commentId);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#get-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    ProtectedBranchAdminEnforced getCommitSignatureProtection(final GetCommitSignatureProtection getCommitSignatureProtection);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_signatures")
    @Docs("https://developer.github.com/v3/repos/branches/#get-commit-signature-protection")
    @EnabledForGithubApps
    @Preview("zzzax")
    ProtectedBranchAdminEnforced getCommitSignatureProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/community/profile")
    @Docs("https://developer.github.com/v3/repos/community/#get-community-profile-metrics")
    @EnabledForGithubApps
    @Preview("black-panther")
    CommunityProfile getCommunityProfileMetrics(final GetCommunityProfileMetrics getCommunityProfileMetrics);

    @GET
    @Path("/repos/{owner}/{repo}/community/profile")
    @Docs("https://developer.github.com/v3/repos/community/#get-community-profile-metrics")
    @EnabledForGithubApps
    @Preview("black-panther")
    CommunityProfile getCommunityProfileMetrics(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/keys/{key_id}")
    @Docs("https://developer.github.com/v3/repos/keys/#get-a-deploy-key")
    @EnabledForGithubApps
    DeployKey getDeployKey(final GetDeployKey getDeployKey);

    @GET
    @Path("/repos/{owner}/{repo}/keys/{key_id}")
    @Docs("https://developer.github.com/v3/repos/keys/#get-a-deploy-key")
    @EnabledForGithubApps
    DeployKey getDeployKey(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("key_id") final int keyId);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#get-a-deployment")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Preview("ant-man")
    Deployment getDeployment(final GetDeployment getDeployment);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#get-a-deployment")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Preview("ant-man")
    Deployment getDeployment(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("deployment_id") final int deploymentId);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#get-a-deployment-status")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Preview("flash")
    @Preview("ant-man")
    DeploymentStatus getDeploymentStatus(final GetDeploymentStatus getDeploymentStatus);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}/statuses/{status_id}")
    @Docs("https://developer.github.com/v3/repos/deployments/#get-a-deployment-status")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Preview("flash")
    @Preview("ant-man")
    DeploymentStatus getDeploymentStatus(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("deployment_id") final int deploymentId, @PathParam("status_id") final int statusId);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds/{build_id}")
    @Docs("https://developer.github.com/v3/repos/pages/#get-github-pages-build")
    @EnabledForGithubApps
    PageBuild getGitHubPagesBuild(final GetGitHubPagesBuild getGitHubPagesBuild);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds/{build_id}")
    @Docs("https://developer.github.com/v3/repos/pages/#get-github-pages-build")
    @EnabledForGithubApps
    PageBuild getGitHubPagesBuild(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("build_id") final int buildId);

    @GET
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#get-a-github-pages-site")
    @EnabledForGithubApps
    Page getGitHubPagesSite(final GetGitHubPagesSite getGitHubPagesSite);

    @GET
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#get-a-github-pages-site")
    @EnabledForGithubApps
    Page getGitHubPagesSite(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/stats/punch_card")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-hourly-commit-count-for-each-day")
    @EnabledForGithubApps
    int[][] getHourlyCommitCountForEachDay(final GetHourlyCommitCountForEachDay getHourlyCommitCountForEachDay);

    @GET
    @Path("/repos/{owner}/{repo}/stats/punch_card")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-hourly-commit-count-for-each-day")
    @EnabledForGithubApps
    int[][] getHourlyCommitCountForEachDay(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/stats/commit_activity")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-last-year-of-commit-activity")
    @EnabledForGithubApps
    Stream<CommitActivity> getLastYearOfCommitActivity(final GetLastYearOfCommitActivity getLastYearOfCommitActivity);

    @GET
    @Path("/repos/{owner}/{repo}/stats/commit_activity")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-last-year-of-commit-activity")
    @EnabledForGithubApps
    Stream<CommitActivity> getLastYearOfCommitActivity(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds/latest")
    @Docs("https://developer.github.com/v3/repos/pages/#get-latest-pages-build")
    @EnabledForGithubApps
    PageBuild getLatestPagesBuild(final GetLatestPagesBuild getLatestPagesBuild);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds/latest")
    @Docs("https://developer.github.com/v3/repos/pages/#get-latest-pages-build")
    @EnabledForGithubApps
    PageBuild getLatestPagesBuild(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/releases/latest")
    @Docs("https://developer.github.com/v3/repos/releases/#get-the-latest-release")
    @EnabledForGithubApps
    Release getLatestRelease(final GetLatestRelease getLatestRelease);

    @GET
    @Path("/repos/{owner}/{repo}/releases/latest")
    @Docs("https://developer.github.com/v3/repos/releases/#get-the-latest-release")
    @EnabledForGithubApps
    Release getLatestRelease(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/views")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-page-views")
    @EnabledForGithubApps
    ViewTraffic getPageViews(final GetPageViews getPageViews);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/views")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-page-views")
    @EnabledForGithubApps
    ViewTraffic getPageViews(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/releases/{release_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release")
    @EnabledForGithubApps
    Release getRelease(final GetRelease getRelease);

    @GET
    @Path("/repos/{owner}/{repo}/releases/{release_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release")
    @EnabledForGithubApps
    Release getRelease(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("release_id") final int releaseId);

    @GET
    @Path("/repos/{owner}/{repo}/releases/assets/{asset_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release-asset")
    @EnabledForGithubApps
    ReleaseAsset getReleaseAsset(final GetReleaseAsset getReleaseAsset);

    @GET
    @Path("/repos/{owner}/{repo}/releases/assets/{asset_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release-asset")
    @EnabledForGithubApps
    ReleaseAsset getReleaseAsset(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("asset_id") final int assetId);

    @GET
    @Path("/repos/{owner}/{repo}/releases/tags/{tag}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release-by-tag-name")
    @EnabledForGithubApps
    Release getReleaseByTagName(final GetReleaseByTagName getReleaseByTagName);

    @GET
    @Path("/repos/{owner}/{repo}/releases/tags/{tag}")
    @Docs("https://developer.github.com/v3/repos/releases/#get-a-release-by-tag-name")
    @EnabledForGithubApps
    Release getReleaseByTagName(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("tag") final String tag);

    @GET
    @Path("/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/repos/#get-a-repository")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("scarlet-witch")
    FullRepository getRepository(final GetRepository getRepository);

    @GET
    @Path("/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/repos/#get-a-repository")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("scarlet-witch")
    FullRepository getRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/clones")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-repository-clones")
    @EnabledForGithubApps
    CloneTraffic getRepositoryClones(final GetRepositoryClones getRepositoryClones);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/clones")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-repository-clones")
    @EnabledForGithubApps
    CloneTraffic getRepositoryClones(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/contents/{path}")
    @Docs("https://developer.github.com/v3/repos/contents/#get-repository-content")
    @EnabledForGithubApps
    GetRepositoryContentResponse getRepositoryContent(final GetRepositoryContent getRepositoryContent);

    @GET
    @Path("/repos/{owner}/{repo}/contents/{path}")
    @Docs("https://developer.github.com/v3/repos/contents/#get-repository-content")
    @EnabledForGithubApps
    GetRepositoryContentResponse getRepositoryContent(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("path") final String path);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators/{username}/permission")
    @Docs("https://developer.github.com/v3/repos/collaborators/#get-repository-permissions-for-a-user")
    @EnabledForGithubApps
    RepositoryCollaboratorPermission getRepositoryPermissionsForUser(final GetRepositoryPermissionsForUser getRepositoryPermissionsForUser);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators/{username}/permission")
    @Docs("https://developer.github.com/v3/repos/collaborators/#get-repository-permissions-for-a-user")
    @EnabledForGithubApps
    RepositoryCollaboratorPermission getRepositoryPermissionsForUser(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("username") final String username);

    @GET
    @Path("/repos/{owner}/{repo}/readme")
    @Docs("https://developer.github.com/v3/repos/contents/#get-a-repository-readme")
    @EnabledForGithubApps
    ContentFile getRepositoryREADME(final GetRepositoryREADME getRepositoryREADME);

    @GET
    @Path("/repos/{owner}/{repo}/readme")
    @Docs("https://developer.github.com/v3/repos/contents/#get-a-repository-readme")
    @EnabledForGithubApps
    ContentFile getRepositoryREADME(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/repos/hooks/#get-a-repository-webhook")
    @EnabledForGithubApps
    Hook getRepositoryWebhook(final GetRepositoryWebhook getRepositoryWebhook);

    @GET
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/repos/hooks/#get-a-repository-webhook")
    @EnabledForGithubApps
    Hook getRepositoryWebhook(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("hook-id") final int hookId);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks")
    @Docs("https://developer.github.com/v3/repos/branches/#get-status-checks-protection")
    @EnabledForGithubApps
    StatusCheckPolicy getStatusChecksProtection(final GetStatusChecksProtection getStatusChecksProtection);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks")
    @Docs("https://developer.github.com/v3/repos/branches/#get-status-checks-protection")
    @EnabledForGithubApps
    StatusCheckPolicy getStatusChecksProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#list-teams-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<Team> getTeamsWithAccessToProtectedBranch(final GetTeamsWithAccessToProtectedBranch getTeamsWithAccessToProtectedBranch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#list-teams-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<Team> getTeamsWithAccessToProtectedBranch(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/popular/paths")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-top-referral-paths")
    @EnabledForGithubApps
    Stream<ContentTraffic> getTopReferralPaths(final GetTopReferralPaths getTopReferralPaths);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/popular/paths")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-top-referral-paths")
    @EnabledForGithubApps
    Stream<ContentTraffic> getTopReferralPaths(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/popular/referrers")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-top-referral-sources")
    @EnabledForGithubApps
    Stream<ReferrerTraffic> getTopReferralSources(final GetTopReferralSources getTopReferralSources);

    @GET
    @Path("/repos/{owner}/{repo}/traffic/popular/referrers")
    @Docs("https://developer.github.com/v3/repos/traffic/#get-top-referral-sources")
    @EnabledForGithubApps
    Stream<ReferrerTraffic> getTopReferralSources(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#list-users-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<SimpleUser> getUsersWithAccessToProtectedBranch(final GetUsersWithAccessToProtectedBranch getUsersWithAccessToProtectedBranch);

    @GET
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#list-users-with-access-to-the-protected-branch")
    @EnabledForGithubApps
    Stream<SimpleUser> getUsersWithAccessToProtectedBranch(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @GET
    @Path("/repos/{owner}/{repo}/stats/code_frequency")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-weekly-commit-activity")
    @EnabledForGithubApps
    int[][] getWeeklyCommitActivity(final GetWeeklyCommitActivity getWeeklyCommitActivity);

    @GET
    @Path("/repos/{owner}/{repo}/stats/code_frequency")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-weekly-commit-activity")
    @EnabledForGithubApps
    int[][] getWeeklyCommitActivity(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/stats/participation")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-weekly-commit-count")
    @EnabledForGithubApps
    ParticipationStats getWeeklyCommitCount(final GetWeeklyCommitCount getWeeklyCommitCount);

    @GET
    @Path("/repos/{owner}/{repo}/stats/participation")
    @Docs("https://developer.github.com/v3/repos/statistics/#get-the-weekly-commit-count")
    @EnabledForGithubApps
    ParticipationStats getWeeklyCommitCount(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/branches")
    @Docs("https://developer.github.com/v3/repos/branches/#list-branches")
    @EnabledForGithubApps
    @Paged(ShortBranch[].class)
    Stream<ShortBranch> listBranches(final ListBranches listBranches);

    @GET
    @Path("/repos/{owner}/{repo}/branches")
    @Docs("https://developer.github.com/v3/repos/branches/#list-branches")
    @EnabledForGithubApps
    @Paged(ShortBranch[].class)
    Stream<ShortBranch> listBranches(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head")
    @Docs("https://developer.github.com/v3/repos/commits/#list-branches-for-head-commit")
    @EnabledForGithubApps
    @Preview("groot")
    Stream<BranchShort> listBranchesForHEADCommit(final ListBranchesForHEADCommit listBranchesForHEADCommit);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/branches-where-head")
    @Docs("https://developer.github.com/v3/repos/commits/#list-branches-for-head-commit")
    @EnabledForGithubApps
    @Preview("groot")
    Stream<BranchShort> listBranchesForHEADCommit(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("commit_sha") final String commitSha);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/comments")
    @Docs("https://developer.github.com/v3/repos/comments/#list-commit-comments")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(CommitComment[].class)
    Stream<CommitComment> listCommitComments(final ListCommitComments listCommitComments);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/comments")
    @Docs("https://developer.github.com/v3/repos/comments/#list-commit-comments")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(CommitComment[].class)
    Stream<CommitComment> listCommitComments(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("commit_sha") final String commitSha);

    @GET
    @Path("/repos/{owner}/{repo}/comments")
    @Docs("https://developer.github.com/v3/repos/comments/#list-commit-comments-for-a-repository")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(CommitComment[].class)
    Stream<CommitComment> listCommitCommentsForRepository(final ListCommitCommentsForRepository listCommitCommentsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/comments")
    @Docs("https://developer.github.com/v3/repos/comments/#list-commit-comments-for-a-repository")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    @Paged(CommitComment[].class)
    Stream<CommitComment> listCommitCommentsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/statuses")
    @Docs("https://developer.github.com/v3/repos/statuses/#list-commit-statuses-for-a-reference")
    @EnabledForGithubApps
    @Paged(Status[].class)
    Stream<Status> listCommitStatusesForReference(final ListCommitStatusesForReference listCommitStatusesForReference);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/statuses")
    @Docs("https://developer.github.com/v3/repos/statuses/#list-commit-statuses-for-a-reference")
    @EnabledForGithubApps
    @Paged(Status[].class)
    Stream<Status> listCommitStatusesForReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/commits")
    @Docs("https://developer.github.com/v3/repos/commits/#list-commits")
    @EnabledForGithubApps
    @Paged(SimpleCommit[].class)
    Stream<SimpleCommit> listCommits(final ListCommits listCommits);

    @GET
    @Path("/repos/{owner}/{repo}/commits")
    @Docs("https://developer.github.com/v3/repos/commits/#list-commits")
    @EnabledForGithubApps
    @Paged(SimpleCommit[].class)
    Stream<SimpleCommit> listCommits(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/keys")
    @Docs("https://developer.github.com/v3/repos/keys/#list-deploy-keys")
    @EnabledForGithubApps
    @Paged(DeployKey[].class)
    Stream<DeployKey> listDeployKeys(final ListDeployKeys listDeployKeys);

    @GET
    @Path("/repos/{owner}/{repo}/keys")
    @Docs("https://developer.github.com/v3/repos/keys/#list-deploy-keys")
    @EnabledForGithubApps
    @Paged(DeployKey[].class)
    Stream<DeployKey> listDeployKeys(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}/statuses")
    @Docs("https://developer.github.com/v3/repos/deployments/#list-deployment-statuses")
    @EnabledForGithubApps
    @Preview("flash")
    @Preview("ant-man")
    @Paged(DeploymentStatus[].class)
    Stream<DeploymentStatus> listDeploymentStatuses(final ListDeploymentStatuses listDeploymentStatuses);

    @GET
    @Path("/repos/{owner}/{repo}/deployments/{deployment_id}/statuses")
    @Docs("https://developer.github.com/v3/repos/deployments/#list-deployment-statuses")
    @EnabledForGithubApps
    @Preview("flash")
    @Preview("ant-man")
    @Paged(DeploymentStatus[].class)
    Stream<DeploymentStatus> listDeploymentStatuses(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("deployment_id") final int deploymentId);

    @GET
    @Path("/repos/{owner}/{repo}/deployments")
    @Docs("https://developer.github.com/v3/repos/deployments/#list-deployments")
    @EnabledForGithubApps
    @Preview("ant-man")
    @Paged(Deployment[].class)
    Stream<Deployment> listDeployments(final ListDeployments listDeployments);

    @GET
    @Path("/repos/{owner}/{repo}/deployments")
    @Docs("https://developer.github.com/v3/repos/deployments/#list-deployments")
    @EnabledForGithubApps
    @Preview("ant-man")
    @Paged(Deployment[].class)
    Stream<Deployment> listDeployments(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/forks")
    @Docs("https://developer.github.com/v3/repos/forks/#list-forks")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listForks(final ListForks listForks);

    @GET
    @Path("/repos/{owner}/{repo}/forks")
    @Docs("https://developer.github.com/v3/repos/forks/#list-forks")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listForks(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds")
    @Docs("https://developer.github.com/v3/repos/pages/#list-github-pages-builds")
    @EnabledForGithubApps
    @Paged(PageBuild[].class)
    Stream<PageBuild> listGitHubPagesBuilds(final ListGitHubPagesBuilds listGitHubPagesBuilds);

    @GET
    @Path("/repos/{owner}/{repo}/pages/builds")
    @Docs("https://developer.github.com/v3/repos/pages/#list-github-pages-builds")
    @EnabledForGithubApps
    @Paged(PageBuild[].class)
    Stream<PageBuild> listGitHubPagesBuilds(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/orgs/{org}/repos")
    @Docs("https://developer.github.com/v3/repos/#list-organization-repositories")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("baptiste")
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listOrganizationRepositories(final ListOrganizationRepositories listOrganizationRepositories);

    @GET
    @Path("/orgs/{org}/repos")
    @Docs("https://developer.github.com/v3/repos/#list-organization-repositories")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("baptiste")
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listOrganizationRepositories(@PathParam("org") final String org);

    @GET
    @Path("/repositories")
    @Docs("https://developer.github.com/v3/repos/#list-public-repositories")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listPublicRepositories(final ListPublicRepositories listPublicRepositories);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/pulls")
    @Docs("https://developer.github.com/v3/repos/commits/#list-pull-requests-associated-with-a-commit")
    @EnabledForGithubApps
    @Preview("groot")
    @Paged(PullRequestSimple[].class)
    Stream<PullRequestSimple> listPullRequestsAssociatedWithCommit(final ListPullRequestsAssociatedWithCommit listPullRequestsAssociatedWithCommit);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{commit_sha}/pulls")
    @Docs("https://developer.github.com/v3/repos/commits/#list-pull-requests-associated-with-a-commit")
    @EnabledForGithubApps
    @Preview("groot")
    @Paged(PullRequestSimple[].class)
    Stream<PullRequestSimple> listPullRequestsAssociatedWithCommit(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("commit_sha") final String commitSha);

    @GET
    @Path("/repos/{owner}/{repo}/releases/{release_id}/assets")
    @Docs("https://developer.github.com/v3/repos/releases/#list-release-assets")
    @EnabledForGithubApps
    @Paged(ReleaseAsset[].class)
    Stream<ReleaseAsset> listReleaseAssets(final ListReleaseAssets listReleaseAssets);

    @GET
    @Path("/repos/{owner}/{repo}/releases/{release_id}/assets")
    @Docs("https://developer.github.com/v3/repos/releases/#list-release-assets")
    @EnabledForGithubApps
    @Paged(ReleaseAsset[].class)
    Stream<ReleaseAsset> listReleaseAssets(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("release_id") final int releaseId);

    @GET
    @Path("/repos/{owner}/{repo}/releases")
    @Docs("https://developer.github.com/v3/repos/releases/#list-releases")
    @EnabledForGithubApps
    @Paged(Release[].class)
    Stream<Release> listReleases(final ListReleases listReleases);

    @GET
    @Path("/repos/{owner}/{repo}/releases")
    @Docs("https://developer.github.com/v3/repos/releases/#list-releases")
    @EnabledForGithubApps
    @Paged(Release[].class)
    Stream<Release> listReleases(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/user/repos")
    @Docs("https://developer.github.com/v3/repos/#list-repositories-for-the-authenticated-user")
    Stream<Repository> listRepositoriesForAuthenticatedUser(final ListRepositoriesForAuthenticatedUser listRepositoriesForAuthenticatedUser);

    @GET
    @Path("/users/{username}/repos")
    @Docs("https://developer.github.com/v3/repos/#list-repositories-for-a-user")
    @EnabledForGithubApps
    @Preview("nebula")
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listRepositoriesForUser(final ListRepositoriesForUser listRepositoriesForUser);

    @GET
    @Path("/users/{username}/repos")
    @Docs("https://developer.github.com/v3/repos/#list-repositories-for-a-user")
    @EnabledForGithubApps
    @Preview("nebula")
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listRepositoriesForUser(@PathParam("username") final String username);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators")
    @Docs("https://developer.github.com/v3/repos/collaborators/#list-repository-collaborators")
    @EnabledForGithubApps
    @Paged(Collaborator[].class)
    Stream<Collaborator> listRepositoryCollaborators(final ListRepositoryCollaborators listRepositoryCollaborators);

    @GET
    @Path("/repos/{owner}/{repo}/collaborators")
    @Docs("https://developer.github.com/v3/repos/collaborators/#list-repository-collaborators")
    @EnabledForGithubApps
    @Paged(Collaborator[].class)
    Stream<Collaborator> listRepositoryCollaborators(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/contributors")
    @Docs("https://developer.github.com/v3/repos/#list-repository-contributors")
    @EnabledForGithubApps
    @Paged(Contributor[].class)
    Stream<Contributor> listRepositoryContributors(final ListRepositoryContributors listRepositoryContributors);

    @GET
    @Path("/repos/{owner}/{repo}/contributors")
    @Docs("https://developer.github.com/v3/repos/#list-repository-contributors")
    @EnabledForGithubApps
    @Paged(Contributor[].class)
    Stream<Contributor> listRepositoryContributors(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/invitations")
    @Docs("https://developer.github.com/v3/repos/invitations/#list-repository-invitations")
    @EnabledForGithubApps
    @Paged(RepositoryInvitation[].class)
    Stream<RepositoryInvitation> listRepositoryInvitations(final ListRepositoryInvitations listRepositoryInvitations);

    @GET
    @Path("/repos/{owner}/{repo}/invitations")
    @Docs("https://developer.github.com/v3/repos/invitations/#list-repository-invitations")
    @EnabledForGithubApps
    @Paged(RepositoryInvitation[].class)
    Stream<RepositoryInvitation> listRepositoryInvitations(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/user/repository_invitations")
    @Docs("https://developer.github.com/v3/repos/invitations/#list-repository-invitations-for-the-authenticated-user")
    @Paged(RepositoryInvitation[].class)
    Stream<RepositoryInvitation> listRepositoryInvitationsForAuthenticatedUser();

    @GET
    @Path("/repos/{owner}/{repo}/languages")
    @Docs("https://developer.github.com/v3/repos/#list-repository-languages")
    @EnabledForGithubApps
    Language listRepositoryLanguages(final ListRepositoryLanguages listRepositoryLanguages);

    @GET
    @Path("/repos/{owner}/{repo}/languages")
    @Docs("https://developer.github.com/v3/repos/#list-repository-languages")
    @EnabledForGithubApps
    Language listRepositoryLanguages(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/tags")
    @Docs("https://developer.github.com/v3/repos/#list-repository-tags")
    @EnabledForGithubApps
    @Paged(Tag[].class)
    Stream<Tag> listRepositoryTags(final ListRepositoryTags listRepositoryTags);

    @GET
    @Path("/repos/{owner}/{repo}/tags")
    @Docs("https://developer.github.com/v3/repos/#list-repository-tags")
    @EnabledForGithubApps
    @Paged(Tag[].class)
    Stream<Tag> listRepositoryTags(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/teams")
    @Docs("https://developer.github.com/v3/repos/#list-repository-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listRepositoryTeams(final ListRepositoryTeams listRepositoryTeams);

    @GET
    @Path("/repos/{owner}/{repo}/teams")
    @Docs("https://developer.github.com/v3/repos/#list-repository-teams")
    @EnabledForGithubApps
    @Paged(Team[].class)
    Stream<Team> listRepositoryTeams(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/hooks")
    @Docs("https://developer.github.com/v3/repos/hooks/#list-repository-webhooks")
    @EnabledForGithubApps
    @Paged(Hook[].class)
    Stream<Hook> listRepositoryWebhooks(final ListRepositoryWebhooks listRepositoryWebhooks);

    @GET
    @Path("/repos/{owner}/{repo}/hooks")
    @Docs("https://developer.github.com/v3/repos/hooks/#list-repository-webhooks")
    @EnabledForGithubApps
    @Paged(Hook[].class)
    Stream<Hook> listRepositoryWebhooks(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @POST
    @Path("/repos/{owner}/{repo}/merges")
    @Docs("https://developer.github.com/v3/repos/merging/#merge-a-branch")
    @EnabledForGithubApps
    Commit mergeBranch(final MergeBranch mergeBranch);

    @POST
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}/pings")
    @Docs("https://developer.github.com/v3/repos/hooks/#ping-a-repository-webhook")
    @EnabledForGithubApps
    void pingRepositoryWebhook(final PingRepositoryWebhook pingRepositoryWebhook);

    @POST
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}/pings")
    @Docs("https://developer.github.com/v3/repos/hooks/#ping-a-repository-webhook")
    @EnabledForGithubApps
    void pingRepositoryWebhook(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("hook-id") final int hookId);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> removeAppAccessRestrictions(final RemoveAppAccessRestrictions removeAppAccessRestrictions);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> removeAppAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/collaborators/{username}")
    @Docs("https://developer.github.com/v3/repos/collaborators/#remove-a-repository-collaborator")
    @EnabledForGithubApps
    void removeRepositoryCollaborator(final RemoveRepositoryCollaborator removeRepositoryCollaborator);

    @DELETE
    @Path("/repos/{owner}/{repo}/collaborators/{username}")
    @Docs("https://developer.github.com/v3/repos/collaborators/#remove-a-repository-collaborator")
    @EnabledForGithubApps
    void removeRepositoryCollaborator(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("username") final String username);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> removeStatusCheckContexts(final RemoveStatusCheckContexts removeStatusCheckContexts);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> removeStatusCheckContexts(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-status-check-protection")
    @EnabledForGithubApps
    void removeStatusCheckProtection(final RemoveStatusCheckProtection removeStatusCheckProtection);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-status-check-protection")
    @EnabledForGithubApps
    void removeStatusCheckProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> removeTeamAccessRestrictions(final RemoveTeamAccessRestrictions removeTeamAccessRestrictions);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> removeTeamAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> removeUserAccessRestrictions(final RemoveUserAccessRestrictions removeUserAccessRestrictions);

    @DELETE
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#remove-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> removeUserAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/topics")
    @Docs("https://developer.github.com/v3/repos/#replace-all-repository-topics")
    @EnabledForGithubApps
    @Preview("mercy")
    Topic replaceAllRepositoryTopics(final ReplaceAllRepositoryTopics replaceAllRepositoryTopics);

    @POST
    @Path("/repos/{owner}/{repo}/pages/builds")
    @Docs("https://developer.github.com/v3/repos/pages/#request-a-github-pages-build")
    @EnabledForGithubApps
    PageBuildStatus requestGitHubPagesBuild(final RequestGitHubPagesBuild requestGitHubPagesBuild);

    @POST
    @Path("/repos/{owner}/{repo}/pages/builds")
    @Docs("https://developer.github.com/v3/repos/pages/#request-a-github-pages-build")
    @EnabledForGithubApps
    PageBuildStatus requestGitHubPagesBuild(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#set-admin-branch-protection")
    @EnabledForGithubApps
    ProtectedBranchAdminEnforced setAdminBranchProtection(final SetAdminBranchProtection setAdminBranchProtection);

    @POST
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/enforce_admins")
    @Docs("https://developer.github.com/v3/repos/branches/#set-admin-branch-protection")
    @EnabledForGithubApps
    ProtectedBranchAdminEnforced setAdminBranchProtection(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#set-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> setAppAccessRestrictions(final SetAppAccessRestrictions setAppAccessRestrictions);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/apps")
    @Docs("https://developer.github.com/v3/repos/branches/#set-app-access-restrictions")
    @EnabledForGithubApps
    Stream<Integration> setAppAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#set-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> setStatusCheckContexts(final SetStatusCheckContexts setStatusCheckContexts);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks/contexts")
    @Docs("https://developer.github.com/v3/repos/branches/#set-status-check-contexts")
    @EnabledForGithubApps
    Stream<String> setStatusCheckContexts(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#set-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> setTeamAccessRestrictions(final SetTeamAccessRestrictions setTeamAccessRestrictions);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/teams")
    @Docs("https://developer.github.com/v3/repos/branches/#set-team-access-restrictions")
    @EnabledForGithubApps
    Stream<Team> setTeamAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#set-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> setUserAccessRestrictions(final SetUserAccessRestrictions setUserAccessRestrictions);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/restrictions/users")
    @Docs("https://developer.github.com/v3/repos/branches/#set-user-access-restrictions")
    @EnabledForGithubApps
    Stream<SimpleUser> setUserAccessRestrictions(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("branch") final String branch);

    @POST
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}/tests")
    @Docs("https://developer.github.com/v3/repos/hooks/#test-the-push-repository-webhook")
    @EnabledForGithubApps
    void testPushRepositoryWebhook(final TestPushRepositoryWebhook testPushRepositoryWebhook);

    @POST
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}/tests")
    @Docs("https://developer.github.com/v3/repos/hooks/#test-the-push-repository-webhook")
    @EnabledForGithubApps
    void testPushRepositoryWebhook(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("hook-id") final int hookId);

    @POST
    @Path("/repos/{owner}/{repo}/transfer")
    @Docs("https://developer.github.com/v3/repos/#transfer-a-repository")
    @EnabledForGithubApps
    Repository transferRepository(final TransferRepository transferRepository);

    @PUT
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection")
    @Docs("https://developer.github.com/v3/repos/branches/#update-branch-protection")
    @EnabledForGithubApps
    @Preview("luke-cage")
    ProtectedBranch updateBranchProtection(final UpdateBranchProtection updateBranchProtection);

    @PATCH
    @Path("/repos/{owner}/{repo}/comments/{comment_id}")
    @Docs("https://developer.github.com/v3/repos/comments/#update-a-commit-comment")
    @EnabledForGithubApps
    CommitComment updateCommitComment(final UpdateCommitComment updateCommitComment);

    @PUT
    @Path("/repos/{owner}/{repo}/pages")
    @Docs("https://developer.github.com/v3/repos/pages/#update-information-about-a-github-pages-site")
    @EnabledForGithubApps
    void updateInformationAboutGitHubPagesSite(final UpdateInformationAboutGitHubPagesSite updateInformationAboutGitHubPagesSite);

    @PATCH
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_pull_request_reviews")
    @Docs("https://developer.github.com/v3/repos/branches/#update-pull-request-review-protection")
    @EnabledForGithubApps
    @Preview("luke-cage")
    ProtectedBranchPullRequestReview updatePullRequestReviewProtection(final UpdatePullRequestReviewProtection updatePullRequestReviewProtection);

    @PATCH
    @Path("/repos/{owner}/{repo}/releases/{release_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#update-a-release")
    @EnabledForGithubApps
    Release updateRelease(final UpdateRelease updateRelease);

    @PATCH
    @Path("/repos/{owner}/{repo}/releases/assets/{asset_id}")
    @Docs("https://developer.github.com/v3/repos/releases/#update-a-release-asset")
    @EnabledForGithubApps
    ReleaseAsset updateReleaseAsset(final UpdateReleaseAsset updateReleaseAsset);

    @PATCH
    @Path("/repos/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/repos/#update-a-repository")
    @EnabledForGithubApps
    @Preview("nebula")
    @Preview("baptiste")
    FullRepository updateRepository(final UpdateRepository updateRepository);

    @PATCH
    @Path("/repos/{owner}/{repo}/invitations/{invitation_id}")
    @Docs("https://developer.github.com/v3/repos/invitations/#update-a-repository-invitation")
    @EnabledForGithubApps
    RepositoryInvitation updateRepositoryInvitation(final UpdateRepositoryInvitation updateRepositoryInvitation);

    @PATCH
    @Path("/repos/{owner}/{repo}/hooks/{hook_id}")
    @Docs("https://developer.github.com/v3/repos/hooks/#update-a-repository-webhook")
    @EnabledForGithubApps
    Hook updateRepositoryWebhook(final UpdateRepositoryWebhook updateRepositoryWebhook);

    @PATCH
    @Path("/repos/{owner}/{repo}/branches/{branch}/protection/required_status_checks")
    @Docs("https://developer.github.com/v3/repos/branches/#update-status-check-potection")
    @EnabledForGithubApps
    StatusCheckPolicy updateStatusCheckProtection(final UpdateStatusCheckProtection updateStatusCheckProtection);
}
