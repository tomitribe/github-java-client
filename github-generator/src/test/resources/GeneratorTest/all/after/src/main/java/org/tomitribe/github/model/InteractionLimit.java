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
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("interaction-limit")
public class InteractionLimit {

    @JsonbTypeAdapter(DateAdapter.class)
    private Date expiresAt;

    @JsonbTypeAdapter(LimitAdapter.class)
    private Limit limit;

    private String origin;

    @JsonbTypeAdapter(DateAdapter.class)
    @JsonbProperty("expires_at")
    public Date getExpiresAt() {
        return this.expiresAt;
    }

    @JsonbTypeAdapter(LimitAdapter.class)
    @JsonbProperty("limit")
    public Limit getLimit() {
        return this.limit;
    }

    @JsonbProperty("origin")
    public String getOrigin() {
        return this.origin;
    }

    @JsonbProperty("expires_at")
    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    @JsonbProperty("limit")
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    @JsonbProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public enum Limit {

        EXISTING_USERS("existing_users"), CONTRIBUTORS_ONLY("contributors_only"), COLLABORATORS_ONLY("collaborators_only");

        private final String name;

        Limit(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class LimitAdapter extends EnumAdapter<Limit> {

        public LimitAdapter() {
            super(Limit.class);
        }
    }
}
