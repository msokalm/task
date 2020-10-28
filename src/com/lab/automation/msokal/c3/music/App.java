package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public  class App {

    private String typeOS;
    private double usTime;
    private Userr userr;
    private Subscription subscription;

    public App(String typeOS, double usTime, Userr userr, Subscription subscription) {
        this.typeOS = typeOS;
        this.usTime = usTime;
        this.userr = userr;
        this.subscription = subscription;
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

    public Userr getUserr() {
        return userr;
    }

    public void setUserr(Userr userr) {
        this.userr = userr;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "App{" +
                "typeOS='" + typeOS + '\'' +
                ", usTime=" + usTime +
                ", userr=" + userr +
                ", subscription=" + subscription +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Double.compare(app.usTime, usTime) == 0 &&
                Objects.equals(typeOS, app.typeOS) &&
                Objects.equals(userr, app.userr) &&
                Objects.equals(subscription, app.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOS, usTime, userr, subscription);
    }
}