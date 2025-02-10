package lk.ijse;

import lk.ijse.bean.TestBean1;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);
        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);*/

        context.registerShutdownHook();

    }
}