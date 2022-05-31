package br.com.estoque.infra.repositories;

import java.util.List;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.estoque.domain.Produto;
import br.com.estoque.domain.interfaces.IProdutoService;

public class ProdutoRepository implements IProdutoService{

    private AgroalDataSource dataSource;

    public ProdutoRepository(AgroalDataSource dataSource) {
        this.dataSource= dataSource;
    }

    @Override
    public List<Produto> getAllProdutos() {
        
        try {
            List<Produto> listProdutos = new ArrayList<Produto>();
    
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement("SELECT * FROM SENAC.ES_PRODUTOS");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Produto produto = new Produto();
                produto.setID(rs.getInt("ID"));
                produto.setNOM_PROD(rs.getString("NOM_PROD"));
                produto.setNUM_VLR_MEDIO_UN(rs.getFloat("NUM_VLR_MEDIO_UN"));
                produto.setNUM_QTD_ESTOQUE(rs.getFloat("NUM_QTD_ESTOQUE"));
                produto.setNUM_VLR_ESTOQUE(rs.getFloat("NUM_VLR_ESTOQUE"));
                listProdutos.add(produto);
            
            }

            return listProdutos;

        }catch(SQLException e) {
            throw new Error(e);
        }
        
    }

    @Override
    public void deleteProduto(Integer id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void createProduto(Produto produto) {
        try {
            String query = 
            "DECLARE V_ID ES_PRODUTOS.ID%TYPE;BEGIN PCKG_CRUD.INSERE_PROD_PCKG('"+produto.getNOM_PROD()+"', 0,0,0, V_ID);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = 
                connection.prepareStatement(query);
            ps.executeQuery();
        }catch(SQLException e) {
            throw new Error(e);
        }
        
    }

    @Override
    public void updateProduto(Produto produto) {
        try{
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
        }catch(SQLException e){
            throw new Error(e);
        }
        
    }
    
}
