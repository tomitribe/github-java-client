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
import jakarta.ws.rs.QueryParam;
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.Installation;
import org.tomitribe.github.model.ListInstallationsForAuthenticatedApp;

public interface AppsClient {

    @GET
    @Path("/app/installations")
    @Docs("https://developer.github.com/v3/apps/#list-installations-for-the-authenticated-app")
    @EnabledForGithubApps
    @Preview("machine-man")
    @Paged(Installation[].class)
    default Stream<Installation> listInstallationsForAuthenticatedApp(final ListInstallationsForAuthenticatedApp listInstallationsForAuthenticatedApp) {
        throw new UnsupportedOperationException();
    }
}
