package com.lab.automation.msokal.c3.factory;

import com.lab.automation.msokal.c3.enums.Playlistname;
import com.lab.automation.msokal.c3.music.Album;
import com.lab.automation.msokal.c3.music.Playlist;

public class AlbumFactory {
    public static Album TopAlbumFactory
            (int trackCount, int timepl, String songName, int year, Playlist album){
        return new Album(trackCount,timepl,songName, Playlistname.TOP_50,year,album);

    }
    public static Album MoodAlbumFactory
            (int trackCount, int timepl, String songName, int year, Playlist album){
        return new Album(trackCount,timepl,songName,Playlistname.DependsOfTheMood,year,album);

    }

}



