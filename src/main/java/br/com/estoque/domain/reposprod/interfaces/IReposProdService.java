package br.com.estoque.domain.reposprod.interfaces;

 import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.reposprod.ReposProd;

public interface IReposProdService {
    void boundReposWithProduct(ReposProd reposProd, OnMoveStockListener listener);
}
