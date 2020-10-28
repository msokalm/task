package com.lab.automation.msokal.c3.Factory;

import com.lab.automation.msokal.c3.enums.Playlistname;
import com.lab.automation.msokal.c3.music.Album;
import com.lab.automation.msokal.c3.music.Playlist;

public class AlbumFactory {
    public static Album AlbumFactory
            (int trackCount, int timepl, String songName,
             Playlistname playlistname, int year, Playlist album){
        return new Album(trackCount,timepl,songName,playlistname,year,album);

    }
}


