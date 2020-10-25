package com.lab.automation.msokal.c3.add.pricep;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class FreeSub extends PricePlan {
    int costPerMonth=0;
    String status="Free";

    public FreeSub(int costPerMonth, String status, Date date, int costPerMonth1, String status1) {
        super(costPerMonth, status, date);
        this.costPerMonth = costPerMonth1;
        this.status = status1;
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
