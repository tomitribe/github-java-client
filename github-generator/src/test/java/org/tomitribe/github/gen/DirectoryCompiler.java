package org.tomitribe.github.gen;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryCompiler {

    public static void compileDirectory(final File sourceDir, final File outputDir) throws IOException {
        if (!sourceDir.isDirectory()) {
            throw new IllegalArgumentException("Source directory is not valid: " + sourceDir.getAbsolutePath());
        }

        if (!outputDir.exists() && !outputDir.mkdirs()) {
            throw new IOException("Failed to create output directory: " + outputDir.getAbsolutePath());
        }

        // Get the Java compiler
        final JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        if (compiler == null) {
            throw new IllegalStateException("No Java compiler available. Are you running this in a JDK?");
        }

        // Collect all .java files in the directory
        List<File> javaFiles;
        try (Stream<Path> paths = Files.walk(sourceDir.toPath())) {
            javaFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".java"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        }

        if (javaFiles.isEmpty()) {
            throw new IllegalStateException("No .java files found in directory: " + sourceDir.getAbsolutePath());
        }

        // Print the files being compiled (optional)
        javaFiles.forEach(file -> System.out.println("Compiling: " + file.getAbsolutePath()));

        // Set up the file manager
        try (final StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
            // Set the output directory for compiled classes
            fileManager.setLocation(StandardLocation.CLASS_OUTPUT, List.of(outputDir));

            // Prepare the classpath
            final String currentClasspath = System.getProperty("java.class.path");
            final String classpath = currentClasspath + File.pathSeparator + outputDir.getAbsolutePath();

            // Add required compiler options
            final List<String> options = new ArrayList<>(List.of(
                    "-classpath", classpath,
                    "--add-exports", "jdk.compiler/com.sun.tools.javac.processing=ALL-UNNAMED",
                    "--add-exports", "jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED"
            ));

            // Convert files to JavaFileObjects
            final Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(javaFiles);

            // Compile the files
            final JavaCompiler.CompilationTask task = compiler.getTask(
                    null, // Writer (e.g., System.err)
                    fileManager, // FileManager
                    null, // DiagnosticListener
                    options, // Options
                    null, // Annotation processing
                    compilationUnits // Files to compile
            );

            if (!task.call()) {
                throw new IllegalStateException("Compilation failed. Check your source files.");
            }

            System.out.println("Compilation completed. Classes saved to: " + outputDir.getAbsolutePath());
        }
    }
}