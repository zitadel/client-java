package com.zitadel;

import com.zitadel.model.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
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
class SessionServiceSanityCheckSpec extends BaseTest {

    private final Supplier<String> validToken = () -> System.getProperty("AUTH_TOKEN");
    private final Supplier<String> baseUrl = () -> System.getProperty("BASE_URL");
    private Zitadel client;
    private SessionServiceCreateSessionResponse session;

    @BeforeAll
    void initClient() {
        client = Zitadel.withAccessToken(baseUrl.get(), validToken.get());
    }

    @BeforeEach
    void setUp() throws ApiException {
        SessionServiceCreateSessionRequest request = new SessionServiceCreateSessionRequest()
            .checks(new SessionServiceChecks()
                .user(new SessionServiceCheckUser().loginName("johndoe")))
            .lifetime("18000s");

        session = client.sessions.sessionServiceCreateSession(request);
    }

    @AfterEach
    void tearDown() {
        try {
            client.sessions.sessionServiceDeleteSession(
                session.getSessionId(),
                new SessionServiceDeleteSessionBody()
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
            client.sessions.sessionServiceGetSession(
                session.getSessionId(),
                session.getSessionToken()
            );
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
            client.sessions.sessionServiceListSessions(request);
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
            .lifetime("36000s");

        SessionServiceSetSessionResponse response =
            client.sessions.sessionServiceSetSession(
                session.getSessionId(), request
            );
        assertNotNull(response.getSessionToken());
    }

    /**
     * Raises an ApiException when retrieving a non-existent session.
     */
    @Test
    void testRaisesApiExceptionForNonexistentSession() {
        assertThrows(ApiException.class, () ->
            client.sessions.sessionServiceGetSession(
                UUID.randomUUID().toString(),
                session.getSessionToken()
            )
        );
    }
}
