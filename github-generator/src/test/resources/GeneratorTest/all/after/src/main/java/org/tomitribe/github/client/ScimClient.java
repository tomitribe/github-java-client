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
import jakarta.ws.rs.Path;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.GithubCloudOnly;
import org.tomitribe.github.model.DeleteSCIMUserFromOrganization;

public interface ScimClient {

    @DELETE
    @Path("/scim/v2/organizations/{org}/Users/{scim_user_id}")
    @Docs("https://developer.github.com/v3/scim/#delete-a-scim-user-from-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    void deleteSCIMUserFromOrganization(final DeleteSCIMUserFromOrganization deleteSCIMUserFromOrganization);

    @DELETE
    @Path("/scim/v2/organizations/{org}/Users/{scim_user_id}")
    @Docs("https://developer.github.com/v3/scim/#delete-a-scim-user-from-an-organization")
    @GithubCloudOnly
    @EnabledForGithubApps
    void deleteSCIMUserFromOrganization(@PathParam("org") final String org, @PathParam("scim_user_id") final String scimUserId);
}
