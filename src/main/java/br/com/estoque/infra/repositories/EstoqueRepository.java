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
            String query = "DECLARE R_NUM_ID_E ES_ESTOQUE.ID%TYPE;R_NUM_ID_N ES_NOTA_FISCAL.ID%TYPE; BEGIN  PCKG_CRUD. INSERE_ESTOQUE("+body.getId_Mov()+","+body.getNumQtd()+", "+body.getiD_Deposito()+", "+body.getiD_produto()+", "+body.getQtdRepos()+", R_NUM_ID_E, R_NUM_ID_N, "+body.getPrice()+","+(body.isHasNota() ? MovementBody.getNumNota() : "")+", "+body.getiD_Fornecedor()+", "+body.getEnterCode()+");  END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                 System.out.println("AFTEER V_ID"+rs.getInt("V_ID"));

                 System.out.println("AFTEER ID"+rs.getInt("ID"));
 
            }


         }catch(SQLException e){
            throw new Error(e);
        } 
        
    }
    

}
