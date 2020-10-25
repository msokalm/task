package com.lab.automation.msokal.c3.add.pricep;

public class BasicSub extends PricePlan {
    public BasicSub(int costPerMonth, String Status) {
        super(costPerMonth, Status);
        costPerMonth=10;
        Status = "Basic";
    }
}
