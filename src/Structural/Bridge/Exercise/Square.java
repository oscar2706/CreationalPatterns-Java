package Structural.Bridge.Exercise;

public class Square extends Shape {
    public Square(Color color) {
        this.color = color;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
    
    @Override
    public String toString() {
        return "Square{" + "color=" + color + '}';
    }
}
