package Structural.Bridge.Excercise2.Cars;

import Structural.Bridge.Excercise2.Engines.Engine;

public class BasicCar implements Car {
    Engine engine;
    
    public BasicCar(Engine engine) {
        this.engine = engine;
    }
    
    @Override
    public void turnOn() {
        engine.turnOn();
    }
    
    @Override
    public void turnOff() {
        engine.turnOff();
    }
    
    @Override
    public void pushAccelerator() {
        if (engine.isWorking()) {
            engine.accelerate();
        }
    }
    
    @Override
    public void pushBreak() {
        engine.slowDown();
    }
    
    @Override
    public void openDors() {
        System.out.println("Opening doors");
    }
}
