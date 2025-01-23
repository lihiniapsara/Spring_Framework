package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
       //
        // context.close();

        /*SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook");
                context.close();
            }
        });

        TestBean3 testBean3 = context.getBean(TestBean3.class);
        System.out.println(testBean3);


        springBean.sayHello();
        context.close();*/

        /*Object bean = context.getBean("bean");
        System.out.println(bean);

        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
        System.out.println(testBean1);

        TestBean2 testBean2 = (TestBean2) context.getBean("testBean2");
        System.out.println(testBean2);*/

        /*MyConnection connection = (MyConnection) context.getBean("bean2");
        System.out.println(connection);

        context.registerShutdownHook();*/

        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);

        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection ref4 = context.getBean(MyConnection.class);
        System.out.println(ref4);

        MyConnection ref5 = context.getBean(MyConnection.class);
        System.out.println(ref5);
    }
}