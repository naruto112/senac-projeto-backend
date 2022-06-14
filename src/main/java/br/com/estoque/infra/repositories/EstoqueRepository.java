package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import br.com.estoque.domain.estoque.body.MovementBody;
import br.com.estoque.domain.estoque.interfaces.IEstoqueService;
 
public class EstoqueRepository implements IEstoqueService {
  
    private AgroalDataSource dataSource;

    public EstoqueRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void movimentaEstoque(MovementBody body) {
         try{
            String query = "DECLARE R_NUM_ID_E ES_ESTOQUE.ID%TYPE;R_NUM_ID_N ES_NOTA_FISCAL.ID%TYPE; BEGIN  PCKG_CRUD. INSERE_ESTOQUE("+body.getId_Mov()+","+body.getQuantity()+", "+body.getIdDeposito()+", "+body.getIdProduto()+", "+body.getQuantityReposition()+", R_NUM_ID_E, R_NUM_ID_N, "+body.getPrice()+","+(body.isHasNota() ? MovementBody.getNumNota() : "")+", "+body.getIdFornecedor()+", "+body.getEnterCode()+");  END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            
            ps.executeQuery();


         } catch(SQLException e){
            throw new Error(e);
        } 
        
    }
    

}
