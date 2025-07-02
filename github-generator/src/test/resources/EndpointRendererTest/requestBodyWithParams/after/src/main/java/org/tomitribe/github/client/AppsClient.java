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

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.CreateInstallationAccessTokenForApp;
import org.tomitribe.github.model.InstallationToken;

public interface AppsClient {

    @POST
    @Path("/app/installations/{installation_id}/access_tokens")
    @Docs("https://developer.github.com/v3/apps/#create-an-installation-access-token-for-an-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    default InstallationToken createInstallationAccessTokenForApp(final CreateInstallationAccessTokenForApp createInstallationAccessTokenForApp) {
        throw new UnsupportedOperationException();
    }
}
