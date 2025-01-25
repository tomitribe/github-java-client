package org.tomitribe.github.gen;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DirectoryCompiler {

    public static void main(String[] args) throws Exception {
        // Directory containing .java files
        File sourceDirectory = new File("src/main/java"); // Update with your source directory

        // Output directory for compiled classes
        File outputDirectory = new File("target/classes");

        // Compile the directory
        compileDirectory(sourceDirectory, outputDirectory);
    }

    public static void compileDirectory(File sourceDir, File outputDir) throws IOException {
        if (!sourceDir.isDirectory()) {
            throw new IllegalArgumentException("Source directory is not valid: " + sourceDir.getAbsolutePath());
        }
        if (!outputDir.exists()) {
            if (!outputDir.mkdirs()) {
                throw new IOException("Failed to create output directory: " + outputDir.getAbsolutePath());
            }
        }

        // Get the Java compiler
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
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
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        // Set the output directory for compiled classes
        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, List.of(outputDir));

        // Prepare the classpath
        String currentClasspath = System.getProperty("java.class.path");
        String classpath = currentClasspath + File.pathSeparator + outputDir.getAbsolutePath();

        // Pass the classpath as an option to the compiler
        List<String> options = List.of("-classpath", classpath);

        // Convert files to JavaFileObjects
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(javaFiles);

        // Compile the files
        JavaCompiler.CompilationTask task = compiler.getTask(
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

        // Close the file manager
        fileManager.close();
    }
}
