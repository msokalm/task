package com.lab.automation.msokal.c3.add.pricep;

import java.util.Date;

public class FreeSub extends PricePlan {
    private String status;
    private int costPerMonth;

    public FreeSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.status="free";
        this.costPerMonth=0;
    }
}
