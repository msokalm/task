package com.lab.automation.msokal.c3.music;


public final class Chart extends AbstractPL  {
    String theme;


    public Chart(int bitrate, int size, int time, int trackCount,
                 int timepl, String songNames, String theme) {
        super(bitrate, size, time, trackCount, timepl, songNames);
        this.theme = theme;
    }

}
