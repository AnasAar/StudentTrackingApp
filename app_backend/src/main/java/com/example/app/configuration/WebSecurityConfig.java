package com.example.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class WebSecurityConfig {

    private static final String[] WHITE_URL= {
            "/login"
    };


  //  @Bean
    /*SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .antMatchers(WHITE_URL).permitAll();
        return http.build();
    }

     */
}
