package com.lab.automation.msokal.c3.music;

import com.lab.automation.msokal.c3.enums.Genre;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPL {
    int trackCount;
    int timepl;
    String songName;
    Song[] playlist1 = {new Song(128,5.3,3.0,"name1",4000,50000, Genre.POP),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.ROCK),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.POP),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.OTHER),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.POP),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.ROCK),
            new Song(128,5.3,3.0,"name1",4000,50000, Genre.POP)};



    public AbstractPL(int trackCount, int timepl, String songName) {
        this.trackCount = trackCount;
        this.timepl = timepl;
        this.songName = songName;
    }



    public int getTrackCount() {
        return trackCount;
    }

    public void setTrackCount(int trackCount) {
        this.trackCount = trackCount;
    }

    public int getTimepl() {
        return timepl;
    }

    public void setTimepl(int timepl) {
        this.timepl = timepl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Song[] getPlaylist1() {
        return playlist1;
    }

    public void setPlaylist1(Song[] playlist1) {
        this.playlist1 = playlist1;
    }

    @Override
    public String toString() {
        return "AbstractPL{" +
                "trackCount=" + trackCount +
                ", timepl=" + timepl +
                ", songName='" + songName + '\'' +
                ", playlist1=" + Arrays.toString(playlist1) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPL that = (AbstractPL) o;
        return trackCount == that.trackCount &&
                timepl == that.timepl &&
                Objects.equals(songName, that.songName) &&
                Arrays.equals(playlist1, that.playlist1);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(trackCount, timepl, songName);
        result = 31 * result + Arrays.hashCode(playlist1);
        return result;
    }
}

