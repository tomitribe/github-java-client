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
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.model.CodeScanningAlert;
import org.tomitribe.github.model.GetCodeScanningAlert;
import org.tomitribe.github.model.ListCodeScanningAlertsForRepository;

public interface CodeScanningClient {

    @GET
    @Path("/repos/{owner}/{repo}/code-scanning/alerts/{alert_id}")
    @Docs("https://developer.github.com/v3/code-scanning/#get-a-code-scanning-alert")
    @EnabledForGithubApps
    CodeScanningAlert getCodeScanningAlert(final GetCodeScanningAlert getCodeScanningAlert);

    @GET
    @Path("/repos/{owner}/{repo}/code-scanning/alerts/{alert_id}")
    @Docs("https://developer.github.com/v3/code-scanning/#get-a-code-scanning-alert")
    @EnabledForGithubApps
    CodeScanningAlert getCodeScanningAlert(@PathParam("owner") final String owner, @PathParam("repo") final String repo, @PathParam("alert_id") final int alertId);

    @GET
    @Path("/repos/{owner}/{repo}/code-scanning/alerts")
    @Docs("https://developer.github.com/v3/code-scanning/#list-code-scanning-alerts-for-a-repository")
    @EnabledForGithubApps
    Stream<CodeScanningAlert> listCodeScanningAlertsForRepository(final ListCodeScanningAlertsForRepository listCodeScanningAlertsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/code-scanning/alerts")
    @Docs("https://developer.github.com/v3/code-scanning/#list-code-scanning-alerts-for-a-repository")
    @EnabledForGithubApps
    Stream<CodeScanningAlert> listCodeScanningAlertsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);
}
