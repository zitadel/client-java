package com.zitadel;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Immutable transport options for configuring HTTP connections.
 *
 * <p>Provides settings for default headers, custom CA certificate paths, insecure
 * (trust-all) TLS connections, and proxy configuration. Use the {@link Builder} to construct instances.
 */
public class TransportOptions {

    private final Map<String, String> defaultHeaders;
    @Nullable
    private final String caCertPath;
    private final boolean insecure;
    @Nullable
    private final String proxyUrl;

    private TransportOptions(Map<String, String> defaultHeaders, @Nullable String caCertPath, boolean insecure, @Nullable String proxyUrl) {
        this.defaultHeaders = Collections.unmodifiableMap(new LinkedHashMap<>(defaultHeaders));
        this.caCertPath = caCertPath;
        this.insecure = insecure;
        this.proxyUrl = proxyUrl;
    }

    /**
     * Returns a default {@code TransportOptions} instance with no custom headers,
     * no CA cert path, and insecure mode disabled.
     *
     * @return the default transport options.
     */
    public static TransportOptions defaults() {
        return new TransportOptions(Collections.emptyMap(), null, false, null);
    }

    /**
     * Returns the default headers to include in every request.
     *
     * @return an unmodifiable map of header names to values.
     */
    public Map<String, String> getDefaultHeaders() {
        return defaultHeaders;
    }

    /**
     * Returns the path to a custom CA certificate file used for TLS verification.
     *
     * @return the CA cert file path, or {@code null} if not set.
     */
    @Nullable
    public String getCaCertPath() {
        return caCertPath;
    }

    /**
     * Returns whether insecure (trust-all) TLS mode is enabled.
     *
     * @return {@code true} if insecure mode is enabled; {@code false} otherwise.
     */
    public boolean isInsecure() {
        return insecure;
    }

    /**
     * Returns the proxy URL used for HTTP connections.
     *
     * @return the proxy URL, or {@code null} if not set.
     */
    @Nullable
    public String getProxyUrl() {
        return proxyUrl;
    }

    /**
     * Builder for constructing {@link TransportOptions} instances.
     */
    public static class Builder {

        private final Map<String, String> defaultHeaders = new LinkedHashMap<>();
        @Nullable
        private String caCertPath;
        private boolean insecure;
        @Nullable
        private String proxyUrl;

        /**
         * Adds a default header to include in every request.
         *
         * @param key   the header name.
         * @param value the header value.
         * @return this builder.
         */
        public Builder defaultHeader(String key, String value) {
            this.defaultHeaders.put(key, value);
            return this;
        }

        /**
         * Sets the path to a custom CA certificate file for TLS verification.
         *
         * @param path the CA cert file path.
         * @return this builder.
         */
        public Builder caCertPath(String path) {
            this.caCertPath = path;
            return this;
        }

        /**
         * Sets whether insecure (trust-all) TLS mode should be enabled.
         *
         * @param insecure {@code true} to trust all certificates; {@code false} otherwise.
         * @return this builder.
         */
        public Builder insecure(boolean insecure) {
            this.insecure = insecure;
            return this;
        }

        /**
         * Sets the proxy URL for HTTP connections.
         *
         * @param proxyUrl the proxy URL (e.g. {@code "http://proxy:8080"}).
         * @return this builder.
         */
        public Builder proxyUrl(String proxyUrl) {
            this.proxyUrl = proxyUrl;
            return this;
        }

        /**
         * Builds the {@link TransportOptions} instance.
         *
         * @return a new immutable {@code TransportOptions}.
         */
        public TransportOptions build() {
            return new TransportOptions(defaultHeaders, caCertPath, insecure, proxyUrl);
        }
    }
}
