package br.com.estoque.domain.posicao.interfaces;

import java.util.List;
import br.com.estoque.domain.posicao.Posicao;

public interface IPosicaoService {
    List<Posicao> getAllPosicoes();
}
