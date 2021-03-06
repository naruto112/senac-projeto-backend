package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.fornecedores.Fornecedores;
import br.com.estoque.domain.fornecedores.interfaces.IFornecedorService;

public class FornecedorRepository implements IFornecedorService {

    private AgroalDataSource dataSource;

    public FornecedorRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Fornecedores> getAllFornecedores() {

        try {
            List<Fornecedores> listFornecedores = new ArrayList<Fornecedores>();

            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM SENAC.ES_FORNECEDORES");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Fornecedores fornecedores = new Fornecedores();
                fornecedores.setID(rs.getInt("ID"));
                fornecedores.setNOM_FORNEC(rs.getString("NOM_FORNEC"));

                listFornecedores.add(fornecedores);

            }

            rs.close();
            ps.close();
            connection.close();

            return listFornecedores;

        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void deleteFornecedores(Integer id) {
        try {
            String query = "DELETE ES_FORNECEDORES WHERE ID = " + id;
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void createFornecedores(Fornecedores fornecedores) {

        try {
            String query = "DECLARE V_ID ES_FORNECEDORES.ID%TYPE;BEGIN PCKG_CRUD.INSERE_FORNEC_PCKG('"
                    + fornecedores.getNOM_FORNEC() + "', V_ID);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void updateFornecedores(Fornecedores fornecedores) {

        try {
            String query = "UPDATE ES_FORNECEDORES SET " +
                    "NOM_FORNEC='" + fornecedores.getNOM_FORNEC() + "'" +
                    " WHERE ID = " + fornecedores.getID();
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();
        } catch (SQLException e) {
            throw new Error(e);
        }

    }

}
