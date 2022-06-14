package br.com.estoque.domain.depositos;

import br.com.estoque.domain.depositos.dtos.DepositosDTO;

public class Depositos {
    
    private Number ID;
    private String nom_DEPOS;

    public Depositos() {
    }

    public Depositos(Number ID, String nom_DEPOS) {
        this.ID = ID;
        this.nom_DEPOS = nom_DEPOS;
    }

    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public String getNOM_DEPOS() {
        return nom_DEPOS;
    }

    public void setNOM_DEPOS(String nOM_DEPOS) {
        nom_DEPOS = nOM_DEPOS;
    }

    public Depositos(DepositosDTO depositosDTO) {
        this.ID = depositosDTO.getID();
        this.nom_DEPOS = depositosDTO.getNOM_DEPOS();
    }


}
