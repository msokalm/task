package com.lab.automation.msokal.c3.Factory;

import com.lab.automation.msokal.c3.enums.Genre;
import com.lab.automation.msokal.c3.music.Song;

public class SongFactory {
    public static Song SongFactory
            (int bitrate, double size, double time,
             String songName, int rating, int countOfListen) {
        return new Song(bitrate, size, time, songName, rating, countOfListen, Genre.POP);
    }
}
