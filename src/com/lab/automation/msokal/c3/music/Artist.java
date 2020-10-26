package com.lab.automation.msokal.c3.music;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return rating == artist.rating &&
                Objects.equals(ArtistName, artist.ArtistName) &&
                Objects.equals(album, artist.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ArtistName, rating, album);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "ArtistName='" + ArtistName + '\'' +
                ", rating=" + rating +
                '}';
    }
}
