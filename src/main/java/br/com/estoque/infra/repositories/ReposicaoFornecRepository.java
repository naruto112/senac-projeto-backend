package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.reposicaoFornec.ReposicaoFornec;
import br.com.estoque.domain.reposicaoFornec.interfaces.IReposicaoFornec;

public class ReposicaoFornecRepository implements IReposicaoFornec {

    private AgroalDataSource dataSource;

    public ReposicaoFornecRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<ReposicaoFornec> getAllReposicaoFornec() {

        try {

            List<ReposicaoFornec> listExtratos = new ArrayList<ReposicaoFornec>();

            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM REPOSICAO_FORNEC");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ReposicaoFornec reposicaoFornec = new ReposicaoFornec();
                reposicaoFornec.setNOM_PROD(rs.getString("NOM_PROD"));
                reposicaoFornec.setNOM_DEPOS(rs.getString("NOM_DEPOS"));
                reposicaoFornec.setNUM_QTD_ESTOQUE(rs.getInt("NUM_QTD_ESTOQUE"));
                reposicaoFornec.setNUM_QTD_REPOS(rs.getInt("NUM_QTD_REPOS"));
                reposicaoFornec.setNOM_FORNEC(rs.getString("NOM_FORNEC"));
                reposicaoFornec.setNUM_CUSTO_UN_PROD(rs.getDouble("NUM_CUSTO_UN_PROD"));
                reposicaoFornec.setDTE(rs.getDate("DTE"));

                listExtratos.add(reposicaoFornec);
            }

            return listExtratos;

        } catch (SQLException e) {
            throw new Error(e);
        }

    }

}
