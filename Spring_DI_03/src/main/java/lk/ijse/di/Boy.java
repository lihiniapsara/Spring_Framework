package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boy implements di{
   // @Autowired -> property injection
    Agreement girl;
    /*@Autowired
    //constructor injection

    public Boy(Agreement girl) {
        this.girl = girl;
    }*/

    /*@Autowired
    //setter method injection
    public void setter(Agreement girl) {
        this.girl = girl;
    }*/


    public void chattingwithGirl() {
        girl.chat();
    }

    @Autowired
    //interface throw injection
    @Override
    public void inject(Agreement agreement) {
        this.girl = agreement;
    }
}
