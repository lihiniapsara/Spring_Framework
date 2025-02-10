package org.example.config;

import org.example.bean.SpringBeanThree;
import org.example.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.bean")
public class AppConfig {
    @Bean
    public SpringBeanTwo getspringBeanTwo() {
        //been method ekk athule thawath method ekakk invoke(call) karana eka => interview dependancy injection
        SpringBeanThree springBeanThree1 = getspringBeanThree();
        SpringBeanThree springBeanThree2 = getspringBeanThree();

        System.out.println(springBeanThree1);
        System.out.println(springBeanThree2);
        System.out.println();

        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree getspringBeanThree() {

        return new SpringBeanThree();
    }
}
