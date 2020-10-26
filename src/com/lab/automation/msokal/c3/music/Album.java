package com.lab.automation.msokal.c3.music;

public class Album {
    private String albumName;
    private int year;
    Song[] album = {new Song("songName1", 256, 5.5, 3.2, 1234, 2121, "pop"),
            new Song("songName2", 256, 5.4, 3.0, 321, 4000, "pop"),
            new Song("songName3", 256, 5.4, 2.5, 2345, 11111, "pop"),
            new Song("songName4", 256, 5.2, 3.4, 5555, 11111, "pop"),
            new Song("songName5", 256, 5.3, 3.1, 12, 7500, "pop"),
            new Song("songName6", 256, 5.1, 3.3, 5, 9300, "pop"),
            new Song("songName7", 256, 5.1, 3.5, 1230, 11111, "pop"),
            new Song("songName8", 256, 5.0, 3.0, 300, 5000,"pop")};


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




