/*
package com.javalearn.gatewayservice.security;

import io.jsonwebtoken.Jwts;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class AuthorizationFilter extends BasicAuthenticationFilter {

    Environment environment;

    public AuthorizationFilter(AuthenticationManager authenticationManager, Environment environment) {
        super(authenticationManager);
        this.environment = environment;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String authorizationToken = request.getHeader("Authorization");
        if(authorizationToken ==null){
            chain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken authenticationToken = getAuthenticationToken(authorizationToken);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }

    private UsernamePasswordAuthenticationToken getAuthenticationToken(String authorizationToken) {
        String token = authorizationToken.replace("Bearer", "");
        String username = Jwts.parser()
                .setSigningKey("sadfhasdfalsdkfa;hsgdajldaslfkda")
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        if (username ==null) {
            return null;
        }
        return new UsernamePasswordAuthenticationToken(username, null, new ArrayList<>());
    }
}
*/
