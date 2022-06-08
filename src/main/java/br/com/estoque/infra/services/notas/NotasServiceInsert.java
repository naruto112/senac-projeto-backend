package br.com.estoque.infra.services.notas;
 
import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.notas.Notas;
import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class NotasServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, Notas nota, OnMoveStockListener listener) {
        NotasRepository notasRepository = new NotasRepository(dataSource);
        notasRepository.insertNota(nota,listener);
    }
}
