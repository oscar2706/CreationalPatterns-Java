package Structural.Bridge.Exercise;

public class Demo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        
        Shape circle = new Circle(blue);
        Shape circleRed = new Circle(red);
        Shape square = new Square(blue);
        Shape squareRed = new Square(red);
    
        System.out.println(circle);
        System.out.println(circleRed);
        System.out.println(square);
        System.out.println(squareRed);
    }
    
}
