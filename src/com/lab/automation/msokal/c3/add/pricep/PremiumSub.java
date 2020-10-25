package com.lab.automation.msokal.c3.add.pricep;

public class PremiumSub extends PricePlan {
    public PremiumSub(int costPerMonth, String Status) {
        super(costPerMonth, Status);
        costPerMonth = 25;
        Status = "Premium";
    }


}
