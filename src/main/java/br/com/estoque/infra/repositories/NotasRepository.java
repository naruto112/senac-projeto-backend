package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List; 
import br.com.estoque.domain.notas.interfaces.INotasService;
 import br.com.estoque.domain.notas.Notas;

public class NotasRepository implements INotasService {
  
    private AgroalDataSource dataSource;

    public NotasRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Notas> getAllNotas() {
        try {
            List<Notas> listNotas = new ArrayList<Notas>();
    
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM SENAC.ES_NOTA_FISCAL");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Notas nota = new Notas();
                nota.setID(rs.getInt("ID"));
                nota.setNUM_NOTA(rs.getInt("NUM_NOTA"));
                nota.setID_FORNEC(rs.getInt("ID_FORNEC"));
                nota.setSTA_ENTRADA_SAIDA(rs.getInt("STA_ENTRADA_SAIDA"));

                listNotas.add(nota);
            
            }

            ps.close();
            connection.close();

            return listNotas;

        }catch(SQLException e) {
            throw new Error(e);
        }
    }


    @Override
    public void insertNota(Notas nota ) {
        try{
            String query = "DECLARE V_ID ES_NOTA_FISCAL.ID%TYPE;BEGIN PCKG_CRUD.INSERE_NOTA_PCKG("+nota.getNUM_NOTA()+","+nota.getID_FORNEC()+" ,"+nota.getSTA_ENTRADA_SAIDA()+", V_ID);END;";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps =  connection.prepareStatement(query); 
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                nota.setID(rs.getInt("V_ID"));
                System.out.println("AFTEER V_ID"+nota.getID());

                nota.setID(rs.getInt("ID"));
                System.out.println("AFTEER ID"+nota.getID());

 
            }

            ps.close();
            connection.close();

         }catch(SQLException e){
            throw new Error(e);
        } 
        
    }

}
