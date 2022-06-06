package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.estoque.domain.movimentacoes.interfaces.IMovimentacaoService;
import br.com.estoque.domain.reposprod.ReposProd;
import br.com.estoque.domain.reposprod.interfaces.IReposProdService;


public class MovimentacaoRepository implements IMovimentacaoService {
  
    private AgroalDataSource dataSource;

    public MovimentacaoRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    //TODO FAZER
    @Override
    public void boundReposWithProduct(ReposProd reposProd) {
        try{
            String query = 
            "UPDATE ES_DEPOSITOS SET " + 
            "NOM_DEPOS='" + "'" + 
            " WHERE ID = " + reposProd.getID();
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement(query);
          
         }catch(SQLException e){
            throw new Error(e);
        }        
    }

}
