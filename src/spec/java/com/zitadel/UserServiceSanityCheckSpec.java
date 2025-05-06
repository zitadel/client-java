package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
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
class UserServiceSanityCheckSpec extends BaseTest {

    @SuppressWarnings("UnnecessaryLambda")
    private final Supplier<String> validToken = () -> System.getProperty("AUTH_TOKEN");
    @SuppressWarnings("UnnecessaryLambda")
    private final Supplier<String> baseUrl = () -> System.getProperty("BASE_URL");
    private Zitadel client;
    private UserServiceAddHumanUserResponse user;

    @BeforeAll
    void initClient() {
        client = Zitadel.withAccessToken(baseUrl.get(), validToken.get());
    }

    /**
     * Create a new human user before each test.
     */
    @BeforeEach
    void setUp() throws ApiException {
        UserServiceAddHumanUserRequest request = new UserServiceAddHumanUserRequest()
            .username(UUID.randomUUID().toString())
            .profile(new UserServiceSetHumanProfile()
                .givenName("John")
                .familyName("Doe"))
            .email(new UserServiceSetHumanEmail()
                .email("johndoe" + UUID.randomUUID() + "@example.com"));

        user = client.users.userServiceAddHumanUser(request);
    }

    /**
     * Delete the created human user after each test.
     */
    @AfterEach
    void tearDown() {
        try {
            client.users.userServiceDeleteUser(user.getUserId());
        } catch (ApiException ignored) {
            // cleanup errors are ignored
        }
    }

    /**
     * Retrieves the user details by ID.
     */
    @Test
    void testRetrievesUserDetailsById() throws ApiException {
        UserServiceGetUserByIDResponse response = client.users.userServiceGetUserByID(
            user.getUserId()
        );
        assertNotNull(response.getUser());
        assertEquals(user.getUserId(), response.getUser().getUserId());
    }

    /**
     * Includes the created user when listing all users.
     */
    @Test
    void testIncludesCreatedUserWhenListing() throws ApiException {
        UserServiceListUsersRequest request = new UserServiceListUsersRequest()
            .query(new UserServiceListQuery());

        UserServiceListUsersResponse response = client.users.userServiceListUsers(request);
        assertNotNull(response.getResult());
        List<String> ids = response.getResult().stream()
            .map(UserServiceUser::getUserId)
            .collect(Collectors.toList());
        assertTrue(ids.contains(user.getUserId()));
    }

    /**
     * Updates the user's email and returns a new email reflecting the change.
     */
    @SuppressWarnings("DataFlowIssue")
    @Test
    void testUpdatesUserEmailAndReflectsInGet() throws ApiException {
        client.users.userServiceUpdateHumanUser(
            user.getUserId(),
            new UserServiceUpdateHumanUserRequest()
                .email(new UserServiceSetHumanEmail()
                    .email("updated" + UUID.randomUUID() + "@example.com"))
        );

        UserServiceGetUserByIDResponse response = client.users.userServiceGetUserByID(
            user.getUserId()
        );
        assertNotNull(response.getUser().getHuman().getEmail());
        assertTrue(response.getUser().getHuman().getEmail().getEmail().contains("updated"));
    }

    /**
     * Raises an ApiException when retrieving a non-existent user.
     */
    @Test
    void testRaisesApiExceptionForNonexistentUser() {
        assertThrows(ApiException.class, () ->
            client.users.userServiceGetUserByID(UUID.randomUUID().toString())
        );
    }
}
