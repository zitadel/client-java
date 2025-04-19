package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

/**
* This spec tests the SDK behavior using Personal Access Token (PAT) authentication.
* It includes test cases for valid and invalid token scenarios related to user deactivation and reactivation.
*/
@SuppressWarnings("NewClassNamingConvention")
class SDKTestUsingWebTokenAssertionAuthenticationSpec extends BaseTest {

private final String baseUrl = System.getProperty("BASE_URL");
private String keyFile;
private String userId;

/**
* Sets up the test environment before each test by creating a user.
*/
@BeforeEach
void setUp() throws IOException {
	String k = System.getProperty("JWT_KEY");
	if (k == null) System.exit(1);
	File f = File.createTempFile("jwt_", null);
	Files.write(f.toPath(), k.getBytes());
	keyFile = f.getAbsolutePath();
	userId = createUser();
}

/**
* Creates a new user in Zitadel using a valid Personal Access Token.
*
* @return the user ID of the newly created user
*/
private String createUser() {
  Zitadel zitadel = Zitadel.withPrivateKey(baseUrl, keyFile);

	try {
	V2AddHumanUserResponse response = zitadel.users.addHumanUser(new V2AddHumanUserRequest()
		.username(UUID.randomUUID().toString())
		.profile(new V2SetHumanProfile()
		.givenName("John")
		.familyName("Doe"))
		.email(new V2SetHumanEmail()
		.email("johndoe" + UUID.randomUUID() + "@caos.ag")));
	System.out.println("User created: " + response);
	return response.getUserId();
	} catch (ApiException e) {
	throw new RuntimeException("Exception while creating user: " + e.getMessage());
	}
}

/**
* Tests deactivating and reactivating a user with a valid Personal Access Token.
* <p>
* It expects the user to be deactivated and then reactivated successfully.
*/
@Test
void shouldDeactivateAndReactivateUserWithValidToken() {
	Zitadel zitadel = Zitadel.withPrivateKey(baseUrl, keyFile);

	try {
	V2DeactivateUserResponse deactivateResponse = zitadel.users.deactivateUser(userId);
	System.out.println("User deactivated: " + deactivateResponse);

	V2ReactivateUserResponse reactivateResponse = zitadel.users.reactivateUser(userId);
	System.out.println("User reactivated: " + reactivateResponse);
	// assertEquals("success", reactivateResponse.getStatus());
	} catch (ApiException e) {
	fail("Exception when calling deactivateUser or reactivateUser with valid token: " + e.getMessage());
	}
}
}
