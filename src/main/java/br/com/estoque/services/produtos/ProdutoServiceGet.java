package br.com.estoque.services.produtos;

import br.com.estoque.model.Produtos;
import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoServiceGet {

    public List<Produtos> execute(AgroalDataSource dataSource) throws SQLException {

        List<Produtos> listProdutos = new ArrayList<Produtos>();
    
        Connection connection = dataSource.getConnection();
        PreparedStatement ps = 
            connection.prepareStatement("SELECT * FROM SENAC.ES_PRODUTOS");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            
            Produtos produto = new Produtos();
            produto.setID(rs.getInt("ID"));
            produto.setNOM_PROD(rs.getString("NOM_PROD"));
            produto.setNUM_VLR_MEDIO_UN(rs.getFloat("NUM_VLR_MEDIO_UN"));
            produto.setNUM_QTD_ESTOQUE(rs.getFloat("NUM_QTD_ESTOQUE"));
            produto.setNUM_VLR_ESTOQUE(rs.getFloat("NUM_VLR_ESTOQUE"));
            listProdutos.add(produto);
        
        }

        return listProdutos;

    }
}
