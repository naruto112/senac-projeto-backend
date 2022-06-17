package br.com.estoque.domain.estoque.body;

public class MovementBody {

    
    private Number idProduto;
    private Number idDeposito;
    private Number idFornecedor;

    private boolean hasNota;
    private boolean hasEntrada;
    
    private int quantity;
    private int quantityReposition;
    
    private Double price;

    public MovementBody(){};

    public MovementBody(Number iD_prod, Number iD_depos, Number iD_fornec, boolean hasNota, boolean isEnter, int quantity, int quantityReposition, Double price){
        this.idProduto=iD_prod;
        this.idDeposito = iD_depos;
        this.idFornecedor = iD_fornec;
        this.hasNota = hasNota;
        this.hasEntrada = isEnter;
        this.quantity = quantity;
        this.quantityReposition = quantityReposition;
        this.price = price;
    }



    public Number getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Number idProduto) {
        this.idProduto = idProduto;
    }

    public Number getIdDeposito() {
        return idDeposito;
    }

    public void setIdDeposito(Number idDeposito) {
        this.idDeposito = idDeposito;
    }

    public Number getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Number idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public boolean isHasNota() {
        return hasNota;
    }

    public void setHasNota(boolean hasNota) {
        this.hasNota = hasNota;
    }

    public boolean isHasEntrada() {
        return hasEntrada;
    }

    public void setHasEntrada(boolean isEntrada) {
        this.hasEntrada = isEntrada;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityReposition() {
        return quantityReposition;
    }

    public void setQuantityReposition(int quantityReposition) {
        this.quantityReposition = quantityReposition;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    
    public int getId_Mov() {
        return (this.isHasEntrada() && isHasNota()) ? 1 : (this.isHasEntrada() && !isHasNota()) ? 2 : (!this.isHasEntrada() && isHasNota()) ? 3 : 4;
    }

    public int getEnterCode() {
        return (isHasEntrada() ? 0 : 1);
    }

    public static int getNumNota(){
        return  (int) ((Math.random() * (999999 - 555555)) + 555555);
    }

}
