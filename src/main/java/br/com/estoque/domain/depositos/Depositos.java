package br.com.estoque.domain.depositos;

import br.com.estoque.domain.depositos.dtos.DepositosDTO;

public class Depositos {
    
    private Number ID;
    private String NOM_DEPOS;

    public Depositos() {
    }

    public Depositos(Number ID, String NOM_DEPOS) {
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

    public Depositos(DepositosDTO depositosDTO) {
        this.ID = depositosDTO.getID();
        this.NOM_DEPOS = depositosDTO.getNOM_DEPOS();
    }


}
