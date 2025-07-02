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
import com.github.javaparser.ast.body.EnumConstantDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.FieldAccessExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.expr.ThisExpr;
import com.github.javaparser.ast.nodeTypes.NodeWithSimpleName;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.ExpressionStmt;
import com.github.javaparser.ast.stmt.ReturnStmt;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.json.bind.annotation.JsonbTypeAdapter;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.EqualsAndHashCode;
import org.tomitribe.github.core.ComponentId;
import org.tomitribe.github.core.DateAdapter;
import org.tomitribe.github.core.EnumAdapter;
import org.tomitribe.github.core.InstantAdapter;
import org.tomitribe.github.core.StringBooleanAdapter;
import org.tomitribe.github.gen.ClassDefinition;
import org.tomitribe.github.gen.Package;
import org.tomitribe.github.gen.Project;
import org.tomitribe.github.gen.code.model.Clazz;
import org.tomitribe.github.gen.code.model.EnumClazz;
import org.tomitribe.github.gen.code.model.Field;
import org.tomitribe.github.gen.code.model.Name;
import org.tomitribe.util.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.tomitribe.github.gen.code.model.Name.BOOLEAN;
import static org.tomitribe.github.gen.code.model.Name.DATE;
import static org.tomitribe.github.gen.code.model.Name.INSTANT;
import static org.tomitribe.github.gen.code.model.Name.OBJECT;
import static org.tomitribe.github.gen.code.model.Name.STRING_BOOLEAN;

public class ClazzRenderer {

    static final Logger LOGGER = Logger.getLogger(ClazzRenderer.class.getSimpleName());

    private final Project project;
    private final String packageName;
    private final Template template;

    public ClazzRenderer(final Project project, final String packageName) {
        this.project = project;
        this.packageName = packageName;
        this.template = Template.builder()
                .templateName("Model")
                .packageName(packageName)
                .build();
    }

    public void render(final Clazz clazz) {
        if (clazz.getName() == null) {
            LOGGER.warning("Class has no name: " + clazz);
            return;
        }
        final String className = clazz.getName().getSimpleName();
        final Package aPackage = project.src().main().java().packageName(packageName);

        LOGGER.info(String.format("Generating class '%s'", clazz.getName()));

        final ClassDefinition definition = template.parseClass(className);

        imports(clazz)
                .sorted()
                .distinct()
                .forEach(definition::addImport);

        clazz.getComponentIds().stream()
                .sorted()
                .distinct()
                .forEach(definition::addComponentId);

        if (clazz.getParent() != null) {
            final Name name = clazz.getParent().getName();
            definition.addParent(name.toString());
            definition.addAnnotation(definition.getClazz(), "@EqualsAndHashCode(callSuper = false)");
            definition.addImport(EqualsAndHashCode.class);
        }

        if (clazz.getParent() != null || clazz.hasChildren()) {
            updateToSuperBuilder(definition);
        }

        // Add any enums or inner classes
        addInnerClasses(clazz, definition);

        addFields(clazz, definition);
        addAccessors(clazz, definition);

        aPackage.write(className + ".java", definition.clean().toString());
    }

    public void addFields(final Clazz clazz, final ClassDefinition definition) {
        final List<String> enums = definition.selectEnums()
                .map(NodeWithSimpleName::getNameAsString)
                .collect(Collectors.toList());

        final Map<String, FieldDeclaration> fields = definition.mapFields();
        for (final Field field : clazz.getFields()) {
            final FieldDeclaration fieldDeclaration;
            final Name type = field.getType().equals(STRING_BOOLEAN) ? BOOLEAN : field.getType();

            if (fields.containsKey(field.getName())) {
                fieldDeclaration = fields.get(field.getName());
            } else {
                fieldDeclaration = definition.getClazz().addField(type.getSimpleName(), field.getName(), Modifier.Keyword.PRIVATE);
            }

            final VariableDeclarator variable = fieldDeclaration.getVariable(0);
            if (field.isCollection()) {

                variable.setType(String.format("List<%s>", type.getSimpleName()));

            } else if (field.isMap()) {

                variable.setType(String.format("Map<String, %s>", type.getSimpleName()));

            } else {
                if (OBJECT.equals(type)) {
                    /*
                     * If Clazz says the type is Object and the source already has a type,
                     * just use what ever type the source has and do not override it
                     */
                    if (variable.getType() == null) {
                        variable.setType(type.getSimpleName());
                    }
                } else {
                    variable.setType(type.getSimpleName());
                }
            }

            switch (field.getIn()) {
                case BODY: {
//                    definition.addAnnotation(fieldDeclaration, String.format("@JsonbProperty(\"%s\")", field.getJsonName()));
                    break;
                }
                case PATH: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@PathParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(PathParam.class);
                    break;
                }
                case QUERY: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@QueryParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(QueryParam.class);
                    break;
                }
                case HEADER: {
                    definition.addAnnotation(fieldDeclaration, "@JsonbTransient");
                    definition.addAnnotation(fieldDeclaration, String.format("@HeaderParam(\"%s\")", field.getJsonName()));
                    definition.addImport(JsonbTransient.class);
                    definition.addImport(HeaderParam.class);
                    break;
                }
                default:
                    throw new UnsupportedOperationException(field.getIn().name());
            }

            /*
             * TODO: Does not work for Enums declared externally
             */
            if (enums.contains(type.getSimpleName())) {
                definition.addAnnotation(fieldDeclaration, String.format("@JsonbTypeAdapter(%sAdapter.class)", type));
                definition.addImport(JsonbTypeAdapter.class);
            }

            if (DATE.equals(type)) {
                addAdapter(definition, fieldDeclaration, DateAdapter.class);
            }

            if (INSTANT.equals(type)) {
                addAdapter(definition, fieldDeclaration, InstantAdapter.class);
            }

            if (field.getType().equals(STRING_BOOLEAN)) {
                addAdapter(definition, fieldDeclaration, StringBooleanAdapter.class);
            }
        }
    }

    private static void addAdapter(final ClassDefinition definition, final FieldDeclaration fieldDeclaration, final Class<?> adapterClass) {
        definition.addAnnotation(fieldDeclaration, String.format("@JsonbTypeAdapter(%s.class)", adapterClass.getSimpleName()));
        definition.addImport(adapterClass);
        definition.addImport(JsonbTypeAdapter.class);
    }

    public void addAccessors(final Clazz clazz, final ClassDefinition definition) {
        final List<String> enums = definition.selectEnums()
                .map(NodeWithSimpleName::getNameAsString)
                .collect(Collectors.toList());

        final Map<String, MethodDeclaration> stringMethodDeclarationMap = definition.mapMethods();
        final Set<String> existingMethods = stringMethodDeclarationMap.keySet();

        final Map<String, FieldDeclaration> fields = definition.mapFields();
        for (final Field field : clazz.getFields()) {
            final String fieldName = field.getName();
            final FieldDeclaration fieldDeclaration = fields.get(fieldName);

            if (fieldDeclaration == null) {
                LOGGER.warning("Field not found for: " + fieldName);
                continue;
            }

            final String fieldType = fieldDeclaration.getVariable(0).getType().asString();
            final String getterName = "get" + Strings.ucfirst(fieldName);
            final String setterName = "set" + Strings.ucfirst(fieldName);

            final MethodDeclaration getter = new MethodDeclaration()
                    .addModifier(Modifier.Keyword.PUBLIC)
                    .setType(fieldType)
                    .setName(getterName);

            final MethodDeclaration setter = new MethodDeclaration()
                    .addModifier(Modifier.Keyword.PUBLIC)
                    .setType("void")
                    .setName(setterName);

            // Add getter if not already present
            if (!existingMethods.contains(getterName)) {

                if (enums.contains(field.getType().getSimpleName())) {
                    definition.addAnnotation(getter, String.format("@JsonbTypeAdapter(%sAdapter.class)", field.getType()));
                }

                if (DATE.equals(field.getType())) {
                    definition.addAnnotation(getter, "@JsonbTypeAdapter(DateAdapter.class)");
                }

                // Add method body: `return this.<fieldName>;`
                getter.setBody(new BlockStmt().addStatement(new ReturnStmt(new NameExpr("this." + fieldName))));

                definition.getClazz().addMember(getter);
            }

            // Add setter if not already present
            if (!existingMethods.contains(setterName)) {

                // Add parameter
                setter.addParameter(new Parameter(new ClassOrInterfaceType(null, fieldType), fieldName));

                // Add method body: `this.<fieldName> = <fieldName>;`
                setter.setBody(new BlockStmt().addStatement(
                        new ExpressionStmt(new AssignExpr(
                                new FieldAccessExpr(new ThisExpr(), fieldName),
                                new NameExpr(fieldName),
                                AssignExpr.Operator.ASSIGN
                        ))
                ));

                // Add @JsonbProperty annotation
                switch (field.getIn()) {
                    case BODY: {
                        definition.addAnnotation(getter, String.format("@JsonbProperty(\"%s\")", field.getJsonName()));
                        definition.addAnnotation(setter, String.format("@JsonbProperty(\"%s\")", field.getJsonName()));
                        break;
                    }
                    case PATH: {
                        definition.addAnnotation(getter, "@JsonbTransient");
                        definition.addAnnotation(getter, String.format("@PathParam(\"%s\")", field.getJsonName()));
                        definition.addAnnotation(setter, "@JsonbTransient");
                        definition.addAnnotation(setter, String.format("@PathParam(\"%s\")", field.getJsonName()));
                        break;
                    }
                    case QUERY: {
                        definition.addAnnotation(getter, "@JsonbTransient");
                        definition.addAnnotation(getter, String.format("@QueryParam(\"%s\")", field.getJsonName()));
                        definition.addAnnotation(setter, "@JsonbTransient");
                        definition.addAnnotation(setter, String.format("@QueryParam(\"%s\")", field.getJsonName()));
                        break;
                    }
                    case HEADER: {
                        definition.addAnnotation(getter, "@JsonbTransient");
                        definition.addAnnotation(getter, String.format("@HeaderParam(\"%s\")", field.getJsonName()));
                        definition.addAnnotation(setter, "@JsonbTransient");
                        definition.addAnnotation(setter, String.format("@HeaderParam(\"%s\")", field.getJsonName()));
                        break;
                    }
                    default:
                        throw new UnsupportedOperationException(field.getIn().name());
                }


                definition.getClazz().addMember(setter);
            }
        }
    }

    public void addInnerClasses(final Clazz clazz, final ClassDefinition definition) {
        for (final Clazz innerClass : clazz.getInnerClasses()) {
            LOGGER.info(String.format("Adding inner class '%s' to '%s'", innerClass.getName(), clazz.getName()));
            if (innerClass instanceof EnumClazz) {
                final EnumClazz enumClazz = (EnumClazz) innerClass;

                final ClassDefinition template = org.tomitribe.github.gen.code.source.Template.builder()
                        .packageName(packageName)
                        .templateName("InnerEnum")
                        .build()
                        .parseClass(enumClazz.getName().getSimpleName());

                { // Add the enum declaration
                    final Optional<EnumDeclaration> existing = definition.selectEnum(enumClazz.getName().getSimpleName());
                    final EnumDeclaration enumDeclaration = existing
                            .orElseGet(template.selectEnum(enumClazz.getName().getSimpleName())::get);

                    final Map<String, EnumConstantDeclaration> entries = enumDeclaration.getEntries().stream()
                            .collect(Collectors.toMap(EnumConstantDeclaration::getNameAsString, Function.identity()));

                    for (final String value : enumClazz.getValues()) {
                        final String constant = EnumClazz.asConstant(value);
                        if (entries.containsKey(constant)) continue;

                        // Some github enums have dashes such as "long-running"
                        // We need a version that is safe to be used as the constant

                        final EnumConstantDeclaration constantDeclaration = new EnumConstantDeclaration(constant);
                        constantDeclaration.addArgument(new StringLiteralExpr(value));
                        enumDeclaration.addEntry(constantDeclaration);
                    }

                    if (!existing.isPresent()) {
                        definition.getClazz().addMember(enumDeclaration);
                    }
                }

                { // Now add the enum adapter
                    final String name = enumClazz.getName() + "Adapter";

                    if (!definition.selectInnerClass(name).isPresent()) {
                        definition.getClazz().addMember(template.selectInnerClass(name).get().getClazz());
                    }
                }
            }
        }
    }

    public void updateToSuperBuilder(final ClassDefinition definition) {
        definition.getClazz().getAnnotations().removeIf(annotation ->
                annotation.getNameAsString().equals("Builder")
        );

        definition.getUnit().getImports().removeIf(importDecl ->
                importDecl.getNameAsString().equals("lombok.Builder")
        );

        definition.addImport(lombok.experimental.SuperBuilder.class);
        definition.addAnnotation("@SuperBuilder");
    }

    private Stream<String> imports(final Clazz clazz) {
        final List<String> imports = new ArrayList<>();

        if (clazz.getComponentIds().size() > 0) {
            imports.add(ComponentId.class.getName());
        }

        for (final Clazz innerClass : clazz.getInnerClasses()) {
            if (innerClass instanceof EnumClazz) {
                imports.add(JsonbTypeAdapter.class.getName());
                imports.add(EnumAdapter.class.getName());
            }
        }

        for (final Field field : clazz.getFields()) {
            if (field.isCollection()) {
                imports.add(List.class.getName());
            }

            if (field.isMap()) {
                imports.add(Map.class.getName());
            }

            imports.add(field.getType().toString());

            if (DATE.equals(field.getType())) {
                imports.add(DateAdapter.class.getName());
            }

            if (INSTANT.equals(field.getType())) {
                imports.add(InstantAdapter.class.getName());
            }

            switch (field.getIn()) {
                case BODY: {
                    imports.add(JsonbProperty.class.getName());
                    break;
                }
                case PATH: {
                    imports.add(JsonbTransient.class.getName());
                    imports.add(PathParam.class.getName());
                    break;
                }
                case QUERY: {
                    imports.add(JsonbTransient.class.getName());
                    imports.add(QueryParam.class.getName());
                    break;
                }
                case HEADER: {
                    imports.add(JsonbTransient.class.getName());
                    imports.add(HeaderParam.class.getName());
                    break;
                }
                default:
                    throw new UnsupportedOperationException(field.getIn().name());
            }
        }

        return imports.stream();
    }

}
