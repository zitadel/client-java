package com.zitadel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.openapitools.jackson.nullable.JsonNullableModule;

import javax.annotation.Nullable;
import java.util.TimeZone;

@SuppressFBWarnings("THROWS_METHOD_THROWS_RUNTIMEEXCEPTION")
public class ObjectSerializer {

    private final ObjectMapper objectMapper;

    public ObjectSerializer() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        this.objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        this.objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.registerModule(new JsonNullableModule());
        this.objectMapper.setDateFormat(new StdDateFormat().withTimeZone(TimeZone.getTimeZone("UTC")).withColonInTimeZone(true));
    }

    /**
     * Serializes the given object into a JSON string.
     *
     * @param body The object to serialize.
     * @return The JSON string representation.
     */
    public String serialize(Object body) {
        try {
            return this.objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to serialize object to JSON", e);
        }
    }

    /**
     * Deserializes the given JSON string into an object of the specified type.
     *
     * @param responseBody The JSON string to deserialize.
     * @param responseType The TypeReference of the target object.
     * @param <T>          The generic type of the target object.
     * @return The deserialized object.
     */
    @Nullable
    public <T> T deserialize(String responseBody, TypeReference<T> responseType) {
        if (responseBody == null || responseBody.isEmpty()) {
            return null;
        }
        try {
            return this.objectMapper.readValue(responseBody, responseType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to deserialize JSON to object", e);
        }
    }
}
