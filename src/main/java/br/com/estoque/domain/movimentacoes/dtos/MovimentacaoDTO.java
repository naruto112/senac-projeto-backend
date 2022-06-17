package br.com.estoque.domain.movimentacoes.dtos;


//TABLE es_movimentacoes
public class MovimentacaoDTO {

    private Number ID;
    private String NOM_MOV;


    public MovimentacaoDTO(Number ID, String NOM_MOV) {
        this.ID = ID;
        this.NOM_MOV = NOM_MOV;

     }
 
    
    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }
 
    public void setNOM_MOV(String nOM_MOV) {
        NOM_MOV = nOM_MOV;
    }

    public String getNOM_MOV(){
        return NOM_MOV;
    }

    
}
