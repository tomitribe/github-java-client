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
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.model.ActionsPublicKey;
import org.tomitribe.github.model.ActionsSecret;
import org.tomitribe.github.model.ActionsSecretsPage;
import org.tomitribe.github.model.AddSelectedRepositoryToOrganizationSecret;
import org.tomitribe.github.model.Artifact;
import org.tomitribe.github.model.ArtifactsPage;
import org.tomitribe.github.model.AuthenticationToken;
import org.tomitribe.github.model.CreateOrUpdateOrganizationSecret;
import org.tomitribe.github.model.CreateOrUpdateRepositorySecret;
import org.tomitribe.github.model.CreateRegistrationTokenForOrganization;
import org.tomitribe.github.model.CreateRegistrationTokenForRepository;
import org.tomitribe.github.model.CreateRemoveTokenForOrganization;
import org.tomitribe.github.model.CreateRemoveTokenForRepository;
import org.tomitribe.github.model.CreateWorkflowDispatchEvent;
import org.tomitribe.github.model.DeleteArtifact;
import org.tomitribe.github.model.DeleteOrganizationSecret;
import org.tomitribe.github.model.DeleteRepositorySecret;
import org.tomitribe.github.model.DeleteSelfHostedRunnerFromOrganization;
import org.tomitribe.github.model.DeleteSelfHostedRunnerFromRepository;
import org.tomitribe.github.model.DeleteWorkflowRun;
import org.tomitribe.github.model.DeleteWorkflowRunLogs;
import org.tomitribe.github.model.GetArtifact;
import org.tomitribe.github.model.GetJobForWorkflowRun;
import org.tomitribe.github.model.GetOrganizationPublicKey;
import org.tomitribe.github.model.GetOrganizationSecret;
import org.tomitribe.github.model.GetRepositoryPublicKey;
import org.tomitribe.github.model.GetRepositorySecret;
import org.tomitribe.github.model.GetSelfHostedRunnerForOrganization;
import org.tomitribe.github.model.GetSelfHostedRunnerForRepository;
import org.tomitribe.github.model.GetWorkflow;
import org.tomitribe.github.model.GetWorkflowRun;
import org.tomitribe.github.model.GetWorkflowRunUsage;
import org.tomitribe.github.model.GetWorkflowUsage;
import org.tomitribe.github.model.Job;
import org.tomitribe.github.model.JobsPage;
import org.tomitribe.github.model.ListArtifactsForRepository;
import org.tomitribe.github.model.ListJobsForWorkflowRun;
import org.tomitribe.github.model.ListOrganizationSecrets;
import org.tomitribe.github.model.ListRepositorySecrets;
import org.tomitribe.github.model.ListRepositoryWorkflows;
import org.tomitribe.github.model.ListRunnerApplicationsForOrganization;
import org.tomitribe.github.model.ListRunnerApplicationsForRepository;
import org.tomitribe.github.model.ListSelectedRepositoriesForOrganizationSecret;
import org.tomitribe.github.model.ListSelectedRepositoriesForOrganizationSecretResponse;
import org.tomitribe.github.model.ListSelfHostedRunnersForOrganization;
import org.tomitribe.github.model.ListSelfHostedRunnersForRepository;
import org.tomitribe.github.model.ListWorkflowRunArtifacts;
import org.tomitribe.github.model.ListWorkflowRuns;
import org.tomitribe.github.model.ListWorkflowRunsForRepository;
import org.tomitribe.github.model.OrganizationActionsSecret;
import org.tomitribe.github.model.OrganizationActionsSecretsPage;
import org.tomitribe.github.model.RemoveSelectedRepositoryFromOrganizationSecret;
import org.tomitribe.github.model.Runner;
import org.tomitribe.github.model.RunnerApplication;
import org.tomitribe.github.model.RunnersPage;
import org.tomitribe.github.model.SetSelectedRepositoriesForOrganizationSecret;
import org.tomitribe.github.model.Workflow;
import org.tomitribe.github.model.WorkflowRun;
import org.tomitribe.github.model.WorkflowRunUsage;
import org.tomitribe.github.model.WorkflowRunsPage;
import org.tomitribe.github.model.WorkflowUsage;
import org.tomitribe.github.model.WorkflowsPage;

public interface ActionsClient {

    @PUT
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/actions/secrets/#add-selected-repository-to-an-organization-secret")
    @EnabledForGithubApps
    void addSelectedRepositoryToOrganizationSecret(final AddSelectedRepositoryToOrganizationSecret addSelectedRepositoryToOrganizationSecret);

    @PUT
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/actions/secrets/#add-selected-repository-to-an-organization-secret")
    @EnabledForGithubApps
    void addSelectedRepositoryToOrganizationSecret(@PathParam("org") final String org, @PathParam("secret_name") final String secretName, @PathParam("repository_id") final int repositoryId);

    @PUT
    @Path("/orgs/{org}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret")
    @EnabledForGithubApps
    void createOrUpdateOrganizationSecret(final CreateOrUpdateOrganizationSecret createOrUpdateOrganizationSecret);

    @PUT
    @Path("/repos/{owner}/{repo}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#create-or-update-a-repository-secret")
    @EnabledForGithubApps
    void createOrUpdateRepositorySecret(final CreateOrUpdateRepositorySecret createOrUpdateRepositorySecret);

    @POST
    @Path("/orgs/{org}/actions/runners/registration-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-registration-token-for-an-organization")
    @EnabledForGithubApps
    AuthenticationToken createRegistrationTokenForOrganization(final CreateRegistrationTokenForOrganization createRegistrationTokenForOrganization);

    @POST
    @Path("/orgs/{org}/actions/runners/registration-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-registration-token-for-an-organization")
    @EnabledForGithubApps
    AuthenticationToken createRegistrationTokenForOrganization(@PathParam("org") final String org);

    @POST
    @Path("/repos/{owner}/{repo}/actions/runners/registration-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-registration-token-for-a-repository")
    @EnabledForGithubApps
    AuthenticationToken createRegistrationTokenForRepository(final CreateRegistrationTokenForRepository createRegistrationTokenForRepository);

    @POST
    @Path("/repos/{owner}/{repo}/actions/runners/registration-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-registration-token-for-a-repository")
    @EnabledForGithubApps
    AuthenticationToken createRegistrationTokenForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @POST
    @Path("/orgs/{org}/actions/runners/remove-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-remove-token-for-an-organization")
    @EnabledForGithubApps
    AuthenticationToken createRemoveTokenForOrganization(final CreateRemoveTokenForOrganization createRemoveTokenForOrganization);

    @POST
    @Path("/orgs/{org}/actions/runners/remove-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-remove-token-for-an-organization")
    @EnabledForGithubApps
    AuthenticationToken createRemoveTokenForOrganization(@PathParam("org") final String org);

    @POST
    @Path("/repos/{owner}/{repo}/actions/runners/remove-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-remove-token-for-a-repository")
    @EnabledForGithubApps
    AuthenticationToken createRemoveTokenForRepository(final CreateRemoveTokenForRepository createRemoveTokenForRepository);

    @POST
    @Path("/repos/{owner}/{repo}/actions/runners/remove-token")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#create-a-remove-token-for-a-repository")
    @EnabledForGithubApps
    AuthenticationToken createRemoveTokenForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @POST
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches")
    @Docs("https://developer.github.com/v3/actions/workflows/#create-a-workflow-dispatch-event")
    @EnabledForGithubApps
    void createWorkflowDispatchEvent(final CreateWorkflowDispatchEvent createWorkflowDispatchEvent);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/artifacts/{artifact_id}")
    @Docs("https://developer.github.com/v3/actions/artifacts/#delete-an-artifact")
    @EnabledForGithubApps
    void deleteArtifact(final DeleteArtifact deleteArtifact);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/artifacts/{artifact_id}")
    @Docs("https://developer.github.com/v3/actions/artifacts/#delete-an-artifact")
    @EnabledForGithubApps
    void deleteArtifact(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("artifact_id") final int artifactId);

    @DELETE
    @Path("/orgs/{org}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#delete-an-organization-secret")
    @EnabledForGithubApps
    void deleteOrganizationSecret(final DeleteOrganizationSecret deleteOrganizationSecret);

    @DELETE
    @Path("/orgs/{org}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#delete-an-organization-secret")
    @EnabledForGithubApps
    void deleteOrganizationSecret(@PathParam("org") final String org, @PathParam("secret_name") final String secretName);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#delete-a-repository-secret")
    @EnabledForGithubApps
    void deleteRepositorySecret(final DeleteRepositorySecret deleteRepositorySecret);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#delete-a-repository-secret")
    @EnabledForGithubApps
    void deleteRepositorySecret(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("secret_name") final String secretName);

    @DELETE
    @Path("/orgs/{org}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#delete-a-self-hosted-runner-from-an-organization")
    @EnabledForGithubApps
    void deleteSelfHostedRunnerFromOrganization(final DeleteSelfHostedRunnerFromOrganization deleteSelfHostedRunnerFromOrganization);

    @DELETE
    @Path("/orgs/{org}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#delete-a-self-hosted-runner-from-an-organization")
    @EnabledForGithubApps
    void deleteSelfHostedRunnerFromOrganization(@PathParam("org") final String org, @PathParam("runner_id") final int runnerId);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#delete-a-self-hosted-runner-from-a-repository")
    @EnabledForGithubApps
    void deleteSelfHostedRunnerFromRepository(final DeleteSelfHostedRunnerFromRepository deleteSelfHostedRunnerFromRepository);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#delete-a-self-hosted-runner-from-a-repository")
    @EnabledForGithubApps
    void deleteSelfHostedRunnerFromRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("runner_id") final int runnerId);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#delete-a-workflow-run")
    @EnabledForGithubApps
    void deleteWorkflowRun(final DeleteWorkflowRun deleteWorkflowRun);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#delete-a-workflow-run")
    @EnabledForGithubApps
    void deleteWorkflowRun(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/logs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#delete-workflow-run-logs")
    @EnabledForGithubApps
    void deleteWorkflowRunLogs(final DeleteWorkflowRunLogs deleteWorkflowRunLogs);

    @DELETE
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/logs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#delete-workflow-run-logs")
    @EnabledForGithubApps
    void deleteWorkflowRunLogs(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/artifacts/{artifact_id}")
    @Docs("https://developer.github.com/v3/actions/artifacts/#get-an-artifact")
    @EnabledForGithubApps
    Artifact getArtifact(final GetArtifact getArtifact);

    @GET
    @Path("/repos/{owner}/{repo}/actions/artifacts/{artifact_id}")
    @Docs("https://developer.github.com/v3/actions/artifacts/#get-an-artifact")
    @EnabledForGithubApps
    Artifact getArtifact(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("artifact_id") final int artifactId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/jobs/{job_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-jobs/#get-a-job-for-a-workflow-run")
    @EnabledForGithubApps
    Job getJobForWorkflowRun(final GetJobForWorkflowRun getJobForWorkflowRun);

    @GET
    @Path("/repos/{owner}/{repo}/actions/jobs/{job_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-jobs/#get-a-job-for-a-workflow-run")
    @EnabledForGithubApps
    Job getJobForWorkflowRun(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("job_id") final int jobId);

    @GET
    @Path("/orgs/{org}/actions/secrets/public-key")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-an-organization-public-key")
    @EnabledForGithubApps
    ActionsPublicKey getOrganizationPublicKey(final GetOrganizationPublicKey getOrganizationPublicKey);

    @GET
    @Path("/orgs/{org}/actions/secrets/public-key")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-an-organization-public-key")
    @EnabledForGithubApps
    ActionsPublicKey getOrganizationPublicKey(@PathParam("org") final String org);

    @GET
    @Path("/orgs/{org}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-an-organization-secret")
    @EnabledForGithubApps
    OrganizationActionsSecret getOrganizationSecret(final GetOrganizationSecret getOrganizationSecret);

    @GET
    @Path("/orgs/{org}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-an-organization-secret")
    @EnabledForGithubApps
    OrganizationActionsSecret getOrganizationSecret(@PathParam("org") final String org, @PathParam("secret_name") final String secretName);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets/public-key")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-a-repository-public-key")
    @EnabledForGithubApps
    ActionsPublicKey getRepositoryPublicKey(final GetRepositoryPublicKey getRepositoryPublicKey);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets/public-key")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-a-repository-public-key")
    @EnabledForGithubApps
    ActionsPublicKey getRepositoryPublicKey(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-a-repository-secret")
    @EnabledForGithubApps
    ActionsSecret getRepositorySecret(final GetRepositorySecret getRepositorySecret);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets/{secret_name}")
    @Docs("https://developer.github.com/v3/actions/secrets/#get-a-repository-secret")
    @EnabledForGithubApps
    ActionsSecret getRepositorySecret(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("secret_name") final String secretName);

    @GET
    @Path("/orgs/{org}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#get-a-self-hosted-runner-for-an-organization")
    @EnabledForGithubApps
    Runner getSelfHostedRunnerForOrganization(final GetSelfHostedRunnerForOrganization getSelfHostedRunnerForOrganization);

    @GET
    @Path("/orgs/{org}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#get-a-self-hosted-runner-for-an-organization")
    @EnabledForGithubApps
    Runner getSelfHostedRunnerForOrganization(@PathParam("org") final String org, @PathParam("runner_id") final int runnerId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#get-a-self-hosted-runner-for-a-repository")
    @EnabledForGithubApps
    Runner getSelfHostedRunnerForRepository(final GetSelfHostedRunnerForRepository getSelfHostedRunnerForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners/{runner_id}")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#get-a-self-hosted-runner-for-a-repository")
    @EnabledForGithubApps
    Runner getSelfHostedRunnerForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("runner_id") final int runnerId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}")
    @Docs("https://developer.github.com/v3/actions/workflows/#get-a-workflow")
    @EnabledForGithubApps
    Workflow getWorkflow(final GetWorkflow getWorkflow);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}")
    @Docs("https://developer.github.com/v3/actions/workflows/#get-a-workflow")
    @EnabledForGithubApps
    Workflow getWorkflow(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("workflow-id") final int workflowId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#get-a-workflow-run")
    @EnabledForGithubApps
    WorkflowRun getWorkflowRun(final GetWorkflowRun getWorkflowRun);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#get-a-workflow-run")
    @EnabledForGithubApps
    WorkflowRun getWorkflowRun(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/timing")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#get-workflow-run-usage")
    WorkflowRunUsage getWorkflowRunUsage(final GetWorkflowRunUsage getWorkflowRunUsage);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/timing")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#get-workflow-run-usage")
    WorkflowRunUsage getWorkflowRunUsage(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing")
    @Docs("https://developer.github.com/v3/actions/workflows/#get-workflow-usage")
    WorkflowUsage getWorkflowUsage(final GetWorkflowUsage getWorkflowUsage);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing")
    @Docs("https://developer.github.com/v3/actions/workflows/#get-workflow-usage")
    WorkflowUsage getWorkflowUsage(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("workflow-id") final int workflowId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/artifacts")
    @Docs("https://developer.github.com/v3/actions/artifacts/#list-artifacts-for-a-repository")
    @EnabledForGithubApps
    @Paged(ArtifactsPage.class)
    Stream<Artifact> listArtifactsForRepository(final ListArtifactsForRepository listArtifactsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/actions/artifacts")
    @Docs("https://developer.github.com/v3/actions/artifacts/#list-artifacts-for-a-repository")
    @EnabledForGithubApps
    @Paged(ArtifactsPage.class)
    Stream<Artifact> listArtifactsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/jobs")
    @Docs("https://developer.github.com/v3/actions/workflow-jobs/#list-jobs-for-a-workflow-run")
    @EnabledForGithubApps
    @Paged(JobsPage.class)
    Stream<Job> listJobsForWorkflowRun(final ListJobsForWorkflowRun listJobsForWorkflowRun);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/jobs")
    @Docs("https://developer.github.com/v3/actions/workflow-jobs/#list-jobs-for-a-workflow-run")
    @EnabledForGithubApps
    @Paged(JobsPage.class)
    Stream<Job> listJobsForWorkflowRun(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @GET
    @Path("/orgs/{org}/actions/secrets")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-organization-secrets")
    @EnabledForGithubApps
    @Paged(OrganizationActionsSecretsPage.class)
    Stream<OrganizationActionsSecret> listOrganizationSecrets(final ListOrganizationSecrets listOrganizationSecrets);

    @GET
    @Path("/orgs/{org}/actions/secrets")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-organization-secrets")
    @EnabledForGithubApps
    @Paged(OrganizationActionsSecretsPage.class)
    Stream<OrganizationActionsSecret> listOrganizationSecrets(@PathParam("org") final String org);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-repository-secrets")
    @EnabledForGithubApps
    @Paged(ActionsSecretsPage.class)
    Stream<ActionsSecret> listRepositorySecrets(final ListRepositorySecrets listRepositorySecrets);

    @GET
    @Path("/repos/{owner}/{repo}/actions/secrets")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-repository-secrets")
    @EnabledForGithubApps
    @Paged(ActionsSecretsPage.class)
    Stream<ActionsSecret> listRepositorySecrets(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows")
    @Docs("https://developer.github.com/v3/actions/workflows/#list-repository-workflows")
    @EnabledForGithubApps
    @Paged(WorkflowsPage.class)
    Stream<Workflow> listRepositoryWorkflows(final ListRepositoryWorkflows listRepositoryWorkflows);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows")
    @Docs("https://developer.github.com/v3/actions/workflows/#list-repository-workflows")
    @EnabledForGithubApps
    @Paged(WorkflowsPage.class)
    Stream<Workflow> listRepositoryWorkflows(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/orgs/{org}/actions/runners/downloads")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-an-organization")
    @EnabledForGithubApps
    Stream<RunnerApplication> listRunnerApplicationsForOrganization(final ListRunnerApplicationsForOrganization listRunnerApplicationsForOrganization);

    @GET
    @Path("/orgs/{org}/actions/runners/downloads")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-an-organization")
    @EnabledForGithubApps
    Stream<RunnerApplication> listRunnerApplicationsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners/downloads")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-a-repository")
    @EnabledForGithubApps
    Stream<RunnerApplication> listRunnerApplicationsForRepository(final ListRunnerApplicationsForRepository listRunnerApplicationsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners/downloads")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-runner-applications-for-a-repository")
    @EnabledForGithubApps
    Stream<RunnerApplication> listRunnerApplicationsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-selected-repositories-for-an-organization-secret")
    @EnabledForGithubApps
    ListSelectedRepositoriesForOrganizationSecretResponse listSelectedRepositoriesForOrganizationSecret(final ListSelectedRepositoriesForOrganizationSecret listSelectedRepositoriesForOrganizationSecret);

    @GET
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories")
    @Docs("https://developer.github.com/v3/actions/secrets/#list-selected-repositories-for-an-organization-secret")
    @EnabledForGithubApps
    ListSelectedRepositoriesForOrganizationSecretResponse listSelectedRepositoriesForOrganizationSecret(@PathParam("org") final String org, @PathParam("secret_name") final String secretName);

    @GET
    @Path("/orgs/{org}/actions/runners")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-an-organization")
    @EnabledForGithubApps
    @Paged(RunnersPage.class)
    Stream<Runner> listSelfHostedRunnersForOrganization(final ListSelfHostedRunnersForOrganization listSelfHostedRunnersForOrganization);

    @GET
    @Path("/orgs/{org}/actions/runners")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-an-organization")
    @EnabledForGithubApps
    @Paged(RunnersPage.class)
    Stream<Runner> listSelfHostedRunnersForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-a-repository")
    @EnabledForGithubApps
    @Paged(RunnersPage.class)
    Stream<Runner> listSelfHostedRunnersForRepository(final ListSelfHostedRunnersForRepository listSelfHostedRunnersForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runners")
    @Docs("https://developer.github.com/v3/actions/self-hosted-runners/#list-self-hosted-runners-for-a-repository")
    @EnabledForGithubApps
    @Paged(RunnersPage.class)
    Stream<Runner> listSelfHostedRunnersForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/artifacts")
    @Docs("https://developer.github.com/v3/actions/artifacts/#list-workflow-run-artifacts")
    @EnabledForGithubApps
    @Paged(ArtifactsPage.class)
    Stream<Artifact> listWorkflowRunArtifacts(final ListWorkflowRunArtifacts listWorkflowRunArtifacts);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs/{run_id}/artifacts")
    @Docs("https://developer.github.com/v3/actions/artifacts/#list-workflow-run-artifacts")
    @EnabledForGithubApps
    @Paged(ArtifactsPage.class)
    Stream<Artifact> listWorkflowRunArtifacts(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("run-id") final int runId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs")
    @EnabledForGithubApps
    @Paged(WorkflowRunsPage.class)
    Stream<WorkflowRun> listWorkflowRuns(final ListWorkflowRuns listWorkflowRuns);

    @GET
    @Path("/repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs")
    @EnabledForGithubApps
    @Paged(WorkflowRunsPage.class)
    Stream<WorkflowRun> listWorkflowRuns(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("workflow-id") final int workflowId);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs-for-a-repository")
    @EnabledForGithubApps
    @Paged(WorkflowRunsPage.class)
    Stream<WorkflowRun> listWorkflowRunsForRepository(final ListWorkflowRunsForRepository listWorkflowRunsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/actions/runs")
    @Docs("https://developer.github.com/v3/actions/workflow-runs/#list-workflow-runs-for-a-repository")
    @EnabledForGithubApps
    @Paged(WorkflowRunsPage.class)
    Stream<WorkflowRun> listWorkflowRunsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret")
    @EnabledForGithubApps
    void removeSelectedRepositoryFromOrganizationSecret(final RemoveSelectedRepositoryFromOrganizationSecret removeSelectedRepositoryFromOrganizationSecret);

    @DELETE
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}")
    @Docs("https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret")
    @EnabledForGithubApps
    void removeSelectedRepositoryFromOrganizationSecret(@PathParam("org") final String org, @PathParam("secret_name") final String secretName, @PathParam("repository_id") final int repositoryId);

    @PUT
    @Path("/orgs/{org}/actions/secrets/{secret_name}/repositories")
    @Docs("https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret")
    @EnabledForGithubApps
    void setSelectedRepositoriesForOrganizationSecret(final SetSelectedRepositoriesForOrganizationSecret setSelectedRepositoriesForOrganizationSecret);
}
