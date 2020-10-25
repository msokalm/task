package com.lab.automation.msokal.c3.music;

public class Album {
    private String albumName;
    private int year;


    public Album(String albumName, int year) {
        this.albumName = albumName;
        this.year = year;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                '}';
    }
}




