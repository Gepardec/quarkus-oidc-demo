package com.gepardec;

import io.quarkus.oidc.UserInfo;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Authenticated
@Path("/api/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    Logger logger;

    public record User(String subject, String email) {
    }

    @Inject
    UserInfo userInfo;

    @GET
    public User user() {
        var user = new User(userInfo.getSubject(), userInfo.getEmail());
        logger.info(user);
        return user;
    }
}
