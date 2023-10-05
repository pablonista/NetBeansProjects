package ar.com.nst.web;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/editar/**", "/agregar/**", "/eliminar/**").hasRole("ADMIN")
                .requestMatchers("/").hasAnyRole("USER", "ADMIN")
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin(formLogin -> formLogin
                .loginPage("/login")
                //.usernameParameter("user")
                .defaultSuccessUrl("/", true)
                .permitAll()
                )
                .rememberMe(rememberMe -> rememberMe.key("AbcdEfghIjkl..."))
                .logout(logout -> logout.logoutUrl("/logout").permitAll())
                .exceptionHandling((exceptionHandling)
                        -> exceptionHandling
                        .accessDeniedPage("/errores/403")
                );

        return http.build();
    }    
}