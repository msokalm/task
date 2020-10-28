package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class Userr {

    protected PricePlan pricePlan;
    private String login;
    private String userID;
    private String password;
    private boolean hPay;


    public Userr(String login, String userID, String password, PricePlan pricePlan) {
        this.login = login;
        this.userID = userID;
        this.password = password;
        this.hPay = hPay;
        this.pricePlan = pricePlan;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean ishPay() {
        return hPay;
    }

    public void sethPay(boolean hPay) {
        this.hPay = hPay;
    }

    @Override
    public String toString() {
        return "Userr{" +
                "pricePlan=" + pricePlan +
                ", login='" + login + '\'' +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", hPay=" + hPay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userr userr = (Userr) o;
        return hPay == userr.hPay &&
                Objects.equals(pricePlan, userr.pricePlan) &&
                Objects.equals(login, userr.login) &&
                Objects.equals(userID, userr.userID) &&
                Objects.equals(password, userr.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePlan, login, userID, password, hPay);
    }
}





