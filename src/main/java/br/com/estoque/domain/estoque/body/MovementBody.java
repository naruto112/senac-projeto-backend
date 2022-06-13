package br.com.estoque.domain.estoque.body;

public class MovementBody {

    private Number iD_produto;
    private Number iD_Deposito;
    private Number iD_Fornecedor;

    private boolean hasNota;
    private boolean isEntrada;
    
    private int nUM_QTD;
    private int nUM_QTD_REPOS;
    
    private Double nUM_PROD_VALOR_NOTA;

    public MovementBody(){};

    public MovementBody(Number iD_prod, Number iD_depos, Number iD_fornec, boolean hasNota, boolean isEnter, int quantity, int quantityReposition, Double price){
        this.iD_produto=iD_prod;
        this.iD_Deposito = iD_depos;
        this.iD_Fornecedor = iD_fornec;
        this.hasNota = hasNota;
        this.isEntrada = isEnter;
        this.nUM_QTD = quantity;
        this.nUM_QTD_REPOS = quantityReposition;
        this.nUM_PROD_VALOR_NOTA = price;
    }

    public Number getiD_produto() {
        return iD_produto;
    }
    public void setiD_produto(Number iD_produto) {
        this.iD_produto = iD_produto;
    }
    public Number getiD_Deposito() {
        return iD_Deposito;
    }
    public void setiD_Deposito(Number iD_Deposito) {
        this.iD_Deposito = iD_Deposito;
    }
    public Number getiD_Fornecedor() {
        return iD_Fornecedor;
    }
    public void setiD_Fornecedor(Number iD_Fornecedor) {
        this.iD_Fornecedor = iD_Fornecedor;
    }
    public boolean isHasNota() {
        return hasNota;
    }
    public void setHasNota(boolean hasNota) {
        this.hasNota = hasNota;
    }
    public boolean isEnter() {
        return isEntrada;
    }
    public void setEnter(boolean isEnter) {
        this.isEntrada = isEnter;
    }
    public int getNumQtd() {
        return nUM_QTD;
    }
    public void setNumQtd(int qtd) {
        this.nUM_QTD = qtd;
    }
    public Double getPrice() {
        return nUM_PROD_VALOR_NOTA;
    }
    public void setPrice(Double price) {
        this.nUM_PROD_VALOR_NOTA = price;
    }

    //todo validar com o djalma
    public int getId_Mov() {
        return (this.isEnter() && hasNota) ? 1 : (!this.isEnter() && hasNota) ? 2 : (this.isEnter() && !hasNota) ? 3 : 4;
    }

    public int getQtdRepos() {
        return nUM_QTD_REPOS;
    }

    public void setQtdRepos(int qtdRepos) {
        this.nUM_QTD_REPOS = qtdRepos;
    }

    //todo validar com o djalma
    public int getEnterCode() {
        return (isEnter() ? 0 :1);
    }

    public static int getNumNota(){
        return  (int) ((Math.random() * (999999 - 555555)) + 555555);
    }

}
