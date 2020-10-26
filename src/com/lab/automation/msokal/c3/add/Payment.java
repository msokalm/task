package com.lab.automation.msokal.c3.add;

import java.util.Objects;

public class Payment {

        private Card card;
        private Web web;

    public Payment( Card card, Web web) {

        this.card = card;
        this.web = web;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "card=" + card +
                ", web=" + web +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(card, payment.card) &&
                Objects.equals(web, payment.web);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, web);
    }
}


