package br.com.estoque.infra.services.fornecedores;

import br.com.estoque.infra.repositories.FornecedorRepository;
import io.agroal.api.AgroalDataSource;

public class FornecedorServiceDelete {
    public static void execute(AgroalDataSource dataSource, Integer id) {
        FornecedorRepository fornecedorRepository = new FornecedorRepository(dataSource);
        fornecedorRepository.deleteFornecedores(id);
    }
}
