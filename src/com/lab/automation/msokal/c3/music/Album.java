package com.lab.automation.msokal.c3.music;
import com.lab.automation.msokal.c3.enums.Playlistname;

import java.util.Arrays;
import java.util.Objects;

public class Album extends AbstractPL{
    private Playlistname playlistname;
    private int year;
    private Playlist album;

    /*Song[] album = {new Song("songName1", 256, 5.5, 3.2, 1234, 2121, "pop"),
            new Song("songName2", 256, 5.4, 3.0, 321, 4000, "pop"),
            new Song("songName3", 256, 5.4, 2.5, 2345, 11111, "pop"),
            new Song("songName4", 256, 5.2, 3.4, 5555, 11111, "pop"),
            new Song("songName5", 256, 5.3, 3.1, 12, 7500, "pop"),
            new Song("songName6", 256, 5.1, 3.3, 5, 9300, "pop"),
            new Song("songName7", 256, 5.1, 3.5, 1230, 11111, "pop"),
            new Song("songName8", 256, 5.0, 3.0, 300, 5000,"pop")};
    Playlist[] album ={new Playlist(12,42,"tttt"),
            new Playlist(15,48,"tttt"),
            new Playlist(13,44,"tttt")};*/


    public Album(int trackCount, int timepl, String songName, Playlistname playlistname, int year, Playlist album) {
        super(trackCount, timepl, songName);
        this.playlistname = playlistname;
        this.year = year;
        this.album = album;
    }

    public Playlistname getPlaylistname() {
        return playlistname;
    }

    public void setPlaylistname(Playlistname playlistname) {
        this.playlistname = playlistname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Playlist getAlbum() {
        return album;
    }

    public void setAlbum(Playlist album) {
        this.album = album;
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

    @Override
    public String toString() {
        return "Album{" +
                "playlistname=" + playlistname +
                ", year=" + year +
                ", album=" + album +
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
        Album album1 = (Album) o;
        return year == album1.year &&
                playlistname == album1.playlistname &&
                Objects.equals(album, album1.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), playlistname, year, album);
    }
}




