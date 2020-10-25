package com.lab.automation.msokal.c3.music;

public class Album extends Artist {
    String albumName;


    public Album(String name, int rating,String albumName) {
        super(name,  rating);
        this.albumName=albumName;
    }


    @Override
    public int getRating() {
        return super.getRating();
    }

    @Override
    public void setRating(int rating) {
        super.setRating(rating);
    }

    @Override
    public String getArtistName() {
        return super.getArtistName();
    }

    @Override
    public void setArtistName(String artistName) {
        super.setArtistName(artistName);
    }


}

