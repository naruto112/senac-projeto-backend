package br.com.estoque.domain.depositos.services;

import java.util.List;

import br.com.estoque.domain.depositos.Depositos;
import br.com.estoque.domain.depositos.interfaces.IDepositosService;
import br.com.estoque.infra.repositories.DepositoRepository;

public class DepositosService implements IDepositosService {
    
    private final DepositoRepository depositoRepository;

    public DepositosService(DepositoRepository depositoRepository) {
        this.depositoRepository = depositoRepository;
    }

    @Override
    public List<Depositos> getAllDepositos() {
        return this.depositoRepository.getAllDepositos();
    }

    @Override
    public void deleteDepositos(Integer id) {
        this.depositoRepository.deleteDepositos(id);
        
    }

    @Override
    public void createDepositos(Depositos depositos) {
        this.depositoRepository.createDepositos(depositos);
        
    }

    @Override
    public void updateDepositos(Depositos depositos) {
        this.depositoRepository.updateDepositos(depositos);
        
    }
    

}
