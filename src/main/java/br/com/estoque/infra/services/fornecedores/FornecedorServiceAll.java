package br.com.estoque.infra.services.fornecedores;

import java.util.List;

import br.com.estoque.infra.repositories.FornecedorRepository;
import io.agroal.api.AgroalDataSource;

public class FornecedorServiceAll {
    
    public static List execute(AgroalDataSource dataSource) {
        FornecedorRepository fornecedorRepository = new FornecedorRepository(dataSource);
        return fornecedorRepository.getAllFornecedores();
    }
}
