package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.bean"})
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config Constructor");
    }
    @Bean()
    @Scope("prototype")
    public MyConnection getMyConnection() {
        return new MyConnection();
    }

}
