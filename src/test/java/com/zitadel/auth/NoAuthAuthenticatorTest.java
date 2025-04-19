package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class NoAuthAuthenticatorTest {

  @Test
  void returnsEmptyHeadersAndDefaultHost() {
    NoAuthAuthenticator auth = new NoAuthAuthenticator();

    assertEquals(Collections.emptyMap(), auth.getAuthHeaders());
    assertEquals("https://localhost", auth.getHost());
  }

  @Test
  void returnsEmptyHeadersAndCustomHost() {
    NoAuthAuthenticator auth = new NoAuthAuthenticator("https://custom-host");

    assertEquals(Collections.emptyMap(), auth.getAuthHeaders());
    assertEquals("https://custom-host", auth.getHost());
  }
}
