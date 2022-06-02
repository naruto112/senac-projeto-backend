package br.com.estoque.domain.fornecedores.interfaces;

import br.com.estoque.domain.fornecedores.Fornecedores;

import java.util.List;

public interface IFornecedorService {
    List getAllFornecedores();
    
    void deleteFornecedores(Integer id);

    void createFornecedores(Fornecedores fornecedores);

    void updateFornecedores(Fornecedores fornecedores);
}
