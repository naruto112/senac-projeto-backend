package br.com.estoque.domain.interfaces;

import br.com.estoque.domain.Produto;
import java.util.List;


public interface IProdutoService {
    List<Produto> getAllProdutos();
    
    void deleteProduto(Integer id);

    void createProduto(Produto produto);

    void updateProduto(Produto produto);
}
