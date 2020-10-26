package com.lab.automation.msokal.c3.music;

public class Artist {
    private String ArtistName;
    private int rating;
    private Album album;

    public Artist(String artistName, int rating, Album Album) {
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



    @Override
    public String toString() {
        return "Artist{" +
                "ArtistName='" + ArtistName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
