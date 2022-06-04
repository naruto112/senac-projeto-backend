package br.com.estoque.infra.services.usuarios;

import java.time.LocalDateTime;
import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.domain.usuarios.dtos.UsuarioTokenDTO;
import br.com.estoque.infra.config.CryptoHash;
import br.com.estoque.infra.repositories.UsuarioRepository;
import io.agroal.api.AgroalDataSource;



public class UsuarioServiceLogin {

    public static UsuarioTokenDTO execute(AgroalDataSource dataSource, Usuario usuario) {
        try {
            UsuarioRepository usuarioRepository = new UsuarioRepository(dataSource);
            String usuarioHashed = usuarioRepository.loginUser(usuario.getUSUARIO());
            UsuarioTokenDTO tokenDTO = new UsuarioTokenDTO();
            LocalDateTime now = LocalDateTime.now();  

            if (CryptoHash.checkedHash(usuario.getSENHA(), usuarioHashed)) {

                tokenDTO.setDATETIME(now);    
                tokenDTO.setMESSAGE("Authorized");
                tokenDTO.setTOKEN(CryptoHash.createHash("Bearer"));

                return tokenDTO;
            } else {
                tokenDTO.setTOKEN("false");
                tokenDTO.setDATETIME(now);
                tokenDTO.setMESSAGE("Not Authorized");
                return tokenDTO;
            }

            
        }catch(Error e) {
            throw new Error("Preencha o campo para o login");
        }
    }

}
