package com.lab.automation.msokal.c3.factory;

import com.lab.automation.msokal.c3.enums.Genre;
import com.lab.automation.msokal.c3.music.Song;

public class SongFactory {
    public static Song PopSongFactory
            (int bitrate, double size, double time,
             String songName, int rating, int countOfListen) {
        return new Song(bitrate, size, time, songName, rating, countOfListen, Genre.POP);
    }
    public static Song PunkSongFactory
            (int bitrate, double size, double time,
             String songName, int rating, int countOfListen) {
        return new Song(bitrate, size, time, songName, rating, countOfListen, Genre.PUNK);
    }
    public static Song RockSongFactory
            (int bitrate, double size, double time,
             String songName, int rating, int countOfListen) {
        return new Song(bitrate, size, time, songName, rating, countOfListen, Genre.ROCK);
    }
    public static Song OtherSongFactory
            (int bitrate, double size, double time,
             String songName, int rating, int countOfListen) {
        return new Song(bitrate, size, time, songName, rating, countOfListen, Genre.OTHER);
    }

}

