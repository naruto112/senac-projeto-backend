package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.movimentacoes.Movimentacao;
import br.com.estoque.domain.movimentacoes.interfaces.IMovimentacaoService;
 

public class MovimentacaoRepository implements IMovimentacaoService {
  
    private AgroalDataSource dataSource;

    public MovimentacaoRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    //TODO FAZER
    @Override
    public void insertMovimentacao(Movimentacao movimentacao,OnMoveStockListener listener) {
        try{
            String query = "DECLARE V_ID ES_MOVIMENTACOES.ID%TYPE;BEGIN PCKG_CRUD.INSERE_COD_MOV_PCKG("+movimentacao.getNOM_MOV()+", V_ID);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                movimentacao.setID(rs.getInt("V_ID"));
                System.out.println("AFTEER V_ID"+movimentacao.getID());

                movimentacao.setID(rs.getInt("ID"));
                System.out.println("AFTEER ID"+movimentacao.getID());

                listener.onReceivedIdMov(movimentacao.getID());

            }


         }catch(SQLException e){
            throw new Error(e);
        } 
        
    }            
    }


