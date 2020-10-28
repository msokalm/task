package com.lab.automation.msokal.c3.music;


import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chart chart = (Chart) o;
        return Objects.equals(theme, chart.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), theme);
    }

    @Override
    public void Play() {

    }

    @Override
    public void Pause() {

    }

    @Override
    public void Repeat() {

    }
}
