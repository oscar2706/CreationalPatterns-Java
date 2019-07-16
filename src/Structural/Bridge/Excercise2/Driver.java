package Structural.Bridge.Excercise2;

public class Driver {
    private String name;
    private int age;
    private Car car;
    
    public Driver(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }
    
    public void getInsideCar() {
        car.openDors();
    }
    
    public void turnOnCar() {
        car.turnOn();
    }
    
    public void turnOffCar() {
        car.turnOff();
    }
    
    public void pushAcelerate() {
        car.accelerate();
    }
    
    public void pushBreak() {
        car.pushBreak(1);
    }
    
}
