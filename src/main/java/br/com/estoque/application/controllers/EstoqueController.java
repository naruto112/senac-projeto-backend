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

import br.com.estoque.domain.estoque.Estoque;
import br.com.estoque.domain.estoque.body.MovementBody;
import br.com.estoque.domain.estoque.utils.EstoqueHandler;
import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.infra.services.estoque.EstoqueServiceUpdate;
import io.agroal.api.AgroalDataSource;


@Path("/estoque")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class EstoqueController {   
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @GET
    public Response get() {
        return Response.ok().build();
    }

    @POST
    public void post( MovementBody body) {
        EstoqueHandler handler = new EstoqueHandler();
     //   handler.addOnStockCompletedListener(new OnStockCompletedListener(){

            //todo lembrar depois como criar o listener

        //EstoqueServiceUpdate.execute(dataSource, estoque);

      //  })
        handler.execute(dataSource, body);
        
    
     }

}


