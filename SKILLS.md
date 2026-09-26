# Zitadel SDK - AI Agent Reference

## Installation

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.zitadel</groupId>
    <artifactId>client</artifactId>
    <version>0.0.1</version>
</dependency>
```

Or with Gradle:

```groovy
implementation 'com.zitadel:client:0.0.1'
```

## Quick Start

```java
import com.zitadel.Zitadel;
import com.zitadel.auth.BearerAuthenticator;

Zitadel client = Zitadel.withToken("https://api.example.com", "your-token");
```

## Authentication

All authentication is handled via `Authenticator` implementations passed to the client constructor.

### Bearer Token

```java
import com.zitadel.auth.BearerAuthenticator;

var authenticator = new BearerAuthenticator("https://api.example.com", "your-token");
var client = new Zitadel(authenticator);
```

## Servers

If the OpenAPI spec defines multiple servers, the generated `Servers` class exposes each as a `ServerConfiguration` constant (e.g., `Servers.SERVER_0`, `Servers.SERVER_1`, ...) plus an `Servers.ALL` list. Pass the desired server's URL to the client:

```java
import com.zitadel.Servers;

var client = Zitadel.withToken(Servers.SERVER_0.getUrl(), "your-token");
```

## Testing

The `Authenticator` interface is the seam for tests: substitute a fake authenticator that returns a known header map, and assert your code calls the API the way you expect.

```java
import com.zitadel.auth.Authenticator;

var fake = new Authenticator() {
    public java.util.Map<String, String> getAuthHeaders() {
        return java.util.Map.of("Authorization", "Bearer test-token");
    }
    public String getHost() { return "https://api.example.com"; }
};

var client = new Zitadel(fake);
```

## Error Handling

All API errors derive from `ApiException`. The error hierarchy is:

- `ApiException` (base)
  - `ClientException` (4xx)
    - `BadRequestException` (400)
    - `UnauthorizedException` (401)
    - `ForbiddenException` (403)
    - `NotFoundException` (404)
    - `ConflictException` (409)
    - `UnprocessableEntityException` (422)
  - `ServerException` (5xx)
    - `InternalServerErrorException` (500)
  - `NetworkException` (no HTTP response, status 0)
    - `NetworkTimeoutException` (the request timed out, status 0)

```java
import com.zitadel.errors.*;
import com.zitadel.model.ActionServiceActivatePublicKeyRequest;

try {
    client.actionService.activatePublicKey(new ActionServiceActivatePublicKeyRequest());
} catch (NotFoundException e) {
    System.out.println("Not found: " + e.getMessage());
} catch (ClientException e) {
    System.out.println("Client error " + e.getStatusCode() + ": " + e.getMessage());
} catch (ServerException e) {
    System.out.println("Server error: " + e.getMessage());
} catch (ApiException e) {
    System.out.println("API error: " + e.getMessage());
}
```

## Configuration

### Custom Transport Options

```java
import com.zitadel.TransportOptions;

var transport = TransportOptions.builder()
    .proxy("http://proxy:3128")
    .timeout(5000)
    .build();

var client = new Zitadel(authenticator, transport);
```

## API Methods

Each API group is exposed as a typed field on the client (e.g., `client.actionService`). API classes have methods that correspond to OpenAPI operations, accepting typed request parameters and returning typed response models.

## Models

Models are generated as Java classes with public fields and a no-argument constructor in the `com.zitadel.model` package.

```java
import com.zitadel.model.ActionServiceActivatePublicKeyRequest;

var model = new ActionServiceActivatePublicKeyRequest();
```

## Binary / File Uploads

File upload parameters are typed as `File`. Binary response bodies are returned as `byte[]`.

## Comment Style

Never place a comment on the same line as code. Use block comments (`/* ... */`); Javadoc (`/** ... */`) is fine.

```good
/* This explains the logic */
int x = 1;
```

```bad
// This explains the logic
int x = 1;
```
