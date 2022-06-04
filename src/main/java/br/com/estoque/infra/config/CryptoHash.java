package br.com.estoque.infra.config;

import org.apache.sshd.common.config.keys.loader.openssh.kdf.BCrypt;
import io.quarkus.elytron.security.common.BcryptUtil;

public class CryptoHash {
    
    public static String createHash(String context) {
        return BcryptUtil.bcryptHash(context);
    }

    public static Boolean checkedHash(String plainHash, String hashedPlain) {
        return BCrypt.checkpw(plainHash, hashedPlain);
    }

}
