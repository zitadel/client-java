package com.zitadel;

import com.zitadel.auth.NoAuthAuthenticator;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class to verify that all API service classes defined in the
 * "com.zitadel.api" package are properly registered as fields in the {@link Zitadel} class.
 * <p>
 * This test dynamically scans the "com.zitadel.api" package using ClassGraph (excluding any classes whose
 * names end with "Test" and only including those whose names end with "ServiceApi"). It then uses reflection
 * on a {@link Zitadel} instance to collect the types of all fields that belong to the "com.zitadel.api" package.
 * The test asserts that the set of expected API service classes exactly matches the set of actual service
 * classes registered in {@code Zitadel}.
 * <p>
 * This ensures that all API services are correctly registered in the {@code Zitadel} class without duplicates,
 * which is critical for the correct functioning of the SDK.
 */
class ZitadelTest {

  /**
   * Verifies that all API service classes in "com.zitadel.api" are registered as fields in the Zitadel class.
   */
  @Test
  @DisplayName("All API services must be registered in Zitadel")
  void testServicesDynamic() throws IOException {
    try (ScanResult scanResult = new ClassGraph()
      .acceptPackages("com.zitadel.api")
      .scan()) {
      Set<Class<?>> expected = scanResult.getAllClasses()
        .loadClasses()
        .stream()
        .filter(c -> !c.getSimpleName().endsWith("Test"))
        .filter(c -> c.getSimpleName().endsWith("ServiceApi"))
        .collect(Collectors.toSet());

      Zitadel zitadel = new Zitadel(new NoAuthAuthenticator("http://dummy"));
      Field[] fields = zitadel.getClass().getDeclaredFields();
      Set<Class<?>> actual = Arrays.stream(fields)
        .map(Field::getType)
        .filter(c -> c.getPackage() != null && "com.zitadel.api".equals(c.getPackage().getName()))
        .collect(Collectors.toSet());

      assertEquals(expected, actual, "The registered API services in Zitadel do not match the expected set");
    }
  }
}
