package com.zitadel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Abstract base class for integration tests that interact with a Docker
 * Compose stack.
 * <p>
 * This class handles the lifecycle of a Docker Compose environment,
 * bringing it up before tests run and tearing it down afterwards. It also
 * provides mechanisms to load specific data (like authentication tokens
 * and JWT key paths) from files and make them accessible via protected
 * getters for use in concrete test implementations.
 * <p>
 * This implementation uses direct shell commands via ProcessBuilder to
 * control Docker Compose, closely mirroring the PHP `exec` approach.
 */
public abstract class AbstractIntegrationTest {

    /**
     * The absolute path to the docker-compose.yaml file.
     */
    private static final Path COMPOSE_FILE_PATH =
        Paths.get(new File("").getAbsolutePath(), "etc", "docker-compose.yaml");

    /**
     * The directory containing the docker-compose.yaml file.
     */
    private static final Path composeFileDir = Optional.ofNullable(COMPOSE_FILE_PATH.getParent()).orElseThrow();

    /**
     * The authentication token loaded from file.
     */
    protected static String authToken = "";

    /**
     * The absolute path to the JWT key file.
     */
    protected static String jwtKeyPath = "";

    /**
     * The base URL for the services.
     */
    protected static String baseUrl = "";

    /**
     * Sets up the test environment before the first test in the class runs.
     * This includes bringing up the Docker Compose stack and exposing
     * necessary data.
     *
     * @throws RuntimeException If the Docker Compose stack fails to start
     *                          or if a required file for data is not found or cannot be read.
     */
    @BeforeAll
    public static void setUpBeforeAll() {
        System.out.println("Bringing up Docker Compose stack...");
        try {
            ProcessBuilder pb = new ProcessBuilder(
                "docker", "compose", "-f", COMPOSE_FILE_PATH.toString(),
                "up", "--detach", "--no-color", "--quiet-pull", "--yes"
            );
            pb.redirectErrorStream(true); // Redirect error stream to output stream
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("STDOUT: " + line);
                }
            }

            if (!process.waitFor(5, TimeUnit.MINUTES) || process.exitValue() != 0) {
                String errorMessage = "Failed to bring up Docker Compose stack. "
                    + "Exit code: " + process.exitValue() + "\n"
                    + "Output:\n" + getProcessOutput(process); // Get remaining output if process timed out
                System.err.println(errorMessage);
                throw new RuntimeException(errorMessage);
            }
            System.out.println("Docker Compose stack is up.\n");

            // Load AUTH_TOKEN content from file
            loadFileContentIntoProperty("zitadel_output/pat.txt", "authToken");

            // Set JWT_KEY to the absolute path of the file
            Path jwtKeyFile = composeFileDir.resolve("zitadel_output/sa-key.json");
            if (!Files.exists(jwtKeyFile)) {
                throw new RuntimeException(
                    "JWT Key file not found at path: " + jwtKeyFile.toAbsolutePath());
            }
            jwtKeyPath = jwtKeyFile.toAbsolutePath().toString();
            System.out.println("Loaded JWT_KEY path: " + jwtKeyPath + "\n");

            baseUrl = "http://localhost:8099";
            System.out.println("Exposed BASE_URL as: " + baseUrl + "\n");

            System.out.println("Sleeping for 20 seconds to allow services to initialize...");
            Thread.sleep(20000);
            System.out.println("Sleep finished.\n");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error during Docker Compose setup: " + e.getMessage(), e);
        }
    }

    /**
     * Tears down the test environment after all tests in the class have run.
     * This includes stopping and removing the Docker Compose stack.
     *
     * @throws RuntimeException If the Docker Compose file path is invalid or
     *                          the stack fails to tear down.
     */
    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("Tearing down Docker Compose stack...");
        if (COMPOSE_FILE_PATH != null && Files.exists(COMPOSE_FILE_PATH)) {
            try {
                ProcessBuilder pb = new ProcessBuilder(
                    "docker", "compose", "-f", COMPOSE_FILE_PATH.toString(), "down", "-v"
                );
                pb.redirectErrorStream(true);
                Process process = pb.start();

                try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println("STDOUT: " + line);
                    }
                }

                if (!process.waitFor(5, TimeUnit.MINUTES) || process.exitValue() != 0) {
                    String errorMessage = "Failed to tear down Docker Compose stack. "
                        + "Exit code: " + process.exitValue() + "\n"
                        + "Output:\n" + getProcessOutput(process);
                    System.err.println("Warning: " + errorMessage);
                    throw new RuntimeException(errorMessage);
                }
                System.out.println("Docker Compose stack torn down.\n");
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(
                    "Error during Docker Compose tear down: " + e.getMessage(), e);
            }
        } else {
            throw new RuntimeException("Docker Compose file path not initialized or "
                + "file does not exist, skipping tear down.");
        }
    }

    /**
     * Reads the content of a file relative to the compose file directory and
     * assigns it to a specified static property of this class.
     * This method is intended for loading *content*, not paths.
     *
     * @param relativePath The path to the file, relative to the compose
     *                     file's directory.
     * @param propertyName The name of the static property (e.g.,
     *                     'authToken') to assign the content to.
     * @throws RuntimeException If the file is not found or cannot be read.
     */
    private static void loadFileContentIntoProperty(
        String relativePath, String propertyName) {
        Path filePath = composeFileDir.resolve(relativePath);

        if (Files.exists(filePath)) {
            try {
                String content = Files.readString(filePath).trim();
                // Use reflection to set the static property
                AbstractIntegrationTest.class.getDeclaredField(propertyName).set(null, content);
                System.out.println(
                    "Loaded " + filePath + " content into property: " + propertyName);
            } catch (IOException | NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(
                    "Could not read content of file: " + filePath + " for property '"
                        + propertyName + "': " + e.getMessage(), e);
            }
        } else {
            throw new RuntimeException("File not found for property '" + propertyName
                + "': " + filePath.toAbsolutePath());
        }
    }

    /**
     * Helper method to get remaining output from a process.
     *
     * @param process The process object.
     * @return The remaining output as a String.
     * @throws IOException If an I/O error occurs.
     */
    private static String getProcessOutput(Process process) throws IOException {
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            return output.toString();
        }
    }

    /**
     * Retrieves the authentication token.
     *
     * @return String The authentication token, or null if not set.
     */
    protected static String getAuthToken() {
        return authToken;
    }

    /**
     * Retrieves the absolute path to the JWT key file.
     *
     * @return String The absolute path to the JWT key file, or null if not set.
     */
    protected static String getJwtKeyPath() {
        return jwtKeyPath;
    }

    /**
     * Retrieves the base URL.
     *
     * @return String The base URL, or null if not set.
     */
    protected static String getBaseUrl() {
        return baseUrl;
    }
}
