package br.com.estoque.controllers;

import java.sql.SQLException;
import javax.inject.Named;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.estoque.model.Produtos;
import br.com.estoque.services.produtos.ProdutoServiceDelete;
import br.com.estoque.services.produtos.ProdutoServiceGet;
import br.com.estoque.services.produtos.ProdutoServicePost;
import br.com.estoque.services.produtos.ProdutoServicePut;
import io.agroal.api.AgroalDataSource;


@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutosResource {   
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @GET
    public Response get()  {

        ProdutoServiceGet produtoServiceGet = new ProdutoServiceGet();
        
        try {
            return Response.ok(produtoServiceGet.execute(dataSource)).build();
        }catch(SQLException e) {
            return Response.ok(e.getErrorCode()).build();
        }
        
    }

    @POST
    public void post(Produtos produto) throws SQLException {

        ProdutoServicePost produtoServicePost = new ProdutoServicePost();
        
        try {
            produtoServicePost.create(dataSource, produto);
        } catch (SQLException e) {
            throw new Error(e);
        }
        
    }

    @PUT
    public void put(Produtos produto) {

        try {
            ProdutoServicePut produtoServicePut = new ProdutoServicePut();
            produtoServicePut.execute(dataSource, produto);
        }catch(SQLException e) {
            throw new Error(e);
        }

    }

    @DELETE
    public void delete(Integer id) {
        
        try {
            ProdutoServiceDelete produtoServiceDelete = new ProdutoServiceDelete();
            produtoServiceDelete.execute(dataSource, id);
        }catch(SQLException e) {
            throw new Error(e);
        }

    }
}


