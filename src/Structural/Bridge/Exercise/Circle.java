package Structural.Bridge.Exercise;

public class Circle extends Shape {
    public Circle(Color color) {
        this.color = color;
    }
    
    @Override
    public void draw() {
        System.out.println("Drwaing a Circle");
    }
    
    @Override
    public String toString() {
        return "Circle{" + "color=" + color + '}';
    }
}
