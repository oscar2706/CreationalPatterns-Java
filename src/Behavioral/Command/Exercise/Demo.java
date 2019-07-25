package Behavioral.Command.Exercise;

import Behavioral.Command.Exercise.Commands.Command;
import Behavioral.Command.Exercise.Commands.CommandHistory;
import Behavioral.Command.Exercise.Commands.DeleteCommand;
import Behavioral.Command.Exercise.Commands.SaveCommand;

public class Demo {
    public static void main(String[] args) {
        Note noteTest = new Note("Prueba", "hola");
        Note noteTest2= new Note("Prueba2", "Cómo estas?");
        Command saveCommand = new SaveCommand(noteTest);
        Command delete = new SaveCommand(noteTest2);
        saveCommand.execute();
        delete.execute();
        
        CommandHistory commandCache = new CommandHistory();
        commandCache.add(saveCommand);
        commandCache.add(delete);
        commandCache.undoLast();
        commandCache.undoLast();
    }
}
