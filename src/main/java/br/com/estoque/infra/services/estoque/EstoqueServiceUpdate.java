package br.com.estoque.infra.services.estoque;
 
 import br.com.estoque.domain.estoque.Estoque;
import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class EstoqueServiceUpdate {
    
    public static void execute(AgroalDataSource dataSource, Estoque estoque) {
        EstoqueRepository estoqueRepository = new EstoqueRepository(dataSource);
        estoqueRepository.movimentaEstoque(estoque);
    }
}
