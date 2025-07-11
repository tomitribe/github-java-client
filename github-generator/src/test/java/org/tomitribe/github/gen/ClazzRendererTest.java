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
package org.tomitribe.github.gen;

import org.junit.Test;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.EnumClazz;
import org.tomitribe.github.gen.code.model.Field;
import org.tomitribe.github.gen.code.source.ClazzRenderer;
import org.tomitribe.util.Files;
import org.tomitribe.util.dir.Dir;

import java.io.File;
import java.io.IOException;

import static org.tomitribe.github.gen.code.model.Field.In.PATH;
import static org.tomitribe.github.gen.code.model.Field.In.QUERY;
import static org.tomitribe.github.gen.code.model.Name.INTEGER;
import static org.tomitribe.github.gen.code.model.Name.STRING;
import static org.tomitribe.github.gen.code.model.Name.name;

public class ClazzRendererTest {

    private final Dir resources = org.tomitribe.github.core.Resources.resources(ClazzRendererTest.class);

    @Test
    public void simple() throws IOException {

        final Clazz clazz = Clazz.builder()
                .name("PullRequest")
                .componentId("#/components/schemas/pull-request-minimal")
                .componentId("#/components/schemas/pull-request")
                .field(Field.field("repository_url", STRING).build())
                .field(Field.field("pull_request_url", STRING).build())
                .field(Field.field("pull_request_number", INTEGER).build())
                .field(Field.field("labels", STRING).collection(true).build())
                .field(Field.field("owner", STRING).in(PATH).build())
                .field(Field.field("repo", STRING).in(PATH).build())
                .field(Field.field("state", name("State")).in(QUERY).build())
                .build();

        final File tmpdir = Files.tmpdir();
        final Project actual = Project.from(tmpdir);
        final ClazzRenderer renderer = new ClazzRenderer(actual, "org.tomitribe.github.model");
        renderer.render(clazz);

        final Project expected = Project.from(resources.file("simple"));

        ProjectAsserts.assertProject(expected, actual);
    }

    @Test
    public void enums() throws Exception {
        final Clazz clazz = Clazz.builder()
                .name("PullRequest")
                .componentId("#/components/schemas/pull-request-minimal")
                .componentId("#/components/schemas/pull-request")
                .field(Field.field("repository_url", STRING).build())
                .field(Field.field("pull_request_url", STRING).build())
                .field(Field.field("pull_request_number", INTEGER).build())
                .field(Field.field("labels", STRING).collection(true).build())
                .field(Field.field("owner", STRING).in(PATH).build())
                .field(Field.field("repo", STRING).in(PATH).build())
                .field(Field.field("state", name("State")).in(QUERY).build())
                .innerClass(EnumClazz.of("State", "created", "updated", "popularity", "long-running"))
                .build();

        final File tmpdir = Files.tmpdir();
        final Project actual = Project.from(tmpdir);
        final ClazzRenderer renderer = new ClazzRenderer(actual, "org.tomitribe.github.model");
        renderer.render(clazz);

        final Project expected = Project.from(resources.file("innerEnums"));

        ProjectAsserts.assertProject(expected, actual);
    }

}
