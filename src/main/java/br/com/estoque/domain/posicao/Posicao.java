package br.com.estoque.domain.posicao;

import br.com.estoque.domain.posicao.dtos.PosicaoDTO;

public class Posicao {
    private Number ID;
    private String PRODUTO;
    private Number SALDO;
    private String DEPOSITO;

    public Posicao(Number ID, String PRODUTO, Number SALDO, String DEPOSITO) {
        this.ID = ID;
        this.PRODUTO = PRODUTO;
        this.SALDO = SALDO;
        this.DEPOSITO = DEPOSITO;
    }

    public Posicao() {
    }

    public Posicao(PosicaoDTO posicaoDTO) {
        this.ID = posicaoDTO.getID();
        this.PRODUTO = posicaoDTO.getPRODUTO();
        this.SALDO = posicaoDTO.getSALDO();
        this.DEPOSITO = posicaoDTO.getDEPOSITO();
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
