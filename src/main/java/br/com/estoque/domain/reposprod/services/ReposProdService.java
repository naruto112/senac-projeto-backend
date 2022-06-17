package br.com.estoque.domain.reposprod.services;

 import br.com.estoque.domain.reposprod.ReposProd;
import br.com.estoque.domain.reposprod.interfaces.IReposProdService;
import br.com.estoque.infra.repositories.ReposProdRepository;

public class ReposProdService implements IReposProdService {
    
    private final ReposProdRepository reposProdRepository;

    public ReposProdService(ReposProdRepository reposProdRepository) {
        this.reposProdRepository = reposProdRepository;
    }

    @Override
    public void boundReposWithProduct(ReposProd reposProd ) {
        this.reposProdRepository.boundReposWithProduct(reposProd );        
    }





}
