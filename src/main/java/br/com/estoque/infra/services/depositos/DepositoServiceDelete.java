package br.com.estoque.infra.services.depositos;

import br.com.estoque.infra.repositories.DepositoRepository;
import io.agroal.api.AgroalDataSource;

public class DepositoServiceDelete {
    
    public static void execute(AgroalDataSource dataSource, Integer id) {
        DepositoRepository depositoRepository = new DepositoRepository(dataSource);
        depositoRepository.deleteDepositos(id);
    }
}
