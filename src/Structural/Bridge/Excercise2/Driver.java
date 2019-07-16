package Structural.Bridge.Excercise2;

import Structural.Bridge.Excercise2.Cars.Car;

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
        car.pushAccelerator();
    }
    
    public void pushBreak() {
        car.pushBreak(1);
    }
    
    public void changeSpeed(int speed) {
        car.changeSpeed(speed);
    }
    
    public void pushClutch() {
        if (car.hasClutch()) {
            car.pushClutch();
        }
        else {
            System.out.println("The car does not have a clutch");
        }
    }
    
    public void leaveClutch() {
        if (car.hasClutch()) {
            car.leaveClutch();
        }
        else {
            System.out.println("The car does not have a clutch");
        }
    }
}
