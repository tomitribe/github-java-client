/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tomitribe.github.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import jakarta.json.bind.annotation.JsonbProperty;

/**
 * <p>Triggered when a private repository is made <a href="/v3/repos/#edit">public</a>.  Without a
 * doubt: the best GitHub event.</p>
 * Used by:
 * -
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@GithubEvent("public")
@EqualsAndHashCode(callSuper = true)
public class PublicEvent extends Event {

    @JsonbProperty("repository")
    private Repository repository;

    @JsonbProperty("sender")
    private Sender sender;
}
