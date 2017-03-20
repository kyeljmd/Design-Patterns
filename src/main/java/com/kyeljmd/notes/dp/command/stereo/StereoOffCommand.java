package com.kyeljmd.notes.dp.command.stereo;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class StereoOffCommand implements Command{

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
