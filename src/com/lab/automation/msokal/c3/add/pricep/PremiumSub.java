package com.lab.automation.msokal.c3.add.pricep;

import java.util.Objects;

public class PremiumSub extends PricePlan {
    private int costPerMonth;
    private String status;

    public PremiumSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.costPerMonth = 25;
        this.status = "prermium";
    }

    @Override
    public String toString() {
        return "PremiumSub{" +
                "costPerMonth=" + costPerMonth +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PremiumSub that = (PremiumSub) o;
        return costPerMonth == that.costPerMonth &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costPerMonth, status);
    }
}




