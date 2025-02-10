package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("${os.name}")
    private String osName;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    public SpringBean() {
        System.out.println("Spring Bean Constructor");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Os Name: " + osName);
        System.out.println("User: " + user);
        System.out.println("Password: " + password);

    }
}
