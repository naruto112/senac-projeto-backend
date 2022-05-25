package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.Model.Cliente;
import org.acme.Services.Cliente.ServiceClienteGet;
import org.acme.Services.Cliente.ServiceClientePost;

@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {
    
    

    @GET
    public Cliente get(){
        ServiceClienteGet serviceClienteGet = new ServiceClienteGet();
        return serviceClienteGet.execute();
    }

    @POST
    public void post(Cliente cliente){
        ServiceClientePost serviceClientePost = new ServiceClientePost();
        serviceClientePost.execute(cliente);
    }

    // @PUT
    // public Cliente put(){
    //     ServiceClienteGet serviceClienteGet = new ServiceClienteGet();
    //     return serviceClienteGet.execute();
    // }

    // @DELETE
    // public Cliente delete(){
    //     ServiceClienteGet serviceClienteGet = new ServiceClienteGet();
    //     return serviceClienteGet.execute();
    // }

}
