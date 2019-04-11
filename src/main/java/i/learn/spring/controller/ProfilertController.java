package i.learn.spring.controller;

import i.learn.spring.interfaces.ProfilertControllerMBean;

public class ProfilertController implements ProfilertControllerMBean {

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
