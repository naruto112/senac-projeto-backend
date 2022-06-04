package br.com.estoque.domain.usuarios.dtos;

import java.time.LocalDateTime;

public class UsuarioTokenDTO {
    private String TOKEN;
    private LocalDateTime DATETIME;
    private String MESSAGE;

    public String getMESSAGE() {
        return MESSAGE;
    }
    public void setMESSAGE(String mESSAGE) {
        MESSAGE = mESSAGE;
    }
    public String getTOKEN() {
        return TOKEN;
    }
    public void setTOKEN(String tOKEN) {
        TOKEN = tOKEN;
    }
    public LocalDateTime getDATETIME() {
        return DATETIME;
    }
    public void setDATETIME(LocalDateTime dATETIME) {
        DATETIME = dATETIME;
    }
    
}
