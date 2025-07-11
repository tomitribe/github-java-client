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
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.InstantAdapter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("BaseEntity")
@SuperBuilder
public class BaseEntity {

    @JsonbTypeAdapter(InstantAdapter.class)
    private Instant createdAt;

    private String id;

    @JsonbProperty("createdAt")
    public Instant getCreatedAt() {
        return this.createdAt;
    }

    @JsonbProperty("id")
    public String getId() {
        return this.id;
    }

    @JsonbProperty("createdAt")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonbProperty("id")
    public void setId(String id) {
        this.id = id;
    }
}
