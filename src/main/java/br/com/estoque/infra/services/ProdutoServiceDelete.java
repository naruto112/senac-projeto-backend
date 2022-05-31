package br.com.estoque.infra.services;

import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;

public class ProdutoServiceDelete {
    public static void execute(AgroalDataSource dataSource, Integer id) {
        ProdutoRepository produtoRepository = new ProdutoRepository(dataSource);
        produtoRepository.deleteProduto(id);
    }
}
