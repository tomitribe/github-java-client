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
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.CheckAnnotation;
import org.tomitribe.github.model.CheckRun;
import org.tomitribe.github.model.CheckRunsPage;
import org.tomitribe.github.model.CheckSuite;
import org.tomitribe.github.model.CheckSuitePreference;
import org.tomitribe.github.model.CheckSuitesPage;
import org.tomitribe.github.model.CreateCheckRun;
import org.tomitribe.github.model.CreateCheckSuite;
import org.tomitribe.github.model.GetCheckRun;
import org.tomitribe.github.model.GetCheckSuite;
import org.tomitribe.github.model.ListCheckRunAnnotations;
import org.tomitribe.github.model.ListCheckRunsForGitReference;
import org.tomitribe.github.model.ListCheckRunsInCheckSuite;
import org.tomitribe.github.model.ListCheckSuitesForGitReference;
import org.tomitribe.github.model.UpdateCheckRun;
import org.tomitribe.github.model.UpdateRepositoryPreferencesForCheckSuites;

public interface ChecksClient {

    @POST
    @Path("/repos/{owner}/{repo}/check-runs")
    @Docs("https://developer.github.com/v3/checks/runs/#create-a-check-run")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckRun createCheckRun(final CreateCheckRun createCheckRun);

    @POST
    @Path("/repos/{owner}/{repo}/check-suites")
    @Docs("https://developer.github.com/v3/checks/suites/#create-a-check-suite")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckSuite createCheckSuite(final CreateCheckSuite createCheckSuite);

    @GET
    @Path("/repos/{owner}/{repo}/check-runs/{check_run_id}")
    @Docs("https://developer.github.com/v3/checks/runs/#get-a-check-run")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckRun getCheckRun(final GetCheckRun getCheckRun);

    @GET
    @Path("/repos/{owner}/{repo}/check-runs/{check_run_id}")
    @Docs("https://developer.github.com/v3/checks/runs/#get-a-check-run")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckRun getCheckRun(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("check_run_id") final int checkRunId);

    @GET
    @Path("/repos/{owner}/{repo}/check-suites/{check_suite_id}")
    @Docs("https://developer.github.com/v3/checks/suites/#get-a-check-suite")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckSuite getCheckSuite(final GetCheckSuite getCheckSuite);

    @GET
    @Path("/repos/{owner}/{repo}/check-suites/{check_suite_id}")
    @Docs("https://developer.github.com/v3/checks/suites/#get-a-check-suite")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckSuite getCheckSuite(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("check_suite_id") final int checkSuiteId);

    @GET
    @Path("/repos/{owner}/{repo}/check-runs/{check_run_id}/annotations")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-run-annotations")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckAnnotation[].class)
    Stream<CheckAnnotation> listCheckRunAnnotations(final ListCheckRunAnnotations listCheckRunAnnotations);

    @GET
    @Path("/repos/{owner}/{repo}/check-runs/{check_run_id}/annotations")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-run-annotations")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckAnnotation[].class)
    Stream<CheckAnnotation> listCheckRunAnnotations(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("check_run_id") final int checkRunId);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/check-runs")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-runs-for-a-git-reference")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckRunsPage.class)
    Stream<CheckRun> listCheckRunsForGitReference(final ListCheckRunsForGitReference listCheckRunsForGitReference);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/check-runs")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-runs-for-a-git-reference")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckRunsPage.class)
    Stream<CheckRun> listCheckRunsForGitReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @GET
    @Path("/repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-runs-in-a-check-suite")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckRunsPage.class)
    Stream<CheckRun> listCheckRunsInCheckSuite(final ListCheckRunsInCheckSuite listCheckRunsInCheckSuite);

    @GET
    @Path("/repos/{owner}/{repo}/check-suites/{check_suite_id}/check-runs")
    @Docs("https://developer.github.com/v3/checks/runs/#list-check-runs-in-a-check-suite")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckRunsPage.class)
    Stream<CheckRun> listCheckRunsInCheckSuite(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("check_suite_id") final int checkSuiteId);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/check-suites")
    @Docs("https://developer.github.com/v3/checks/suites/#list-check-suites-for-a-git-reference")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckSuitesPage.class)
    Stream<CheckSuite> listCheckSuitesForGitReference(final ListCheckSuitesForGitReference listCheckSuitesForGitReference);

    @GET
    @Path("/repos/{owner}/{repo}/commits/{ref}/check-suites")
    @Docs("https://developer.github.com/v3/checks/suites/#list-check-suites-for-a-git-reference")
    @EnabledForGithubApps
    @Preview("antiope")
    @Paged(CheckSuitesPage.class)
    Stream<CheckSuite> listCheckSuitesForGitReference(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("ref") final String ref);

    @PATCH
    @Path("/repos/{owner}/{repo}/check-runs/{check_run_id}")
    @Docs("https://developer.github.com/v3/checks/runs/#update-a-check-run")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckRun updateCheckRun(final UpdateCheckRun updateCheckRun);

    @PATCH
    @Path("/repos/{owner}/{repo}/check-suites/preferences")
    @Docs("https://developer.github.com/v3/checks/suites/#update-repository-preferences-for-check-suites")
    @EnabledForGithubApps
    @Preview("antiope")
    CheckSuitePreference updateRepositoryPreferencesForCheckSuites(final UpdateRepositoryPreferencesForCheckSuites updateRepositoryPreferencesForCheckSuites);
}
