package br.com.estoque.application.controllers;

import javax.inject.Named;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;

import br.com.estoque.domain.depositos.Depositos;
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
    public Response get() {
        return Response.ok(DepositoServiceAll.execute(dataSource)).build();
    }

    @POST
    public void post(Depositos depositos) {
        DepositoServiceInsert.execute(dataSource, depositos);
    }

    @PUT
    public void put(Depositos depositos) {
        DepositoServiceUpdate.execute(dataSource, depositos);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Integer id) {
        DepositoServiceDelete.execute(dataSource, id);
    }

}
