package Structural.Flyweight.Exercise.cars;

public class Car {
    private int x, y;
    private CarType type;
    
    public Car(int x, int y, CarType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public void run() {
        System.out.println(this + " is Running");
    }
    
    @Override
    public String toString() {
        return "Car{" + "x=" + x + ", y=" + y + ", type=" + type + '}';
    }
}
