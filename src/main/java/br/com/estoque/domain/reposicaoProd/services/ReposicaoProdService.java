package br.com.estoque.domain.reposicaoProd.services;

import java.util.List;

import br.com.estoque.domain.reposicaoProd.ReposicaoProd;
import br.com.estoque.domain.reposicaoProd.interfaces.IReposicaoProdService;
import br.com.estoque.infra.repositories.ReposicaoProdRepository;

public class ReposicaoProdService implements IReposicaoProdService {

    private final ReposicaoProdRepository reposicaoProdRepository;

    public ReposicaoProdService(ReposicaoProdRepository reposicaoProdRepository) {
        this.reposicaoProdRepository = reposicaoProdRepository;
    }

    @Override
    public List<ReposicaoProd> getAllReposicaoProd() {
        return this.reposicaoProdRepository.getAllReposicaoProd();
    }

}
