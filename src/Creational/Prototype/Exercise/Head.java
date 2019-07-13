package Creational.Prototype.Exercise;

public class Head implements Prototype{
    private String color;
    private String shape;
    
    public Head(String color, String type) {
        this.color = color;
        this.shape = type;
    }
    
    public Head(Head originHead) {
        color = originHead.color;
        shape = originHead.shape;
    }
    
    @Override
    public Prototype clone() {
        return new Head(this);
    }
    
    @Override
    public String toString() {
        return "Head{" + "color='" + color + '\'' + ", shape='" + shape + '\'' + '}';
    }
}
