package br.com.estoque.domain.produtos.services;
import java.util.List;

import br.com.estoque.domain.produtos.interfaces.IProdutoService;
import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.infra.repositories.ProdutoRepository;

public class ProdutoService implements IProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List getAllProdutos() {
        return this.produtoRepository.getAllProdutos();
    }

    @Override
    public void deleteProduto(Integer id) {
        this.produtoRepository.deleteProduto(id);
        
    }

    @Override
    public void createProduto(Produto produto) {
        this.produtoRepository.createProduto(produto);
    }

    @Override
    public void updateProduto(Produto produto) {
        this.produtoRepository.updateProduto(produto);
    }

}
