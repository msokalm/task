package com.lab.automation.msokal.c3.music;

import com.lab.automation.msokal.c3.inteffaces.iPay;

import java.util.Objects;

public class Card implements iPay {
    long creditCardNumber;
    int exparationDate;
    int securityCodde;

    public Card(long creditCardNumber, int exparationDate, int securityCodde) {
        this.creditCardNumber = creditCardNumber;
        this.exparationDate = exparationDate;
        this.securityCodde = securityCodde;

    }



    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getExparationDate() {
        return exparationDate;
    }

    public void setExparationDate(int exparationDate) {
        this.exparationDate = exparationDate;
    }

    public int getSecurityCodde() {
        return securityCodde;
    }

    public void setSecurityCodde(int securityCodde) {
        this.securityCodde = securityCodde;
    }

    @Override
    public void iPay() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return creditCardNumber == card.creditCardNumber &&
                exparationDate == card.exparationDate &&
                securityCodde == card.securityCodde;
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditCardNumber, exparationDate, securityCodde);
    }
}
