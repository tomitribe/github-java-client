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
import lombok.NoArgsConstructor;
import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Used by:
 * - PageBuildEvent
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Build {

    @JsonbProperty("commit")
    private String commit;

    @JsonbProperty("created_at")
    private String createdAt;

    @JsonbProperty("duration")
    private Long duration;

    @JsonbProperty("error")
    private Error error;

    @JsonbProperty("pusher")
    private Pusher pusher;

    @JsonbProperty("status")
    private String status;

    @JsonbProperty("updated_at")
    private String updatedAt;

    @JsonbProperty("url")
    private String url;
}
