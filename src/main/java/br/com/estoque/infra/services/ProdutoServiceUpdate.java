package br.com.estoque.infra.services;

import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;


public class ProdutoServiceUpdate {
    public static void execute(AgroalDataSource dataSource, Produto produtos) {
        ProdutoRepository produtoRepository = new ProdutoRepository(dataSource);
        produtoRepository.updateProduto(produtos);
    }
}
