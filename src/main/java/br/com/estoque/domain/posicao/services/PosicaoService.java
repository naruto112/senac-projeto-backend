package br.com.estoque.domain.posicao.services;

import java.util.List;

import br.com.estoque.domain.posicao.Posicao;
import br.com.estoque.domain.posicao.interfaces.IPosicaoService;
import br.com.estoque.infra.repositories.PosicaoRepository;

public class PosicaoService implements IPosicaoService {

    private final PosicaoRepository posicaoRepository;

    public PosicaoService(PosicaoRepository posicaoRepository) {
        this.posicaoRepository = posicaoRepository;
    }

    @Override
    public List<Posicao> getAllPosicoes() {
        return this.posicaoRepository.getAllPosicoes();
    }

}
