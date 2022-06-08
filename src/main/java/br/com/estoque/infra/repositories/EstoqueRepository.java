package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import br.com.estoque.domain.estoque.Estoque;
import br.com.estoque.domain.estoque.interfaces.IEstoqueService;
import br.com.estoque.domain.estoque.utils.OnMoveStockListener;

public class EstoqueRepository implements IEstoqueService {
  
    private AgroalDataSource dataSource;

    public EstoqueRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

     @Override
    public void movimentaEstoque(Estoque estoque, OnMoveStockListener listener) {
         try{
            String query = "DECLARE V_ID ES_ESTOQUE.ID%TYPE;BEGIN PCKG_CRUD.INSERE_ESTOQUE("+estoque.getID_MOV()+","+estoque.getNUM_QTD_PROD()+","+estoque.getID_REPOS_PROD()+",V_ID,"+estoque.getNUM_CUSTO_UN_PROD()+", PRICE);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                estoque.setID(rs.getInt("V_ID"));
                System.out.println("AFTEER V_ID"+estoque.getID());

                estoque.setID(rs.getInt("ID"));
                System.out.println("AFTEER ID"+estoque.getID());


                //todo
               // listener.onReceivedIdNota(nota.getID());

            }


         }catch(SQLException e){
            throw new Error(e);
        } 
        
    }
    

}
