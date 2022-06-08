package br.com.estoque.infra.services.movimentacao;
 
 import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.movimentacoes.Movimentacao;
import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class MovimentacaoServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, Movimentacao movimentacao, OnMoveStockListener listener) {
        MovimentacaoRepository movimentacaoRepository = new MovimentacaoRepository(dataSource);
        movimentacaoRepository.insertMovimentacao(movimentacao, listener);
    }
}
