package Behavioral.Command.Exercise.Commands;

import Behavioral.Command.Exercise.BD;
import Behavioral.Command.Exercise.Note;

public abstract class Command {
    protected Note note;
    protected boolean succesful = false;
    
    public Command(Note note) {
        this.note = note;
    }
    public abstract void undo();
    public abstract void execute();
}
