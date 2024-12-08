package org.acme;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/zhgl")
@RegisterRestClient(configKey = "zhgl")
public interface Zhgl {

    @Path("/userList")
    @GET
    List<String> GetUsers();
}
