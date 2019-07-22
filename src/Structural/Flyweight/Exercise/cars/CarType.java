package Structural.Flyweight.Exercise.cars;

public class CarType {
    private String name;
    private String model;
    private String color;
    
    @Override
    public String toString() {
        return "CarType{" + "name='" + name + '\'' + ", model='" + model + '\'' + ", color='" + color + '\'' + '}';
    }
    
    public CarType(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }
}
