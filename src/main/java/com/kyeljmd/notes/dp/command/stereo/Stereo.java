package com.kyeljmd.notes.dp.command.stereo;

/**
 * Created by kyel on 2/12/2017.
 */
public class Stereo {

    public void on() {
        System.out.println("Turning on the stereo");
    }

    public void off() {
        System.out.println("Turning off the stereo");
    }

    public void setCd() {
        System.out.println("Setting CD");
    }

    public void setDVD() {
        System.out.println("Setting DVD");
    }

    public void setRadio() {
        System.out.println("Setting Radio");
    }

    public void setVolume(int volume) {
        System.out.println("Setting Volume "+volume);
    }
}
