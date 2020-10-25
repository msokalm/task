package com.lab.automation.msokal.c3.add.pricep;

public class StandartSub extends PricePlan {
    public StandartSub(int costPerMonth, String Status) {
        super(costPerMonth, Status);
        costPerMonth = 15;
        Status = "Standart";
    }
}
