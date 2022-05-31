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

import br.com.estoque.domain.dtos.ProdutosDTO;
import br.com.estoque.domain.interfaces.IProdutoService;
import br.com.estoque.domain.services.ProdutoService;
import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;


@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class ProdutosController {   
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    private final IProdutoService iProdutoService;

    public ProdutosController(IProdutoService iProdutoService) {
        this.iProdutoService = iProdutoService;
    }


    @GET
    public Response get()  {
        return Response.ok(iProdutoService.getAllProdutos()).build();
        
    }

    // @POST
    // public void post(ProdutosDTO produto) throws SQLException {

    //     ProdutoServicePost produtoServicePost = new ProdutoServicePost();
        
    //     try {
    //         produtoServicePost.create(dataSource, produto);
    //     } catch (SQLException e) {
    //         throw new Error(e);
    //     }
        
    // }

    // @PUT
    // public void put(ProdutosDTO produto) {

    //     try {
    //         ProdutoServicePut produtoServicePut = new ProdutoServicePut();
    //         produtoServicePut.execute(dataSource, produto);
    //     }catch(SQLException e) {
    //         throw new Error(e);
    //     }

    // }

    // @DELETE
    // @Path("{id}")
    // public void delete(@PathParam("id") Integer id) {
        
    //     try {
    //         ProdutoServiceDelete produtoServiceDelete = new ProdutoServiceDelete();
    //         produtoServiceDelete.execute(dataSource, id);
    //     }catch(SQLException e) {
    //         throw new Error(e);
    //     }

    // }
}


