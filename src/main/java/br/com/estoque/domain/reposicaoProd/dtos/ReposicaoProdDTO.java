package br.com.estoque.domain.reposicaoProd.dtos;

public class ReposicaoProdDTO {
    private String NOM_PROD;
    private Number ID_REP;
    private Number NUM_QTD_ESTOQUE;
    private Number NUM_QTD_REPOS;
    private String NOM_DEPOS;

    public ReposicaoProdDTO(String NOM_PROD, Number ID_REP, Number NUM_QTD_ESTOQUE, Number NUM_QTD_REPOS,
            String NOM_DEPOS) {
        this.ID_REP = ID_REP;
        this.NOM_DEPOS = NOM_DEPOS;
        this.NUM_QTD_ESTOQUE = NUM_QTD_ESTOQUE;
        this.NUM_QTD_REPOS = NUM_QTD_REPOS;
        this.NOM_DEPOS = NOM_DEPOS;
    }

    public Number getID_REP() {
        return ID_REP;
    }

    public void setID_REP(Number iD_REP) {
        ID_REP = iD_REP;
    }

    public String getNOM_PROD() {
        return NOM_PROD;
    }

    public void setNOM_PROD(String nOM_PROD) {
        NOM_PROD = nOM_PROD;
    }

    public Number getNUM_QTD_ESTOQUE() {
        return NUM_QTD_ESTOQUE;
    }

    public void setNUM_QTD_ESTOQUE(Number nUM_QTD_ESTOQUE) {
        NUM_QTD_ESTOQUE = nUM_QTD_ESTOQUE;
    }

    public Number getNUM_QTD_REPOS() {
        return NUM_QTD_REPOS;
    }

    public void setNUM_QTD_REPOS(Number nUM_QTD_REPOS) {
        NUM_QTD_REPOS = nUM_QTD_REPOS;
    }

    public String getNOM_DEPOS() {
        return NOM_DEPOS;
    }

    public void setNOM_DEPOS(String nOM_DEPOS) {
        NOM_DEPOS = nOM_DEPOS;
    }
}
