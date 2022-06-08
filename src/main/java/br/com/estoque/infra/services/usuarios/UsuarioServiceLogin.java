package br.com.estoque.infra.services.usuarios;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.domain.usuarios.dtos.UsuarioTokenDTO;
import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.repositories.UsuarioRepository;
import io.agroal.api.AgroalDataSource;



public class UsuarioServiceLogin {

    public static UsuarioTokenDTO execute(AgroalDataSource dataSource, Usuario usuario, String secret) {
        try {
            UsuarioRepository usuarioRepository = new UsuarioRepository(dataSource);
            String usuarioHashed = usuarioRepository.loginUser(usuario.getUSUARIO());
            UsuarioTokenDTO acessToken = new UsuarioTokenDTO();

            if (CryptoHash.checkedHash(usuario.getSENHA(), usuarioHashed)) {
                
                acessToken.setACESS_TOKEN(CryptoHash.jwt(usuarioHashed, secret));
                acessToken.setMESSAGE("Authorized");
                return acessToken;
            } else {
                acessToken.setMESSAGE("Not Authorized");
                return acessToken;
            }

            
        }catch(Error e) {
            throw new Error("Preencha o campo para o login");
        }
    }

}
