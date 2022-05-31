package br.com.estoque.domain.fornecedores.services;

import java.util.List;

import br.com.estoque.domain.fornecedores.Fornecedores;
import br.com.estoque.domain.fornecedores.interfaces.IFornecedorService;
import br.com.estoque.infra.repositories.FornecedorRepository;

public class FornecedorService implements IFornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public List<Fornecedores> getAllFornecedores() {
        return this.fornecedorRepository.getAllFornecedores();
    }

    @Override
    public void deleteFornecedores(Integer id) {
        this.fornecedorRepository.deleteFornecedores(id);
        
    }

    @Override
    public void createFornecedores(Fornecedores fornecedores) {
        this.fornecedorRepository.createFornecedores(fornecedores);
        
    }

    @Override
    public void updateFornecedores(Fornecedores fornecedores) {
        this.updateFornecedores(fornecedores);

    }
    
}
