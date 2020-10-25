package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.add.pricep.PricePlan;

public class App extends Userr {
    private String typeOS;
    private double usTime;

    public App(String login, PricePlan pricePlan, String userID, String password, String typeOS, double usTime) {
        super(login, pricePlan, userID, password);
        this.typeOS = typeOS;
        this.usTime = usTime;
    }
    public String getTypeOS() {
        return typeOS;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

    public double getUsTime() {
        return usTime;
    }

    public void setUsTime(double usTime) {
        this.usTime = usTime;
    }
}