package com.lab.automation.msokal.c3.music;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractPL extends Sound {
    int trackCount;
    int timepl;
    String songName;

    public AbstractPL(int bitrate, double size, double time, int trackCount, int timepl, String songName) {
        super(bitrate, size, time);
        this.trackCount = trackCount;
        this.timepl = timepl;
        this.songName = songName;
    }

    public List<Song> PlaylistName() {

        return Arrays.asList(new Song[]{});


    }
}

