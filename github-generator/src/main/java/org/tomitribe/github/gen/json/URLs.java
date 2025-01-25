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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tomitribe.github.gen.json;



import org.tomitribe.util.JarLocation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


/**
 * @version $Rev$ $Date$
 */
public final class URLs {
    public static File asFile(final URL url) {
        return toFile(url);
    }

    public static URI uri(final String uri) {
        if (!uri.startsWith("file") && !uri.startsWith("jar") && !uri.isEmpty()) {
            final File f = new File(uri);
            if (f.exists()) {
                return f.toURI();
            }
        }
        return URI.create(uri.replace(" ", "%20").replace("#", "%23"));
    }

    private URLs() {
    }

    public static File toFile(final URL url) {
        if ("jar".equals(url.getProtocol())) {
            try {
                final String spec = url.getFile();

                int separator = spec.indexOf('!');
                /*
                 * REMIND: we don't handle nested JAR URLs
                 */
                if (separator == -1) {
                    throw new MalformedURLException("no ! found in jar url spec:" + spec);
                }

                return toFile(new URL(spec.substring(0, separator++)));
            } catch (final MalformedURLException e) {
                throw new IllegalStateException(e);
            }
        } else if ("file".equals(url.getProtocol())) {
            String path = JarLocation.decode(url.getFile());
            if (path.endsWith("!")) {
                path = path.substring(0, path.length() - 1);
            }
            return new File(path);
        } else {
            throw new IllegalArgumentException("Unsupported URL scheme: " + url.toExternalForm());
        }
    }
}