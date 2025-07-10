package com.zitadel;

import com.fasterxml.jackson.core.type.TypeReference;
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

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@SuppressWarnings("unused")
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
    public Object invokeAPI(
        String operationId,
        String pathTemplate,
        String method,
        Map<String, Object> pathParams,
        Map<String, Object> queryParams,
        Map<String, Collection<String>> headerParams,
        Object body,
        Map<Integer, TypeReference<?>> responseTypes
    ) throws ApiException {
        try {
            String finalPath = buildPath(pathTemplate, pathParams);
            URIBuilder uriBuilder = new URIBuilder(this.config.getHost() + finalPath);
            if (queryParams != null) {
                for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                    uriBuilder.addParameter(entry.getKey(), entry.getValue().toString());
                }
            }
            final URI uri = uriBuilder.build();
            final var request = new HttpUriRequestBase(method, uri);

            request.setHeader("Accept", "application/json");
            request.setHeader("Authorization", "Bearer " + config.getAccessToken());
            request.setHeader("User-Agent", config.getUserAgent());
            request.setHeader("X-Operation-Id", operationId);
            if (headerParams != null) {
                for (Map.Entry<String, Collection<String>> entry : headerParams.entrySet()) {
                    for (String value : entry.getValue()) {
                        request.addHeader(entry.getKey(), value);
                    }
                }
            }

            if (body != null) {
                request.setHeader("Content-Type", "application/json");
                request.setEntity(new StringEntity(serializer.serialize(body), ContentType.APPLICATION_JSON.withCharset(StandardCharsets.UTF_8)));
            }

            return this.httpClient.execute(request, response -> {
                final int statusCode = response.getCode();
                final var responseEntity = response.getEntity();
                final String responseBody = (responseEntity == null) ? "" : new String(responseEntity.getContent().readAllBytes());
                final var responseType = responseTypes.get(statusCode);

                if (statusCode >= 200 && statusCode < 300) {
                    if (responseType != null) {
                        return this.serializer.deserialize(responseBody, responseType);
                    }
                    return null;
                } else {
                    Object errorBody = null;
                    if (responseType != null) {
                        try {
                            errorBody = this.serializer.deserialize(responseBody, responseType);
                        } catch (Exception e) {
                            // Fallback will be used
                        }
                    }
                    if (errorBody == null) {
                        try {
                            errorBody = this.serializer.deserialize(responseBody, new TypeReference<Map<String, Object>>() {
                            });
                        } catch (Exception e) {
                            errorBody = responseBody;
                        }
                    }
                    throw new ApiException(statusCode, buildHeadersMap(response.getHeaders()), errorBody);
                }
            });
        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(String.format("[%s] API Request failed.", operationId), e);
        }
    }

    private String buildPath(String pathTemplate, Map<String, Object> pathParams) {
        String result = pathTemplate;
        for (Map.Entry<String, Object> entry : pathParams.entrySet()) {
            String value = URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8);
            result = result.replace("{" + entry.getKey() + "}", value);
        }
        return result;
    }

    private Map<String, Collection<String>> buildHeadersMap(Header[] headers) {
        Map<String, Collection<String>> map = new HashMap<>();
        for (Header header : headers) {
            map.computeIfAbsent(header.getName(), k -> new ArrayList<>()).add(header.getValue());
        }
        return map;
    }
}
