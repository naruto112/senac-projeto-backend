package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.domain.depositos.interfaces.IDepositosService;


public class DepositoRepository implements IDepositosService {
  
    private AgroalDataSource dataSource;

    public DepositoRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Depositos> getAllDepositos() {

        try {

            List<Depositos> listDepositos = new ArrayList<Depositos>();
    
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement("SELECT * FROM SENAC.ES_DEPOSITOS");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Depositos depositos = new Depositos();
                depositos.setID(rs.getInt("ID"));
                depositos.setNOM_DEPOS(rs.getString("NOM_DEPOS"));

                listDepositos.add(depositos);
            
            }
            ps.close();
            connection.close();

            return listDepositos;

        }catch(SQLException e) {
            throw new Error(e);
        }
        
    }

    @Override
    public void deleteDepositos(Integer id) {
 
        try {
            String query = 
            "DELETE ES_DEPOSITOS WHERE ID =" +id;
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();

        }catch(SQLException e) {
            throw new Error(e);
        }
        
     }

    @Override
    public void createDepositos(Depositos depositos) {
        try {
 
            String query = 
            "DECLARE V_ID ES_DEPOSITOS.ID%TYPE;BEGIN PCKG_CRUD.INSERE_DEPOS_PCKG('"+depositos.getNOM_DEPOS()+"', V_ID);END;";
             Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();
        }catch(SQLException e) {
            throw new Error(e);
        }
    }

    @Override
    public void updateDepositos(Depositos depositos) {
        try{
            String query = 
            "UPDATE ES_DEPOSITOS SET " + 
            "NOM_DEPOS='" + depositos.getNOM_DEPOS() + "'" + 
            " WHERE ID = " + depositos.getID();
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();

        }catch(SQLException e){
            throw new Error(e);
        }
        
    }
}
