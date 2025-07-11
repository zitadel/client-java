package com.zitadel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zitadel.auth.NoAuthAuthenticator;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.junit.jupiter.api.*;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
class DefaultApiClientTest {

    private static GenericContainer<?> mockApiServer;
    @SuppressWarnings("FieldCanBeLocal")
    private static String apiHost;
    private IApiClient apiClient;

    private static class SuccessModel {
        @Nullable
        public String status;
    }

    private static class ErrorModel {
    }

    @BeforeAll
    static void setUp() throws IOException, InterruptedException {
        mockApiServer =
            new GenericContainer<>(DockerImageName.parse("wiremock/wiremock:3.5.2"))
                .withExposedPorts(8080)
                .waitingFor(Wait.forHttp("/__admin/mappings").forStatusCode(200));
        mockApiServer.start();
        apiHost = "http://" + mockApiServer.getHost() + ":" + mockApiServer.getMappedPort(8080);

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String stubs = new String(Files.readAllBytes(Paths.get("src/test/resources/api.json")), StandardCharsets.UTF_8);
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(stubs);
            JsonNode mappings = rootNode.get("mappings");

            Iterator<JsonNode> mappingsIterator = mappings.elements();
            while (mappingsIterator.hasNext()) {
                JsonNode mapping = mappingsIterator.next();
                HttpPost postRequest = new HttpPost(apiHost + "/__admin/mappings");
                postRequest.setHeader("Content-Type", "application/json");
                postRequest.setEntity(new StringEntity(mapping.toString()));
                httpClient.execute(postRequest, response -> {
                    EntityUtils.consume(response.getEntity());
                    return null;
                });
            }
        }

        Thread.sleep(3000L);
    }

    @AfterAll
    static void tearDown() {
        if (mockApiServer != null) {
            mockApiServer.stop();
        }
    }

    @BeforeEach
    void initializeClient() {
        Configuration config = new Configuration(new NoAuthAuthenticator(apiHost, "test-token"));
        apiClient = new DefaultApiClient(config);
    }

    @Test
    @DisplayName("GET request is successful")
    void testGetRequest() {
        Map<Integer, TypeReference<?>> responseTypes = Map.of(200, new TypeReference<SuccessModel>() {
        });
        Object result = assertDoesNotThrow(() ->
            apiClient.invokeAPI("testGetSuccess", "/users/123", "GET", Map.of(), Map.of(), Map.of(), null, responseTypes)
        );
        assertInstanceOf(SuccessModel.class, result);
    }

    @Test
    @DisplayName("POST request is successful")
    void testPostRequest() {
        Map<Integer, TypeReference<?>> responseTypes = Map.of(201, new TypeReference<SuccessModel>() {
        });
        Object result = assertDoesNotThrow(() ->
            apiClient.invokeAPI("testPost", "/users", "POST", Map.of(), Map.of(), Map.of(), new Object(), responseTypes)
        );
        assertInstanceOf(SuccessModel.class, result);
    }

    @Test
    @DisplayName("PUT request sends custom headers")
    void testSendsCustomHeaders() {
        Map<Integer, TypeReference<?>> responseTypes = Map.of(200, new TypeReference<>() {
        });
        var customHeaders = Map.of("X-Request-ID", (Collection<String>) List.of("test-uuid-123"));
        assertDoesNotThrow(() ->
            apiClient.invokeAPI("testCustomHeaders", "/users/123", "PUT", Map.of(), Map.of(), customHeaders, new Object(), responseTypes)
        );
    }

    @Test
    @DisplayName("DELETE request returns void")
    void testDeleteRequest() {
        Object result = assertDoesNotThrow(() ->
            apiClient.invokeAPI("testVoid", "/users/123", "DELETE", Map.of(), Map.of(), Map.of(), null, Map.of())
        );
        assertNull(result);
    }

    @Test
    @DisplayName("Handles 404 Not Found error")
    void testApiClientErrorResponse() {
        ApiException exception = assertThrows(ApiException.class, () ->
            apiClient.invokeAPI("test404", "/users/notfound", "GET", Map.of(), Map.of(), Map.of(), null, Map.of())
        );
        assertEquals(404, exception.getCode());
    }

    @Test
    @DisplayName("Handles 400 Bad Request with a typed error model")
    void testTypedClientErrorResponse() {
        Map<Integer, TypeReference<?>> responseTypes = Map.of(400, new TypeReference<ErrorModel>() {
        });
        ApiException exception = assertThrows(ApiException.class, () ->
            apiClient.invokeAPI("test400", "/users/bad", "POST", Map.of(), Map.of(), Map.of(), new Object(), responseTypes)
        );
        assertEquals(400, exception.getCode());
        assertInstanceOf(ErrorModel.class, exception.getResponseBody());
    }

    @Test
    @DisplayName("Handles successful response with malformed JSON")
    void testDeserializationFailure() {
        Map<Integer, TypeReference<?>> responseTypes = Map.of(200, new TypeReference<SuccessModel>() {
        });
        assertThrows(RuntimeException.class, () ->
            apiClient.invokeAPI("testMalformed", "/malformed", "GET", Map.of(), Map.of(), Map.of(), null, responseTypes)
        );
    }
}
