package com.lab.automation.msokal.c3.add.pricep;

import java.time.Period;
import java.util.Date;

public class BasicSub extends PricePlan {
    int costPerMonth=0;
    String status="Free";



    public BasicSub(int costPerMonth, String status, Date date) {
        super(costPerMonth, status, date);

    }

    @Override
    public int getCostPerMonth() {
        return costPerMonth;
    }

    @Override
    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
