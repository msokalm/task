package com.lab.automation.msokal.c3.add.pricep;


import java.time.OffsetDateTime;

public class DataRange {
    private OffsetDateTime dateStart;
    private OffsetDateTime dateEnd;

    public void DateRange (OffsetDateTime dateStart, OffsetDateTime dateEnd){
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }



    public OffsetDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(OffsetDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public OffsetDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(OffsetDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

}
