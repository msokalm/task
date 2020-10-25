package com.lab.automation.msokal.c3.add;

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
}


