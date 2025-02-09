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
import org.tomitribe.github.model.GetGitignoreTemplate;
import org.tomitribe.github.model.GitignoreTemplate;

public interface GitignoreClient {

    @GET
    @Path("/gitignore/templates")
    @OperationId("gitignore/get-all-templates")
    @Docs("https://developer.github.com/v3/gitignore/#get-all-gitignore-templates")
    @EnabledForGithubApps
    @Category("gitignore")
    Stream<String> getAllGitignoreTemplates();

    @GET
    @Path("/gitignore/templates/{name}")
    @OperationId("gitignore/get-template")
    @Docs("https://developer.github.com/v3/gitignore/#get-a-gitignore-template")
    @EnabledForGithubApps
    @Category("gitignore")
    GitignoreTemplate getGitignoreTemplate(final GetGitignoreTemplate getGitignoreTemplate);

    @GET
    @Path("/gitignore/templates/{name}")
    @OperationId("gitignore/get-template")
    @Docs("https://developer.github.com/v3/gitignore/#get-a-gitignore-template")
    @EnabledForGithubApps
    @Category("gitignore")
    GitignoreTemplate getGitignoreTemplate(@PathParam("name") final String name);
}
