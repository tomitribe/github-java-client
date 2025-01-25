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


import org.tomitribe.util.Files;

import java.io.File;

public interface Java extends Dir {

    default Package packageName(final String name) {
        final File file = file(name.replace(".", "/"));
        Files.mkdirs(file);
        return org.tomitribe.util.dir.Dir.of(Package.class, file);
    }

    default Package client() {
        return packageName("org/tomitribe/github/client");
    }

    default Package model() {
        return packageName("org/tomitribe/github/model");
    }

    default Package core() {
        return packageName("org/tomitribe/github/core");
    }
}
