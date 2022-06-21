package br.com.estoque.domain.posicao;

import br.com.estoque.domain.posicao.dtos.PosicaoDTO;

public class Posicao {
    private String PRODUTO;
    private Number SALDO;
    private String DEPOSITO;

    public Posicao(String PRODUTO, Number SALDO, String DEPOSITO) {
        this.PRODUTO = PRODUTO;
        this.SALDO = SALDO;
        this.DEPOSITO = DEPOSITO;
    }

    public Posicao() {
    }

    public Posicao(PosicaoDTO posicaoDTO) {
        this.PRODUTO = posicaoDTO.getPRODUTO();
        this.SALDO = posicaoDTO.getSALDO();
        this.DEPOSITO = posicaoDTO.getDEPOSITO();
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
