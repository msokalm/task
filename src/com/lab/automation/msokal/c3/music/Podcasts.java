package com.lab.automation.msokal.c3.music;

public class Podcasts extends Sound {
    private String name;

    public Podcasts(int bitrate, double size, double time, String name) {
        super(bitrate, size, time);
        this.name = name;
    }
}
