package br.com.estoque.infra.services.notas;

import java.util.List;

import br.com.estoque.infra.repositories.NotasRepository;
import io.agroal.api.AgroalDataSource;
import br.com.estoque.domain.notas.Notas;

public class NotasServiceAll {
    public static List<Notas> execute(AgroalDataSource dataSource) {
        NotasRepository notasRepository = new NotasRepository(dataSource);
        return notasRepository.getAllNotas();
    }
}
