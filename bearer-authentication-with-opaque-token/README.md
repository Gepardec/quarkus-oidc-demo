# bearer-authentication-with-opaque-token

This project contains a sample quarkus oidc application with the follow components:

- quarkus rest backend
- keyloak powered by quarkus devservices

Requirements:

- Java 21
- Maven
- Quarkus CLI (optional)

To run this sample application simply type `quarkus dev` or `mvn clean quarkus:dev`.

Use the OpenID Connect devui (http://localhost:8080/q/dev-ui/io.quarkus.quarkus-oidc/keycloak-provider) to log in and test the `/api/user` Endpoint.

You can change the config from authorization code flow to client credential flow and repeat testing.

# run with Google as oidc provider

You can run this sample application with Google as oidc provider. Configure these properties to do so:

- quarkus.oidc.provider=google
- quarkus.oidc.client-id=<your client id>
- quarkus.oidc.credentials.secret=<your secret>
