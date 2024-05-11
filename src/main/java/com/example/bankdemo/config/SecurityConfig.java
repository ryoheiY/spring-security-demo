package com.example.bankdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth -> auth
                        .requestMatchers("/myAccount", "/myBalance", "/myLoan", "/myCards").authenticated()
                        .anyRequest().authenticated()
                ).formLogin().and().
                httpBasic();


//        http.authorizeHttpRequests()
//                .requestMatchers("/myAccount","/myBalance","/myLoan", "/myCards").authenticated()
//                .requestMatchers("/contact","/notices").permitAll()
//                .and().formLogin()
//                .and().httpBasic();

        return http.build();
    }

}
