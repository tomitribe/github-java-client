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
import java.net.URI;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.EnumAdapter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ComponentId("page")
public class Page {

    private String cname;

    private Boolean custom404;

    private URI htmlUrl;

    private PagesSourceHash source;

    @JsonbTypeAdapter(StatusAdapter.class)
    private Status status;

    private URI url;

    @JsonbProperty("cname")
    public String getCname() {
        return this.cname;
    }

    @JsonbProperty("custom_404")
    public Boolean getCustom404() {
        return this.custom404;
    }

    @JsonbProperty("html_url")
    public URI getHtmlUrl() {
        return this.htmlUrl;
    }

    @JsonbProperty("source")
    public PagesSourceHash getSource() {
        return this.source;
    }

    @JsonbTypeAdapter(StatusAdapter.class)
    @JsonbProperty("status")
    public Status getStatus() {
        return this.status;
    }

    @JsonbProperty("url")
    public URI getUrl() {
        return this.url;
    }

    @JsonbProperty("cname")
    public void setCname(String cname) {
        this.cname = cname;
    }

    @JsonbProperty("custom_404")
    public void setCustom404(Boolean custom404) {
        this.custom404 = custom404;
    }

    @JsonbProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonbProperty("source")
    public void setSource(PagesSourceHash source) {
        this.source = source;
    }

    @JsonbProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonbProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    public enum Status {

        BUILT("built"), BUILDING("building"), ERRORED("errored");

        private final String name;

        Status(final String name) {
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

    public static class StatusAdapter extends EnumAdapter<Status> {

        public StatusAdapter() {
            super(Status.class);
        }
    }
}
