package com.zitadel;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.junit.jupiter.api.BeforeAll;

import java.util.Set;

/**
 * BaseTest class provides a setup for loading environment variables from a
 * .env file before any tests are executed. This ensures that the environment
 * properties are available as system properties for all tests in the suite.
 */
public class BaseTest {

    /**
     * Loads environment variables from an.env file and sets them as system properties
     * before any tests are run. This method is executed once before all tests in the
     * test class. It uses the Dotenv library to read the .env file from the project's
     * root directory and sets each entry as a system property.
     *
     * @throws IllegalArgumentException if there are issues with loading environment variables
     */
    @BeforeAll
    public static void loadEnvVars() {
        Dotenv dotenv = Dotenv.configure()
            .directory(System.getProperty("user.dir"))
            .ignoreIfMissing()
            .load();

        Set<DotenvEntry> envVars = dotenv.entries();

        for (DotenvEntry entry : envVars) {
            System.setProperty(entry.getKey(), entry.getValue());
        }
    }
}
