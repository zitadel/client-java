package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

@SuppressWarnings("NewClassNamingConvention")
public class SDKTestUsingClientCredentialsAuthenticationSpec extends BaseTest {

    private final String clientId = System.getProperty("CLIENT_ID");
    private final String clientSecret = System.getProperty("CLIENT_SECRET");
    private final String baseUrl = System.getProperty("BASE_URL");
    private String userId;

    /**
     * Sets up the test environment before each test by creating a user.
     */
    @BeforeEach
    void setUp() {
        userId = createUser();
    }

    /**
     * Creates a new user in Zitadel using a valid Personal Access Token.
     *
     * @return the user ID of the newly created user
     */
    private String createUser() {
        Zitadel zitadel = Zitadel.withClientCredentials(baseUrl, clientId, clientSecret);

        try {
            UserServiceAddHumanUserResponse response = zitadel.users.userServiceAddHumanUser(new UserServiceAddHumanUserRequest()
                .username(UUID.randomUUID().toString())
                .profile(new UserServiceSetHumanProfile()
                    .givenName("John")
                    .familyName("Doe"))
                .email(new UserServiceSetHumanEmail()
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
        Zitadel zitadel = Zitadel.withClientCredentials(baseUrl, clientId, clientSecret);

        try {
            UserServiceDeactivateUserResponse deactivateResponse = zitadel.users.userServiceDeactivateUser(userId);
            System.out.println("User deactivated: " + deactivateResponse);

            UserServiceReactivateUserResponse reactivateResponse = zitadel.users.userServiceReactivateUser(userId);
            System.out.println("User reactivated: " + reactivateResponse);
            // assertEquals("success", reactivateResponse.getStatus());
        } catch (ApiException e) {
            fail("Exception when calling deactivateUser or reactivateUser with valid token: " + e.getMessage());
        }
    }

    /**
     * Tests deactivating and reactivating a user with an invalid Personal Access Token.
     * <p>
     * It expects an exception to be thrown for both deactivate and reactivate operations.
     */
    @Test
    void shouldNotDeactivateOrReactivateUserWithInvalidToken() {
        Zitadel zitadel = Zitadel.withClientCredentials(baseUrl, "clientId", "clientSecret");

        try {
            zitadel.users.userServiceDeactivateUser(userId);
            fail("Expected exception when deactivating user with invalid token, but got response.");
        } catch (Exception e) {
            // assertTrue(e.getMessage().contains("Unauthorized"));
            System.out.println("Caught expected ApiException: " + e.getMessage());
        }

        try {
            zitadel.users.userServiceReactivateUser(userId);
            fail("Expected exception when reactivating user with invalid token, but got response.");
        } catch (Exception e) {
            // assertTrue(e.getMessage().contains("Unauthorized"));
            System.out.println("Caught expected ApiException: " + e.getMessage());
        }
    }
}
