package Structural.Bridge.Excercise2.Cars;

import Structural.Bridge.Excercise2.Engines.Engine;

public class SportCar extends Car{
    Engine engine;
    
    public SportCar(Engine engine) {
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
    public void accelerate() {
        engine.accelerate();
    }
    
    @Override
    public boolean openDors() {
        System.out.println("Opening doors");
        return true;
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
    
    }
}
