# code-flow-with-angular

This project contains a sample quarkus oidc application with the follow components:

- quarkus rest backend
- angular frontend powered by quarkus quinoa
- keyloak powered by quarkus devservices

Requirements:

- Java 21
- Maven
- Quarkus CLI (optional)

To run this sample application simply type `quarkus dev` or `mvn clean quarkus:dev`.

Access the application via http://localhost:8080/ and login with alice/alice or bob/bob.

# run with Google as oidc provider

You can run this sample application with Google as oidc provider. Configure these properties to do so:

- quarkus.oidc.provider=google
- quarkus.oidc.client-id=<your client id>
- quarkus.oidc.credentials.secret=<your secret>
- quarkus.oidc.logout.path=
