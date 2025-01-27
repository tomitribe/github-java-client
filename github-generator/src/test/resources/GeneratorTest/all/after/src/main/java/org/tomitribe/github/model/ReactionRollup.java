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
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("reaction-rollup")
public class ReactionRollup {

    private Integer confused;

    private Integer eyes;

    private Integer heart;

    private Integer hooray;

    private Integer laugh;

    private Integer negativeOne;

    private Integer positiveOne;

    private Integer rocket;

    private Integer totalCount;

    private URI url;

    @JsonbProperty("confused")
    public Integer getConfused() {
        return this.confused;
    }

    @JsonbProperty("eyes")
    public Integer getEyes() {
        return this.eyes;
    }

    @JsonbProperty("heart")
    public Integer getHeart() {
        return this.heart;
    }

    @JsonbProperty("hooray")
    public Integer getHooray() {
        return this.hooray;
    }

    @JsonbProperty("laugh")
    public Integer getLaugh() {
        return this.laugh;
    }

    @JsonbProperty("-1")
    public Integer getNegativeOne() {
        return this.negativeOne;
    }

    @JsonbProperty("+1")
    public Integer getPositiveOne() {
        return this.positiveOne;
    }

    @JsonbProperty("rocket")
    public Integer getRocket() {
        return this.rocket;
    }

    @JsonbProperty("total_count")
    public Integer getTotalCount() {
        return this.totalCount;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("confused")
    public void setConfused(Integer confused) {
        this.confused = confused;
    }

    @JsonbProperty("eyes")
    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    @JsonbProperty("heart")
    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    @JsonbProperty("hooray")
    public void setHooray(Integer hooray) {
        this.hooray = hooray;
    }

    @JsonbProperty("laugh")
    public void setLaugh(Integer laugh) {
        this.laugh = laugh;
    }

    @JsonbProperty("-1")
    public void setNegativeOne(Integer negativeOne) {
        this.negativeOne = negativeOne;
    }

    @JsonbProperty("+1")
    public void setPositiveOne(Integer positiveOne) {
        this.positiveOne = positiveOne;
    }

    @JsonbProperty("rocket")
    public void setRocket(Integer rocket) {
        this.rocket = rocket;
    }

    @JsonbProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }
}
