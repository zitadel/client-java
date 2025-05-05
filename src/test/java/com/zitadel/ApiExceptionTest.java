package com.zitadel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ApiExceptionTest {

    @Test
    public void testApiException() {
        Map<String, List<String>> headers = Collections.singletonMap("H", Collections.singletonList("v"));
        ApiException e = new ApiException(
            418,
            headers,
            "body"
        );
        assertEquals("Error 418", e.getMessage());
        assertEquals(418, e.getCode());
        assertEquals(Collections.singletonList("v"), e.getResponseHeaders().get("H"));
        assertEquals("body", e.getResponseBody());
    }
}
