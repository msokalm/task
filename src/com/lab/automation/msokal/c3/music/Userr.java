package com.lab.automation.msokal.c3.music;

import com.lab.automation.msokal.c3.music.Playlist;

import java.util.Objects;

public class Userr {



    private Subscription subscription;
    private String login;
    private String userID;
    private String password;
    private boolean hPay;
    private Playlist  recomendPL;



    public Userr(Subscription subscription, String login, String userID, String password,Playlist recomendPL) {
        this.subscription = subscription;
        this.login = login;
        this.userID = userID;
        this.password = password;
        this.hPay=true;
        this.recomendPL = recomendPL;
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
                "subscription=" + subscription +
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
                Objects.equals(subscription, userr.subscription) &&
                Objects.equals(login, userr.login) &&
                Objects.equals(userID, userr.userID) &&
                Objects.equals(password, userr.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscription, login, userID, password, hPay);
    }


}





