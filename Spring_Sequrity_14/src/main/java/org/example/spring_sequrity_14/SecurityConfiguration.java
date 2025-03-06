package org.example.spring_sequrity_14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/*@Configuration
@EnableWebSecurity*/
public class SecurityConfiguration {
   /* @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(customizer-> customizer.disable());
        http.authorizeHttpRequests(customizer-> customizer.anyRequest().authenticated());
        return http.build();
    }*/
}
