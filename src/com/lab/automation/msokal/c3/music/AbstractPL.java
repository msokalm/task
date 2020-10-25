package com.lab.automation.msokal.c3.music;

import java.util.Arrays;

public abstract class AbstractPL {
    int trackCount;
    int timepl;
    String songName;
    Song[] playlist1 = {new Song("songName1", 256, 5.5, 3.2, 1234, 2121, "pop"),
            new Song("songName2", 256, 5.4, 3.0, 321, 4000, "pop"),
            new Song("songName3", 256, 5.4, 2.5, 2345, 11111, "pop"),
            new Song("songName4", 256, 5.2, 3.4, 5555, 11111, "pop"),
            new Song("songName5", 256, 5.3, 3.1, 12, 7500, "pop"),
            new Song("songName6", 256, 5.1, 3.3, 5, 9300, "pop"),
            new Song("songName7", 256, 5.1, 3.5, 1230, 11111, "pop"),
            new Song("songName8", 256, 5.0, 3.0, 300, 5000, "pop")};


    public AbstractPL(int trackCount, int timepl, String songName) {
        this.trackCount = trackCount;
        this.timepl = timepl;
        this.songName = songName;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getTimepl() {
        return timepl;
    }

    public void setTimepl(int timepl) {
        this.timepl = timepl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Song[] getPlaylist1() {
        return playlist1;
    }

    public void setPlaylist1(Song[] playlist1) {
        this.playlist1 = playlist1;
    }

    @Override
    public String toString() {
        return "AbstractPL{" +
                "trackCount=" + trackCount +
                ", timepl=" + timepl +
                ", songName='" + songName + '\'' +
                ", playlist1=" + Arrays.toString(playlist1) +
                '}';
    }
}

