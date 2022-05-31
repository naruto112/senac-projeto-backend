package br.com.estoque.application.controllers;

import java.sql.SQLException;
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

import br.com.estoque.domain.Produto;
import br.com.estoque.infra.services.*;
import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;


@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class ProdutosController {   
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;



    @GET
    public Response get()  {
        return Response.ok(ProdutoServiceAll.execute(dataSource)).build();
    }

    @POST
    public void post(Produto produto) {
        ProdutoServiceInsert.execute(dataSource, produto);
    }

    @PUT
    public void put(Produto produto) {
        ProdutoServiceUpdate.execute(dataSource, produto);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Integer id) {
       ProdutoServiceDelete.execute(dataSource, id);
    }
}


