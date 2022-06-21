package br.com.estoque.infra.services.reposicaoProd;

import java.util.List;
import br.com.estoque.domain.reposicaoProd.ReposicaoProd;
import br.com.estoque.infra.repositories.ReposicaoProdRepository;
import io.agroal.api.AgroalDataSource;

public class ReposicaoProdAll {
    public static List<ReposicaoProd> execute(AgroalDataSource dataSource) {
        ReposicaoProdRepository reposicaoProdRepository = new ReposicaoProdRepository(dataSource);
        return reposicaoProdRepository.getAllReposicaoProd();
    }
}
