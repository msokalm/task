package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class Playlist extends AbstractPL {
    private String playlistname;

    public Playlist(int trackCount, int timepl, String songName) {
        super(trackCount, timepl, songName);
    }




    @Override
    public String toString() {
        return "Playlist{" +
                "playlistname='" + playlistname + '\'' +
                '}';
    }


}

