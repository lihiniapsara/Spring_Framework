package org.example.config;

import org.example.bean.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class AppConfig {
    @Configuration
    @Import(AppConfig1.class)
    public SpringBean1 getspringBeanOne() {
    }


}
