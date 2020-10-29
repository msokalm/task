package com.lab.automation.msokal.c3.music;

import com.lab.automation.msokal.c3.enums.Playlistname;

import java.util.Objects;

public class Playlist extends AbstractPL {
    private Playlistname playlistname;

    public Playlist(int trackCount, int timepl, String songName) {
        super(trackCount, timepl, songName);
    }

    public Playlistname getPlaylistname() {
        return playlistname;
    }

    public void setPlaylistname(Playlistname playlistname) {
        this.playlistname = playlistname;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistname='" + playlistname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Playlist playlist = (Playlist) o;
        return Objects.equals(playlistname, playlist.playlistname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), playlistname);
    }

}

