package br.com.estoque.domain.estoque.services;

 
import br.com.estoque.domain.estoque.body.MovementBody;
import br.com.estoque.domain.estoque.interfaces.IEstoqueService;
 import br.com.estoque.infra.repositories.EstoqueRepository;
 
public class EstoqueService implements IEstoqueService {
    
    private final EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository notasRepository) {
        this.estoqueRepository = notasRepository;
    }


    @Override
    public void movimentaEstoque(MovementBody body ) {
        this.estoqueRepository.movimentaEstoque(body);
    }


}
