package com.lab.automation.msokal.c3.add.pricep;

public class FreeSub extends PricePlan {
    public FreeSub(int costPerMonth, String Status) {
        super(costPerMonth, Status);
        costPerMonth=0;
        Status="Free";
    }
}
