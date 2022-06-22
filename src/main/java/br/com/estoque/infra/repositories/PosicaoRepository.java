package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.posicao.Posicao;
import br.com.estoque.domain.posicao.interfaces.IPosicaoService;

public class PosicaoRepository implements IPosicaoService {

    private AgroalDataSource dataSource;

    public PosicaoRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Posicao> getAllPosicoes() {
        try {

            List<Posicao> listPosicoes = new ArrayList<Posicao>();

            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM POSICAO");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Posicao posicao = new Posicao();
                posicao.setID(rs.getInt("ID_REPOS"));
                posicao.setPRODUTO(rs.getString("NOM_PROD"));
                posicao.setSALDO(rs.getDouble("NUM_QTD_ESTOQUE"));
                posicao.setDEPOSITO(rs.getString("NOM_DEPOS"));

                listPosicoes.add(posicao);
            }

            rs.close();
            ps.close();
            connection.close();

            return listPosicoes;

        } catch (SQLException e) {
            throw new Error(e);
        }
    }

}
