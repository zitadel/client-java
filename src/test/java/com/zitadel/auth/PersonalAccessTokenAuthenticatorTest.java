package com.zitadel.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class PersonalAccessTokenAuthenticatorTest {

  @Test
  void returnsExpectedHeadersAndHost() {
    PersonalAccessTokenAuthenticator auth =
        new PersonalAccessTokenAuthenticator("https://api.example.com", "my-secret-token");

    assertEquals(
        Collections.singletonMap("Authorization", "Bearer my-secret-token"), auth.getAuthHeaders());

    assertEquals("https://api.example.com", auth.getHost());
  }
}
