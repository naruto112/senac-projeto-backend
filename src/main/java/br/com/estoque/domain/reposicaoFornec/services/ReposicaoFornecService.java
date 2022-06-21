package br.com.estoque.domain.reposicaoFornec.services;

import java.util.List;

import br.com.estoque.domain.reposicaoFornec.ReposicaoFornec;
import br.com.estoque.domain.reposicaoFornec.interfaces.IReposicaoFornec;
import br.com.estoque.infra.repositories.ReposicaoFornecRepository;

public class ReposicaoFornecService implements IReposicaoFornec {

    private final ReposicaoFornecRepository reposicaoFornecRepository;

    public ReposicaoFornecService(ReposicaoFornecRepository reposicaoFornecRepository) {
        this.reposicaoFornecRepository = reposicaoFornecRepository;
    }

    @Override
    public List<ReposicaoFornec> getAllReposicaoFornec() {
        return this.reposicaoFornecRepository.getAllReposicaoFornec();
    }

}
