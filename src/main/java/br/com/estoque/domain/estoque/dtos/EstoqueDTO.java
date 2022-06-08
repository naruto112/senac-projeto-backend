package br.com.estoque.domain.estoque.dtos;

//TABLE es_estoque 
public class EstoqueDTO {
    
    private Number ID;
    private Number ID_REPOS_PROD;
    private Number ID_NOTA;
    private Number ID_MOV;
    private Number NUM_QTD_PROD;
    private Number NUM_CUSTO_UN_PROD;

    public EstoqueDTO(Number ID, Number ID_REPOS_PROD, Number ID_NOTA, Number ID_MOV, Number NUM_QTD_PROD, Number NUM_CUSTO_UN_PROD) {
        this.ID = ID;
        this.ID_REPOS_PROD = ID_REPOS_PROD;
        this.ID_NOTA = ID_NOTA;
        this.ID_MOV = ID_MOV;
        this.NUM_QTD_PROD = NUM_QTD_PROD;
        this.NUM_CUSTO_UN_PROD = NUM_CUSTO_UN_PROD;

     }


    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public Number getID_REPOS_PROD() {
        return ID_REPOS_PROD;
    }

    public void setID_REPOS_PROD(Number iD_REPOS_PROD) {
        ID_REPOS_PROD = iD_REPOS_PROD;
    }

    public Number getID_NOTA() {
        return ID_NOTA;
    }

    public void setID_NOTA(Number iD_NOTA) {
        ID_NOTA = iD_NOTA;
    }

    public Number getID_MOV() {
        return ID_MOV;
    }

    public void setID_MOV(Number iD_MOV) {
        ID_MOV = iD_MOV;
    }

    public Number getNUM_QTD_PROD() {
        return NUM_QTD_PROD;
    }

    public void setNUM_QTD_PROD(Number nUM_QTD_PROD) {
        NUM_QTD_PROD = nUM_QTD_PROD;
    }

    public Number getNUM_CUSTO_UN_PROD() {
        return NUM_CUSTO_UN_PROD;
    }

    public void setNUM_CUSTO_UN_PROD(Number nUM_CUSTO_UN_PROD) {
        NUM_CUSTO_UN_PROD = nUM_CUSTO_UN_PROD;
    }


    
}
