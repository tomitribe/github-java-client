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
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.GetInteractionRestrictionsForOrganization;
import org.tomitribe.github.model.GetInteractionRestrictionsForRepository;
import org.tomitribe.github.model.InteractionLimit;
import org.tomitribe.github.model.RemoveInteractionRestrictionsForOrganization;
import org.tomitribe.github.model.RemoveInteractionRestrictionsForRepository;
import org.tomitribe.github.model.SetInteractionRestrictionsForOrganization;
import org.tomitribe.github.model.SetInteractionRestrictionsForRepository;

public interface InteractionsClient {

    @GET
    @Path("/orgs/{org}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/orgs/#get-interaction-restrictions-for-an-organization")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit getInteractionRestrictionsForOrganization(final GetInteractionRestrictionsForOrganization getInteractionRestrictionsForOrganization);

    @GET
    @Path("/orgs/{org}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/orgs/#get-interaction-restrictions-for-an-organization")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit getInteractionRestrictionsForOrganization(@PathParam("org") final String org);

    @GET
    @Path("/repos/{owner}/{repo}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/repos/#get-interaction-restrictions-for-a-repository")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit getInteractionRestrictionsForRepository(final GetInteractionRestrictionsForRepository getInteractionRestrictionsForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/repos/#get-interaction-restrictions-for-a-repository")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit getInteractionRestrictionsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/orgs/{org}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/orgs/#remove-interaction-restrictions-for-an-organization")
    @EnabledForGithubApps
    @Preview("sombra")
    void removeInteractionRestrictionsForOrganization(final RemoveInteractionRestrictionsForOrganization removeInteractionRestrictionsForOrganization);

    @DELETE
    @Path("/orgs/{org}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/orgs/#remove-interaction-restrictions-for-an-organization")
    @EnabledForGithubApps
    @Preview("sombra")
    void removeInteractionRestrictionsForOrganization(@PathParam("org") final String org);

    @DELETE
    @Path("/repos/{owner}/{repo}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/repos/#remove-interaction-restrictions-for-a-repository")
    @EnabledForGithubApps
    @Preview("sombra")
    void removeInteractionRestrictionsForRepository(final RemoveInteractionRestrictionsForRepository removeInteractionRestrictionsForRepository);

    @DELETE
    @Path("/repos/{owner}/{repo}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/repos/#remove-interaction-restrictions-for-a-repository")
    @EnabledForGithubApps
    @Preview("sombra")
    void removeInteractionRestrictionsForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @PUT
    @Path("/orgs/{org}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/orgs/#set-interaction-restrictions-for-an-organization")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit setInteractionRestrictionsForOrganization(final SetInteractionRestrictionsForOrganization setInteractionRestrictionsForOrganization);

    @PUT
    @Path("/repos/{owner}/{repo}/interaction-limits")
    @Docs("https://developer.github.com/v3/interactions/repos/#set-interaction-restrictions-for-a-repository")
    @EnabledForGithubApps
    @Preview("sombra")
    InteractionLimit setInteractionRestrictionsForRepository(final SetInteractionRestrictionsForRepository setInteractionRestrictionsForRepository);
}
