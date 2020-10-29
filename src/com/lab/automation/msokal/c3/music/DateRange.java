package com.lab.automation.msokal.c3.music;


import java.time.OffsetDateTime;
import java.util.Objects;

public class DateRange {
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

    @Override
    public String toString() {
        return "DataRange{" +
                "dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateRange dataRange = (DateRange) o;
        return Objects.equals(dateStart, dataRange.dateStart) &&
                Objects.equals(dateEnd, dataRange.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateStart, dateEnd);
    }
}
