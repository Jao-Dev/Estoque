package com.example.estoque.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authorize -> {
                authorize.requestMatchers("/estoque").permitAll();
                authorize.requestMatchers("/logout").permitAll();
                authorize.anyRequest().authenticated();
            })
            .formLogin(Customizer.withDefaults())
            .build();
    }
}
