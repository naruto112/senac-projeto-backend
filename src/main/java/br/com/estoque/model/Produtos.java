package br.com.estoque.model;

import java.util.Currency;

public class Produtos {
    private Number ID;
    public Number getID() {
        return ID;
    }
    public void setID(Number iD) {
        ID = iD;
    }
    public String getNOM_PROD() {
        return NOM_PROD;
    }
    public void setNOM_PROD(String nOM_PROD) {
        NOM_PROD = nOM_PROD;
    }
    public Float getNUM_VLR_MEDIO_UN() {
        return NUM_VLR_MEDIO_UN;
    }
    public void setNUM_VLR_MEDIO_UN(Float nUM_VLR_MEDIO_UN) {
        NUM_VLR_MEDIO_UN = nUM_VLR_MEDIO_UN;
    }
    public Float getNUM_QTD_ESTOQUE() {
        return NUM_QTD_ESTOQUE;
    }
    public void setNUM_QTD_ESTOQUE(Float nUM_QTD_ESTOQUE) {
        NUM_QTD_ESTOQUE = nUM_QTD_ESTOQUE;
    }
    public Float getNUM_VLR_ESTOQUE() {
        return NUM_VLR_ESTOQUE;
    }
    public void setNUM_VLR_ESTOQUE(Float nUM_VLR_ESTOQUE) {
        NUM_VLR_ESTOQUE = nUM_VLR_ESTOQUE;
    }
    private String NOM_PROD;
    private Float NUM_VLR_MEDIO_UN;
    private Float NUM_QTD_ESTOQUE;
    private Float NUM_VLR_ESTOQUE;
}
