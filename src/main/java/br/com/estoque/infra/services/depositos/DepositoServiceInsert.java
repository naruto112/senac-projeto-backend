package br.com.estoque.infra.services.depositos;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.repositories.DepositoRepository;
import io.agroal.api.AgroalDataSource;

public class DepositoServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, Depositos depositos) {
        DepositoRepository depositoRepository = new DepositoRepository(dataSource);
        depositoRepository.createDepositos(depositos);
    }
}
