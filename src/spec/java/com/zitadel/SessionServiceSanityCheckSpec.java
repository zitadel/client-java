package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.*;

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

        client.users.addHumanUser(new UserServiceAddHumanUserRequest()
            .username(userName)
            .profile(new UserServiceSetHumanProfile()
                .givenName("John")
                .familyName("Doe"))
            .email(new UserServiceSetHumanEmail()
                .email("johndoe" + UUID.randomUUID() + "@example.com")));

        session = client.sessions.createSession(new SessionServiceCreateSessionRequest()
            .checks(new SessionServiceChecks()
                .user(new SessionServiceCheckUser()
                    .loginName(userName)))
            .lifetime("18000s"));
    }

    @AfterEach
    void tearDown() {
        try {
            client.sessions.deleteSession(
                new SessionServiceDeleteSessionRequest().sessionId(session.getSessionId())
            );
        } catch (ApiException ignored) {
            // cleanup errors are ignored
        }
    }

    /**
     * Retrieves the session details by ID.
     */
    @Test
    void testRetrievesSessionDetailsById() throws ApiException {
        SessionServiceGetSessionResponse response =
            client.sessions.getSession(new SessionServiceGetSessionRequest()
                .sessionId(session.getSessionId())
                .sessionToken(session.getSessionToken()));
        assertNotNull(response.getSession());
        assertEquals(session.getSessionId(), response.getSession().getId());
    }

    /**
     * Includes the created session when listing all sessions.
     */
    @Test
    void testIncludesCreatedSessionWhenListing() throws ApiException {
        SessionServiceListSessionsRequest request = new SessionServiceListSessionsRequest()
            .query(new SessionServiceListQuery());

        SessionServiceListSessionsResponse response =
            client.sessions.listSessions(request);
        assertNotNull(response.getSessions());
        List<String> ids = response.getSessions().stream()
            .map(SessionServiceSession::getId)
            .collect(Collectors.toList());
        assertTrue(ids.contains(session.getSessionId()));
    }

    /**
     * Updates the session lifetime and returns a new token.
     */
    @Test
    void testUpdatesSessionLifetimeAndReturnsNewToken() throws ApiException {
        SessionServiceSetSessionRequest request = new SessionServiceSetSessionRequest()
            .sessionId(session.getSessionId())
            .lifetime("36000s");

        SessionServiceSetSessionResponse response =
            client.sessions.setSession(request);
        assertNotNull(response.getSessionToken());
    }

    /**
     * Raises an ApiException when retrieving a non-existent session.
     */
    @Test
    void testRaisesApiExceptionForNonexistentSession() {
        assertThrows(ApiException.class, () ->
            client.sessions.getSession(new SessionServiceGetSessionRequest()
                .sessionId(UUID.randomUUID().toString())
                .sessionToken(session.getSessionToken())
            ));
    }
}
