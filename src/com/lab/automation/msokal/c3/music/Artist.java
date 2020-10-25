package com.lab.automation.msokal.c3.music;

public class Artist {
    private String ArtistName;
    private int rating;
    Album album = new Album("test1",2000);


    public Artist(String artistName, int rating, Album album) {
        ArtistName = artistName;
        this.rating = rating;
        this.album = album;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "ArtistName='" + ArtistName + '\'' +
                ", rating=" + rating +
                ", album=" + album +
                '}';
    }
}
