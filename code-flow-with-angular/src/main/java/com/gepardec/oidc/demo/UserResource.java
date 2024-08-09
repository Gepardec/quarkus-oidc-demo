package com.gepardec.oidc.demo;

import io.quarkus.oidc.IdToken;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.jwt.JsonWebToken;

@Path("/api/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    public record User(String name) {}

    @Inject
    @IdToken
    JsonWebToken idToken;

    @GET
    public User user() {
        return new User(idToken.getName());
    }
}
