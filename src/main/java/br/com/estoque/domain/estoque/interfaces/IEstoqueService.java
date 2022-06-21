package br.com.estoque.domain.estoque.interfaces;

import br.com.estoque.domain.estoque.body.MovementBody;

public interface IEstoqueService {
    void movimentaEstoque(MovementBody body);
}
