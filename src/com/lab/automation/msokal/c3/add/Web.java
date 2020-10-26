package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.inteffaces.iPay;

import java.util.Objects;

public class Web implements iPay {
    private String serviceName;
    private String purseNumber;

    public Web (String serviceName, String purseNumber) {
        this.purseNumber = purseNumber;
        this.serviceName = serviceName;

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPurseNumber() {
        return purseNumber;
    }

    public void setPurseNumber(String purseNumber) {
        this.purseNumber = purseNumber;
    }

    @Override
    public void iPay() {

    }

    @Override
    public String toString() {
        return "Web{" +
                "serviceName='" + serviceName + '\'' +
                ", purseNumber='" + purseNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Web web = (Web) o;
        return Objects.equals(serviceName, web.serviceName) &&
                Objects.equals(purseNumber, web.purseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName, purseNumber);
    }
}
