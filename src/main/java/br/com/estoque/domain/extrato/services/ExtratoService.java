package br.com.estoque.domain.extrato.services;

import java.util.List;

import br.com.estoque.domain.extrato.Extrato;
import br.com.estoque.domain.extrato.interfaces.IExtratoService;
import br.com.estoque.infra.repositories.ExtratoRepository;

public class ExtratoService implements IExtratoService {

    private final ExtratoRepository extratoRepository;

    public ExtratoService(ExtratoRepository extratoRepository) {
        this.extratoRepository = extratoRepository;
    }

    @Override
    public List<Extrato> getAllExtratos() {
        return this.extratoRepository.getAllExtratos();
    }

}
