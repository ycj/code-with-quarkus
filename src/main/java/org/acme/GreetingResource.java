package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

class Greeting {
    public String message;
}

@Path("/hello")
public class GreetingResource {

    @Inject
    T3 t3;

    @ConfigProperty(name = "project.name")
    String projectName;

    @ConfigProperty(name = "project.version")
    String projectVersion;

    @ConfigProperty(name = "password")
    String password;

    @GET
    @Path("/greeting")
    public Greeting hello() {
        var g = new Greeting();
        g.message = "Hello YZ";
        return g;
    }

    @GET
    @Path("/abc")
    public String hello2() {
        Log.info(t3.hello());
        Log.info(projectName + " " + projectVersion);
        return password;
    }
}
