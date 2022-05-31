package br.com.estoque.infra.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.estoque.domain.services.ProdutoService;
import br.com.estoque.infra.repositories.ProdutoRepository;

@ApplicationScoped
public class ProdutoServices {
    
    
    ProdutoService produtoServices(ProdutoRepository produtosRepository) {
        return new ProdutoService(produtosRepository);
    }
        
}
