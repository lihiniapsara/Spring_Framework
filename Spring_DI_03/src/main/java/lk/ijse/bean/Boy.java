package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    //mona primary ekada ganne kiyala denne me anotation eken
    @Qualifier("girl1")
    @Autowired
    Aggrement girl;
    public Boy() {
        System.out.println("Boy Constructor");
    }

    //tight coupling
    public void chattingwithGirl() {
        girl.chat();
    }
}
