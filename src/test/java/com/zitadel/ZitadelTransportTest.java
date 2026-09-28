// Zitadel SDK
// Testcontainers-based transport tests, aligned with the other Zitadel SDKs.
//
// A WireMock container stubs the OAuth discovery, token, and GetGeneralSettings
// endpoints over both HTTP and HTTPS (with a self-signed cert chained to the
// fixture CA), and a Squid container provides a forward proxy on two ports:
// 3128 is open, and 3129 requires Basic proxy credentials. The tests assert
// that TransportOptions correctly drive TLS verification, custom CA trust,
// default headers, and proxy routing (including proxy authentication).

package com.zitadel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.zitadel.auth.ClientCredentialsAuthenticator;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.errors.ClientException;
import com.zitadel.errors.NetworkException;
import com.zitadel.model.SettingsServiceGetGeneralSettingsResponse;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.utility.MountableFile;

/**
 * Transport-layer integration tests exercising {@link TransportOptions} against a WireMock stub and
 * a Squid forward proxy.
 *
 * <p>The WireMock stub returns the request scheme as {@code defaultLanguage} and echoes the {@code
 * X-Custom-Header} value as {@code defaultOrgId}, so each test can assert that the request reached
 * the stub over the expected transport.
 */
class ZitadelTransportTest {

  private static String host;
  private static int httpPort;
  private static int httpsPort;
  private static int proxyPort;
  private static int proxyAuthPort;
  private static String caCertPath;
  private static Network network;
  private static GenericContainer<?> wireMockServer;
  private static GenericContainer<?> proxyServer;

  @SuppressWarnings("resource")
  @BeforeAll
  static void setUp() throws Exception {
    caCertPath =
        Path.of(
                Objects.requireNonNull(
                        ZitadelTransportTest.class.getClassLoader().getResource("ca.pem"))
                    .toURI())
            .toString();

    network = Network.newNetwork();

    wireMockServer =
        new GenericContainer<>(DockerImageName.parse("wiremock/wiremock:3.12.1"))
            .withNetwork(network)
            .withNetworkAliases("wiremock")
            .withExposedPorts(8080, 8443)
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("keystore.p12"), "/home/wiremock/keystore.p12")
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("mappings/"), "/home/wiremock/mappings/")
            .withCommand(
                "--https-port",
                "8443",
                "--https-keystore",
                "/home/wiremock/keystore.p12",
                "--keystore-password",
                "password",
                "--keystore-type",
                "PKCS12",
                "--global-response-templating")
            .waitingFor(Wait.forHttp("/__admin/mappings").forPort(8080).forStatusCode(200));

    wireMockServer.start();

    proxyServer =
        new GenericContainer<>(DockerImageName.parse("ubuntu/squid:6.10-24.10_beta"))
            .withNetwork(network)
            .withExposedPorts(3128, 3129)
            .withCopyFileToContainer(
                MountableFile.forClasspathResource("squid.conf"), "/etc/squid/squid.conf")
            .withTmpFs(Map.of("/var/log/squid", "rw,mode=1777", "/var/spool/squid", "rw,mode=1777"))
            .waitingFor(Wait.forListeningPort());

    proxyServer.start();

    host = wireMockServer.getHost();
    httpPort = wireMockServer.getMappedPort(8080);
    httpsPort = wireMockServer.getMappedPort(8443);
    proxyPort = proxyServer.getMappedPort(3128);
    proxyAuthPort = proxyServer.getMappedPort(3129);
  }

  @AfterAll
  static void tearDown() {
    proxyServer.stop();
    wireMockServer.stop();
    network.close();
  }

  @Test
  @DisplayName("custom CA cert is trusted over HTTPS")
  void customCaCertIsTrusted() {
    TransportOptions transport = TransportOptions.builder().caCertPath(caCertPath).build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            ClientCredentialsAuthenticator.builder(
                    "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret")
                .build(),
            transport);

    SettingsServiceGetGeneralSettingsResponse response =
        zitadel.settingsService.getGeneralSettings(new Object());

    assertEquals("https", response.defaultLanguage);
  }

  @Test
  @DisplayName("insecure mode skips TLS verification")
  void insecureModeSkipsVerification() {
    TransportOptions transport = TransportOptions.builder().verifySsl(false).build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            ClientCredentialsAuthenticator.builder(
                    "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret")
                .build(),
            transport);

    SettingsServiceGetGeneralSettingsResponse response =
        zitadel.settingsService.getGeneralSettings(new Object());

    assertEquals("https", response.defaultLanguage);
  }

  @SuppressWarnings("HttpUrlsUsage")
  @Test
  @DisplayName("default headers are sent")
  void defaultHeadersAreSent() {
    TransportOptions transport =
        TransportOptions.builder().defaultHeader("X-Custom-Header", "test-value").build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            ClientCredentialsAuthenticator.builder(
                    "http://" + host + ":" + httpPort, "dummy-client", "dummy-secret")
                .build(),
            transport);

    SettingsServiceGetGeneralSettingsResponse response =
        zitadel.settingsService.getGeneralSettings(new Object());

    assertEquals("http", response.defaultLanguage);
    assertEquals("test-value", response.defaultOrgId);
  }

  @SuppressWarnings("HttpUrlsUsage")
  @Test
  @DisplayName("proxy routes the request")
  void proxyRoutesRequest() {
    TransportOptions transport =
        TransportOptions.builder().proxy("http://" + host + ":" + proxyPort).build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            new PersonalAccessTokenAuthenticator("http://wiremock:8080", "test-token"), transport);

    SettingsServiceGetGeneralSettingsResponse response =
        zitadel.settingsService.getGeneralSettings(new Object());

    assertEquals("http", response.defaultLanguage);
  }

  @SuppressWarnings("HttpUrlsUsage")
  @Test
  @DisplayName("credentialed proxy returns 407 without credentials")
  void proxyWithoutCredentialsFails() {
    TransportOptions transport =
        TransportOptions.builder().proxy("http://" + host + ":" + proxyAuthPort).build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            new PersonalAccessTokenAuthenticator("http://wiremock:8080", "test-token"), transport);

    ClientException exception =
        assertThrows(
            ClientException.class, () -> zitadel.settingsService.getGeneralSettings(new Object()));
    assertEquals(407, exception.getStatusCode());
  }

  @SuppressWarnings("HttpUrlsUsage")
  @Test
  @DisplayName("credentialed proxy routes the request with credentials")
  void proxyWithCredentialsRoutesRequest() {
    TransportOptions transport =
        TransportOptions.builder().proxy("http://user:pass@" + host + ":" + proxyAuthPort).build();
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            new PersonalAccessTokenAuthenticator("http://wiremock:8080", "test-token"), transport);

    SettingsServiceGetGeneralSettingsResponse response =
        zitadel.settingsService.getGeneralSettings(new Object());

    assertEquals("http", response.defaultLanguage);
  }

  @Test
  @DisplayName("missing CA cert fails over HTTPS")
  void missingCaCertFails() {
    Zitadel zitadel =
        Zitadel.withAuthenticator(
            ClientCredentialsAuthenticator.builder(
                    "https://" + host + ":" + httpsPort, "dummy-client", "dummy-secret")
                .build());

    assertThrows(
        NetworkException.class, () -> zitadel.settingsService.getGeneralSettings(new Object()));
  }
}
