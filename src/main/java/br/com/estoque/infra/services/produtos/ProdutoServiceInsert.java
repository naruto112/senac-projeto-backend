package br.com.estoque.infra.services.produtos;

import br.com.estoque.domain.produtos.Produto;
import br.com.estoque.infra.repositories.ProdutoRepository;
import io.agroal.api.AgroalDataSource;

public class ProdutoServiceInsert {
    public static void execute(AgroalDataSource dataSource, Produto produto) {
        ProdutoRepository produtoRepository = new ProdutoRepository(dataSource);
        produtoRepository.createProduto(produto);
    }
}
