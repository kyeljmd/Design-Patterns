package com.kyeljmd.notes.dp.command.lights;

/**
 * Created by kyel on 2/12/2017.
 */
public class Light {

    private String area;

    public Light(String area) {
        this.area = area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void on() {
        System.out.println("Turning the lights On");
    }

    public void off() {
        System.out.println("Turning the lights Off");
    }

}
