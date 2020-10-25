package com.lab.automation.msokal.c3.add.pricep;

public abstract class PricePlan {
    private int costPerMonth;
    private String Status;
    public PricePlan (int costPerMonth, String Status){
        this.costPerMonth=costPerMonth;
        this.Status=Status;

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
}
