package com.zitadel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransportOptionsTest {

    private static String host;
    private static int httpPort;
    private static int httpsPort;
    @Nullable
    private static Path caCertPath;
    @Nullable
    private static GenericContainer<?> wireMockServer;

    @SuppressWarnings({"resource", "HttpUrlsUsage"})
    @BeforeAll
    static void setUp() throws Exception {
        wireMockServer = new GenericContainer<>(DockerImageName.parse("wiremock/wiremock:3.3.1"))
            .withExposedPorts(8080, 8443)
            .withCommand("--https-port 8443 --global-response-templating")
            .waitingFor(Wait.forHttp("/__admin/mappings").forPort(8080).forStatusCode(200));

        wireMockServer.start();

        host = wireMockServer.getHost();
        httpPort = wireMockServer.getMappedPort(8080);
        httpsPort = wireMockServer.getMappedPort(8443);

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

        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(null, new TrustManager[]{new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] c, String a) {}
            public void checkServerTrusted(X509Certificate[] c, String a) {}
            public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
        }}, new SecureRandom());

        Certificate cert;
        try (SSLSocket socket = (SSLSocket) ctx.getSocketFactory().createSocket(host, httpsPort)) {
            socket.startHandshake();
            cert = socket.getSession().getPeerCertificates()[0];
        }

        String pem = "-----BEGIN CERTIFICATE-----\n"
            + Base64.getMimeEncoder(64, "\n".getBytes()).encodeToString(cert.getEncoded())
            + "\n-----END CERTIFICATE-----\n";

        caCertPath = Files.createTempFile("wiremock-ca-", ".pem");
        Files.writeString(caCertPath, pem);
    }

    @AfterAll
    static void tearDown() throws Exception {
        if (wireMockServer != null) {
            wireMockServer.stop();
        }
        if (caCertPath != null) {
            Files.deleteIfExists(caCertPath);
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
        TransportOptions options = new TransportOptions.Builder()
            .caCertPath(caCertPath.toString())
            .build();

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);
    }

    @Test
    void testInsecureMode() {
        TransportOptions options = new TransportOptions.Builder()
            .insecure(true)
            .build();

        Zitadel zitadel = Zitadel.withClientCredentials(
            "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testDefaultHeaders() throws Exception {
        TransportOptions options = new TransportOptions.Builder()
            .defaultHeader("X-Custom-Header", "test-value")
            .build();

        Zitadel zitadel = Zitadel.withClientCredentials(
            "http://" + host + ":" + httpPort, "dummy-client", "dummy-secret", options);

        assertNotNull(zitadel);

        URL journalUrl = new URL("http://" + host + ":" + httpPort + "/__admin/requests");
        HttpURLConnection conn = (HttpURLConnection) journalUrl.openConnection();
        try (var in = conn.getInputStream()) {
            String journal = new String(in.readAllBytes());
            assertTrue(journal.contains("X-Custom-Header"),
                "Custom header should be present in WireMock request journal");
        } finally {
            conn.disconnect();
        }
    }

    @SuppressWarnings("HttpUrlsUsage")
    @Test
    void testProxyUrl() {
        TransportOptions options = new TransportOptions.Builder()
            .proxyUrl("http://" + host + ":" + httpPort)
            .build();

        assertNotNull(options);
        assertNotNull(options.getProxyUrl());
    }

    @Test
    void testNoCaCertFails() {
        assertThrows(Exception.class, () -> {
            Zitadel.withClientCredentials(
                "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret");
        });
    }
}
