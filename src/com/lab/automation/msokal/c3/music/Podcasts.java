package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class Podcasts extends Sound {
    private String theme;

    public Podcasts(int bitrate, double size, double time, String name) {
        super(bitrate, size, time);
        this.theme = theme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Podcasts podcasts = (Podcasts) o;
        return Objects.equals(theme, podcasts.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theme);
    }
}
