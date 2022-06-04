package br.com.estoque.domain.usuarios.interfaces;

import java.util.List;

import br.com.estoque.domain.usuarios.Usuario;

public interface IUsuarioService {
    List<Usuario> getAllUsuarios();

    void createUsuario(Usuario usuario);

    void updateUsuario(Usuario usuario);

    String loginUser(String nome);

    void forgotUser(Usuario usuario);

}
