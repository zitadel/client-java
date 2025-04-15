package com.zitadel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * This test verifies that the API client correctly builds the endpoint path using the base URL provided by the
 * authenticator and adds the Personal Access Token to the Authorization header.
 *
 * <p>
 * A WireMock server is started using TestContainers and configured via a JSON mapping loaded from a resource file.
 * The test then invokes the API using an {@link ApiClient} that utilizes a {@link PersonalAccessTokenAuthenticator}.
 * It asserts that the response from the API matches the expected output.
 * </p>
 */
public class ApiClientTest {

  protected static String oauthHost;
  private static GenericContainer<?> mockOAuth2Server;

  @SuppressWarnings({"resource", "HttpUrlsUsage"})
  @BeforeAll
  public static void setUp() {
    mockOAuth2Server = new GenericContainer<>(DockerImageName.parse("wiremock/wiremock"))
      .withExposedPorts(8080)
      .waitingFor(Wait.forHttp("/").forStatusCodeMatching(i -> true));
    mockOAuth2Server.start();
    oauthHost = "http://" + mockOAuth2Server.getHost() + ":" + mockOAuth2Server.getMappedPort(8080);
  }

  @AfterAll
  public static void tearDown() {
    if (mockOAuth2Server != null) {
      mockOAuth2Server.stop();
    }
  }

  /**
   * Loads a resource file from the classpath.
   *
   * @param resourcePath the resource path to load
   * @return the content of the resource file as a String
   * @throws Exception if the resource cannot be found or read
   */
  private String loadResourceFile(@SuppressWarnings("SameParameterValue") String resourcePath) throws Exception {
    try (InputStream is = getClass().getClassLoader().getResourceAsStream(resourcePath)) {
      if (is == null) {
        throw new IllegalArgumentException("Resource not found: " + resourcePath);
      }
      try (Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.name())) {
        scanner.useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
      }
    }
  }

  /**
   * Tests that the API client correctly integrates the PersonalAccessTokenAuthenticator,
   * ensuring that the token is added to the Authorization header and that the request path is built from
   * the base URL provided by the authenticator.
   *
   * @throws Exception if any error occurs during the test execution
   */
  @Test
  public void testAssertHeadersAndContentType() throws Exception {
    try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
      HttpPost postRequest = new HttpPost(oauthHost + "/__admin/mappings");
      postRequest.addHeader("Content-Type", "application/json");
      postRequest.setEntity(new StringEntity(loadResourceFile("wiremock.json")));
      httpClient.execute(postRequest, response -> {
        EntityUtils.consume(response.getEntity());
        return null;
      });
    }

    ApiClient apiClient = new ApiClient(new PersonalAccessTokenAuthenticator(oauthHost, "mm"));
    Map<String, Object> apiResponse = apiClient.invokeAPI(
      "/your/endpoint",
      "GET",
      Collections.emptyList(),
      Collections.emptyList(),
      null,
      null,
      Collections.emptyMap(),
      Collections.emptyMap(),
      Collections.emptyMap(),
      "application/json",
      "application/json",
      new String[0],
      new TypeReference<Map<String, Object>>() {
      }
    );
    assertNotNull(apiResponse);
    assertEquals("value", apiResponse.get("key"));
  }
}
