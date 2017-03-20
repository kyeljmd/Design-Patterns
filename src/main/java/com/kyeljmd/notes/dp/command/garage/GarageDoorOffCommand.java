package com.kyeljmd.notes.dp.command.garage;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class GarageDoorOffCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.down();
    }

    @Override
    public void undo() {
        this.garageDoor.up();
    }
}
