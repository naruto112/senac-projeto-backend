package br.com.estoque.domain.notas.services;

import br.com.estoque.domain.notas.interfaces.INotasService;
import br.com.estoque.domain.estoque.utils.OnMoveStockListener;
import br.com.estoque.domain.notas.Notas;
import br.com.estoque.infra.repositories.NotasRepository;
import java.util.List;

public class NotasService implements INotasService {
    
    private final NotasRepository notasRepository;

    public NotasService(NotasRepository notasRepository) {
        this.notasRepository = notasRepository;
    }

    @Override
    public List<Notas> getAllNotas() {
        return this.notasRepository.getAllNotas();
    }

    @Override
    public void insertNota(Notas nota, OnMoveStockListener listener) {
        this.notasRepository.insertNota(nota,listener);
    }

}
