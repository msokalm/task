package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.add.pricep.DataRange;
import com.lab.automation.msokal.c3.add.pricep.PricePlan;

import java.util.Date;
import java.util.Objects;

public abstract class App {

    private String typeOS;
    private double usTime;
    private PricePlan pricePlan;


    public App(String typeOS, double usTime,PricePlan pricePlan) {
        this.typeOS = typeOS;
        this.usTime = usTime;
        this.pricePlan=pricePlan;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Double.compare(app.usTime, usTime) == 0 &&
                Objects.equals(typeOS, app.typeOS) &&
                Objects.equals(pricePlan, app.pricePlan);
    }

    @Override
    public String toString() {
        return "App{" +
                "typeOS='" + typeOS + '\'' +
                ", usTime=" + usTime +
                ", pricePlan=" + pricePlan +
                '}';
    }
}