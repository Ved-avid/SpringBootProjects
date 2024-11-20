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
        UserDetails user1 = User.withUsername("ved").
                           password(encoder.encode("ved")).
                           roles("USER").build();

        UserDetails user2 = User.withUsername("admin").
                            password(encoder.encode("ved")).
                            roles("ADMIN").build();
        UserDetails[] users = {user1,user2};

        return new InMemoryUserDetailsManager(users);
    }

    // FOR SECURITY CHECKS

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests().
                requestMatchers("/user").hasAnyRole("ADMIN","USER")
                .requestMatchers("/admin").hasRole("ADMIN")
                .requestMatchers("/home").permitAll()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        return http.build();
    }
}
