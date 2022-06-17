package br.com.estoque.domain.notas.interfaces;

 import br.com.estoque.domain.notas.*;

import java.util.List;

public interface INotasService {
    List<Notas> getAllNotas();

    void insertNota(Notas nota );
    
}
