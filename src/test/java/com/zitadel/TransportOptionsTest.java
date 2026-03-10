package com.zitadel;

import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class TransportOptionsTest {

    @Test
    void testDefaultsReturnsNull() throws GeneralSecurityException, IOException {
        TransportOptions options = TransportOptions.defaults();
        assertNull(options.buildSSLContext());
    }

    @Test
    void testInsecureReturnsSSLContext() throws GeneralSecurityException, IOException {
        TransportOptions options = new TransportOptions(Map.of(), null, true, null);
        SSLContext ctx = options.buildSSLContext();
        assertNotNull(ctx);
    }

    @Test
    void testCaCertPathReturnsSSLContext() throws Exception {
        String caCertPath = Path.of(TransportOptionsTest.class.getClassLoader()
            .getResource("ca.pem").toURI()).toString();
        TransportOptions options = new TransportOptions(Map.of(), caCertPath, false, null);
        SSLContext ctx = options.buildSSLContext();
        assertNotNull(ctx);
    }

    @Test
    void testInsecureTakesPrecedenceOverCaCert() throws GeneralSecurityException, IOException {
        TransportOptions options = new TransportOptions(Map.of(), "/nonexistent/ca.pem", true, null);
        SSLContext ctx = options.buildSSLContext();
        assertNotNull(ctx);
    }

    @Test
    void testDefaultsFactory() {
        TransportOptions options = TransportOptions.defaults();

        assertEquals(Collections.emptyMap(), options.getDefaultHeaders());
        assertNull(options.getCaCertPath());
        assertFalse(options.isInsecure());
        assertNull(options.getProxyUrl());
    }
}
