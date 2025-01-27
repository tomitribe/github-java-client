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
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.model.AddEmailAddressForAuthenticatedUser;
import org.tomitribe.github.model.BlockUser;
import org.tomitribe.github.model.CheckIfPersonIsFollowedByAuthenticatedUser;
import org.tomitribe.github.model.CheckIfUserFollowsAnotherUser;
import org.tomitribe.github.model.CheckIfUserIsBlockedByAuthenticatedUser;
import org.tomitribe.github.model.CreateGPGKeyForAuthenticatedUser;
import org.tomitribe.github.model.CreatePublicSSHKeyForAuthenticatedUser;
import org.tomitribe.github.model.DeleteEmailAddressForAuthenticatedUser;
import org.tomitribe.github.model.DeleteGPGKeyForAuthenticatedUser;
import org.tomitribe.github.model.DeletePublicSSHKeyForAuthenticatedUser;
import org.tomitribe.github.model.Email;
import org.tomitribe.github.model.FollowUser;
import org.tomitribe.github.model.GetAuthenticatedUserResponse;
import org.tomitribe.github.model.GetContextualInformationForUser;
import org.tomitribe.github.model.GetGPGKeyForAuthenticatedUser;
import org.tomitribe.github.model.GetPublicSSHKeyForAuthenticatedUser;
import org.tomitribe.github.model.GetUser;
import org.tomitribe.github.model.GetUserResponse;
import org.tomitribe.github.model.GpgKey;
import org.tomitribe.github.model.Hovercard;
import org.tomitribe.github.model.Key;
import org.tomitribe.github.model.KeySimple;
import org.tomitribe.github.model.ListFollowersOfUser;
import org.tomitribe.github.model.ListGPGKeysForUser;
import org.tomitribe.github.model.ListPeopleUserFollows;
import org.tomitribe.github.model.ListPublicKeysForUser;
import org.tomitribe.github.model.ListUsers;
import org.tomitribe.github.model.PrivateUser;
import org.tomitribe.github.model.SetPrimaryEmailVisibilityForAuthenticatedUser;
import org.tomitribe.github.model.SimpleUser;
import org.tomitribe.github.model.UnblockUser;
import org.tomitribe.github.model.UnfollowUser;
import org.tomitribe.github.model.UpdateAuthenticatedUser;

public interface UsersClient {

    @POST
    @Path("/user/emails")
    @Docs("https://developer.github.com/v3/users/emails/#add-an-email-address-for-the-authenticated-user")
    Stream<Email> addEmailAddressForAuthenticatedUser(final AddEmailAddressForAuthenticatedUser addEmailAddressForAuthenticatedUser);

    @PUT
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#block-a-user")
    void blockUser(final BlockUser blockUser);

    @PUT
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#block-a-user")
    void blockUser(@PathParam("username") final String username);

    @GET
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#check-if-a-person-is-followed-by-the-authenticated-user")
    void checkIfPersonIsFollowedByAuthenticatedUser(final CheckIfPersonIsFollowedByAuthenticatedUser checkIfPersonIsFollowedByAuthenticatedUser);

    @GET
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#check-if-a-person-is-followed-by-the-authenticated-user")
    void checkIfPersonIsFollowedByAuthenticatedUser(@PathParam("username") final String username);

    @GET
    @Path("/users/{username}/following/{target_user}")
    @Docs("https://developer.github.com/v3/users/followers/#check-if-a-user-follows-another-user")
    @EnabledForGithubApps
    void checkIfUserFollowsAnotherUser(final CheckIfUserFollowsAnotherUser checkIfUserFollowsAnotherUser);

    @GET
    @Path("/users/{username}/following/{target_user}")
    @Docs("https://developer.github.com/v3/users/followers/#check-if-a-user-follows-another-user")
    @EnabledForGithubApps
    void checkIfUserFollowsAnotherUser(@PathParam("username") final String username, @PathParam("target_user") final String targetUser);

    @GET
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#check-if-a-user-is-blocked-by-the-authenticated-user")
    void checkIfUserIsBlockedByAuthenticatedUser(final CheckIfUserIsBlockedByAuthenticatedUser checkIfUserIsBlockedByAuthenticatedUser);

    @GET
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#check-if-a-user-is-blocked-by-the-authenticated-user")
    void checkIfUserIsBlockedByAuthenticatedUser(@PathParam("username") final String username);

    @POST
    @Path("/user/gpg_keys")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#create-a-gpg-key-for-the-authenticated-user")
    GpgKey createGPGKeyForAuthenticatedUser(final CreateGPGKeyForAuthenticatedUser createGPGKeyForAuthenticatedUser);

    @POST
    @Path("/user/keys")
    @Docs("https://developer.github.com/v3/users/keys/#create-a-public-ssh-key-for-the-authenticated-user")
    Key createPublicSSHKeyForAuthenticatedUser(final CreatePublicSSHKeyForAuthenticatedUser createPublicSSHKeyForAuthenticatedUser);

    @DELETE
    @Path("/user/emails")
    @Docs("https://developer.github.com/v3/users/emails/#delete-an-email-address-for-the-authenticated-user")
    void deleteEmailAddressForAuthenticatedUser(final DeleteEmailAddressForAuthenticatedUser deleteEmailAddressForAuthenticatedUser);

    @DELETE
    @Path("/user/gpg_keys/{gpg_key_id}")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#delete-a-gpg-key-for-the-authenticated-user")
    void deleteGPGKeyForAuthenticatedUser(final DeleteGPGKeyForAuthenticatedUser deleteGPGKeyForAuthenticatedUser);

    @DELETE
    @Path("/user/gpg_keys/{gpg_key_id}")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#delete-a-gpg-key-for-the-authenticated-user")
    void deleteGPGKeyForAuthenticatedUser(@PathParam("gpg_key_id") final int gpgKeyId);

    @DELETE
    @Path("/user/keys/{key_id}")
    @Docs("https://developer.github.com/v3/users/keys/#delete-a-public-ssh-key-for-the-authenticated-user")
    void deletePublicSSHKeyForAuthenticatedUser(final DeletePublicSSHKeyForAuthenticatedUser deletePublicSSHKeyForAuthenticatedUser);

    @DELETE
    @Path("/user/keys/{key_id}")
    @Docs("https://developer.github.com/v3/users/keys/#delete-a-public-ssh-key-for-the-authenticated-user")
    void deletePublicSSHKeyForAuthenticatedUser(@PathParam("key_id") final int keyId);

    @PUT
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#follow-a-user")
    void followUser(final FollowUser followUser);

    @PUT
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#follow-a-user")
    void followUser(@PathParam("username") final String username);

    @GET
    @Path("/user")
    @Docs("https://developer.github.com/v3/users/#get-the-authenticated-user")
    GetAuthenticatedUserResponse getAuthenticatedUser();

    @GET
    @Path("/users/{username}/hovercard")
    @Docs("https://developer.github.com/v3/users/#get-contextual-information-for-a-user")
    Hovercard getContextualInformationForUser(final GetContextualInformationForUser getContextualInformationForUser);

    @GET
    @Path("/users/{username}/hovercard")
    @Docs("https://developer.github.com/v3/users/#get-contextual-information-for-a-user")
    Hovercard getContextualInformationForUser(@PathParam("username") final String username);

    @GET
    @Path("/user/gpg_keys/{gpg_key_id}")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#get-a-gpg-key-for-the-authenticated-user")
    GpgKey getGPGKeyForAuthenticatedUser(final GetGPGKeyForAuthenticatedUser getGPGKeyForAuthenticatedUser);

    @GET
    @Path("/user/gpg_keys/{gpg_key_id}")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#get-a-gpg-key-for-the-authenticated-user")
    GpgKey getGPGKeyForAuthenticatedUser(@PathParam("gpg_key_id") final int gpgKeyId);

    @GET
    @Path("/user/keys/{key_id}")
    @Docs("https://developer.github.com/v3/users/keys/#get-a-public-ssh-key-for-the-authenticated-user")
    Key getPublicSSHKeyForAuthenticatedUser(final GetPublicSSHKeyForAuthenticatedUser getPublicSSHKeyForAuthenticatedUser);

    @GET
    @Path("/user/keys/{key_id}")
    @Docs("https://developer.github.com/v3/users/keys/#get-a-public-ssh-key-for-the-authenticated-user")
    Key getPublicSSHKeyForAuthenticatedUser(@PathParam("key_id") final int keyId);

    @GET
    @Path("/users/{username}")
    @Docs("https://developer.github.com/v3/users/#get-a-user")
    @EnabledForGithubApps
    GetUserResponse getUser(final GetUser getUser);

    @GET
    @Path("/users/{username}")
    @Docs("https://developer.github.com/v3/users/#get-a-user")
    @EnabledForGithubApps
    GetUserResponse getUser(@PathParam("username") final String username);

    @GET
    @Path("/user/emails")
    @Docs("https://developer.github.com/v3/users/emails/#list-email-addresses-for-the-authenticated-user")
    @Paged(Email[].class)
    Stream<Email> listEmailAddressesForAuthenticatedUser();

    @GET
    @Path("/user/followers")
    @Docs("https://developer.github.com/v3/users/followers/#list-followers-of-the-authenticated-user")
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listFollowersOfAuthenticatedUser();

    @GET
    @Path("/users/{username}/followers")
    @Docs("https://developer.github.com/v3/users/followers/#list-followers-of-a-user")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listFollowersOfUser(final ListFollowersOfUser listFollowersOfUser);

    @GET
    @Path("/users/{username}/followers")
    @Docs("https://developer.github.com/v3/users/followers/#list-followers-of-a-user")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listFollowersOfUser(@PathParam("username") final String username);

    @GET
    @Path("/user/gpg_keys")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#list-gpg-keys-for-the-authenticated-user")
    @Paged(GpgKey[].class)
    Stream<GpgKey> listGPGKeysForAuthenticatedUser();

    @GET
    @Path("/users/{username}/gpg_keys")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#list-gpg-keys-for-a-user")
    @EnabledForGithubApps
    @Paged(GpgKey[].class)
    Stream<GpgKey> listGPGKeysForUser(final ListGPGKeysForUser listGPGKeysForUser);

    @GET
    @Path("/users/{username}/gpg_keys")
    @Docs("https://developer.github.com/v3/users/gpg_keys/#list-gpg-keys-for-a-user")
    @EnabledForGithubApps
    @Paged(GpgKey[].class)
    Stream<GpgKey> listGPGKeysForUser(@PathParam("username") final String username);

    @GET
    @Path("/user/following")
    @Docs("https://developer.github.com/v3/users/followers/#list-the-people-the-authenticated-user-follows")
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listPeopleAuthenticatedUserFollows();

    @GET
    @Path("/users/{username}/following")
    @Docs("https://developer.github.com/v3/users/followers/#list-the-people-a-user-follows")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listPeopleUserFollows(final ListPeopleUserFollows listPeopleUserFollows);

    @GET
    @Path("/users/{username}/following")
    @Docs("https://developer.github.com/v3/users/followers/#list-the-people-a-user-follows")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listPeopleUserFollows(@PathParam("username") final String username);

    @GET
    @Path("/user/public_emails")
    @Docs("https://developer.github.com/v3/users/emails/#list-public-email-addresses-for-the-authenticated-user")
    @Paged(Email[].class)
    Stream<Email> listPublicEmailAddressesForAuthenticatedUser();

    @GET
    @Path("/users/{username}/keys")
    @Docs("https://developer.github.com/v3/users/keys/#list-public-keys-for-a-user")
    @EnabledForGithubApps
    @Paged(KeySimple[].class)
    Stream<KeySimple> listPublicKeysForUser(final ListPublicKeysForUser listPublicKeysForUser);

    @GET
    @Path("/users/{username}/keys")
    @Docs("https://developer.github.com/v3/users/keys/#list-public-keys-for-a-user")
    @EnabledForGithubApps
    @Paged(KeySimple[].class)
    Stream<KeySimple> listPublicKeysForUser(@PathParam("username") final String username);

    @GET
    @Path("/user/keys")
    @Docs("https://developer.github.com/v3/users/keys/#list-public-ssh-keys-for-the-authenticated-user")
    @Paged(Key[].class)
    Stream<Key> listPublicSSHKeysForAuthenticatedUser();

    @GET
    @Path("/users")
    @Docs("https://developer.github.com/v3/users/#list-users")
    @EnabledForGithubApps
    @Paged(SimpleUser[].class)
    Stream<SimpleUser> listUsers(final ListUsers listUsers);

    @GET
    @Path("/user/blocks")
    @Docs("https://developer.github.com/v3/users/blocking/#list-users-blocked-by-the-authenticated-user")
    Stream<SimpleUser> listUsersBlockedByAuthenticatedUser();

    @PATCH
    @Path("/user/email/visibility")
    @Docs("https://developer.github.com/v3/users/emails/#set-primary-email-visibility-for-the-authenticated-user")
    Stream<Email> setPrimaryEmailVisibilityForAuthenticatedUser(final SetPrimaryEmailVisibilityForAuthenticatedUser setPrimaryEmailVisibilityForAuthenticatedUser);

    @DELETE
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#unblock-a-user")
    void unblockUser(final UnblockUser unblockUser);

    @DELETE
    @Path("/user/blocks/{username}")
    @Docs("https://developer.github.com/v3/users/blocking/#unblock-a-user")
    void unblockUser(@PathParam("username") final String username);

    @DELETE
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#unfollow-a-user")
    void unfollowUser(final UnfollowUser unfollowUser);

    @DELETE
    @Path("/user/following/{username}")
    @Docs("https://developer.github.com/v3/users/followers/#unfollow-a-user")
    void unfollowUser(@PathParam("username") final String username);

    @PATCH
    @Path("/user")
    @Docs("https://developer.github.com/v3/users/#update-the-authenticated-user")
    PrivateUser updateAuthenticatedUser(final UpdateAuthenticatedUser updateAuthenticatedUser);
}
