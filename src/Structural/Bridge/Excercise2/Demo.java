package Structural.Bridge.Excercise2;

import Structural.Bridge.Excercise2.Cars.BasicCar;
import Structural.Bridge.Excercise2.Cars.Car;
import Structural.Bridge.Excercise2.Cars.ManualCar;
import Structural.Bridge.Excercise2.Engines.AutomaticEngine;
import Structural.Bridge.Excercise2.Engines.Engine;
import Structural.Bridge.Excercise2.Engines.ManualEngine;

public class Demo {
    public static void main(String[] args) {
        Engine automaticEngine = new AutomaticEngine();
        Engine manualEngine = new ManualEngine();
    
        System.out.println("--- PRUEBAS CON FUNCIÓN ---");
        checkEngine(automaticEngine);
        checkEngine(manualEngine);
    }
    
    public static void checkEngine(Engine engine){
        System.out.println("-> BasicCar");
        Car basicCar = new BasicCar(engine);
        basicCar.turnOn();
        basicCar.pushAccelerator();
        basicCar.pushAccelerator();
        basicCar.pushAccelerator();
        basicCar.pushAccelerator();
        basicCar.pushAccelerator();
        basicCar.pushAccelerator();
        engine.restartEngine();
        System.out.println("-> ManualCar");
        ManualCar manualCar = new ManualCar(engine);
        manualCar.pushClutch();
        manualCar.turnOn();
        manualCar.leaveClutch();
        manualCar.pushAccelerator();
        manualCar.pushAccelerator();
        manualCar.pushAccelerator();
        manualCar.pushAccelerator();
        manualCar.pushClutch();
        manualCar.changeSpeed(2);
        manualCar.leaveClutch();
        manualCar.pushAccelerator();
        manualCar.pushAccelerator();
        System.out.println("----------------------");
    }
}
