package br.com.estoque.infra.services.reposprod;
 
 import br.com.estoque.domain.reposprod.ReposProd;
import br.com.estoque.infra.repositories.*;
import io.agroal.api.AgroalDataSource;

public class ReposProdServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, ReposProd reposProd ) {
        ReposProdRepository reposProdRepository = new ReposProdRepository(dataSource);
        reposProdRepository.boundReposWithProduct(reposProd );
    }
}
