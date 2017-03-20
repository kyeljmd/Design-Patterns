package com.kyeljmd.notes.dp.command.lights;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class LightsOffCommand implements Command {

    private Light light;

    public LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
