package br.com.estoque.domain.produtos.interfaces;

import java.util.List;

import br.com.estoque.domain.produtos.Produto;


public interface IProdutoService {
    List getAllProdutos();
    
    void deleteProduto(Integer id);

    void createProduto(Produto produto);

    void updateProduto(Produto produto);
}
