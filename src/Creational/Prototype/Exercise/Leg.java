package Creational.Prototype.Exercise;

public class Leg implements Prototype{
    private String color;
    private int length;
    
    public Leg(String color, int length) {
        this.color = color;
        this.length = length;
    }
    
    public Leg(Leg originLeg) {
        color = originLeg.color;
        length = originLeg.length;
    }
    
    @Override
    public String toString() {
        return "Leg{" + "color='" + color + '\'' + ", length=" + length + '}';
    }
    
    @Override
    public Prototype clone() {
        return new Leg(this);
    }
}
