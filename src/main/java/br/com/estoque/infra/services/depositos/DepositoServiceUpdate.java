package br.com.estoque.infra.services.depositos;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.repositories.DepositoRepository;

public class DepositoServiceUpdate {
    
    public static void execute(AgroalDataSource dataSource, Depositos depositos) {
        DepositoRepository depositoRepository = new DepositoRepository();
        depositoRepository.updateDepositos(depositos);
    }
}
