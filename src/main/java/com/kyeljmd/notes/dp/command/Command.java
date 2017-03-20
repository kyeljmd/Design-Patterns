package com.kyeljmd.notes.dp.command;

/**
 * Created by kyel on 2/12/2017.
 */
public interface Command {

    void execute();

    void undo();

}
