package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component("bean")
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Constructor");
    }
    public void sayHello(){
        System.out.println("Hello");}//sayHello
}
