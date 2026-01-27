package com.webstack.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //basic authentication
        //http.httpBasic(withDefaults());

        //if we want to authorize every request
        http.authorizeHttpRequests(auth ->
                auth.anyRequest().authenticated())
                .httpBasic(withDefaults());

        return http.build();
    }

}
