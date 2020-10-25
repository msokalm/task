package com.lab.automation.msokal.c3.add;

import com.lab.automation.msokal.c3.inteffaces.iPay;

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


}
