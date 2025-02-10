package lk.ijse;

import lk.ijse.config.AppConfig;
import lk.ijse.di.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

       /* Boy boy = context.getBean(Boy.class);
        boy.chattingwithGirl();*/
        Boy boy = context.getBean(Boy.class);
        boy.chattingwithGirl();
    }
}