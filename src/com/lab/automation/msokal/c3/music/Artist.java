package com.lab.automation.msokal.c3.music;

public class Artist {
    private String ArtistName;
    private int rating;
    private Album[] Album = {new Album("test1", 2000),
            new Album("test2", 2002),
            new Album("test", 2010)};


    public Artist(String artistName, int rating, Album album) {
        ArtistName = artistName;
        this.rating = rating;

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
