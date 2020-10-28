package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class FreeSub extends PricePlan {
    private String status;
    private int costPerMonth;

    public FreeSub(int costPerMonth, String status, DataRange dateRange) {
        super(costPerMonth, status, dateRange);
        this.status="free";
        this.costPerMonth=0;
    }

    @Override
    public String toString() {
        return "FreeSub{" +
                "status='" + status + '\'' +
                ", costPerMonth=" + costPerMonth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreeSub freeSub = (FreeSub) o;
        return costPerMonth == freeSub.costPerMonth &&
                Objects.equals(status, freeSub.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, costPerMonth);
    }
}
