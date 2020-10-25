package com.lab.automation.msokal.c3.music;

public class Playlist extends AbstractPL{
    private String playlistname;

    public Playlist(int bitrate, double size, double time, int trackCount, int timepl, String songName) {
        super(bitrate, size, time, trackCount, timepl, songName);
    }

    public String getPlaylistname() {
        return playlistname;
    }

    public void setPlaylistname(String playlistname) {
        this.playlistname = playlistname;
    }
}

