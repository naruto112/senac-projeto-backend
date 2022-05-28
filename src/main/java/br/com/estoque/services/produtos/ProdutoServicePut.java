package br.com.estoque.services.produtos;

import java.sql.SQLException;
import br.com.estoque.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import io.agroal.api.AgroalDataSource;

public class ProdutoServicePut {
    
    public void execute(AgroalDataSource dataSource, Produtos produto) throws SQLException {

        String query = 
        "UPDATE ES_PRODUTOS SET " + 
        "NOM_PROD='" + produto.getNOM_PROD() + "'," + 
        "NUM_VLR_MEDIO_UN=" + produto.getNUM_VLR_MEDIO_UN() +","+
        "NUM_QTD_ESTOQUE=" + produto.getNUM_QTD_ESTOQUE() +"," +
        "NUM_VLR_ESTOQUE="+ produto.getNUM_VLR_ESTOQUE()+
        " WHERE ID = " + produto.getID();


        Connection connection = dataSource.getConnection();
        PreparedStatement ps = 
            connection.prepareStatement(query);
        ps.executeQuery();
    }

}
