package br.com.estoque.infra.services.reposicaoFornec;

import java.util.List;

import br.com.estoque.domain.reposicaoFornec.ReposicaoFornec;
import br.com.estoque.infra.repositories.ReposicaoFornecRepository;
import io.agroal.api.AgroalDataSource;

public class ReposicaoFornecAll {
    public static List<ReposicaoFornec> execute(AgroalDataSource dataSource) {
        ReposicaoFornecRepository reposicaoFornecRepository = new ReposicaoFornecRepository(dataSource);
        return reposicaoFornecRepository.getAllReposicaoFornec();
    }
}
