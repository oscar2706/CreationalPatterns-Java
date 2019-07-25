package Behavioral.Command.Exercise;

import java.util.HashMap;
import java.util.Map;

public final class BD {
    private static BD instance;
    private Map<String, Note> noteMap = new HashMap<>();
    
    public static BD getInstance() {
        if (instance == null) {
            instance = new BD();
        }
        return instance;
    }
    
    public void insertNote(Note note) {
        noteMap.put(note.getTitle(), note);
    }
    
    public void deleteNote(String title) {
        noteMap.remove(title);
    }
    
    public void updateNote(Note note) {
        noteMap.replace(note.getTitle(), note);
    }
    
    @Override
    public String toString() {
        return "BD{" + "noteMap=" + noteMap + '}';
    }
}
