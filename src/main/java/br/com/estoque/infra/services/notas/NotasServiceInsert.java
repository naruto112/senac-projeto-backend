package br.com.estoque.infra.services.notas;
 
 import br.com.estoque.domain.notas.Notas;
import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class NotasServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, Notas nota ) {
        NotasRepository notasRepository = new NotasRepository(dataSource);
        notasRepository.insertNota(nota );
    }
}
