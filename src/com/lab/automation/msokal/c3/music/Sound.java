package com.lab.automation.msokal.c3.music;

import java.util.Objects;

public class Sound  {
    private int bitrate;
    private double size;
    private double time;

    public Sound(int bitrate, double size, double time) {

        this.bitrate = bitrate;
        this.time = time;
        this.size = size;

    }


    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Sound{" +
                "bitrate=" + bitrate +
                ", size=" + size +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sound sound = (Sound) o;
        return bitrate == sound.bitrate &&
                Double.compare(sound.size, size) == 0 &&
                Double.compare(sound.time, time) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitrate, size, time);
    }
}
