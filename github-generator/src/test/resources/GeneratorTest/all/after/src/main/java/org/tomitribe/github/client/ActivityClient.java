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
import java.util.stream.Stream;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.model.CheckIfRepositoryIsStarredByAuthenticatedUser;
import org.tomitribe.github.model.DeleteRepositorySubscription;
import org.tomitribe.github.model.DeleteThreadSubscription;
import org.tomitribe.github.model.Event;
import org.tomitribe.github.model.Feed;
import org.tomitribe.github.model.GetRepositorySubscription;
import org.tomitribe.github.model.GetThread;
import org.tomitribe.github.model.GetThreadSubscriptionForAuthenticatedUser;
import org.tomitribe.github.model.ListEventsForAuthenticatedUser;
import org.tomitribe.github.model.ListEventsReceivedByAuthenticatedUser;
import org.tomitribe.github.model.ListNotificationsForAuthenticatedUser;
import org.tomitribe.github.model.ListOrganizationEventsForAuthenticatedUser;
import org.tomitribe.github.model.ListPublicEventsForNetworkOfRepositories;
import org.tomitribe.github.model.ListPublicEventsForUser;
import org.tomitribe.github.model.ListPublicEventsReceivedByUser;
import org.tomitribe.github.model.ListPublicOrganizationEvents;
import org.tomitribe.github.model.ListRepositoriesStarredByAuthenticatedUser;
import org.tomitribe.github.model.ListRepositoriesStarredByUser;
import org.tomitribe.github.model.ListRepositoriesWatchedByUser;
import org.tomitribe.github.model.ListRepositoryEvents;
import org.tomitribe.github.model.ListRepositoryNotificationsForAuthenticatedUser;
import org.tomitribe.github.model.ListStargazers;
import org.tomitribe.github.model.ListWatchers;
import org.tomitribe.github.model.MarkNotificationsAsRead;
import org.tomitribe.github.model.MarkNotificationsAsReadResponse;
import org.tomitribe.github.model.MinimalRepository;
import org.tomitribe.github.model.Repository;
import org.tomitribe.github.model.RepositorySubscription;
import org.tomitribe.github.model.SetRepositorySubscription;
import org.tomitribe.github.model.SetThreadSubscription;
import org.tomitribe.github.model.SimpleUser;
import org.tomitribe.github.model.StarRepositoryForAuthenticatedUser;
import org.tomitribe.github.model.Thread;
import org.tomitribe.github.model.ThreadSubscription;
import org.tomitribe.github.model.UnstarRepositoryForAuthenticatedUser;

public interface ActivityClient {

    @GET
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#check-if-a-repository-is-starred-by-the-authenticated-user")
    void checkIfRepositoryIsStarredByAuthenticatedUser(final CheckIfRepositoryIsStarredByAuthenticatedUser checkIfRepositoryIsStarredByAuthenticatedUser);

    @GET
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#check-if-a-repository-is-starred-by-the-authenticated-user")
    void checkIfRepositoryIsStarredByAuthenticatedUser(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/repos/{owner}/{repo}/subscription")
    @Docs("https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription")
    void deleteRepositorySubscription(final DeleteRepositorySubscription deleteRepositorySubscription);

    @DELETE
    @Path("/repos/{owner}/{repo}/subscription")
    @Docs("https://developer.github.com/v3/activity/watching/#delete-a-repository-subscription")
    void deleteRepositorySubscription(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/notifications/threads/{thread_id}/subscription")
    @Docs("https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription")
    void deleteThreadSubscription(final DeleteThreadSubscription deleteThreadSubscription);

    @DELETE
    @Path("/notifications/threads/{thread_id}/subscription")
    @Docs("https://developer.github.com/v3/activity/notifications/#delete-a-thread-subscription")
    void deleteThreadSubscription(@PathParam("thread_id") final int threadId);

    @GET
    @Path("/feeds")
    @Docs("https://developer.github.com/v3/activity/feeds/#get-feeds")
    @EnabledForGithubApps
    Feed getFeeds();

    @GET
    @Path("/repos/{owner}/{repo}/subscription")
    @Docs("https://developer.github.com/v3/activity/watching/#get-a-repository-subscription")
    RepositorySubscription getRepositorySubscription(final GetRepositorySubscription getRepositorySubscription);

    @GET
    @Path("/repos/{owner}/{repo}/subscription")
    @Docs("https://developer.github.com/v3/activity/watching/#get-a-repository-subscription")
    RepositorySubscription getRepositorySubscription(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/notifications/threads/{thread_id}")
    @Docs("https://developer.github.com/v3/activity/notifications/#get-a-thread")
    Thread getThread(final GetThread getThread);

    @GET
    @Path("/notifications/threads/{thread_id}")
    @Docs("https://developer.github.com/v3/activity/notifications/#get-a-thread")
    Thread getThread(@PathParam("thread_id") final int threadId);

    @GET
    @Path("/notifications/threads/{thread_id}/subscription")
    @Docs("https://developer.github.com/v3/activity/notifications/#get-a-thread-subscription-for-the-authenticated-user")
    ThreadSubscription getThreadSubscriptionForAuthenticatedUser(final GetThreadSubscriptionForAuthenticatedUser getThreadSubscriptionForAuthenticatedUser);

    @GET
    @Path("/notifications/threads/{thread_id}/subscription")
    @Docs("https://developer.github.com/v3/activity/notifications/#get-a-thread-subscription-for-the-authenticated-user")
    ThreadSubscription getThreadSubscriptionForAuthenticatedUser(@PathParam("thread_id") final int threadId);

    @GET
    @Path("/users/{username}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-events-for-the-authenticated-user")
    @EnabledForGithubApps
    Stream<Event> listEventsForAuthenticatedUser(final ListEventsForAuthenticatedUser listEventsForAuthenticatedUser);

    @GET
    @Path("/users/{username}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-events-for-the-authenticated-user")
    @EnabledForGithubApps
    Stream<Event> listEventsForAuthenticatedUser(@PathParam("username") final String username);

    @GET
    @Path("/users/{username}/received_events")
    @Docs("https://developer.github.com/v3/activity/events/#list-events-received-by-the-authenticated-user")
    @EnabledForGithubApps
    Stream<Event> listEventsReceivedByAuthenticatedUser(final ListEventsReceivedByAuthenticatedUser listEventsReceivedByAuthenticatedUser);

    @GET
    @Path("/users/{username}/received_events")
    @Docs("https://developer.github.com/v3/activity/events/#list-events-received-by-the-authenticated-user")
    @EnabledForGithubApps
    Stream<Event> listEventsReceivedByAuthenticatedUser(@PathParam("username") final String username);

    @GET
    @Path("/notifications")
    @Docs("https://developer.github.com/v3/activity/notifications/#list-notifications-for-the-authenticated-user")
    @Paged(Thread[].class)
    Stream<Thread> listNotificationsForAuthenticatedUser(final ListNotificationsForAuthenticatedUser listNotificationsForAuthenticatedUser);

    @GET
    @Path("/users/{username}/events/orgs/{org}")
    @Docs("https://developer.github.com/v3/activity/events/#list-organization-events-for-the-authenticated-user")
    Stream<Event> listOrganizationEventsForAuthenticatedUser(final ListOrganizationEventsForAuthenticatedUser listOrganizationEventsForAuthenticatedUser);

    @GET
    @Path("/users/{username}/events/orgs/{org}")
    @Docs("https://developer.github.com/v3/activity/events/#list-organization-events-for-the-authenticated-user")
    Stream<Event> listOrganizationEventsForAuthenticatedUser(@PathParam("username") final String username, @PathParam("org") final String org);

    @GET
    @Path("/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events")
    @EnabledForGithubApps
    Stream<Event> listPublicEvents();

    @GET
    @Path("/networks/{owner}/{repo}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-for-a-network-of-repositories")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsForNetworkOfRepositories(final ListPublicEventsForNetworkOfRepositories listPublicEventsForNetworkOfRepositories);

    @GET
    @Path("/networks/{owner}/{repo}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-for-a-network-of-repositories")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsForNetworkOfRepositories(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/users/{username}/events/public")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-for-a-user")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsForUser(final ListPublicEventsForUser listPublicEventsForUser);

    @GET
    @Path("/users/{username}/events/public")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-for-a-user")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsForUser(@PathParam("username") final String username);

    @GET
    @Path("/users/{username}/received_events/public")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-received-by-a-user")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsReceivedByUser(final ListPublicEventsReceivedByUser listPublicEventsReceivedByUser);

    @GET
    @Path("/users/{username}/received_events/public")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-events-received-by-a-user")
    @EnabledForGithubApps
    Stream<Event> listPublicEventsReceivedByUser(@PathParam("username") final String username);

    @GET
    @Path("/orgs/{org}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-organization-events")
    @EnabledForGithubApps
    Stream<Event> listPublicOrganizationEvents(final ListPublicOrganizationEvents listPublicOrganizationEvents);

    @GET
    @Path("/orgs/{org}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-public-organization-events")
    @EnabledForGithubApps
    Stream<Event> listPublicOrganizationEvents(@PathParam("org") final String org);

    @GET
    @Path("/user/starred")
    @Docs("https://developer.github.com/v3/activity/starring/#list-repositories-starred-by-the-authenticated-user")
    @Paged(Repository[].class)
    Stream<Repository> listRepositoriesStarredByAuthenticatedUser(final ListRepositoriesStarredByAuthenticatedUser listRepositoriesStarredByAuthenticatedUser);

    @GET
    @Path("/users/{username}/starred")
    @Docs("https://developer.github.com/v3/activity/starring/#list-repositories-starred-by-a-user")
    @EnabledForGithubApps
    @Paged(Repository[].class)
    Stream<Repository> listRepositoriesStarredByUser(final ListRepositoriesStarredByUser listRepositoriesStarredByUser);

    @GET
    @Path("/users/{username}/starred")
    @Docs("https://developer.github.com/v3/activity/starring/#list-repositories-starred-by-a-user")
    @EnabledForGithubApps
    @Paged(Repository[].class)
    Stream<Repository> listRepositoriesStarredByUser(@PathParam("username") final String username);

    @GET
    @Path("/user/subscriptions")
    @Docs("https://developer.github.com/v3/activity/watching/#list-repositories-watched-by-the-authenticated-user")
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listRepositoriesWatchedByAuthenticatedUser();

    @GET
    @Path("/users/{username}/subscriptions")
    @Docs("https://developer.github.com/v3/activity/watching/#list-repositories-watched-by-a-user")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listRepositoriesWatchedByUser(final ListRepositoriesWatchedByUser listRepositoriesWatchedByUser);

    @GET
    @Path("/users/{username}/subscriptions")
    @Docs("https://developer.github.com/v3/activity/watching/#list-repositories-watched-by-a-user")
    @EnabledForGithubApps
    @Paged(MinimalRepository[].class)
    Stream<MinimalRepository> listRepositoriesWatchedByUser(@PathParam("username") final String username);

    @GET
    @Path("/repos/{owner}/{repo}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-repository-events")
    @EnabledForGithubApps
    Stream<Event> listRepositoryEvents(final ListRepositoryEvents listRepositoryEvents);

    @GET
    @Path("/repos/{owner}/{repo}/events")
    @Docs("https://developer.github.com/v3/activity/events/#list-repository-events")
    @EnabledForGithubApps
    Stream<Event> listRepositoryEvents(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/notifications")
    @Docs("https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user")
    @Paged(Thread[].class)
    Stream<Thread> listRepositoryNotificationsForAuthenticatedUser(final ListRepositoryNotificationsForAuthenticatedUser listRepositoryNotificationsForAuthenticatedUser);

    @GET
    @Path("/repos/{owner}/{repo}/notifications")
    @Docs("https://developer.github.com/v3/activity/notifications/#list-repository-notifications-for-the-authenticated-user")
    @Paged(Thread[].class)
    Stream<Thread> listRepositoryNotificationsForAuthenticatedUser(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/stargazers")
    @Docs("https://developer.github.com/v3/activity/starring/#list-stargazers")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listStargazers(final ListStargazers listStargazers);

    @GET
    @Path("/repos/{owner}/{repo}/stargazers")
    @Docs("https://developer.github.com/v3/activity/starring/#list-stargazers")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listStargazers(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @GET
    @Path("/repos/{owner}/{repo}/subscribers")
    @Docs("https://developer.github.com/v3/activity/watching/#list-watchers")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listWatchers(final ListWatchers listWatchers);

    @GET
    @Path("/repos/{owner}/{repo}/subscribers")
    @Docs("https://developer.github.com/v3/activity/watching/#list-watchers")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listWatchers(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @PUT
    @Path("/notifications")
    @Docs("https://developer.github.com/v3/activity/notifications/#mark-notifications-as-read")
    MarkNotificationsAsReadResponse markNotificationsAsRead(final MarkNotificationsAsRead markNotificationsAsRead);

    @PUT
    @Path("/repos/{owner}/{repo}/subscription")
    @Docs("https://developer.github.com/v3/activity/watching/#set-a-repository-subscription")
    RepositorySubscription setRepositorySubscription(final SetRepositorySubscription setRepositorySubscription);

    @PUT
    @Path("/notifications/threads/{thread_id}/subscription")
    @Docs("https://developer.github.com/v3/activity/notifications/#set-a-thread-subscription")
    ThreadSubscription setThreadSubscription(final SetThreadSubscription setThreadSubscription);

    @PUT
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#star-a-repository-for-the-authenticated-user")
    void starRepositoryForAuthenticatedUser(final StarRepositoryForAuthenticatedUser starRepositoryForAuthenticatedUser);

    @PUT
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#star-a-repository-for-the-authenticated-user")
    void starRepositoryForAuthenticatedUser(@PathParam("owner") final String owner, @PathParam("repo") final String repo);

    @DELETE
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#unstar-a-repository-for-the-authenticated-user")
    void unstarRepositoryForAuthenticatedUser(final UnstarRepositoryForAuthenticatedUser unstarRepositoryForAuthenticatedUser);

    @DELETE
    @Path("/user/starred/{owner}/{repo}")
    @Docs("https://developer.github.com/v3/activity/starring/#unstar-a-repository-for-the-authenticated-user")
    void unstarRepositoryForAuthenticatedUser(@PathParam("owner") final String owner, @PathParam("repo") final String repo);
}
