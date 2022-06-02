package br.com.estoque.domain.depositos.interfaces;

import br.com.estoque.domain.depositos.Depositos;

import java.util.List;

public interface IDepositosService {
    List<Depositos> getAllDepositos();

    void deleteDepositos(Integer id);

    void createDepositos(Depositos depositos);

    void updateDepositos(Depositos depositos);
}
