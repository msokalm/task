package com.lab.automation.msokal.c3.music;

public class Artist {
    private String ArtistName;
    private int rating;

    public Artist(String name, int rating) {
        this.ArtistName = name;
        this.rating = rating;

    }



    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

}
