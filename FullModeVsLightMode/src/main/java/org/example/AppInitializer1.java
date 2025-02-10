package org.example;

import org.example.bean.SpringBeanTwo;
import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*SpringBeanTwo ref1 = context.getBean(SpringBeanTwo.class);
        SpringBeanTwo ref2 = context.getBean(SpringBeanTwo.class);

        System.out.println(ref1);
        System.out.println(ref2);*/

        context.registerShutdownHook();

    }
}