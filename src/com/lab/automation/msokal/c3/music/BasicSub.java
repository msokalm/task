package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class BasicSub extends PricePlan {
    private String status;
    private int costPerMonth;


    public BasicSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.status="basic";
        this.costPerMonth=10;
    }

    @Override
    public String toString() {
        return "BasicSub{" +
                "status='" + status + '\'' +
                ", costPerMonth=" + costPerMonth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasicSub basicSub = (BasicSub) o;
        return costPerMonth == basicSub.costPerMonth &&
                Objects.equals(status, basicSub.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, costPerMonth);
    }
}



