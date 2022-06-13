package br.com.estoque.infra.services.estoque;
 
 import br.com.estoque.domain.estoque.body.MovementBody;
 import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class EstoqueServiceUpdate {
    
    public static void execute(AgroalDataSource dataSource, MovementBody body) {
        EstoqueRepository estoqueRepository = new EstoqueRepository(dataSource);
        estoqueRepository.movimentaEstoque(body);
    }
}
