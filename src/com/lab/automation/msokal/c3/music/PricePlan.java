package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class PricePlan {

    private int costPerMonth;
    private String Status;
    private DataRange dateRange;

    public PricePlan(int costPerMonth, String status, DataRange dateRange) {
        this.costPerMonth = costPerMonth;
        this.Status = status;
        this.dateRange = dateRange;
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

    public DataRange getDateRange() {
        return dateRange;
    }

    public void setDateRange(DataRange dateRange) {
        this.dateRange = dateRange;
    }
    @Override
    public String toString() {
        return "PricePlan{" +
                "costPerMonth=" + costPerMonth +
                ", Status='" + Status + '\'' +
                ", dateRange=" + dateRange +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricePlan pricePlan = (PricePlan) o;
        return costPerMonth == pricePlan.costPerMonth &&
                Objects.equals(Status, pricePlan.Status) &&
                Objects.equals(dateRange, pricePlan.dateRange);
    }


}
