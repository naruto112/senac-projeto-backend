package br.com.estoque.domain.extrato;

import java.sql.Date;

import br.com.estoque.domain.extrato.dtos.ExtratoDTO;

public class Extrato {
    private Date DATA;
    private String NOTA_FISCAL;
    private String ENTRADA_SAIDA;
    private Number VALOR;
    private String PRODUTO;
    private Number QUANTIDADE;
    private String FORNECEDOR;
    private String DEPOSITO;

    public Extrato() {
    }

    public Extrato(Date DATA, String NOTA_FISCAL, String ENTRADA_SAIDA, Number VALOR, String PRODUTO,
            Number QUANTIDADE, String FORNECEDOR, String DEPOSITO) {
        this.DATA = DATA;
        this.NOTA_FISCAL = NOTA_FISCAL;
        this.ENTRADA_SAIDA = ENTRADA_SAIDA;
        this.VALOR = VALOR;
        this.PRODUTO = PRODUTO;
        this.QUANTIDADE = QUANTIDADE;
        this.FORNECEDOR = FORNECEDOR;
        this.DEPOSITO = DEPOSITO;
    }

    public Extrato(ExtratoDTO extratoDTO) {
        this.DATA = extratoDTO.getDATA();
        this.NOTA_FISCAL = extratoDTO.getNOTA_FISCAL();
        this.ENTRADA_SAIDA = extratoDTO.getENTRADA_SAIDA();
        this.VALOR = extratoDTO.getVALOR();
        this.PRODUTO = extratoDTO.getPRODUTO();
        this.QUANTIDADE = extratoDTO.getQUANTIDADE();
        this.FORNECEDOR = extratoDTO.getFORNECEDOR();
        this.DEPOSITO = extratoDTO.getDEPOSITO();
    }

    public Date getDATA() {
        return DATA;
    }

    public void setDATA(Date dATA) {
        DATA = dATA;
    }

    public String getNOTA_FISCAL() {
        return NOTA_FISCAL;
    }

    public void setNOTA_FISCAL(String nOTA_FISCAL) {
        NOTA_FISCAL = nOTA_FISCAL;
    }

    public String getENTRADA_SAIDA() {
        return ENTRADA_SAIDA;
    }

    public void setENTRADA_SAIDA(String eNTRADA_SAIDA) {
        ENTRADA_SAIDA = eNTRADA_SAIDA;
    }

    public Number getVALOR() {
        return VALOR;
    }

    public void setVALOR(Number vALOR) {
        VALOR = vALOR;
    }

    public String getPRODUTO() {
        return PRODUTO;
    }

    public void setPRODUTO(String pRODUTO) {
        PRODUTO = pRODUTO;
    }

    public Number getQUANTIDADE() {
        return QUANTIDADE;
    }

    public void setQUANTIDADE(Number qUANTIDADE) {
        QUANTIDADE = qUANTIDADE;
    }

    public String getFORNECEDOR() {
        return FORNECEDOR;
    }

    public void setFORNECEDOR(String fORNECEDOR) {
        FORNECEDOR = fORNECEDOR;
    }

    public String getDEPOSITO() {
        return DEPOSITO;
    }

    public void setDEPOSITO(String dEPOSITO) {
        DEPOSITO = dEPOSITO;
    }

}
