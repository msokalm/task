package com.lab.automation.msokal.c3.add.pricep;

public class BasicSub extends PricePlan {
    private String status;
    private int costPerMonth;


    public BasicSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.status="basic";
        this.costPerMonth=10;
    }

}



