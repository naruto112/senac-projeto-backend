package br.com.estoque.domain.estoque.utils;

import org.jboss.resteasy.annotations.Stream.MODE;

import br.com.estoque.domain.estoque.Estoque;
import br.com.estoque.domain.estoque.body.MovementBody;
import br.com.estoque.domain.movimentacoes.Movimentacao;
import br.com.estoque.domain.notas.Notas;
import br.com.estoque.domain.reposprod.ReposProd;
import br.com.estoque.infra.services.estoque.EstoqueServiceUpdate;
import br.com.estoque.infra.services.movimentacao.MovimentacaoServiceInsert;
import br.com.estoque.infra.services.notas.NotasServiceInsert;
import br.com.estoque.infra.services.reposprod.ReposProdServiceInsert;
import io.agroal.api.AgroalDataSource;
import oracle.net.aso.b;

public class EstoqueHandler implements OnMoveStockListener{

    private AgroalDataSource dataSource;
    private MovementBody body;
    private Estoque estoque;

    public EstoqueHandler() {
    }

    public void execute(AgroalDataSource dataSource, MovementBody body){
        this.body = body;
        this.dataSource = dataSource;
        this.estoque = new Estoque();

        //perguntar aonde envia a quantidade do usuario 
        
        ReposProd reposProd = new ReposProd();
        reposProd.setID_PROD(body.getiD_produto());
        reposProd.setID_DEPOS(body.getiD_Deposito());


         
       ReposProdServiceInsert.execute(dataSource, reposProd, this)  ;
    };

    @Override
    public void onReceivedIdReposProd(Number id_repos_prod) {
        this.estoque.setID_REPOS_PROD(id_repos_prod);

        Notas nota = new Notas();
        nota.setID_FORNEC(body.getiD_Fornecedor());
        nota.setNUM_NOTA((int) ((Math.random() * (999999 - 555555)) + 555555));
        nota.setSTA_ENTRADA_SAIDA(body.isEnter() ? 1 : 0);
    

        NotasServiceInsert.execute(dataSource, nota,this);
        
        
    }

    @Override
    public void onReceivedIdNota(Number id_nota) {
        this.estoque.setID_NOTA(id_nota);

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setNOM_MOV(""+(body.isHasNota() ? 1000 :1001)+"");

        MovimentacaoServiceInsert.execute(dataSource, movimentacao, this);
        
        
    }

    @Override
    public void onReceivedIdMov(Number id_mov ) {
        this.estoque.setID_MOV(id_mov);
        
        EstoqueServiceUpdate.execute(dataSource, estoque, this);
    }
    
}
