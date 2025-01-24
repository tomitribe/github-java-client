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
import org.tomitribe.github.core.EnumAdapter;

import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListPullRequests {

    public enum State {

        open,
        closed,
        all
    }

    public enum Sort {

        created("created"),
        updated("updated"),
        popularity("popularity"),
        long_running("long-running");

        private final String name;

        Sort(final String name) {
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

    public enum Direction {

        asc,
        desc
    }

    @QueryParam("base")
    private String base;

    @QueryParam("direction")
    private Direction direction;

    @QueryParam("head")
    private String head;

    @PathParam("owner")
    private String owner;

    @PathParam("repo")
    private String repo;

    @JsonbTypeAdapter(SortAdapter.class)
    @QueryParam("sort")
    private Sort sort;

    @QueryParam("state")
    private State state;

    public static class SortAdapter extends EnumAdapter<Sort> {
        public SortAdapter() {
            super(Sort.class);
        }
    }
}
