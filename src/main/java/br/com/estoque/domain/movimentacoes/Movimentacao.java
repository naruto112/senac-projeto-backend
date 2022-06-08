package br.com.estoque.domain.movimentacoes;

import br.com.estoque.domain.movimentacoes.dtos.MovimentacaoDTO;
 
public class Movimentacao {


    private Number ID;
    private String NOM_MOV;


     public Movimentacao(){};
    public Movimentacao(Number ID, String nOM_MOv) {
        this.ID = ID;
        this.NOM_MOV = nOM_MOv;
 
     }

     public Movimentacao(MovimentacaoDTO movimentacaoDTO){
         this.ID = movimentacaoDTO.getID();
         this.NOM_MOV = movimentacaoDTO.getNOM_MOV();
     }

    

    public Number getID() {
        return ID;
    }
    public void setID(Number iD) {
        ID = iD;
    }
    public String getNOM_MOV() {
        return NOM_MOV;
    }
    public void setNOM_MOV(String nOM_MOV) {
        NOM_MOV = nOM_MOV;
    }


}
