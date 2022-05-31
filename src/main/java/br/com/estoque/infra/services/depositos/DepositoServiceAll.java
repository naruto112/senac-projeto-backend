package br.com.estoque.infra.services.depositos;

import java.util.List;

import io.agroal.api.AgroalDataSource;
import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.repositories.DepositoRepository;

public class DepositoServiceAll {
    public static List<Depositos> execute(AgroalDataSource dataSource) {
        DepositoRepository depositoRepository = new DepositoRepository(dataSource);
        return depositoRepository.getAllDepositos();
    }
}
