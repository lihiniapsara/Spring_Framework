package lk.ijse.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl2 implements Aggrement{

    public Girl2() {
        System.out.println("Girl Constructor");
    }
    @Override
    public void chat() {
        System.out.println("Girl2 Chatting...");
    }

}
