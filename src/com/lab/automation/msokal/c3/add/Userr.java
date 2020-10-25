package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.add.pricep.PricePlan;



public  class Userr  {

    private String login;
    private String userID;
    private String password;
    private boolean hPay;
    protected PricePlan pricePlan;


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
                "login='" + login + '\'' +
                ", userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", hPay=" + hPay +
                ", pricePlan=" + pricePlan +
                '}';
    }
}

