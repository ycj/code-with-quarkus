package org.acme;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

class Greeting {
    public String message;
}

@Path("/")
public class GreetingResource {

    @Inject
    T3 t3;

    @ConfigProperty(name = "project.name")
    String projectName;

    @ConfigProperty(name = "project.version")
    String projectVersion;

    @ConfigProperty(name = "password")
    String password;

    @Inject
    @RestClient
    Zhgl zhgl;

    @GET
    @Path("/hello")
    public Greeting hello() {
        var g = new Greeting();
        g.message = "Hello YZ";
        var data = zhgl.GetUsers();
        Log.info(data.toString());
        return g;
    }

    @GET
    @Path("/abc")
    public String hello2() {
        Log.info(t3.hello());
        Log.info(projectName + " " + projectVersion);
        return password;
    }

    @GET
    @Path("/zhgl/userList")
    public List<String> hello3() {
        var data = new ArrayList<String>();
        data.add("Hello");
        data.add("Year");
        data.add("2025");
        return data;
    }
}
