package org.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne {
    @Bean

    public SpringBeanTwo getspringBeanTwo() {
            SpringBeanThree springBeanThree1 = getspringBeanThree();
            SpringBeanThree springBeanThree2 = getspringBeanThree();

            System.out.println(springBeanThree1);
            System.out.println(springBeanThree2);
            return new SpringBeanTwo();

    }

    @Bean
    public SpringBeanThree getspringBeanThree() {
        return new SpringBeanThree();
    }
}
