package com.kyeljmd.notes.dp.command.remotecontrol;

import com.kyeljmd.notes.dp.command.Command;
import com.kyeljmd.notes.dp.command.NoCommand;

import java.util.Arrays;

/**
 * Created by kyel on 2/12/2017.
 */
public class RemoteControl {

    private Command[] offCommand;

    private Command[] onCommand;

    private Command undoCommand;

    public RemoteControl() {
        this(7);
    }

    public RemoteControl(int slots) {
        this.offCommand = new Command[slots];
        this.onCommand = new Command[slots];
        for(int i = 0; i < slots; i++){
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command on, Command off){
        offCommand[slot] = off;
        onCommand[slot] = on;
    }

    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undo() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("--Remote Control--\n");

        for(int i = 0; i<onCommand.length; i++) {
            sb.append("[Slot "+0+"]"+ " "+ onCommand[i].getClass().getName() + " "
                    +onCommand[i].getClass().getName()+"\n");
        }

        return sb.toString();
    }
}
