package com.kyeljmd.notes.dp.command.garage;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class GarageDoorOnCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
