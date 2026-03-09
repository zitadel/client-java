package com.zitadel;

import com.zitadel.auth.NoAuthAuthenticator;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.utility.MountableFile;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ZitadelTest {

    private static String host;
    private static int httpPort;
    private static int httpsPort;
    private static int proxyPort;
    private static String caCertPath;
    @Nullable
    private static Network network;
    @Nullable
    private static GenericContainer<?> wireMockServer;
    @Nullable
    private static GenericContainer<?> proxyServer;

    @SuppressWarnings({"resource", "HttpUrlsUsage"})
    @BeforeAll
    static void setUp() throws Exception {
        caCertPath = Path.of(ZitadelTest.class.getClassLoader()
            .getResource("ca.pem").toURI()).toString();

        network = Network.newNetwork();

        wireMockServer = new GenericContainer<>(DockerImageName.parse("wiremock/wiremock:3.12.1"))
            .withNetwork(network)
            .withNetworkAliases("wiremock")
            .withExposedPorts(8080, 8443)
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("keystore.p12"),
                "/home/wiremock/keystore.p12"
            )
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("mappings/"),
                "/home/wiremock/mappings/"
            )
            .withCommand(
                "--https-port", "8443",
                "--https-keystore", "/home/wiremock/keystore.p12",
                "--keystore-password", "password",
                "--keystore-type", "PKCS12",
                "--global-response-templating"
            )
            .waitingFor(Wait.forHttp("/__admin/mappings").forPort(8080).forStatusCode(200));

        wireMockServer.start();

        proxyServer = new GenericContainer<>(DockerImageName.parse("ubuntu/squid:6.10-24.10_beta"))
            .withNetwork(network)
            .withExposedPorts(3128)
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("squid.conf"),
                "/etc/squid/squid.conf"
            )
            .waitingFor(Wait.forListeningPort());

        proxyServer.start();

        host = wireMockServer.getHost();
        httpPort = wireMockServer.getMappedPort(8080);
        httpsPort = wireMockServer.getMappedPort(8443);
        proxyPort = proxyServer.getMappedPort(3128);
    }

    @AfterAll
    static void tearDown() {
        if (proxyServer != null) {
            proxyServer.stop();
        }
        if (wireMockServer != null) {
            wireMockServer.stop();
        }
        if (network != null) {
            network.close();
        }
    }

    @Test
    @DisplayName("All API services must be registered in Zitadel")
    void testServicesDynamic() {
        try (ScanResult scanResult = new ClassGraph().acceptPackages("com.zitadel.api").scan()) {
            Set<Class<?>> expected =
                scanResult.getAllClasses().loadClasses().stream()
                    .filter(c -> !c.getSimpleName().endsWith("Test"))
                    .filter(c -> c.getSimpleName().endsWith("ServiceApi"))
                    .collect(Collectors.toSet());

            Zitadel zitadel = new Zitadel(new NoAuthAuthenticator("http://dummy"));
            Field[] fields = zitadel.getClass().getDeclaredFields();
            Set<Class<?>> actual =
                Arrays.stream(fields)
                    .map(Field::getType)
                    .filter(
                        c -> c.getPackage() != null && "com.zitadel.api".equals(c.getPackage().getName()))
                    .collect(Collectors.toSet());

            assertEquals(
                expected, actual, "The registered API services in Zitadel do not match the expected set");
        }
    }

    @Test
    void testCustomCaCert() {
        TransportOptions options = new TransportOptions(
            Map.of(), caCertPath, false, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        var response = zitadel.getSettings().getGeneralSettings();
        assertEquals("https", response.getDefaultLanguage());
    }

    @Test
    void testInsecureMode() {
        TransportOptions options = new TransportOptions(
            Map.of(), null, true, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        var response = zitadel.getSettings().getGeneralSettings();
        assertEquals("https", response.getDefaultLanguage());
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testDefaultHeaders() {
        TransportOptions options = new TransportOptions(
            Map.of("X-Custom-Header", "test-value"), null, false, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "http://" + host + ":" + httpPort, "dummy-client", "dummy-secret", options);

        var response = zitadel.getSettings().getGeneralSettings();
        assertEquals("http", response.getDefaultLanguage());
        assertEquals("test-value", response.getDefaultOrgId());
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testProxyUrl() {
        TransportOptions options = new TransportOptions(
            Map.of(), null, false, "http://" + host + ":" + proxyPort);

        Zitadel zitadel = Zitadel.withAccessToken(
            "http://wiremock:8080", "test-token", options);

        var response = zitadel.getSettings().getGeneralSettings();
        assertEquals("http", response.getDefaultLanguage());
    }

    @Test
    void testNoCaCertFails() {
        assertThrows(RuntimeException.class, () -> {
            Zitadel.withClientCredentials(
                "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret");
        });
    }
}
