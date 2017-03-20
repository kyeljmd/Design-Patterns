package com.kyeljmd.notes.dp.command.garage;

/**
 * Created by kyel on 2/12/2017.
 */
public class GarageDoor {

    public void down(){
        System.out.println("Garage Door closed");
    }

    public void up() {
        System.out.println("Garage Door Opened");
    }

    public void stop() {
        System.out.println("Garage Door Stopped");
    }

    public void lightsOn() {
        System.out.println("Garage Door Lights On");
    }

    public void lightsOf() {
        System.out.println("Garage Door Lights off");
    }
}
