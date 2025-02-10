package org.example;

import org.example.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//system envarament variables
       // Map<String,String> env = System.getenv();
       /* for (String key : env.keySet()){
            System.out.println(key+"=" + env.get(key));
        }*/

       // System.out.println(env.get("PROCESSER_LEVEL"));



        context.registerShutdownHook();
    }
}