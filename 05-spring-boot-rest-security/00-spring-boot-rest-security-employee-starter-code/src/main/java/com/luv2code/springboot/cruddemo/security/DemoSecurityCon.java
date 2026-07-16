package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityCon {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails thoraya = User.builder()
                .username("thoraya")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails yahia = User.builder()
                .username("yahia")
                .password("{noop}yahia123")
                .roles("EMPLOYEE", "MANAGER")
                .build();
        UserDetails noor = User.builder()
                .username("noor")
                .password("{noop}noor123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();



        return new InMemoryUserDetailsManager(thoraya, yahia, noor);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configuer->
                configuer
                        .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE, "/api/employees").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/api/employees/**").hasRole("MANAGER")

        );

      http.httpBasic(Customizer.withDefaults());
      http.csrf(csrf-> csrf.disable());
      return http.build();
    }
}
