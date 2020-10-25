package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.inteffaces.iPay;

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

}
