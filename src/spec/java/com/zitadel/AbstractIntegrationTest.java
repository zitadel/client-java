package com.zitadel;

import org.junit.jupiter.api.BeforeAll;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * Abstract base class for integration tests that interact with a Docker
 * Compose stack.
 * <p>
 * The Zitadel stack is expensive to provision and is shared by every
 * {@code *Spec} class in the suite. Because the integration specs run
 * concurrently (see {@code junit-platform.properties} and the Failsafe
 * {@code <parallel>} configuration), each class's {@link BeforeAll} would
 * otherwise race to {@code docker compose up} the <em>same</em> project,
 * colliding on network, volume, and container names. To avoid that, the stack
 * is brought up exactly once per JVM under a lock and torn down once via a JVM
 * shutdown hook. This mirrors the single-provisioning fixtures used by the
 * other Zitadel SDKs (Python's {@code docker_compose} fixture, the .NET
 * {@code ZitadelStackFixture}).
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
    private static final Path composeFileDir =
        Optional.ofNullable(COMPOSE_FILE_PATH.getParent()).orElseThrow();

    /**
     * Guards one-time provisioning of the shared Docker Compose stack across
     * the concurrently executing spec classes in this JVM.
     */
    private static final Object LOCK = new Object();

    /**
     * Whether the shared stack has already been provisioned in this JVM.
     */
    private static boolean started = false;

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
     * Provisions the shared Docker Compose stack the first time any spec class
     * runs, and exposes the credentials it mints. Subsequent invocations from
     * other spec classes reuse the already-running stack.
     *
     * @throws RuntimeException If the Docker Compose stack fails to start or if
     *                          a required output file cannot be read.
     */
    @BeforeAll
    public static void setUpBeforeAll() {
        synchronized (LOCK) {
            if (started) {
                return;
            }

            System.out.println("Bringing up Docker Compose stack...");
            try {
                ProcessResult up = runCompose(
                    List.of("up", "--detach", "--no-color", "--quiet-pull", "--yes"));
                if (up.exitCode() != 0) {
                    throw new RuntimeException(
                        "Failed to bring up Docker Compose stack. Exit code: "
                            + up.exitCode() + "\nOutput:\n" + up.output());
                }
                System.out.println("Docker Compose stack is up.\n");

                loadFileContentIntoProperty("zitadel_output/pat.txt", "authToken");

                Path jwtKeyFile = composeFileDir.resolve("zitadel_output/sa-key.json");
                if (!Files.exists(jwtKeyFile)) {
                    throw new RuntimeException(
                        "JWT Key file not found at path: " + jwtKeyFile.toAbsolutePath());
                }
                jwtKeyPath = jwtKeyFile.toAbsolutePath().toString();
                System.out.println("Loaded JWT_KEY path: " + jwtKeyPath + "\n");

                baseUrl = "http://localhost:18103";
                System.out.println("Exposed BASE_URL as: " + baseUrl + "\n");

                System.out.println("Sleeping for 20 seconds to allow services to initialize...");
                Thread.sleep(20000);
                System.out.println("Sleep finished.\n");

                Runtime.getRuntime().addShutdownHook(new Thread(AbstractIntegrationTest::tearDownStack));
                started = true;
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException("Error during Docker Compose setup: " + e.getMessage(), e);
            }
        }
    }

    /**
     * Stops and removes the shared Docker Compose stack. Invoked once per JVM
     * from a shutdown hook after every spec class has finished, so that an
     * early teardown cannot pull the stack out from under specs still running.
     */
    private static void tearDownStack() {
        System.out.println("Tearing down Docker Compose stack...");
        if (!Files.exists(COMPOSE_FILE_PATH)) {
            return;
        }
        try {
            ProcessResult down = runCompose(List.of("down", "-v"));
            if (down.exitCode() != 0) {
                System.err.println("Warning: Failed to tear down Docker Compose stack. Exit code: "
                    + down.exitCode() + "\nOutput:\n" + down.output());
                return;
            }
            System.out.println("Docker Compose stack torn down.\n");
        } catch (IOException | InterruptedException e) {
            System.err.println("Warning: Error during Docker Compose tear down: " + e.getMessage());
        }
    }

    /**
     * Runs a {@code docker compose} subcommand against the suite's compose
     * file, draining its combined output stream to completion before returning.
     *
     * <p>The output is captured into a string as it is read, so callers can
     * include it in error messages without re-reading (and thus reopening) the
     * already-closed process stream.</p>
     *
     * @param composeArgs the compose subcommand and its arguments
     * @return the exit code and captured combined output
     * @throws IOException          if the process cannot be started or read
     * @throws InterruptedException if waiting for the process is interrupted
     */
    private static ProcessResult runCompose(List<String> composeArgs)
        throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder();
        pb.command().add("docker");
        pb.command().add("compose");
        pb.command().add("-f");
        pb.command().add(COMPOSE_FILE_PATH.toString());
        pb.command().addAll(composeArgs);
        pb.redirectErrorStream(true);

        Process process = pb.start();
        StringBuilder output = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("STDOUT: " + line);
                output.append(line).append("\n");
            }
        }

        if (!process.waitFor(5, TimeUnit.MINUTES)) {
            process.destroyForcibly();
            throw new IOException("Docker Compose command timed out:\n" + output);
        }
        return new ProcessResult(process.exitValue(), output.toString());
    }

    /**
     * The outcome of a {@code docker compose} subcommand.
     *
     * @param exitCode the process exit code
     * @param output   the captured combined output
     */
    private record ProcessResult(int exitCode, String output) {
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
        @SuppressWarnings("SameParameterValue") String relativePath,
        @SuppressWarnings("SameParameterValue") String propertyName) {
        Path filePath = composeFileDir.resolve(relativePath);

        if (Files.exists(filePath)) {
            try {
                String content = Files.readString(filePath).trim();
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
