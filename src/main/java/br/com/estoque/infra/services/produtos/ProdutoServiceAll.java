package br.com.estoque.infra.services.produtos;

import java.util.List;

import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;


public class ProdutoServiceAll {
    
    public static List execute(AgroalDataSource dataSource) {
        ProdutoRepository produtoRepository = new ProdutoRepository(dataSource);
        return produtoRepository.getAllProdutos();
    }
        
}
