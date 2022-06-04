package br.com.estoque.domain.usuarios.services;

import java.util.List;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.domain.usuarios.interfaces.IUsuarioService;
import br.com.estoque.infra.repositories.UsuarioRepository;

public class UsuarioService implements IUsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return this.usuarioRepository.getAllUsuarios();
    }

    @Override
    public void createUsuario(Usuario usuario) {
        this.usuarioRepository.createUsuario(usuario);
        
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        this.usuarioRepository.updateUsuario(usuario);
        
    }

    @Override
    public String loginUser(String nome) {
        return this.usuarioRepository.loginUser(nome);

    }

    @Override
    public void forgotUser(Usuario usuario) {
        this.usuarioRepository.forgotUser(usuario);
        
    }
}
