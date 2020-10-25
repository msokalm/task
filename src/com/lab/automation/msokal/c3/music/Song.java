package com.lab.automation.msokal.c3.music;

public final class Song extends Sound  {
    private String songName;
    private int Rating;
    private int countOfListen;
    private String Genre;


    public Song(String songName, int bitrate,
                double size, double time, int Rating,
                int countOfListen, String Genre) {
        super(bitrate, size, time);
        this.Rating = Rating;
        this.countOfListen = countOfListen;
        this.songName = songName;
        this.Genre=Genre;
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

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", Rating=" + Rating +
                ", countOfListen=" + countOfListen +
                '}';
    }
}
