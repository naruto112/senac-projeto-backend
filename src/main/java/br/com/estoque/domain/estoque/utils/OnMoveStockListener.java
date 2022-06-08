package br.com.estoque.domain.estoque.utils;

 
public interface OnMoveStockListener {

    void onReceivedIdReposProd(Number id_repos_prod );

    void onReceivedIdNota(Number id_nota );

    void onReceivedIdMov(Number id_mov );

    
}
