package org.acme;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.agroal.api.AgroalDataSource;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {
    @Inject
    @Named("teste")
    AgroalDataSource dataSource;

    @GET
    public Response hello() {

        StringBuilder sb = new StringBuilder();

        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement("SELECT * FROM SENAC.ES_DEPOSITOS");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                
            }

        }catch(SQLException e) {
            return Response.ok(e.getSQLState()).build();
        }

        

        return Response.ok(new Modelo("Deploy com APRESENTACAO")).build();
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


    @POST
    public Response examplePost(){
        return Response.ok(new Modelo("status atualizado")).build();
    }
}