package br.com.estoque.domain.movimentacoes.services;

import br.com.estoque.domain.movimentacoes.Movimentacao;
import br.com.estoque.domain.movimentacoes.interfaces.IMovimentacaoService;
import br.com.estoque.infra.repositories.MovimentacaoRepository;

public class MovimentacaoService implements IMovimentacaoService {
    
    private final MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    @Override
    public void registerMovimentacao(Movimentacao movimentacao) {
        this.movimentacaoRepository.registerMovimentacao(movimentacao);     
    }





}
