package br.com.estoque.infra.services;

import java.util.List;

import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;


public class ProdutoServiceAll {
    
    
    public static List<Produto> execute(AgroalDataSource dataSource) {
        ProdutoRepository produtoRepository = new ProdutoRepository(dataSource);
        return produtoRepository.getAllProdutos();
    }
        
}
