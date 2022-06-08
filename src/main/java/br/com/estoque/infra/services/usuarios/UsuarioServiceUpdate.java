package br.com.estoque.infra.services.usuarios;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.infra.repositories.UsuarioRepository;
import io.agroal.api.AgroalDataSource;

public class UsuarioServiceUpdate {
    
    public static void execute(AgroalDataSource dataSource, Usuario usuario) {
        UsuarioRepository usuarioRepository = new UsuarioRepository(dataSource);
        usuarioRepository.updateUsuario(usuario);
    }
}
