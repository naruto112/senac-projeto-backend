package br.com.estoque.services.produtos;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import io.agroal.api.AgroalDataSource;

public class ProdutoServiceDelete {
    public void execute(AgroalDataSource dataSource, Integer id) throws SQLException {

        Connection connection = dataSource.getConnection();
        // PreparedStatement ps = 
        //     connection.prepareStatement("DELETE ES_PRODUTOS WHERE ID = " + id);
        // ps.executeQuery();
    }
}
