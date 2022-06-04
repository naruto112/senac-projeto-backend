package br.com.estoque.application.controllers;

import javax.inject.Named;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.infra.services.usuarios.UsuarioServiceLogin;
import io.agroal.api.AgroalDataSource;

@Path("/authentication")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON )
public class AuthenticationController {
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @Path("login")
    @POST
    public Response login(Usuario usuario) {
        return Response.ok(UsuarioServiceLogin.execute(dataSource, usuario)).build();
    }

    @Path("forgot")
    @PUT
    public void forgot() {
        //TO DO
    }

}


