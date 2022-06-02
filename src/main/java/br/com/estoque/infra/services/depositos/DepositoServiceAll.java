package br.com.estoque.infra.services.depositos;

import java.util.List;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.infra.repositories.DepositoRepository;

public class DepositoServiceAll {
    public static List<Depositos> execute() {
        DepositoRepository depositoRepository = new DepositoRepository();
        return depositoRepository.getAllDepositos();
    }
}
