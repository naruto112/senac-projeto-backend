package br.com.estoque.infra.config;

import org.apache.sshd.common.config.keys.loader.openssh.kdf.BCrypt;
import org.eclipse.microprofile.config.inject.ConfigProperties;

import io.quarkus.elytron.security.common.BcryptUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;

import io.jsonwebtoken.SignatureAlgorithm;
import javax.crypto.spec.SecretKeySpec;

import java.security.Key;
import java.util.Base64;



public class CryptoHash {

    public static String createHash(String context) {
        return BcryptUtil.bcryptHash(context);
    }

    public static Boolean checkedHash(String plainHash, String hashedPlain) {
        return BCrypt.checkpw(plainHash, hashedPlain);
    }

    
    public static String jwt(String context, String secret) {

        Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret), 
                                    SignatureAlgorithm.HS256.getJcaName());

        Instant now = Instant.now();
        String jwtToken = Jwts.builder()
                .claim("system", "quarkus-senac-projeto")
                .claim("email", "system@quarkus.com.br")
                .claim("password", context)
                .setSubject(context)
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(5l, ChronoUnit.HOURS)))
                .signWith(hmacKey)
                .compact();

        return jwtToken;
    }

    public static Boolean validateJWT(String jwtString, String secret) {

        boolean validator = false;
        Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret), 
                                        SignatureAlgorithm.HS256.getJcaName());

        Jws<Claims> jwt = Jwts.parserBuilder()
                .setSigningKey(hmacKey)
                .build()
                .parseClaimsJws(jwtString);

        if (jwt.getSignature() != null) {
            validator=true;
        }

        return validator;
    }

}
