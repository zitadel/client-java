package com.zitadel.auth;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.ApiClient;
import com.zitadel.ApiException;
import com.zitadel.ApiHttpResponse;
import com.zitadel.ZitadelException;
import com.zitadel.utils.URLUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import javax.annotation.Nullable;

/**
 * Resolves the OpenID Connect discovery document for a Zitadel host.
 *
 * <p>Unlike the previous implementation, discovery is performed lazily through the shared {@link
 * ApiClient} (so it inherits the SDK's proxy / TLS / timeout configuration) rather than eagerly in
 * the constructor with a private {@code HttpURLConnection}. The host is captured at construction
 * time; the {@code token_endpoint} is fetched the first time {@link #getTokenEndpoint} is called.
 */
@SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
public class OpenId {

  private final URL hostEndpoint;
  private final String hostname;

  @Nullable private volatile URL tokenEndpoint;

  /**
   * @param hostname the hostname of the OpenID provider.
   */
  public OpenId(String hostname) {
    this.hostname = hostname;
    this.hostEndpoint = URLUtil.buildHostname(hostname);
  }

  /**
   * Returns the base host endpoint URL.
   *
   * @return the host endpoint.
   */
  public URL getHostEndpoint() {
    return hostEndpoint;
  }

  /**
   * Returns the OAuth2 token endpoint, resolving the discovery document via the shared API client
   * on first access.
   *
   * @param apiClient the shared API client used for the discovery request.
   * @return the resolved token endpoint URL.
   * @throws ZitadelException if discovery fails.
   */
  public URL getTokenEndpoint(ApiClient apiClient) {
    URL resolved = tokenEndpoint;
    if (resolved == null) {
      synchronized (this) {
        resolved = tokenEndpoint;
        if (resolved == null) {
          resolved = resolve(apiClient);
          tokenEndpoint = resolved;
        }
      }
    }
    return resolved;
  }

  private URL resolve(ApiClient apiClient) {
    if (apiClient == null) {
      throw new IllegalStateException(
          "ApiClient has not been injected; OpenID discovery cannot run before setApiClient().");
    }
    try {
      String wellKnown = buildWellKnownUrl(hostname).toString();
      ApiHttpResponse response =
          apiClient.sendRequest(
              "GET", wellKnown, Collections.singletonMap("Accept", "application/json"), null);
      if (response.statusCode() < 200 || response.statusCode() >= 300) {
        throw new ZitadelException(
            "Failed to fetch OpenID configuration: HTTP " + response.statusCode());
      }
      JsonNode root = new ObjectMapper().readTree(response.body());
      String endpoint = root.path("token_endpoint").asText();
      if (endpoint == null || endpoint.isEmpty()) {
        throw new ZitadelException("OpenID configuration did not contain a token_endpoint.");
      }
      return new URI(endpoint).toURL();
    } catch (ApiException | IOException | URISyntaxException e) {
      throw new ZitadelException("Failed to resolve OpenID configuration: " + e.getMessage(), e);
    }
  }

  @SuppressWarnings("HttpUrlsUsage")
  private static URL buildWellKnownUrl(String hostname) {
    try {
      if (!hostname.startsWith("http://") && !hostname.startsWith("https://")) {
        hostname = "https://" + hostname;
      }
      return new URI(hostname).resolve("/.well-known/openid-configuration").toURL();
    } catch (MalformedURLException | URISyntaxException | IllegalArgumentException e) {
      throw new ZitadelException("Malformed host URL: " + hostname, e);
    }
  }
}
