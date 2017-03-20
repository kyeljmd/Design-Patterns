package com.kyeljmd.notes.dp.command.lights;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class LightsOnCommand implements Command {

    private Light light;

    public LightsOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
