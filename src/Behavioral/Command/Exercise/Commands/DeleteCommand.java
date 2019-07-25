package Behavioral.Command.Exercise.Commands;

import Behavioral.Command.Exercise.BD;
import Behavioral.Command.Exercise.Note;

public class DeleteCommand extends Command {
    public DeleteCommand(Note note) {
        super(note);
    }
    
    @Override
    public void undo() {
        if (succesful) {
            BD bd = BD.getInstance();
            bd.insertNote(note);
            System.out.println(bd);
        } else {
            System.out.println(note.getTitle() + "has not been saved to be deleted");
        }
    }
    
    @Override
    public void execute() {
        BD bd = BD.getInstance();
        bd.deleteNote(note.getTitle());
        System.out.println(bd);
        succesful = true;
    }
}
