package com.lab.automation.msokal.c3.add.pricep;

public class PremiumSub extends PricePlan {
    private int costPerMonth;
    private String status;

    public PremiumSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.costPerMonth = 25;
        this.status = "prermium";
    }


}




