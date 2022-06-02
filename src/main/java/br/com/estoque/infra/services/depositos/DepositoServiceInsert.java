package br.com.estoque.infra.services.depositos;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.repositories.DepositoRepository;

public class DepositoServiceInsert {
    
    public static void execute(Depositos depositos) {
        DepositoRepository depositoRepository = new DepositoRepository();
        depositoRepository.createDepositos(depositos);
    }
}
