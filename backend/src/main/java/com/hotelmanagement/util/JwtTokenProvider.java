package com.hotelmanagement.util;
import io.jsonwebtoken.*; import io.jsonwebtoken.security.Keys; import org.springframework.security.core.Authentication; import org.springframework.security.core.userdetails.UserDetails; import org.springframework.stereotype.Component; import javax.crypto.SecretKey; import java.util.Date;
@Component public class JwtTokenProvider {
 private final SecretKey secretKey=Keys.hmacShaKeyFor("hotelManagementSecretKeyForJWTTokenGenerationAndValidation12345".getBytes()); private final long jwtExpirationMs=86400000;
 public String generateToken(Authentication a){UserDetails u=(UserDetails)a.getPrincipal();Date now=new Date();return Jwts.builder().subject(u.getUsername()).issuedAt(now).expiration(new Date(now.getTime()+jwtExpirationMs)).signWith(secretKey,Jwts.SIG.HS256).compact();}
 public String getUsernameFromToken(String token){return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload().getSubject();}
 public Long getUserIdFromToken(String token){return 1L;}
 public boolean validateToken(String token){try{Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token);return true;}catch(JwtException|IllegalArgumentException e){return false;}}
}