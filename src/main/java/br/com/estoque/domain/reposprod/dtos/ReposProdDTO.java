package br.com.estoque.domain.reposprod.dtos;


//TABLE es_repos_prod 
public class ReposProdDTO {

    private Number ID;
    private Number ID_PROD;
    private Number ID_DEPOS;
     private Number NUM_QTD_REPOS;
     private Number NUM_QTD_ESTOQUE;

    public ReposProdDTO(Number ID, Number ID_PROD, Number ID_DEPOS, Number NUM_QTD_REPOS, Number NUM_QTD_ESTOQUE ) {
        this.ID = ID;
        this.ID_PROD = ID_PROD;
        this.ID_DEPOS = ID_DEPOS;
        this.NUM_QTD_REPOS = NUM_QTD_REPOS;
        this.NUM_QTD_ESTOQUE = NUM_QTD_ESTOQUE;
 
     }
 
    
    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public Number getID_PROD() {
        return ID_PROD;
    }

    public void setID_PROD(Number iD_PROD) {
        ID_PROD = iD_PROD;
    }

    public Number getID_DEPOS() {
        return ID_DEPOS;
    }

    public void setID_DEPOS(Number iD_DEPOS) {
        ID_DEPOS = iD_DEPOS;
    }

    public Number getNUM_QTD_REPOS() {
        return NUM_QTD_REPOS;
    }

    public void setNUM_QTD_REPOS(Number nUM_QTD_REPOS) {
        NUM_QTD_REPOS = nUM_QTD_REPOS;
    }

    public Number getNUM_QTD_ESTOQUE() {
        return NUM_QTD_ESTOQUE;
    }

    public void setNUM_QTD_ESTOQUE(Number nUM_QTD_ESTOQUE) {
        NUM_QTD_ESTOQUE = nUM_QTD_ESTOQUE;
    }

    
}
