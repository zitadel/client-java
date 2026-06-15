package com.zitadel;

import com.zitadel.auth.PersonalAccessTokenAuthenticator;
import com.zitadel.model.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserService Integration Tests
 * <p>
 * This suite verifies the Zitadel UserService API's basic operations using a
 * personal access token:
 * <p>
 * 1. Create a human user
 * 2. Retrieve the user by ID
 * 3. List users and ensure the created user appears
 * 4. Update the user's email and confirm the change
 * 5. Error when retrieving a non-existent user
 * <p>
 * Each test runs in isolation: a new session is created in @BeforeEach and deleted in
 * {@code @AfterEach} to ensure a clean state.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SuppressWarnings("NewClassNamingConvention")
class UserServiceSanityCheckSpec extends AbstractIntegrationTest {

    private Zitadel client;
    private UserServiceAddHumanUserResponse user;

    @BeforeAll
    void initClient() {
        client = Zitadel.withAuthenticator(
            new PersonalAccessTokenAuthenticator(getBaseUrl(), getAuthToken()));
    }

    /**
     * Create a new human user before each test.
     */
    @BeforeEach
    void setUp() throws ApiException {
        UserServiceAddHumanUserRequest request = new UserServiceAddHumanUserRequest();
        request.username = UUID.randomUUID().toString();
        UserServiceSetHumanProfile profile = new UserServiceSetHumanProfile();
        profile.givenName = "John";
        profile.familyName = "Doe";
        request.profile = profile;
        UserServiceSetHumanEmail email = new UserServiceSetHumanEmail();
        email.email = "johndoe" + UUID.randomUUID() + "@example.com";
        request.email = email;

        user = client.userService.addHumanUser(request);
    }

    /**
     * Delete the created human user after each test.
     */
    @AfterEach
    void tearDown() {
        try {
            UserServiceDeleteUserRequest deleteRequest = new UserServiceDeleteUserRequest();
            deleteRequest.userId = user.userId;
            client.userService.deleteUser(deleteRequest);
        } catch (ApiException ignored) {
            // cleanup errors are ignored
        }
    }

    /**
     * Retrieves the user details by ID.
     */
    @Test
    void testRetrievesUserDetailsById() throws ApiException {
        UserServiceGetUserByIDRequest getRequest = new UserServiceGetUserByIDRequest();
        getRequest.userId = user.userId;
        UserServiceGetUserByIDResponse response = client.userService.getUserByID(getRequest);
        assertNotNull(response.user);
        assertEquals(user.userId, response.user.userId);
    }

    /**
     * Includes the created user when listing all users.
     */
    @Test
    void testIncludesCreatedUserWhenListing() throws ApiException {
        UserServiceListUsersRequest request = new UserServiceListUsersRequest();
        request.queries = List.of();

        UserServiceListUsersResponse response = client.userService.listUsers(request);
        assertNotNull(response.result);
        List<String> ids = response.result.stream()
            .map(u -> u.userId)
            .collect(Collectors.toList());
        assertTrue(ids.contains(user.userId));
    }

    /**
     * Updates the user's email and returns a new email reflecting the change.
     */
    @SuppressWarnings("DataFlowIssue")
    @Test
    void testUpdatesUserEmailAndReflectsInGet() throws ApiException {
        UserServiceUpdateHumanUserRequest updateRequest = new UserServiceUpdateHumanUserRequest();
        updateRequest.userId = user.userId;
        UserServiceSetHumanEmail email = new UserServiceSetHumanEmail();
        email.email = "updated" + UUID.randomUUID() + "@example.com";
        updateRequest.email = email;
        client.userService.updateHumanUser(updateRequest);

        UserServiceGetUserByIDRequest getRequest = new UserServiceGetUserByIDRequest();
        getRequest.userId = user.userId;
        UserServiceGetUserByIDResponse response = client.userService.getUserByID(getRequest);
        UserServiceUser fetched = Objects.requireNonNull(response.user);
        UserServiceHumanUser human = Objects.requireNonNull(fetched.human);
        UserServiceHumanEmail humanEmail = Objects.requireNonNull(human.email);
        assertNotNull(humanEmail);
        assertTrue(Objects.requireNonNull(humanEmail.email).contains("updated"));
    }

    /**
     * Raises an ApiException when retrieving a non-existent user.
     */
    @Test
    void testRaisesApiExceptionForNonexistentUser() {
        assertThrows(ApiException.class, () -> {
            UserServiceGetUserByIDRequest getRequest = new UserServiceGetUserByIDRequest();
            getRequest.userId = UUID.randomUUID().toString();
            client.userService.getUserByID(getRequest);
        });
    }
}
