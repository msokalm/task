package com.lab.automation.msokal.c3.music;

import java.util.Objects;
import com.lab.automation.msokal.c3.enums.Genre;

public final class Song extends Sound {
    private String songName;
    private int Rating;
    private int countOfListen;
    private Genre genre;

    public Song(int bitrate, double size, double time,
                String songName, int rating, int countOfListen,
                Genre genre) {
        super(bitrate, size, time);
        this.songName = songName;
        this.Rating = rating;
        this.countOfListen = countOfListen;
        this.genre=genre;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getCountOfListen() {
        return countOfListen;
    }

    public void setCountOfListen(int countOfListen) {
        this.countOfListen = countOfListen;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", Rating=" + Rating +
                ", countOfListen=" + countOfListen +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Song song = (Song) o;
        return Rating == song.Rating &&
                countOfListen == song.countOfListen &&
                Objects.equals(songName, song.songName) &&
                genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), songName, Rating, countOfListen, genre);
    }
}