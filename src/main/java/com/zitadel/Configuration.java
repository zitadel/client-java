package com.zitadel;

import com.zitadel.auth.Authenticator;

import java.time.Duration;
import java.util.Locale;

public class Configuration {

    private final Authenticator authenticator;
    private final Duration timeout;
    private final Duration connectTimeout;
    private final String userAgent;

    /**
     * Initializes a new instance of the Configuration.
     *
     * @param authenticator  The authenticator for signing requests.
     * @param timeout        The total request timeout.
     * @param connectTimeout The connection timeout.
     */
    public Configuration(Authenticator authenticator, Duration timeout, Duration connectTimeout) {
        this.authenticator = authenticator;
        this.timeout = timeout;
        this.connectTimeout = connectTimeout;
        this.userAgent = myUserAgent();
    }

    /**
     * Initializes a new instance with default timeouts.
     *
     * @param authenticator The authenticator for signing requests.
     */
    public Configuration(Authenticator authenticator) {
        this(authenticator, Duration.ofSeconds(30), Duration.ofSeconds(5));
    }

    private static String myUserAgent() {
        return String.format("zitadel-client/%s (lang=java; lang_version=%s; os=%s; arch=%s)",
            Version.VERSION,
            System.getProperty("java.version"),
            System.getProperty("os.name"),
            System.getProperty("os.arch")
        ).toLowerCase(Locale.ENGLISH);
    }

    /**
     * Gets the authentication access token (Bearer Token).
     *
     * @return String The authentication access token.
     */
    public String getAccessToken() {
        return this.authenticator.getAuthToken();
    }

    /**
     * Gets the API host URL (e.g., "<a href="https://api.zitadel.ch">...</a>").
     *
     * @return String The API host URL.
     */
    public String getHost() {
        return this.authenticator.getHost();
    }

    /**
     * Gets the User-Agent string for the client.
     *
     * @return String The User-Agent string.
     */
    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Gets the total request timeout.
     *
     * @return Duration The total request timeout.
     */
    public Duration getTimeout() {
        return this.timeout;
    }

    /**
     * Gets the connection timeout.
     *
     * @return Duration The time to wait for a connection to be established.
     */
    public Duration getConnectTimeout() {
        return this.connectTimeout;
    }
}
