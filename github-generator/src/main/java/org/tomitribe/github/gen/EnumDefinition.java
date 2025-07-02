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

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseProblemException;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import lombok.Data;
import org.tomitribe.util.IO;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class EnumDefinition {
    private final CompilationUnit unit;
    private final com.github.javaparser.ast.body.EnumDeclaration clazz;
    private final JavaParser javaParser = new JavaParser();

    public EnumDefinition(final CompilationUnit unit, final EnumDeclaration clazz) {
        this.clazz = clazz;
        this.unit = unit;
        clazz.getEntries().clear();
    }

    public void addImport(final Class<?> clazz) {
        addImport(clazz.getName());
    }

    public void addImport(final String className) {
        final boolean exists = unit.getImports().stream()
                .map(ImportDeclaration::getNameAsString)
                .anyMatch(s -> s.equals(className));

        if (!exists) {
            unit.addImport(className);
        }
    }

    public static <T> T get(final ParseResult<T> result) {
        if (!result.isSuccessful()) throw new ParseProblemException(result.getProblems());
        return result.getResult().get();
    }

    public static EnumDefinition parse(final File file) {
        try {
            return parse(IO.slurp(file));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public static EnumDefinition parse(final String source) {
        final JavaParser javaParser = new JavaParser();
        final CompilationUnit unit = get(javaParser.parse(source));
        final com.github.javaparser.ast.body.EnumDeclaration enumConstantDeclaration = (com.github.javaparser.ast.body.EnumDeclaration) unit.getChildNodes().stream()
                .filter(node -> node instanceof com.github.javaparser.ast.body.EnumDeclaration)
                .findFirst().orElse(null);
        return new EnumDefinition(unit, enumConstantDeclaration);
    }

    public EnumDefinition clean() {

        { // Remove duplicates and sort
            final List<ImportDeclaration> imports = unit.getImports().stream()
                    .distinct()
                    .sorted(Comparator.comparing(ImportDeclaration::getNameAsString))
                    .collect(Collectors.toList());

            unit.setImports(new NodeList<>(imports));
        }

        return this;
    }

    public void addEntry(final EnumConstantDeclaration constantDeclaration) {
        this.clazz.addEntry(constantDeclaration);
    }


    public String toString() {
        return unit.toString();
    }

}
