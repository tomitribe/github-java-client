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
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.model.DeleteDiscussion;
import org.tomitribe.github.model.GetDiscussion;
import org.tomitribe.github.model.TeamDiscussion;
import org.tomitribe.github.model.UpdateDiscussion;

public interface TeamsClient {

    @DELETE
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#delete-a-discussion")
    @EnabledForGithubApps
    default void deleteDiscussion(final DeleteDiscussion deleteDiscussion) {
        throw new UnsupportedOperationException();
    }

    @GET
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#get-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    default TeamDiscussion getDiscussion(final GetDiscussion getDiscussion) {
        throw new UnsupportedOperationException();
    }

    @PATCH
    @Path("/orgs/{org}/teams/{team_slug}/discussions/{discussion_number}")
    @Docs("https://developer.github.com/v3/teams/discussions/#update-a-discussion")
    @EnabledForGithubApps
    @Preview("squirrel-girl")
    default TeamDiscussion updateDiscussion(final UpdateDiscussion updateDiscussion) {
        throw new UnsupportedOperationException();
    }
}
