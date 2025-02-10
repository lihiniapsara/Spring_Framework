package org.example.config;

import org.example.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig1 {


    @Bean
    public SpringBean1 getspringBeanThree() {

        return new SpringBean1();
    }
}
