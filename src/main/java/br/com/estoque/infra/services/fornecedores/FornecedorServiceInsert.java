package br.com.estoque.infra.services.fornecedores;

import br.com.estoque.domain.fornecedores.Fornecedores;
import br.com.estoque.infra.repositories.FornecedorRepository;
import io.agroal.api.AgroalDataSource;

public class FornecedorServiceInsert {
    public static void execute(AgroalDataSource dataSource, Fornecedores fornecedores) {
        FornecedorRepository fornecedorRepository = new FornecedorRepository(dataSource);
        fornecedorRepository.createFornecedores(fornecedores);
    }
}
