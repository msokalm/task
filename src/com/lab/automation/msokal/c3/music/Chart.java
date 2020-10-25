package com.lab.automation.msokal.c3.music;


import java.util.Arrays;

public final class Chart extends AbstractPL  {
    String theme;



    public Chart(int trackCount, int timepl, String songName, String theme) {
        super(trackCount, timepl, songName);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "theme='" + theme + '\'' +
                ", trackCount=" + trackCount +
                ", timepl=" + timepl +
                ", songName='" + songName + '\'' +
                ", playlist1=" + Arrays.toString(playlist1) +
                '}';
    }
}
