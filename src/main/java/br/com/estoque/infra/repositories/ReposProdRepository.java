package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import io.quarkus.logging.Log;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.estoque.domain.reposprod.ReposProd;
import br.com.estoque.domain.reposprod.interfaces.IReposProdService;


//vincula deposito com produto
public class ReposProdRepository implements IReposProdService {
  
    private AgroalDataSource dataSource;

    public ReposProdRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void boundReposWithProduct(ReposProd reposProd  ) {
        try{
            String query = "DECLARE V_ID ES_REPOS_PROD.ID%TYPE;BEGIN PCKG_CRUD.REPOS_PROD("+reposProd.getID_PROD()+","+ reposProd.getID_DEPOS()+ " ,0, V_ID);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                reposProd.setID(rs.getInt("V_ID"));
                System.out.println("AFTEER V_ID"+reposProd.getID());

                reposProd.setID(rs.getInt("ID"));
                System.out.println("AFTEER ID"+reposProd.getID());
 
            }

        }catch(SQLException e){
            throw new Error(e);
        }        
    }

}
