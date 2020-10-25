package com.lab.automation.msokal.c3.add.pricep;

import java.time.Period;
import java.util.Date;

public class PremiumSub extends PricePlan {
    int costPerMonth=25;
    String status="Premiun";
    public PremiumSub(int costPerMonth, String status, Date date) {
        super(costPerMonth, status, date);
    }



}
