package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.extrato.Extrato;
import br.com.estoque.domain.extrato.interfaces.IExtratoService;

public class ExtratoRepository implements IExtratoService {

    private AgroalDataSource dataSource;

    public ExtratoRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Extrato> getAllExtratos() {

        try {

            List<Extrato> listExtratos = new ArrayList<Extrato>();

            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM EXTRATO");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Extrato extrato = new Extrato();

                extrato.setDATA(rs.getDate("DATE_CREATE"));
                extrato.setNOTA_FISCAL(rs.getString("NUM_NOTA"));
                extrato.setENTRADA_SAIDA(rs.getString("MOV"));
                extrato.setVALOR(rs.getDouble("NUM_CUSTO_UN_PROD"));
                extrato.setPRODUTO(rs.getString("NOM_PROD"));
                extrato.setQUANTIDADE(rs.getInt("NUM_QTD_PROD"));
                extrato.setFORNECEDOR(rs.getString("NOM_FORNEC"));
                extrato.setDEPOSITO(rs.getString("NOM_DEPOS"));

                listExtratos.add(extrato);
            }

            return listExtratos;

        } catch (SQLException e) {
            throw new Error(e);
        }
    }

}
