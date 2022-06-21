package br.com.estoque.application.controllers;

import javax.inject.Named;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.Response.Status;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.services.extrato.ExtratoServiceAll;
import br.com.estoque.infra.services.posicao.PosicaoServiceAll;
import br.com.estoque.infra.services.reposicaoFornec.ReposicaoFornecAll;
import br.com.estoque.infra.services.reposicaoProd.ReposicaoProdAll;
import io.agroal.api.AgroalDataSource;

@Path("/relatorio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RelatorioMovimentacaoController {
    @Inject
    @Named("oracle")
    AgroalDataSource dataSource;

    @ConfigProperty(name = "crypto.secret")
    String secret;

    @GET
    @Path("/extratomovimenta")
    public Response extratoMovimentaEstoque(@HeaderParam("Authorization") String header) {

        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.validateJWT(plainHash[1].toString(), secret)) {
                return Response.ok(ExtratoServiceAll.execute(dataSource)).build();
            } else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        } catch (Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }

    }

    @GET
    @Path("/ponto-reposicao-produto")
    public Response produtoPontoReposicao(@HeaderParam("Authorization") String header) {

        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.validateJWT(plainHash[1].toString(), secret)) {
                return Response.ok(PosicaoServiceAll.execute(dataSource)).build();
            } else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        } catch (Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
    }

    @GET
    @Path("/ponto-reposicao-fornecedor")
    public Response pontoReposicaoFornecedor(@HeaderParam("Authorization") String header) {

        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.validateJWT(plainHash[1].toString(), secret)) {
                return Response.ok(ReposicaoFornecAll.execute(dataSource)).build();
            } else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        } catch (Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
    }

    @GET
    @Path("/posicao-estoque-deposito")
    public Response posicaoEstoqueDeposito(@HeaderParam("Authorization") String header) {

        try {
            String[] plainHash = header.split(" ");
            if (CryptoHash.validateJWT(plainHash[1].toString(), secret)) {
                return Response.ok(ReposicaoProdAll.execute(dataSource)).build();
            } else {
                return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
            }
        } catch (Exception e) {
            return Response.status(Status.UNAUTHORIZED).entity("Not Authorized").build();
        }
    }

}
