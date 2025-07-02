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
import org.tomitribe.github.gen.code.source.ClazzRenderer;
import org.tomitribe.github.gen.code.source.EnumClazzRenderer;
import org.tomitribe.util.Files;
import org.tomitribe.util.dir.Dir;

import java.io.File;
import java.io.IOException;

public class EnumClazzRendererTest {

    private final Dir resources = org.tomitribe.github.core.Resources.resources(EnumClazzRendererTest.class);

    @Test
    public void simple() throws IOException {

        final EnumClazz clazz = EnumClazz.of("Sort", "asc", "desc");

        final File tmpdir = Files.tmpdir();
        final Project actual = Project.from(tmpdir);
        final EnumClazzRenderer renderer = new EnumClazzRenderer(actual, "org.tomitribe.github.model");
        renderer.render(clazz);

        final Project expected = Project.from(resources.file("simple"));

        ProjectAsserts.assertProject(expected, actual);
    }

}
