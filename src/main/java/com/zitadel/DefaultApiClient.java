    package com.zitadel;

    import com.fasterxml.jackson.core.type.TypeReference;
    import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
    import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
    import org.apache.hc.client5.http.config.ConnectionConfig;
    import org.apache.hc.client5.http.config.RequestConfig;
    import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
    import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
    import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
    import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
    import org.apache.hc.core5.http.ContentType;
    import org.apache.hc.core5.http.Header;
    import org.apache.hc.core5.http.io.entity.StringEntity;
    import org.apache.hc.core5.net.URIBuilder;
    import org.apache.hc.core5.util.Timeout;

    import javax.annotation.Nullable;
    import java.io.IOException;
    import java.net.URI;
    import java.net.URISyntaxException;
    import java.net.URLEncoder;
    import java.nio.charset.StandardCharsets;
    import java.util.*;
    import java.util.function.Function;

    /**
     * A self-contained, Apache HttpClient-based API client implementation.
     *
     * <p>This client supports custom HttpClient configuration via an optional configurator,
     * allowing proxy settings, disabling TLS verification, adding custom headers, etc.</p>
     *
     * <p>Example:</p>
     * <pre>
     * import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
     * import org.apache.hc.core5.http.HttpHost;
     * import org.apache.hc.core5.ssl.SSLContextBuilder;
     * import org.apache.hc.core5.ssl.SSLContexts;
     * import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
     *
     * Configuration config = new Configuration(new PersonalAccessTokenAuthenticator("https://api.example.com", "test-token"));
     *
     * Function<HttpClientBuilder, <HttpClientBuilder> clientConfigurator = builder -> {
     *     try {
     *         // Disable SSL certificate verification
     *         builder.setSSLContext(new SSLContextBuilder()
     *             .loadTrustMaterial(null, (chain, authType) -> true)
     *             .build());
     *         builder.setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE);
     *     } catch (Exception e) {
     *         throw new RuntimeException("Failed to configure SSL context", e);
     *     }
     *
     *     builder.setProxy(new HttpHost("proxy.example.com", 3128));
     *     builder.addRequestInterceptorFirst((request, context) ->
     *         request.addHeader("X-My-Custom-Header", "custom-value")
     *     );
     *
     *     return builder;
     * };
     *
     * DefaultApiClient apiClient = new DefaultApiClient(config, clientConfigurator);
     * </pre>
     */
    @SuppressFBWarnings(
        value = {
            "DE_MIGHT_IGNORE",
            "SIC_INNER_SHOULD_BE_STATIC_ANON",
        },
        justification = "Intentional fallback logic in lambda; anonymous class is acceptable"
    )
    @SuppressWarnings({"unused", "JavadocLinkAsPlainText"})
    public final class DefaultApiClient implements IApiClient {
        private final CloseableHttpClient httpClient;
        private final Configuration config;
        private final ObjectSerializer serializer;

        public DefaultApiClient(Configuration config, Function<HttpClientBuilder, HttpClientBuilder> clientConfigurator) {
            this.config = config;
            this.serializer = new ObjectSerializer();

            final ConnectionConfig connectionConfig = ConnectionConfig.custom()
                .setConnectTimeout(Timeout.of(config.getConnectTimeout()))
                .build();

            final PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                .setDefaultConnectionConfig(connectionConfig)
                .build();

            final RequestConfig requestConfig = RequestConfig.custom()
                .setResponseTimeout(Timeout.of(config.getTimeout()))
                .build();

            HttpClientBuilder builder = HttpClientBuilder.create()
                .setConnectionManager(connectionManager)
                .setDefaultRequestConfig(requestConfig);

            if (clientConfigurator != null) {
                builder = clientConfigurator.apply(builder);
            }

            this.httpClient = builder.build();
        }

        @SuppressWarnings("unused")
        public DefaultApiClient(Configuration config) {
            this(config, Function.identity());
        }

        @SuppressWarnings("UastIncorrectHttpHeaderInspection")
        @Override
        public <T> T invokeAPI(
            String operationId,
            String pathTemplate,
            String method,
            Map<String, Object> pathParams,
            Map<String, Object> queryParams,
            Map<String, Collection<String>> headerParams,
            @Nullable Object body,
            @Nullable TypeReference<T> successType,
            @Nullable Map<String, TypeReference<?>> errorTypes
        ) throws ZitadelException {
            try {
                String finalPath = buildPath(pathTemplate, pathParams);
                URIBuilder uriBuilder = new URIBuilder(this.config.getHost() + finalPath);
                if (queryParams != null) {
                    for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                        uriBuilder.addParameter(entry.getKey(), entry.getValue().toString());
                    }
                }
                final URI uri = uriBuilder.build();
                final var request1 = new HttpUriRequestBase(method, uri);
                request1.setHeader("Accept", "application/json");
                request1.setHeader("Authorization", "Bearer " + config.getAccessToken());
                request1.setHeader("User-Agent", config.getUserAgent());
                request1.setHeader("X-Operation-Id", operationId);
                if (headerParams != null) {
                    for (Map.Entry<String, Collection<String>> entry : headerParams.entrySet()) {
                        for (String value : entry.getValue()) {
                            request1.addHeader(entry.getKey(), value);
                        }
                    }
                }
                if (body != null) {
                    request1.setHeader("Content-Type", "application/json");
                    request1.setEntity(new StringEntity(serializer.serialize(body), ContentType.APPLICATION_JSON.withCharset(StandardCharsets.UTF_8)));
                }
                HttpUriRequestBase request = request1;

                return this.httpClient.execute(request, response -> {
                    final int statusCode = response.getCode();
                    final var responseEntity = response.getEntity();
                    final String responseBody = (responseEntity == null) ? "" : new String(responseEntity.getContent().readAllBytes(), StandardCharsets.UTF_8);

                    if (statusCode >= 200 && statusCode < 300) {
                        if (successType != null && !responseBody.isEmpty()) {
                            return this.serializer.deserialize(responseBody, successType);
                        }
                        return null;
                    } else {
                        Optional<TypeReference<?>> responseType = findErrorType(statusCode, errorTypes);

                        Object errorBody = null;
                        if (responseType.isPresent()) {
                            try {
                                errorBody = this.serializer.deserialize(responseBody, responseType.get());
                            } catch (Exception e) {
                                // Fallback will be used
                            }
                        }
                        if (errorBody == null) {
                            try {
                                errorBody = this.serializer.deserialize(responseBody, new TypeReference<Map<String, Object>>() {});
                            } catch (Exception e) {
                                errorBody = responseBody;
                            }
                        }
                        throw new ApiException(statusCode, buildHeadersMap(response.getHeaders()), errorBody);
                    }
                });
            } catch (IOException | URISyntaxException e) {
                throw new ZitadelException(String.format("[%s] API Request failed.", operationId), e);
            }
        }

        private Optional<TypeReference<?>> findErrorType(int statusCode, @Nullable Map<String, TypeReference<?>> errorTypes) {
            if (errorTypes == null) {
                return Optional.empty();
            }
            TypeReference<?> errorType = errorTypes.get(String.valueOf(statusCode));
            if (errorType == null) {
                errorType = errorTypes.get(statusCode / 100 + "XX");
            }
            if (errorType == null) {
                errorType = errorTypes.get("default");
            }
            return Optional.ofNullable(errorType);
        }

        private String buildPath(String pathTemplate, Map<String, Object> pathParams) {
            String result = pathTemplate;
            if (pathParams != null) {
                for (Map.Entry<String, Object> entry : pathParams.entrySet()) {
                    String value = URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8);
                    result = result.replace("{" + entry.getKey() + "}", value);
                }
            }
            return result;
        }

        private Map<String, Collection<String>> buildHeadersMap(Header[] headers) {
            Map<String, Collection<String>> map = new HashMap<>();
            if (headers != null) {
                for (Header header : headers) {
                    map.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
                }
            }
            return map;
        }
    }
