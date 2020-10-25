package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.add.pricep.PricePlan;

import java.util.Date;

public abstract class App {

    private String typeOS;
    private double usTime;
    private PricePlan pricePlan = new PricePlan(0,"free", new Date());
    private Userr userr = new Userr("namelastname", "1223312",
            "*******",new  PricePlan(0,"free",new Date(0,3,0)));


    public App(String typeOS, double usTime) {
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

    public PricePlan getPricePlan() {
        return pricePlan;
    }

    public void setPricePlan(PricePlan pricePlan) {
        this.pricePlan = pricePlan;
    }

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }
}