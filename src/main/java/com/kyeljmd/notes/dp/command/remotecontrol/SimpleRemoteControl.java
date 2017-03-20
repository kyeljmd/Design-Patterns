package com.kyeljmd.notes.dp.command.remotecontrol;

import com.kyeljmd.notes.dp.command.Command;

/**
 * Created by kyel on 2/12/2017.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }


    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonPressed() {
        slot.execute();
    }
 }


