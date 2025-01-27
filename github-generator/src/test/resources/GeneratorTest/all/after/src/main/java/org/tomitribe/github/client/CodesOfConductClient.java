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
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.CodeOfConduct;
import org.tomitribe.github.model.GetCodeOfConduct;
import org.tomitribe.github.model.GetCodeOfConductForRepository;

public interface CodesOfConductClient {

    @GET
    @Path("/codes_of_conduct")
    @Docs("https://developer.github.com/v3/codes_of_conduct/#get-all-codes-of-conduct")
    @EnabledForGithubApps
    @Preview("scarlet-witch")
    Stream<CodeOfConduct> getAllCodesOfConduct();

    @GET
    @Path("/codes_of_conduct/{key}")
    @Docs("https://developer.github.com/v3/codes_of_conduct/#get-a-code-of-conduct")
    @EnabledForGithubApps
    @Preview("scarlet-witch")
    CodeOfConduct getCodeOfConduct(final GetCodeOfConduct getCodeOfConduct);

    @GET
    @Path("/codes_of_conduct/{key}")
    @Docs("https://developer.github.com/v3/codes_of_conduct/#get-a-code-of-conduct")
    @EnabledForGithubApps
    @Preview("scarlet-witch")
    CodeOfConduct getCodeOfConduct(@PathParam("key") final String key);

    @GET
    @Path("/repos/{owner}/{repo}/community/code_of_conduct")
    @Docs("https://developer.github.com/v3/codes_of_conduct/#get-the-code-of-conduct-for-a-repository")
    @EnabledForGithubApps
    @Preview("scarlet-witch")
    CodeOfConduct getCodeOfConductForRepository(final GetCodeOfConductForRepository getCodeOfConductForRepository);

    @GET
    @Path("/repos/{owner}/{repo}/community/code_of_conduct")
    @Docs("https://developer.github.com/v3/codes_of_conduct/#get-the-code-of-conduct-for-a-repository")
    @EnabledForGithubApps
    @Preview("scarlet-witch")
    CodeOfConduct getCodeOfConductForRepository(@PathParam("owner") final String owner, @PathParam("repo") final String repo);
}
