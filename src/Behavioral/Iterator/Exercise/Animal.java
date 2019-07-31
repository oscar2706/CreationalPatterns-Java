package Behavioral.Iterator.Exercise;

public class Animal {
    private String name;
    private String sound;
    private int age;
    
    public Animal(String name, String sound, int age) {
        this.name = name;
        this.sound = sound;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSound() {
        return sound;
    }
    
    public int getAge() {
        return age;
    }
}
