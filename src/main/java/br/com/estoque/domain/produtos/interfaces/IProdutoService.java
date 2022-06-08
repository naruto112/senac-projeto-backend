package br.com.estoque.domain.produtos.interfaces;

import java.util.List;

import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.domain.produtos.dtos.ProdutosDTO;

public interface IProdutoService {
    List<ProdutosDTO> getAllProdutos();
    
    void deleteProduto(Integer id);

    void createProduto(Produto produto);

    void updateProduto(Produto produto);
}
