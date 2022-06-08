package br.com.estoque.domain.usuarios.dtos;

import java.time.LocalDateTime;

public class UsuarioTokenDTO {
    private String ACESS_TOKEN;
    private String MESSAGE;

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String mESSAGE) {
        MESSAGE = mESSAGE;
    }

    public String getACESS_TOKEN() {
        return ACESS_TOKEN;
    }

    public void setACESS_TOKEN(String aCESS_TOKEN) {
        ACESS_TOKEN = aCESS_TOKEN;
    }
    
}
