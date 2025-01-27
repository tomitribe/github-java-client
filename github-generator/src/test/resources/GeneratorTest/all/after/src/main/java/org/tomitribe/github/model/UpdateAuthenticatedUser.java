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
package org.tomitribe.github.model;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAuthenticatedUser {

    private String bio;

    private String blog;

    private String company;

    private String email;

    private Boolean hireable;

    private String location;

    private String name;

    private String twitterUsername;

    @JsonbProperty("bio")
    public String getBio() {
        return this.bio;
    }

    @JsonbProperty("blog")
    public String getBlog() {
        return this.blog;
    }

    @JsonbProperty("company")
    public String getCompany() {
        return this.company;
    }

    @JsonbProperty("email")
    public String getEmail() {
        return this.email;
    }

    @JsonbProperty("hireable")
    public Boolean getHireable() {
        return this.hireable;
    }

    @JsonbProperty("location")
    public String getLocation() {
        return this.location;
    }

    @JsonbProperty("name")
    public String getName() {
        return this.name;
    }

    @JsonbProperty("twitter_username")
    public String getTwitterUsername() {
        return this.twitterUsername;
    }

    @JsonbProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonbProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    @JsonbProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    @JsonbProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonbProperty("hireable")
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    @JsonbProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }
}
