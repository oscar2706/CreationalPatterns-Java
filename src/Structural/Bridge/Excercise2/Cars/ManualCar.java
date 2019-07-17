package Structural.Bridge.Excercise2.Cars;

import Structural.Bridge.Excercise2.Engines.Engine;

public class ManualCar extends BasicCar {
    private boolean clutchPressed = false;
    
    public ManualCar(Engine engine) {
        super(engine);
    }
    
    @Override
    public void turnOn() {
        if (clutchPressed) {
            engine.turnOn();
        } else {
            System.out.println("You need to push the clutch to Start the motor");
        }
    }
    
    @Override
    public void turnOff() {
        if (!clutchPressed) {
            System.out.println("You have to push the cluth to turn off the engine correctly");
        }
        engine.turnOff();
    }
    
    @Override
    public void openDors() {
        System.out.println("Opening doors");
    }
    
    public void pushClutch() {
        clutchPressed = true;
        System.out.println("Clutch pressed");
    }
    
    public void leaveClutch() {
        clutchPressed = false;
        System.out.println("Clutch leaved");
    }
    
    public void changeSpeed(int speedChange) {
        if (clutchPressed) {
            engine.changeSpeed(speedChange);
        } else {
            engine.turnOff();
            System.out.println("You had to press the clutch to change the speed");
        }
    }
}
