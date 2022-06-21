package br.com.estoque.domain.posicao.dtos;

public class PosicaoDTO {
    private String PRODUTO;
    private Number SALDO;
    private String DEPOSITO;

    public PosicaoDTO(String PRODUTO, Number SALDO, String DEPOSITO) {
        this.PRODUTO = PRODUTO;
        this.SALDO = SALDO;
        this.DEPOSITO = DEPOSITO;
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
