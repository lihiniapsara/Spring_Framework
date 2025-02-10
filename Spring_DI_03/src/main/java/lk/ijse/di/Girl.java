package lk.ijse.di;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Agreement {
    @Override
    public void chat() {
        System.out.println("fgt");
    }
}
