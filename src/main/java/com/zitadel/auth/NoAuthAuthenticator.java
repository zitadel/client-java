package com.zitadel.auth;

import com.zitadel.ZitadelException;
import com.zitadel.utils.URLUtil;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/**
 * Authenticator implementation for testing purposes.
 *
 * <p>This strategy applies no authentication and returns empty headers.
 */
public class NoAuthAuthenticator extends Authenticator {

    private final String token;

    /**
     * Constructs a NoAuthAuthenticator.
     *
     * @param host The base URL for authentication endpoints.
     */
    public NoAuthAuthenticator(String host) {
        this(host, UUID.randomUUID().toString());
    }

    public NoAuthAuthenticator() {
        this("localhost");
    }

    public NoAuthAuthenticator(String host, String token) {
        super(URLUtil.buildHostname(host));
        this.token = token;
    }

    /**
     * Returns an empty set of authentication headers.
     *
     * @return An empty map.
     */
    @Override
    public Map<String, String> getAuthHeaders() {
        return Collections.emptyMap();
    }

    @Override
    public String getAuthToken() throws ZitadelException {
        return token;
    }
}
