package br.com.estoque.domain.movimentacoes.interfaces;

import br.com.estoque.domain.reposprod.Movimentacao;
import br.com.estoque.domain.reposprod.ReposProd;

public interface IMovimentacaoService {
    void boundReposWithProduct(Movimentacao movimentacao);
}
