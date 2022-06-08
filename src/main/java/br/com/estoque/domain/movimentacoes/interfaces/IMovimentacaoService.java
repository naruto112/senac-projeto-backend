package br.com.estoque.domain.movimentacoes.interfaces;

import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.movimentacoes.Movimentacao;
 
public interface IMovimentacaoService {
    void insertMovimentacao(Movimentacao movimentacao,OnMoveStockListener listener);
}
