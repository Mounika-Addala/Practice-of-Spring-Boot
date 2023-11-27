package com.springmvc.demosecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails mouni= User.builder()
                .username("mouni")
                .password("{noop}mouni123")
                .roles("EMPLOYEE")
                .build();
        UserDetails leena= User.builder()
                .username("leena")
                .password("{noop}mouni123")
                .roles("EMPLOYEE","MANAGER")
                .build();
        UserDetails sai=User.builder()
                .username("sai")
                .password("{noop}mouni123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();
        return  new InMemoryUserDetailsManager(mouni,leena,sai);
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer.anyRequest().authenticated())
                .formLogin(form ->
                        form.loginPage("/showMyLoginPage")
                                .loginProcessingUrl("/authenticateTheUser")
                                .permitAll())
        .logout(logout -> logout.permitAll());
return http.build();
    }
}
