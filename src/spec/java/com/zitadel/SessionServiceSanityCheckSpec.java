package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * SessionService Integration Tests
 * <p>
 * This suite verifies the Zitadel SessionService API's basic operations using a
 * personal access token:
 * <p>
 * 1. Create a session with specified checks and lifetime
 * 2. Retrieve the session by ID
 * 3. List sessions and ensure the created session appears
 * 4. Update the session's lifetime and confirm a new token is returned
 * 5. Error when retrieving a non-existent session
 * <p>
 * Each test runs in isolation: a new session is created in @BeforeEach and deleted in
 * {@code @AfterEach} to ensure a clean state.
 */
@SuppressWarnings("NewClassNamingConvention")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SessionServiceSanityCheckSpec extends AbstractIntegrationTest {

    private Zitadel client;
    private SessionServiceCreateSessionResponse session;

    @BeforeAll
    void initClient() {
        client = Zitadel.withAccessToken(getBaseUrl(), getAuthToken());
    }

    @BeforeEach
    void setUp() throws ApiException {
        String userName = UUID.randomUUID().toString();

        UserServiceAddHumanUserRequest humanUser = new UserServiceAddHumanUserRequest();
        humanUser.username = userName;
        UserServiceSetHumanProfile profile = new UserServiceSetHumanProfile();
        profile.givenName = "John";
        profile.familyName = "Doe";
        humanUser.profile = profile;
        UserServiceSetHumanEmail email = new UserServiceSetHumanEmail();
        email.email = "johndoe" + UUID.randomUUID() + "@example.com";
        humanUser.email = email;
        client.users.addHumanUser(humanUser);

        SessionServiceCreateSessionRequest createRequest = new SessionServiceCreateSessionRequest();
        SessionServiceChecks checks = new SessionServiceChecks();
        SessionServiceCheckUser checkUser = new SessionServiceCheckUser();
        checkUser.loginName = userName;
        checks.user = checkUser;
        createRequest.checks = checks;
        createRequest.lifetime = Duration.ofHours(5);
        session = client.sessions.createSession(createRequest);
    }

    @AfterEach
    void tearDown() {
        try {
            SessionServiceDeleteSessionRequest deleteRequest = new SessionServiceDeleteSessionRequest();
            deleteRequest.sessionId = session.sessionId;
            client.sessions.deleteSession(deleteRequest);
        } catch (ApiException ignored) {
            // cleanup errors are ignored
        }
    }

    /**
     * Retrieves the session details by ID.
     */
    @Test
    void testRetrievesSessionDetailsById() throws ApiException {
        SessionServiceGetSessionRequest getRequest = new SessionServiceGetSessionRequest();
        getRequest.sessionId = session.sessionId;
        getRequest.sessionToken = session.sessionToken;
        SessionServiceGetSessionResponse response = client.sessions.getSession(getRequest);
        assertNotNull(response.session);
        assertEquals(session.sessionId, response.session.id);
    }

    /**
     * Includes the created session when listing all sessions.
     */
    @Test
    void testIncludesCreatedSessionWhenListing() throws ApiException {
        SessionServiceListSessionsRequest request = new SessionServiceListSessionsRequest();
        request.queries = List.of();

        SessionServiceListSessionsResponse response =
            client.sessions.listSessions(request);
        assertNotNull(response.sessions);
        List<String> ids = response.sessions.stream()
            .map(s -> s.id)
            .collect(Collectors.toList());
        assertTrue(ids.contains(session.sessionId));
    }

    /**
     * Updates the session lifetime and returns a new token.
     */
    @Test
    void testUpdatesSessionLifetimeAndReturnsNewToken() throws ApiException {
        SessionServiceSetSessionRequest request = new SessionServiceSetSessionRequest();
        request.sessionId = session.sessionId;
        request.lifetime = Duration.ofHours(10);

        SessionServiceSetSessionResponse response =
            client.sessions.setSession(request);
        assertNotNull(response.sessionToken);
    }

    /**
     * Raises an ApiException when retrieving a non-existent session.
     */
    @Test
    void testRaisesApiExceptionForNonexistentSession() {
        assertThrows(ApiException.class, () -> {
            SessionServiceGetSessionRequest getRequest = new SessionServiceGetSessionRequest();
            getRequest.sessionId = UUID.randomUUID().toString();
            getRequest.sessionToken = session.sessionToken;
            client.sessions.getSession(getRequest);
        });
    }
}
