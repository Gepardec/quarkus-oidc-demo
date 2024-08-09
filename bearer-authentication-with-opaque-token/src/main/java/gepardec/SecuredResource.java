package gepardec;

import io.quarkus.oidc.UserInfo;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Authenticated
@Path("/api/secured")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SecuredResource {

    public record SecureInformation(String subject) {
    }

    @Inject
    UserInfo userInfo;

    @GET
    public SecureInformation getSecureInformation() {
        return new SecureInformation(userInfo.getSubject());
    }
}
