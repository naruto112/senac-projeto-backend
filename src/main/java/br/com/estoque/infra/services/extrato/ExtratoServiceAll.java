package br.com.estoque.infra.services.extrato;

import java.util.List;

import br.com.estoque.domain.extrato.Extrato;
import br.com.estoque.infra.repositories.ExtratoRepository;
import io.agroal.api.AgroalDataSource;

public class ExtratoServiceAll {
    public static List<Extrato> execute(AgroalDataSource dataSource) {
        ExtratoRepository extratoRepository = new ExtratoRepository(dataSource);
        return extratoRepository.getAllExtratos();
    }
}