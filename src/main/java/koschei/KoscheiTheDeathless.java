package koschei;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;
    private Duck5 duck5;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString() + duck5.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    @Autowired
    public void setDuck5(Duck5 duck5) {
        this.duck5 = duck5;
    }
}


