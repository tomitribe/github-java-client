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
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.stream.Stream;
import org.tomitribe.github.core.DeprecationDate;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.model.Authorization;
import org.tomitribe.github.model.CreateNewAuthorization;
import org.tomitribe.github.model.ListYourAuthorizations;

public interface OauthAuthorizationsClient {

    @POST
    @Path("/authorizations")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    default Authorization createNewAuthorization(final CreateNewAuthorization createNewAuthorization) {
        throw new UnsupportedOperationException();
    }

    @GET
    @Path("/authorizations")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    @Paged(Authorization[].class)
    default Stream<Authorization> listYourAuthorizations(final ListYourAuthorizations listYourAuthorizations) {
        throw new UnsupportedOperationException();
    }
}
