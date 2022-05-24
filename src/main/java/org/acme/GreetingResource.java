package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    public Response hello() {
        return Response.ok(new Modelo("Hi Sister lets go Five")).build();
    }

    public static class Modelo {
        private final String messsage;


        public Modelo(String message) {
            this.messsage = message;
        }

        public String getMessage() {
            return this.messsage;
        }
    }
}