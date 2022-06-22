package br.com.estoque.domain.posicao.dtos;

public class PosicaoDTO {
    private Number ID;
    private String PRODUTO;
    private Number SALDO;
    private String DEPOSITO;

    public PosicaoDTO(Number ID, String PRODUTO, Number SALDO, String DEPOSITO) {
        this.ID = ID;
        this.PRODUTO = PRODUTO;
        this.SALDO = SALDO;
        this.DEPOSITO = DEPOSITO;
    }

    public Number getID() {
        return ID;
    }

    public void setID(Number iD) {
        ID = iD;
    }

    public String getPRODUTO() {
        return PRODUTO;
    }

    public void setPRODUTO(String pRODUTO) {
        PRODUTO = pRODUTO;
    }

    public Number getSALDO() {
        return SALDO;
    }

    public void setSALDO(Number sALDO) {
        SALDO = sALDO;
    }

    public String getDEPOSITO() {
        return DEPOSITO;
    }

    public void setDEPOSITO(String dEPOSITO) {
        DEPOSITO = dEPOSITO;
    }
}
