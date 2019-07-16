package Structural.Bridge.Excercise2.Cars;

import Structural.Bridge.Excercise2.Engines.Engine;

public class Truck extends Car {
    private Engine engine;
    private boolean clutchPressed = false;
    
    public Truck(Engine engine) {
        this.engine = engine;
    }
    
    @Override
    public void turnOn() {
        if (clutchPressed) {
            engine.turnOn();
        }
        else {
            System.out.println("You need to push the clutch to Start the motor");
        }
    }
    
    @Override
    public void turnOff() {
        engine.turnOff();
    }
    
    @Override
    public void pushAccelerator() {
        engine.accelerate();
    }
    
    @Override
    public void openDors() {
        System.out.println("Opening doors");
    }
    
    @Override
    public boolean isTurnedOn() {
        return engine.isWorking();
    }
    
    @Override
    public void pushBreak(int intensity) {
        engine.slowDown();
    }
    
    @Override
    public void changeSpeed(int speedChange) {
        if (clutchPressed) {
            engine.changeSpeed(speedChange);
        }
        else{
            engine.turnOff();
            System.out.println("You had to press the clutch to change the speed");
        }
    }
    
    @Override
    public boolean hasClutch() {
        return true;
    }
    
    @Override
    public void pushClutch() {
        clutchPressed = true;
        System.out.println("Clutch pressed");
    }
    
    @Override
    public void leaveClutch() {
        clutchPressed = false;
        System.out.println("Clutch leaved");
    }
}
