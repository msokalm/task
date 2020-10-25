package com.lab.automation.msokal.c3.add.pricep;

import java.time.Period;
import java.util.Date;

public class StandartSub extends PricePlan {

        int costPerMonth = 15;
        String status = "Standart";

    public StandartSub(int costPerMonth, String status, Date date, int costPerMonth1, String status1) {
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

    @Override
    public String toString() {
        return "StandartSub{" +
                "costPerMonth=" + costPerMonth +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}

