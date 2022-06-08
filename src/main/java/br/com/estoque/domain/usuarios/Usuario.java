package br.com.estoque.domain.usuarios;

public class Usuario {
    private String USUARIO;
    private String SENHA; 

    public Usuario() {
    }

    public Usuario(String USUARIO, String SENHA) {
        this.USUARIO = USUARIO;
        this.SENHA = SENHA;
    }
    
    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String uSUARIO) {
        USUARIO = uSUARIO;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String sENHA) {
        SENHA = sENHA;
    }
}
