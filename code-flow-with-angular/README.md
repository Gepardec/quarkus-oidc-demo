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

Access the application via http://localhost:8080/ and login with gepard/gepard@123.

# run with google as oidc provider

You can run this sample application with google as oidc provider. Configure this properties to do so:

- quarkus.oidc.auth-server-url=https://accounts.google.com
- quarkus.oidc.client-id=<your client id>
- quarkus.oidc.credentials.secret=<your secret>
- quarkus.oidc.authentication.verify-access-token=false
- quarkus.oidc.logout.path=
