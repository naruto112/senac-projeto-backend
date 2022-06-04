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

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.services.depositos.DepositoServiceAll;
import br.com.estoque.infra.services.depositos.DepositoServiceDelete;
import br.com.estoque.infra.services.depositos.DepositoServiceInsert;
import br.com.estoque.infra.services.depositos.DepositoServiceUpdate;
import io.agroal.api.AgroalDataSource;

@Path("/depositos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class DepositosController {
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @GET
    public Response get(@HeaderParam("Authorization") String header) {
        try{
            String[] plainHash = header.split(" ");
            if (CryptoHash.checkedHash(plainHash[0], plainHash[1])) {
                return Response.ok(DepositoServiceAll.execute(dataSource)).build();
            }else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        }catch(Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
        
    }

    @POST
    public Response post(@HeaderParam("Authorization") String header, Depositos depositos) {
        try{
            String[] plainHash = header.split(" ");
            if (CryptoHash.checkedHash(plainHash[0], plainHash[1])){
                DepositoServiceInsert.execute(dataSource, depositos);
                return Response.status(Status.CREATED).build();
            }else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        }catch(Exception e){
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
        
    }

    @PUT
    public Response put(@HeaderParam("Authorization") String header, Depositos depositos) {
        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.checkedHash(plainHash[0], plainHash[1])) {
                DepositoServiceUpdate.execute(dataSource, depositos);
                return Response.status(Status.ACCEPTED).build();
            }else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        }catch(Exception e){
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
        
    }

    @DELETE
    @Path("{id}")
    public Response delete(@HeaderParam("Authorization") String header, @PathParam("id") Integer id) {
        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.checkedHash(plainHash[0], plainHash[1])) {
                DepositoServiceDelete.execute(dataSource, id);
                return Response.status(Status.ACCEPTED).build();
            }else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        }catch(Exception e){
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
        
    }

}
