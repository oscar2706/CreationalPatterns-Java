package Behavioral.Command.Exercise.Commands;

import Behavioral.Command.Exercise.Note;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> commandsHistory = new Stack<>();
    
    public void undoLast() {
        commandsHistory.pop().undo();
    }
    
    public void add(Command command) {
        commandsHistory.push(command);
    }
}
