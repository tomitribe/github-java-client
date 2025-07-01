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
package org.tomitribe.github.gen.code.source;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HEAD;
import jakarta.ws.rs.OPTIONS;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.tomitribe.github.core.DeprecationDate;
import org.tomitribe.github.core.Docs;
import org.tomitribe.github.core.EnabledForGithubApps;
import org.tomitribe.github.core.GithubCloudOnly;
import org.tomitribe.github.core.Paged;
import org.tomitribe.github.core.Preview;
import org.tomitribe.github.core.RemovalDate;
import org.tomitribe.github.gen.ClassDefinition;
import org.tomitribe.github.gen.Package;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.endpoint.Endpoint;
import org.tomitribe.github.gen.code.endpoint.EndpointMethod;
import org.tomitribe.github.gen.code.model.ArrayClazz;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.Field;
import org.tomitribe.github.gen.code.model.Name;
import org.tomitribe.github.gen.code.model.VoidClazz;
import org.tomitribe.util.IO;
import org.tomitribe.util.Strings;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.tomitribe.github.gen.EndpointGenerator.getPagedItem;

public class EndpointRenderer {

    private final Project project;
    private final String packageName;
    private final ClazzRenderer clazzRenderer;
    private final Template template;

    public EndpointRenderer(final Project project, final String clientPackage, final String modelPackage) {
        this.project = project;
        this.packageName = clientPackage;
        this.clazzRenderer = new ClazzRenderer(project, modelPackage);
        this.template = Template.builder()
                .templateName("Endpoint")
                .packageName(packageName)
                .build();

    }

    public void render(final Clazz clazz) {
        clazzRenderer.render(clazz);
    }

    public void render(final Endpoint endpoint) {
        final String simpleClassName = endpoint.getClassName();
        final Package aPackage = project.src().main().java().packageName(packageName);

        final ClassDefinition definition = template.define(simpleClassName);

        endpoint.getMethods()
                .stream()
                .flatMap(this::imports)
                .sorted()
                .distinct()
                .filter(s -> !"void".equals(s))
                .forEach(definition::addImport);

        endpoint.getMethods().sort(Comparator.comparing(EndpointMethod::getMethod));
        endpoint.getMethods().sort(Comparator.comparing(EndpointMethod::getPath));

        for (final EndpointMethod method : endpoint.getMethods()) {
            final MethodDeclaration methodDeclaration = new MethodDeclaration();
            methodDeclaration.setName(method.getJavaMethod());

            if (method.getRequest() instanceof VoidClazz) {
                // skip setting any parameters
            } else {
                methodDeclaration.addParameter(param(
                        method.getRequest().getName().getSimpleName(),
                        Strings.lcfirst(method.getRequest().getName().getSimpleName())));
            }

            if (method.getResponse().isPaged()) {
                if (method.getResponse() instanceof ArrayClazz) {
                    final ArrayClazz arrayClazz = (ArrayClazz) method.getResponse();
                    methodDeclaration.setType(String.format("Stream<%s>", arrayClazz.getOf().getName().getSimpleName()));
                } else {
                    final Field pagedItem = getPagedItem(method.getResponse());
                    methodDeclaration.setType(String.format("Stream<%s>", pagedItem.getType().getSimpleName()));
                }
            } else if (isArrayOfArray(method)) {
                final Name arrayType = getImport(method.getResponse());
                methodDeclaration.setType(String.format("%s[][]", asRequiredType(arrayType)));
            } else if (isArray(method)) {
                final ArrayClazz arrayClazz = (ArrayClazz) method.getResponse();
                methodDeclaration.setType(String.format("Stream<%s>", arrayClazz.getOf().getName().getSimpleName()));
            } else {
                methodDeclaration.setType(asRequiredType(method.getResponse().getName()));
            }

            final Annotations annotations = new Annotations(methodDeclaration, definition);

            // Add @GET, @PUT, @POST
            annotations.add(getMethodAnnotation(method.getMethod()));
            annotations.add(Path.class, method.getPath());

            if (method.getDocs() != null) {
                annotations.add(Docs.class, method.getDocs());
            }

            if (method.getRemovalDate() != null) {
                annotations.add(RemovalDate.class, method.getRemovalDate());
            }

            if (method.getDeprecationDate() != null) {
                annotations.add(DeprecationDate.class, method.getDeprecationDate());
            }

            if (method.isGithubCloudOnly()) {
                annotations.add(GithubCloudOnly.class);
            }

            if (method.isEnabledForGitHubApps()) {
                annotations.add(EnabledForGithubApps.class);
            }

            for (final String preview : method.getPreviews()) {
                annotations.addRepeatable(Preview.class, preview);
            }

            if (method.getResponse().isPaged()) {
                if (method.getResponse() instanceof ArrayClazz) {
                    final ArrayClazz arrayClazz = (ArrayClazz) method.getResponse();
                    annotations.add(Paged.class, "(%s[].class)", arrayClazz.getOf().getName().getSimpleName());
                } else {
                    annotations.add(Paged.class, method.getResponse().getName());
                }
            }

            methodDeclaration.setBody(new com.github.javaparser.ast.stmt.BlockStmt()
                    .addStatement("throw new UnsupportedOperationException();"));
            methodDeclaration.setDefault(true);
//            methodDeclaration.setBody(null);
            definition.getClazz().addMember(methodDeclaration);

            /*
             * Some people may not like the all-in-one request object style
             * of methods and may prefer individual parameters.
             * Let's generate an overloaded version of the method that has
             * each path parameter individually.
             */
            if (canOverload(method)) {
                final MethodDeclaration overloaded = new MethodDeclaration();
                overloaded.setType(methodDeclaration.getType());
                overloaded.setAnnotations(methodDeclaration.getAnnotations());
                overloaded.setName(methodDeclaration.getName());
                overloaded.setBody(new com.github.javaparser.ast.stmt.BlockStmt()
                        .addStatement("throw new UnsupportedOperationException();"));
                overloaded.setDefault(true);

                method.getRequest().getFields().stream()
                        .filter(field -> field.getIn().equals(Field.In.PATH))
                        .peek(field -> definition.addImport(field.getName()))
                        .map(this::asParameter)
                        .forEach(overloaded::addParameter);

                definition.getClazz().addMember(overloaded);
            }
        }

        aPackage.write(simpleClassName + ".java", definition.clean().toString());
    }

    private Class<?> getMethodAnnotation(final String method) {
        switch (method.toUpperCase()) {
            case "PUT":
                return PUT.class;
            case "POST":
                return POST.class;
            case "GET":
                return GET.class;
            case "OPTIONS":
                return OPTIONS.class;
            case "DELETE":
                return DELETE.class;
            case "HEAD":
                return HEAD.class;
            case "PATCH":
                return PATCH.class;
            default:
                throw new UnsupportedOperationException("Unknown http method: " + method.toUpperCase());
        }
    }

    private Parameter asParameter(final Field field) {

        if (field.getIn().equals(Field.In.PATH)) {

            final Parameter parameter = new Parameter();
            parameter.addAnnotation(ann(PathParam.class, field.getJsonName()));
            parameter.setModifiers(Modifier.Keyword.FINAL);
            parameter.setType(asRequiredType(field.getType()));
            parameter.setName(field.getName());
            return parameter;

        }

        if (field.getIn().equals(Field.In.QUERY)) {

            final Parameter parameter = new Parameter();
            parameter.addAnnotation(ann(QueryParam.class, field.getJsonName()));
            parameter.setModifiers(Modifier.Keyword.FINAL);
            parameter.setType(field.getType().getSimpleName());
            parameter.setName(field.getName());
            return parameter;

        }

        throw new UnsupportedOperationException("Unsupported parameter type: " + field.getIn());
    }

    /**
     * When a method returns json "integer" we should not
     * return Integer but int.  Similarly, when a method
     * parameter takes json "integer" and that parameter
     * is a path parameter or other non-optional value,
     * we should also use the "int" version so users are
     * forced to supply values.
     */
    private String asRequiredType(final Name type) {
        if (Name.BOOLEAN.equals(type)) return "boolean";
        if (Name.INTEGER.equals(type)) return "int";
        if (Name.LONG.equals(type)) return "long";
        return type.getSimpleName();
    }

    private static SingleMemberAnnotationExpr ann(final Class<?> annotationType, final String value) {
        return new SingleMemberAnnotationExpr(
                new com.github.javaparser.ast.expr.Name(annotationType.getSimpleName()),
                new StringLiteralExpr(value));
    }

    private boolean canOverload(final EndpointMethod method) {
        int parameter = 0;
        final List<Field> fields = method.getRequest().getFields();
        for (final Field field : fields) {
            if (field.getIn().equals(Field.In.BODY)) return false;
            if (field.getIn().equals(Field.In.PATH)) parameter++;
        }
        return parameter > 0;
    }

    private boolean isArray(final EndpointMethod method) {
        return method.getResponse() instanceof ArrayClazz;
    }

    private boolean isArrayOfArray(final EndpointMethod method) {
        final Clazz clazz = method.getResponse();
        if (clazz instanceof ArrayClazz) {
            final ArrayClazz arrayClazz = (ArrayClazz) clazz;
            return arrayClazz.getOf() instanceof ArrayClazz;
        }
        return false;
    }

    public static class Imports {
        final List<String> imports = new ArrayList<>();

        public void add(final Class<?> clazz) {
            imports.add(clazz.getName());
        }

        public void add(final String className) {
            imports.add(className);
        }

        public void add(final Name className) {
            try {
                imports.add(className.toString());
            } catch (Exception e) {
                throw new IllegalStateException(String.format("Cannot add import for name: %s", className), e);
            }
        }

        private Stream<String> stream() {
            return imports.stream();
        }
    }

    private Stream<String> imports(final EndpointMethod method) {
        final Imports imports = new Imports();

        if (isArray(method)) {
            imports.add(Stream.class);
        }

        method.getRequest().getFields().stream()
                .filter(field -> field.getIn().equals(Field.In.PATH))
                .findAny()
                .ifPresent(field -> {
                    imports.add(PathParam.class);
                });

        method.getRequest().getFields().stream()
                .filter(field -> field.getIn().equals(Field.In.QUERY))
                .findAny()
                .ifPresent(field -> {
                    imports.add(QueryParam.class);
                });

        if (method.getResponse().isPaged()) {
            if (method.getResponse() instanceof ArrayClazz) {
                final ArrayClazz arrayClazz = (ArrayClazz) method.getResponse();
                imports.add(arrayClazz.getOf().getName());
            } else {
                imports.add(method.getResponse().getName());
                imports.add(getPagedItem(method.getResponse()).getType());
            }
        }

        if ("GET".equalsIgnoreCase(method.getMethod())) imports.add(GET.class);
        if ("POST".equalsIgnoreCase(method.getMethod())) imports.add(POST.class);
        if ("PUT".equalsIgnoreCase(method.getMethod())) imports.add(PUT.class);
        if ("DELETE".equalsIgnoreCase(method.getMethod())) imports.add(DELETE.class);
        if ("OPTIONS".equalsIgnoreCase(method.getMethod())) imports.add(OPTIONS.class);
        if ("PATCH".equalsIgnoreCase(method.getMethod())) imports.add(PATCH.class);
        if ("HEAD".equalsIgnoreCase(method.getMethod())) imports.add(HEAD.class);

        imports.add(Path.class);

        final List<Clazz> clazzes = Arrays.asList(method.getRequest(), method.getResponse());
        for (final Clazz clazz : clazzes) {
            if (clazz == null) continue;
            imports.add(getImport(clazz));
        }

        return imports.stream().filter(Objects::nonNull);
    }

    private Name getImport(final Clazz clazz) {
        if (clazz == null) return new Name(null, null);
        if (clazz instanceof VoidClazz) return new Name(null, null);
        if (clazz instanceof ArrayClazz) {
            final ArrayClazz arrayClazz = (ArrayClazz) clazz;
            return getImport(arrayClazz.getOf());
        }

        return clazz.getName();
    }

    public static class Annotations {
        private final MethodDeclaration methodDeclaration;
        private final ClassDefinition definition;

        public Annotations(final MethodDeclaration methodDeclaration, final ClassDefinition definition) {
            this.methodDeclaration = methodDeclaration;
            this.definition = definition;
        }

        private Annotations add(final Class<? extends Annotation> annotationClass, final String format, final Object... details) {
            definition.addImport(annotationClass);
            final String annotation = String.format(format, details);
            definition.addAnnotation(methodDeclaration, "@" + annotationClass.getSimpleName() + annotation);
            return this;
        }

        public Annotations add(final Class<? extends Annotation> annotation, final String value) {
            definition.addImport(annotation);
            return add(annotation, "(\"%s\")", value);
        }

        public Annotations add(final Class<? extends Annotation> annotation, final Name value) {
            return add(annotation, "(%s.class)", value.getSimpleName());
        }

        public Annotations add(final Class<?> annotation) {
            definition.addImport(annotation);
            definition.addAnnotation(methodDeclaration, "@" + annotation.getSimpleName());
            return this;
        }

        private Annotations addRepeatable(final String format, final Object... details) {
            final String annotation = String.format(format, details);
            definition.addRepeatableAnnotation(methodDeclaration, annotation);
            return this;
        }

        public Annotations addRepeatable(final Class<?> annotation, final String value) {
            definition.addImport(annotation);
            return addRepeatable("@%s(\"%s\")", annotation.getSimpleName(), value);
        }

        public Annotations addRepeatable(final Class<?> annotation) {
            definition.addImport(annotation);
            return addRepeatable("@%s", annotation.getSimpleName());
        }

    }

    private Parameter param(final String type, final String name) {
        final Parameter parameter = new Parameter();
        parameter.setType(type);
        parameter.setName(name);
        parameter.setModifiers(new NodeList<>(Modifier.finalModifier()));
        return parameter;
    }

}
