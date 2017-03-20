package com.kyeljmd.notes.dp.command.stereo;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class StereoOnCommand implements Command {
    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
