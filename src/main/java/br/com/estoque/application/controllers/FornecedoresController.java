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

import br.com.estoque.domain.fornecedores.Fornecedores;
import br.com.estoque.infra.services.fornecedores.FornecedorServiceAll;
import br.com.estoque.infra.services.fornecedores.FornecedorServiceDelete;
import br.com.estoque.infra.services.fornecedores.FornecedorServiceInsert;
import br.com.estoque.infra.services.fornecedores.FornecedorServiceUpdate;
import io.agroal.api.AgroalDataSource;

@Path("/fornecedores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class FornecedoresController {
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @GET
    public Response get() {
        return Response.ok(FornecedorServiceAll.execute(dataSource)).build();
    }

    @POST
    public void post(Fornecedores fornecedores) {
        FornecedorServiceInsert.execute(dataSource, fornecedores);
    }

    @PUT
    public void put(Fornecedores fornecedores) {
        FornecedorServiceUpdate.execute(dataSource, fornecedores);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Integer id) {
        FornecedorServiceDelete.execute(dataSource, id);
    }
}
