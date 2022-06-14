package br.com.estoque.application.controllers;

import javax.inject.Named;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.services.notas.NotasServiceAll;
import io.agroal.api.AgroalDataSource;

@Path("/notas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class NotasController {
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @ConfigProperty(name = "crypto.secret") 
    String secret;

    @GET
    public Response get(@HeaderParam("Authorization") String header) {
        try{
            String[] plainHash = header.split(" ");
            if (CryptoHash.validateJWT(plainHash[1].toString(), secret)) {
                return Response.ok(NotasServiceAll.execute(dataSource)).build();
            }else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        }catch(Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
        
    }


}
