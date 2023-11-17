package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {


    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails leena = User.builder()
                .username("leena")
                .password("{noop}mouni123")
                .roles("EMPLOYEE")
                .build();
        UserDetails sai = User.builder()
                .username("sai")
                .password("{noop}mouni123")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails mounika = User.builder()
                .username("mounika")
                .password("{noop}mouni123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(leena, sai, mounika);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN"))

        .httpBasic(Customizer.withDefaults())

        .csrf(csrf -> csrf.disable());

        return http.build();

    }
}











