# bearer-authentication-with-opaque-token

This project contains a sample quarkus oidc application with the follow components:

- quarkus rest backend
- keyloak powered by quarkus devservices

Requirements:

- Java 21
- Maven
- Quarkus CLI (optional)

To run this sample application simply type `quarkus dev` or `mvn clean quarkus:dev`.

TODO: You have to configure the web origins for oidc client 'oidc-demo' every time you restart. You can find the link to the keycloak admin interface here: http://localhost:8080/q/dev-ui/extensions

Access the API via Swagger-UI (http://localhost:8080/q/dev-ui/io.quarkus.quarkus-smallrye-openapi/swagger-ui);

Generate a token using `Authorize`.
- SecurityScheme (OAuth2, password)
- username: gepard
- password: gepard@123
- client_id: oidc-demo
- client_secret: my-secret-client-secret
- scope: openid

Test `/api/secured` Endpoint.

# run with google as oidc provider

You can run this sample application with google as oidc provider. Configure this properties to do so:

- quarkus.oidc.auth-server-url=https://accounts.google.com
- quarkus.oidc.client-id=<your client id>
- quarkus.oidc.credentials.secret=<your secret>
- quarkus.oidc.token.verify-access-token-with-user-info=true
