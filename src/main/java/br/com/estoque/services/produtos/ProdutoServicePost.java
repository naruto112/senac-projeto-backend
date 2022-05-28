package br.com.estoque.services.produtos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import br.com.estoque.model.Produtos;
import io.agroal.api.AgroalDataSource;

public class ProdutoServicePost {
    public void create(AgroalDataSource dataSource, Produtos produto) throws SQLException {

        String query = "DECLARE...";
        Connection connection = dataSource.getConnection();
        PreparedStatement ps = 
            connection.prepareStatement(query);
        ps.executeQuery();

    }
}
