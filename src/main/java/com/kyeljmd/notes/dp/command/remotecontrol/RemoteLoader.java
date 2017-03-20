package com.kyeljmd.notes.dp.command.remotecontrol;

import com.kyeljmd.notes.dp.command.garage.GarageDoor;
import com.kyeljmd.notes.dp.command.garage.GarageDoorOffCommand;
import com.kyeljmd.notes.dp.command.garage.GarageDoorOnCommand;
import com.kyeljmd.notes.dp.command.lights.Light;
import com.kyeljmd.notes.dp.command.lights.LightsOffCommand;
import com.kyeljmd.notes.dp.command.lights.LightsOnCommand;
import com.kyeljmd.notes.dp.command.stereo.Stereo;
import com.kyeljmd.notes.dp.command.stereo.StereoOffCommand;
import com.kyeljmd.notes.dp.command.stereo.StereoOnCommand;

/**
 * Created by kyel on 2/12/2017.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightsOnCommand livingRoomLightOnCommand = new LightsOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOffCommand = new LightsOffCommand(livingRoomLight);

        LightsOnCommand kitchenLightOnCommand = new LightsOnCommand(kitchenLight);
        LightsOffCommand kitchenLightOffCommand = new LightsOffCommand(kitchenLight);

        GarageDoorOffCommand garageOffCommand = new GarageDoorOffCommand(garageDoor);
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);

        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControl.setCommand(2,garageDoorOnCommand,garageOffCommand);
        remoteControl.setCommand(3,stereoOnCommand,stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undo();
    }
}
