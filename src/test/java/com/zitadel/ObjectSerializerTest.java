package com.zitadel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

class ObjectSerializerTest {

    private final ObjectSerializer serializer = new ObjectSerializer();

    @Test
    void testDeserializeAllTypes() throws IOException, JSONException {
        String originalJson = Files.readString(Paths.get("src/test/resources/serde.json"), StandardCharsets.UTF_8);
        var model = serializer.deserialize(originalJson, new TypeReference<SerdeModel>() {
        });
        String outputJson = serializer.serialize(Objects.requireNonNull(model));
        JSONAssert.assertEquals(
            originalJson,
            outputJson,
            JSONCompareMode.LENIENT
        );
    }

    @JsonInclude(JsonInclude.Include.ALWAYS)
    @SuppressWarnings({"NullAway", "unused"})
    public static class SerdeModel {
        @JsonProperty("some_string")
        public String someString;

        @JsonProperty("some_binary")
        public byte[] someBinary;

        @JsonProperty("some_byte")
        public byte[] someByte;

        @JsonProperty("some_date")
        public LocalDate someDate;

        @JsonProperty("some_date_time")
        public OffsetDateTime someDateTime;

        @JsonProperty("some_password")
        public String somePassword;

        @JsonProperty("some_email")
        public String someEmail;

        @JsonProperty("some_hostname")
        public String someHostname;

        @JsonProperty("some_ipv4")
        public InetAddress someIpv4;

        @JsonProperty("some_ipv6")
        public InetAddress someIpv6;

        @JsonProperty("some_uri")
        public URI someUri;

        @JsonProperty("some_uri_reference")
        public String someUriReference;

        @JsonProperty("some_uri_template")
        public String someUriTemplate;

        @JsonProperty("some_json_pointer")
        public String someJsonPointer;

        @JsonProperty("some_relative_json_pointer")
        public String someRelativeJsonPointer;

        @JsonProperty("some_regex")
        public Pattern someRegex;

        @JsonProperty("some_number")
        public BigDecimal someNumber;

        @JsonProperty("some_float")
        public Float someFloat;

        @JsonProperty("some_double")
        public Double someDouble;

        @JsonProperty("some_integer")
        public Integer someInteger;

        @JsonProperty("some_int32")
        public Integer someInt32;

        @JsonProperty("some_int64")
        public Long someInt64;

        @JsonProperty("some_boolean")
        public Boolean someBoolean;

        @JsonProperty("some_array")
        public List<String> someArray;

        @JsonProperty("some_object")
        public Map<String, Object> someObject;

        @JsonProperty("some_nested_object")
        public NestedObject someNestedObject;

        @JsonProperty("some_array_of_objects")
        public List<Item> someArrayOfObjects;

        @JsonProperty("some_nullable_field")
        public Object someNullableField;

        // getters and setters omitted for brevity

        public static class NestedObject {
            @JsonProperty("some_level1")
            public Level1 someLevel1;

            public static class Level1 {
                @JsonProperty("some_level2")
                public Level2 someLevel2;

                public static class Level2 {
                    @JsonProperty("some_level3_string")
                    public String someLevel3String;
                    @JsonProperty("some_level3_number")
                    public Double someLevel3Number;
                    // getters/setters...
                }
                // getters/setters...
            }
            // getters/setters...
        }

        public static class Item {
            @JsonProperty("some_id")
            public Integer someId;
            @JsonProperty("some_name")
            public String someName;
            // getters/setters...
        }
    }
}
