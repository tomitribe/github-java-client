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
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import java.util.stream.Stream;
import org.tomitribe.github.core.DeprecationDate;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.model.ApplicationGrant;
import org.tomitribe.github.model.Authorization;
import org.tomitribe.github.model.CreateNewAuthorization;
import org.tomitribe.github.model.DeleteAuthorization;
import org.tomitribe.github.model.DeleteGrant;
import org.tomitribe.github.model.GetOrCreateAuthorizationForSpecificApp;
import org.tomitribe.github.model.GetOrCreateAuthorizationForSpecificAppAndFingerprint;
import org.tomitribe.github.model.GetSingleAuthorization;
import org.tomitribe.github.model.GetSingleGrant;
import org.tomitribe.github.model.UpdateExistingAuthorization;

public interface OauthAuthorizationsClient {

    @POST
    @Path("/authorizations")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#create-a-new-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization createNewAuthorization(final CreateNewAuthorization createNewAuthorization);

    @DELETE
    @Path("/authorizations/{authorization_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#delete-an-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    void deleteAuthorization(final DeleteAuthorization deleteAuthorization);

    @DELETE
    @Path("/authorizations/{authorization_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#delete-an-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    void deleteAuthorization(@PathParam("authorization_id") final int authorizationId);

    @DELETE
    @Path("/applications/grants/{grant_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#delete-a-grant")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    void deleteGrant(final DeleteGrant deleteGrant);

    @DELETE
    @Path("/applications/grants/{grant_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#delete-a-grant")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    void deleteGrant(@PathParam("grant_id") final int grantId);

    @PUT
    @Path("/authorizations/clients/{client_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-or-create-an-authorization-for-a-specific-app")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization getOrCreateAuthorizationForSpecificApp(final GetOrCreateAuthorizationForSpecificApp getOrCreateAuthorizationForSpecificApp);

    @PUT
    @Path("/authorizations/clients/{client_id}/{fingerprint}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-or-create-an-authorization-for-a-specific-app-and-fingerprint")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization getOrCreateAuthorizationForSpecificAppAndFingerprint(final GetOrCreateAuthorizationForSpecificAppAndFingerprint getOrCreateAuthorizationForSpecificAppAndFingerprint);

    @GET
    @Path("/authorizations/{authorization_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-a-single-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization getSingleAuthorization(final GetSingleAuthorization getSingleAuthorization);

    @GET
    @Path("/authorizations/{authorization_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-a-single-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization getSingleAuthorization(@PathParam("authorization_id") final int authorizationId);

    @GET
    @Path("/applications/grants/{grant_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-a-single-grant")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    ApplicationGrant getSingleGrant(final GetSingleGrant getSingleGrant);

    @GET
    @Path("/applications/grants/{grant_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#get-a-single-grant")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    ApplicationGrant getSingleGrant(@PathParam("grant_id") final int grantId);

    @GET
    @Path("/authorizations")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#list-your-authorizations")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    @Paged(Authorization[].class)
    Stream<Authorization> listYourAuthorizations();

    @GET
    @Path("/applications/grants")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#list-your-grants")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    @Paged(ApplicationGrant[].class)
    Stream<ApplicationGrant> listYourGrants();

    @PATCH
    @Path("/authorizations/{authorization_id}")
    @Docs("https://developer.github.com/v3/oauth_authorizations/#update-an-existing-authorization")
    @RemovalDate("2020-11-13")
    @DeprecationDate("2020-02-14")
    Authorization updateExistingAuthorization(final UpdateExistingAuthorization updateExistingAuthorization);
}
