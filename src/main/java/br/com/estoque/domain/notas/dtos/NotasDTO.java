package br.com.estoque.domain.depositos.dtos;

public class DepositosDTO {

    private Number ID;
    private String NOM_DEPOS;

    public DepositosDTO(Number ID, String NOM_DEPOS) {
        this.ID = ID;
        this.NOM_DEPOS = NOM_DEPOS;
    }

    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public String getNOM_DEPOS() {
        return NOM_DEPOS;
    }

    public void setNOM_DEPOS(String nOM_DEPOS) {
        NOM_DEPOS = nOM_DEPOS;
    }
    
}
