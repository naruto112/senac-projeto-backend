package br.com.estoque.domain.estoque.body;

public class MovementBody {

    private Number iD_produto;
    private Number iD_Deposito;
    private Number iD_Fornecedor;
    private boolean hasNota;
    private boolean isEntrada;
    private int qtd;
    private Double price;


    public MovementBody(){};

    public MovementBody(Number iD_prod, Number iD_depos, Number iD_fornec, boolean hasNota, boolean isEnter, int quantity, Double value){
        this.iD_produto=iD_prod;
        this.iD_Deposito = iD_depos;
        this.iD_Fornecedor = iD_fornec;
        this.hasNota = hasNota;
        this.isEntrada = isEnter;
        this.qtd = quantity;
        this.price = value;

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
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

}
