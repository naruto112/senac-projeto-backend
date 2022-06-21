package br.com.estoque.domain.extrato.interfaces;

import java.util.List;

import br.com.estoque.domain.extrato.Extrato;

public interface IExtratoService {
    List<Extrato> getAllExtratos();
}
