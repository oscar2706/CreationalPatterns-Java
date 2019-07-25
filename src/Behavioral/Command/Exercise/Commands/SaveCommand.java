package Behavioral.Command.Exercise.Commands;

import Behavioral.Command.Exercise.BD;
import Behavioral.Command.Exercise.Note;

public class SaveCommand extends Command {
    public SaveCommand(Note note) {
        super(note);
    }
    
    @Override
    public void undo() {
        BD bd = BD.getInstance();
        bd.deleteNote(note.getTitle());
        System.out.println(bd);
    }
    
    @Override
    public void execute() {
        BD bd = BD.getInstance();
        bd.insertNote(note);
        System.out.println(bd);
    }
}
