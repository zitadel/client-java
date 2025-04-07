package com.zitadel.auth;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonalAccessTokenAuthenticatorTest {

  @Test
  void returnsExpectedHeadersAndHost() throws MalformedURLException {
    PersonalAccessTokenAuthenticator auth = new PersonalAccessTokenAuthenticator(
      "https://api.example.com",
      "my-secret-token"
    );

    assertEquals(
      Collections.singletonMap("Authorization", "Bearer my-secret-token"),
      auth.getAuthHeaders()
    );

    assertEquals("https://api.example.com", auth.getHost());
  }
}
