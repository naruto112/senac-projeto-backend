package br.com.estoque.infra.services.usuarios;

import java.util.List;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.infra.repositories.UsuarioRepository;
import io.agroal.api.AgroalDataSource;

public class UsuarioServiceAll {
    
    public static List<Usuario> execute(AgroalDataSource dataSource) {
        UsuarioRepository usuarioRepository = new UsuarioRepository(dataSource);
        return usuarioRepository.getAllUsuarios();
    }
}
