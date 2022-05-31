package br.com.estoque.domain.fornecedores;

import br.com.estoque.domain.fornecedores.dtos.FornecedoresDTO;

public class Fornecedores {
    
    private Number ID;
    private String NOM_FORNEC;

    public Fornecedores() {
    }

    public Fornecedores(Number ID, String NOM_FORNEC) {
        this.ID = ID;
        this.NOM_FORNEC = NOM_FORNEC;
    }

    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public String getNOM_FORNEC() {
        return NOM_FORNEC;
    }

    public void setNOM_FORNEC(String nOM_FORNEC) {
        NOM_FORNEC = nOM_FORNEC;
    }

    public Fornecedores(FornecedoresDTO fornecedoresDTO) {
        this.ID = fornecedoresDTO.getID();
        this.NOM_FORNEC = fornecedoresDTO.getNOM_FORNEC();
    }

}
