# Zitadel SDK SDK - AI Agent Reference

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
import com.zitadel.Client;
import com.zitadel.auth.BearerAuthenticator;

Client client = Client.withToken("https://api.example.com", "your-token");
```

## Authentication

All authentication is handled via `Authenticator` implementations passed to the client constructor.

### Bearer Token

```java
import com.zitadel.auth.BearerAuthenticator;

var authenticator = new BearerAuthenticator("https://api.example.com", "your-token");
var client = new Client(authenticator);
```

## Servers

If the OpenAPI spec defines multiple servers, the generated `Servers` class exposes each as a `ServerConfiguration` constant (e.g., `Servers.SERVER_0`, `Servers.SERVER_1`, ...) plus an `Servers.ALL` list. Pass the desired server's URL to the client:

```java
import com.zitadel.Servers;

var client = Client.withToken(Servers.SERVER_0.url(), "your-token");
```

## Testing

The `Authenticator` interface is the seam for tests: substitute a fake authenticator that returns a known header map, and assert your code calls the API the way you expect.

```java
import com.zitadel.auth.Authenticator;

var fake = new Authenticator() {
    public java.util.Map<String, String> getAuthHeaders(RequestContext req) {
        return java.util.Map.of("Authorization", "Bearer test-token");
    }
    public String getHost() { return "https://api.example.com"; }
};

var client = new Client(fake);
```

## Error Handling

All API errors extend `ApiException`. The error hierarchy is:

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

```java
import com.zitadel.errors.*;

try {
    var result = client.petApi.getPetById(petId);
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

var client = new Client(authenticator, transport);
```

## API Methods

Each API group is exposed as a typed field on the client. API classes have methods that correspond to OpenAPI operations, accepting typed request parameters and returning typed response models.

## Models

Models are generated as Java classes with builder patterns. They are located in `com.zitadel.api` and model packages.

```java
import com.zitadel.models.*;

var pet = new Pet();
pet.setName("Fido");
pet.setStatus("available");
```

## Binary / File Uploads

File upload parameters are typed as `File`. Binary response bodies are returned as `byte[]`.

## Comment Style

Never use inline comments (`//`). Always use block comments (`/* ... */`).

```good
/* This explains the logic */
int x = 1;
```

```bad
// This explains the logic
int x = 1;
```
