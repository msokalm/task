package com.lab.automation.msokal.c3.add.pricep;
import java.util.Date;

public class PricePlan {
    private int costPerMonth;
    private String Status;

    Date date = new Date();



    public PricePlan(int costPerMonth, String status, Date date) {
        this.costPerMonth = costPerMonth;
        Status = status;
        this.date = date;
    }

    public int getCostPerMonth() {
        return costPerMonth;
    }

    public void setCostPerMonth(int costPerMonth) {
        this.costPerMonth = costPerMonth;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "PricePlan{" +
                "costPerMonth=" + costPerMonth +
                ", Status='" + Status + '\'' +
                ", date=" + date +
                '}';
    }
}
