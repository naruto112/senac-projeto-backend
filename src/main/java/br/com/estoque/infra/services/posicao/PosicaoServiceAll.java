package br.com.estoque.infra.services.posicao;

import java.util.List;

import br.com.estoque.domain.posicao.Posicao;
import br.com.estoque.infra.repositories.PosicaoRepository;
import io.agroal.api.AgroalDataSource;

public class PosicaoServiceAll {
    public static List<Posicao> execute(AgroalDataSource dataSource) {
        PosicaoRepository posicaoRepository = new PosicaoRepository(dataSource);
        return posicaoRepository.getAllPosicoes();
    }
}
