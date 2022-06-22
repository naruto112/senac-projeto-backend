package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.reposicaoProd.ReposicaoProd;
import br.com.estoque.domain.reposicaoProd.interfaces.IReposicaoProdService;

public class ReposicaoProdRepository implements IReposicaoProdService {

    private AgroalDataSource dataSource;

    public ReposicaoProdRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<ReposicaoProd> getAllReposicaoProd() {

        try {

            List<ReposicaoProd> listReposicaoProd = new ArrayList<ReposicaoProd>();
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM REPOSICAO_PROD");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ReposicaoProd reposicaoProd = new ReposicaoProd();
                reposicaoProd.setNOM_PROD(rs.getString("NOM_PROD"));
                reposicaoProd.setID_REP(rs.getInt("ID_REP"));
                reposicaoProd.setNUM_QTD_ESTOQUE(rs.getInt("NUM_QTD_ESTOQUE"));
                reposicaoProd.setNUM_QTD_REPOS(rs.getInt("NUM_QTD_REPOS"));
                reposicaoProd.setNOM_DEPOS(rs.getString("NOM_DEPOS"));

                listReposicaoProd.add(reposicaoProd);

            }

            rs.close();
            ps.close();
            connection.close();

            return listReposicaoProd;

        } catch (SQLException e) {
            throw new Error(e);
        }

    }

}
