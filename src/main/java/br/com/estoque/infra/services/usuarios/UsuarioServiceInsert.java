package br.com.estoque.infra.services.usuarios;
import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.repositories.UsuarioRepository;
import io.agroal.api.AgroalDataSource;

public class UsuarioServiceInsert {
    
    public static void execute(AgroalDataSource dataSource, Usuario usuario) {
        UsuarioRepository usuarioRepository = new UsuarioRepository(dataSource);
        usuario.setSENHA(CryptoHash.createHash(usuario.getSENHA()));
        usuarioRepository.createUsuario(usuario);
    }
}
