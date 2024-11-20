package com.security.inmemory.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{

    // CREATING IN MEMORY USER FOR AUTHENTICATION

    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.withUsername("ved").
                           password(encoder.encode("ved")).
                           roles("USER").build();

        return new InMemoryUserDetailsManager(user);
    }

    // FOR SECURITY CHECKS

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests().
                requestMatchers("/user").authenticated()
                .requestMatchers("/home").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();
    }
}
