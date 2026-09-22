package com.zitadel.auth;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.ApiClient;
import com.zitadel.ApiException;
import com.zitadel.ApiHttpResponse;
import com.zitadel.ObjectSerializer.SerializationException;
import com.zitadel.errors.BadRequestException;
import com.zitadel.errors.ClientException;
import com.zitadel.errors.ConflictException;
import com.zitadel.errors.ForbiddenException;
import com.zitadel.errors.InternalServerErrorException;
import com.zitadel.errors.NotFoundException;
import com.zitadel.errors.ServerException;
import com.zitadel.errors.UnauthorizedException;
import com.zitadel.errors.UnprocessableEntityException;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Resolves the OpenID Connect discovery document for a Zitadel host.
 *
 * <p>The constructor only validates and normalises the host; it performs no I/O. The {@code
 * token_endpoint} is fetched through the shared {@link ApiClient} the first time {@link
 * #getTokenEndpoint} is called, so discovery honours the SDK's proxy, TLS and timeout settings and
 * fails with the same error types as any other request:
 *
 * <ul>
 *   <li>no HTTP response: {@link com.zitadel.errors.NetworkException} or {@link
 *       com.zitadel.errors.NetworkTimeoutException};
 *   <li>a non-2xx status: the {@link ApiException} subclass for that status;
 *   <li>a body that is not a JSON object with a {@code token_endpoint}: {@link
 *       SerializationException}.
 * </ul>
 */
@SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
public class OpenId {

  private static final String WELL_KNOWN_PATH = "/.well-known/openid-configuration";

  private final String hostEndpoint;
  private final String wellKnownUrl;

  @Nullable private volatile String tokenEndpoint;

  /**
   * Validates and normalises the host. A host without a scheme gets {@code https://}.
   *
   * @param host the Zitadel instance host name or URL.
   * @throws IllegalArgumentException if the host is empty, uses a scheme other than http or https,
   *     or is not a valid URL.
   */
  public OpenId(String host) {
    this.hostEndpoint = normaliseHost(host);
    URI uri = URI.create(hostEndpoint);
    this.wellKnownUrl = uri.getScheme() + "://" + uri.getRawAuthority() + WELL_KNOWN_PATH;
  }

  @SuppressWarnings("HttpUrlsUsage")
  private static String normaliseHost(@Nullable String host) {
    String trimmed = host == null ? "" : host.trim();
    if (trimmed.isEmpty()) {
      throw new IllegalArgumentException("Host cannot be empty.");
    }
    String lower = trimmed.toLowerCase(Locale.ROOT);
    if (!lower.startsWith("http://") && !lower.startsWith("https://")) {
      if (trimmed.contains("://")) {
        throw new IllegalArgumentException("Host must use the http or https scheme: " + trimmed);
      }
      trimmed = "https://" + trimmed;
    }
    try {
      URI uri = new URI(trimmed);
      if (uri.getHost() == null || uri.getHost().isEmpty()) {
        throw new IllegalArgumentException("Host is not a valid URL: " + trimmed);
      }
    } catch (URISyntaxException e) {
      throw new IllegalArgumentException("Host is not a valid URL: " + trimmed, e);
    }
    return trimmed;
  }

  /**
   * Returns the normalised host endpoint.
   *
   * @return the host endpoint.
   */
  public String getHostEndpoint() {
    return hostEndpoint;
  }

  /**
   * Returns the OAuth2 token endpoint, fetching the discovery document through the given API client
   * on first access and caching the result.
   *
   * @param apiClient the shared API client used for the discovery request.
   * @return the token endpoint URL.
   * @throws ApiException if discovery fails at the transport or HTTP level.
   * @throws SerializationException if the discovery document is unusable.
   */
  public String getTokenEndpoint(ApiClient apiClient) {
    String resolved = tokenEndpoint;
    if (resolved == null) {
      synchronized (this) {
        resolved = tokenEndpoint;
        if (resolved == null) {
          resolved = discover(apiClient);
          tokenEndpoint = resolved;
        }
      }
    }
    return resolved;
  }

  private String discover(ApiClient apiClient) {
    ApiHttpResponse response =
        apiClient.sendRequest(
            "GET", wellKnownUrl, Collections.singletonMap("Accept", "application/json"), null);
    int status = response.statusCode();
    if (status < 200 || status >= 300) {
      throw statusException(
          status,
          "OpenID discovery at " + wellKnownUrl + " failed with status " + status,
          response.headers(),
          response.body());
    }
    JsonNode root;
    try {
      root = new ObjectMapper().readTree(response.body());
    } catch (JsonProcessingException e) {
      throw new SerializationException(
          "OpenID configuration at " + wellKnownUrl + " is not a JSON object", e);
    }
    if (root == null || !root.isObject()) {
      throw new SerializationException(
          "OpenID configuration at " + wellKnownUrl + " is not a JSON object");
    }
    JsonNode endpoint = root.get("token_endpoint");
    if (endpoint == null || !endpoint.isTextual() || endpoint.asText().isEmpty()) {
      throw new SerializationException(
          "OpenID configuration at " + wellKnownUrl + " has no valid token_endpoint");
    }
    return endpoint.asText();
  }

  private static ApiException statusException(
      int status, String message, Map<String, String> headers, String body) {
    return switch (status) {
      case 400 -> new BadRequestException(message, headers, body, null);
      case 401 -> new UnauthorizedException(message, headers, body, null);
      case 403 -> new ForbiddenException(message, headers, body, null);
      case 404 -> new NotFoundException(message, headers, body, null);
      case 409 -> new ConflictException(message, headers, body, null);
      case 422 -> new UnprocessableEntityException(message, headers, body, null);
      case 500 -> new InternalServerErrorException(message, headers, body, null);
      default -> {
        if (status >= 400 && status < 500) {
          yield new ClientException(status, message, headers, body, null);
        }
        if (status >= 500) {
          yield new ServerException(status, message, headers, body, null);
        }
        yield new ApiException(status, message, headers, body, null);
      }
    };
  }
}
