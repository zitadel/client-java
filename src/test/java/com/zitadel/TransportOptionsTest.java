package com.zitadel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.utility.MountableFile;

import javax.annotation.Nullable;
import java.io.OutputStream;
import java.util.Map;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TransportOptionsTest {

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
        caCertPath = Path.of(TransportOptionsTest.class.getClassLoader()
            .getResource("ca.pem").toURI()).toString();

        network = Network.newNetwork();

        wireMockServer = new GenericContainer<>(DockerImageName.parse("wiremock/wiremock:3.3.1"))
            .withNetwork(network)
            .withNetworkAliases("wiremock")
            .withExposedPorts(8080, 8443)
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("keystore.p12"),
                "/home/wiremock/keystore.p12"
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

        registerStub("{"
            + "\"request\":{\"method\":\"GET\",\"url\":\"/.well-known/openid-configuration\"},"
            + "\"response\":{"
            + "\"status\":200,"
            + "\"headers\":{\"Content-Type\":\"application/json\"},"
            + "\"body\":\"{\\\"issuer\\\":\\\"{{request.baseUrl}}\\\","
            + "\\\"token_endpoint\\\":\\\"{{request.baseUrl}}/oauth/v2/token\\\","
            + "\\\"authorization_endpoint\\\":\\\"{{request.baseUrl}}/oauth/v2/authorize\\\","
            + "\\\"userinfo_endpoint\\\":\\\"{{request.baseUrl}}/oidc/v1/userinfo\\\","
            + "\\\"jwks_uri\\\":\\\"{{request.baseUrl}}/oauth/v2/keys\\\"}\""
            + "}"
            + "}");

        registerStub("{"
            + "\"request\":{\"method\":\"POST\",\"url\":\"/oauth/v2/token\"},"
            + "\"response\":{"
            + "\"status\":200,"
            + "\"headers\":{\"Content-Type\":\"application/json\"},"
            + "\"jsonBody\":{\"access_token\":\"test-token-12345\",\"token_type\":\"Bearer\",\"expires_in\":3600}"
            + "}"
            + "}");

        registerStub("{"
            + "\"request\":{\"method\":\"POST\",\"url\":\"/zitadel.settings.v2.SettingsService/GetGeneralSettings\"},"
            + "\"response\":{"
            + "\"status\":200,"
            + "\"headers\":{\"Content-Type\":\"application/json\"},"
            + "\"jsonBody\":{}"
            + "}"
            + "}");
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

    @SuppressWarnings("HttpUrlsUsage")
    private static void registerStub(String stubJson) throws Exception {
        URL url = new URL("http://" + host + ":" + httpPort + "/__admin/mappings");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        try (OutputStream os = conn.getOutputStream()) {
            os.write(stubJson.getBytes(StandardCharsets.UTF_8));
        }
        int status = conn.getResponseCode();
        conn.disconnect();
        if (status != 201) {
            throw new RuntimeException("Failed to register WireMock stub, status: " + status);
        }
    }

    @Test
    void testCustomCaCert() {
        assertNotNull(caCertPath, "CA cert path must not be null");
        TransportOptions options = new TransportOptions(
            Map.of(), caCertPath, false, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);
    }

    @Test
    void testInsecureMode() {
        TransportOptions options = new TransportOptions(
            Map.of(), null, true, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testDefaultHeaders() throws Exception {
        TransportOptions options = new TransportOptions(
            Map.of("X-Custom-Header", "test-value"), null, false, null);

        Zitadel zitadel = Zitadel.withClientCredentials(
            "http://" + host + ":" + httpPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);

        zitadel.getSettings().getGeneralSettings();

        URL verifyUrl = new URL("http://" + host + ":" + httpPort + "/__admin/requests/count");
        HttpURLConnection conn = (HttpURLConnection) verifyUrl.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        String verifyBody = "{\"url\":\"/zitadel.settings.v2.SettingsService/GetGeneralSettings\","
            + "\"headers\":{\"X-Custom-Header\":{\"equalTo\":\"test-value\"}}}";
        try (OutputStream os = conn.getOutputStream()) {
            os.write(verifyBody.getBytes(StandardCharsets.UTF_8));
        }
        try (var in = conn.getInputStream()) {
            JsonNode result = new ObjectMapper().readTree(in);
            int count = result.path("count").asInt();
            assertTrue(count >= 1, "Custom header should be present on API call");
        } finally {
            conn.disconnect();
        }
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testProxyUrl() throws Exception {
        TransportOptions options = new TransportOptions(
            Map.of(), null, false, "http://" + host + ":" + proxyPort);

        Zitadel zitadel = Zitadel.withAccessToken(
            "http://wiremock:8080", "test-token", options);

        assertNotNull(zitadel);
        zitadel.getSettings().getGeneralSettings();
    }

    @Test
    void testNoCaCertFails() {
        assertThrows(RuntimeException.class, () -> {
            Zitadel.withClientCredentials(
                "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret");
        });
    }
}
