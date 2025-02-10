package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {

    @Value("lihini")
    private String name;

    public SpringBean() {
        //name eka print wenne na null wadinne
        System.out.println("Spring Bean Constructor"+ " " + name);
    }

    public void afterPropertiesSet() throws Exception {
        //name eka print wenoo
        System.out.println("Spring Bean Constructor"+ " " + name);
    }
    /*public SpringBean() {
    }*/


    //same parameters thibboth kamathi eka run karanne nathnm wadipura parameters thiyena eka run wenne

/*    @Autowired(required = false)

    public SpringBean(@Value("lihini") String name ,@Value("21") int age) {
        System.out.println("Spring Bean Constructor"+ " " + name + "  "+ age);
    }
@Autowired(required = false)
    public SpringBean(@Value("lihini") String name ,@Value("21") int age ,@Value("true") boolean flag) {
        System.out.println("Spring Bean Constructor"+ " " + name + "  "+ age + "  "+ flag);
    }*/
}
