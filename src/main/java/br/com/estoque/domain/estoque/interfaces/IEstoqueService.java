package br.com.estoque.domain.estoque.interfaces;

import br.com.estoque.domain.estoque.Estoque;
import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
 
public interface IEstoqueService {
    void movimentaEstoque (Estoque estoque,OnMoveStockListener listener);
}
