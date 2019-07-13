package Creational.Prototype.Exercise;

public class Arm implements Prototype {
    public int length;
    public String color;
    
    public Arm(int length, String color) {
        this.length = length;
        this.color = color;
    }
    
    public Arm(Arm originArm){
        this.color = originArm.color;
        this.length = originArm.length;
    }
    
    @Override
    public Prototype clone() {
        return new Arm(this);
    }
    
    @Override
    public String toString() {
        return "Arm{" + "length=" + length + ", color='" + color + '\'' + '}';
    }
}
