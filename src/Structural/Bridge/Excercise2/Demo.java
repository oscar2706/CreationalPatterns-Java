package Structural.Bridge.Excercise2;

import Structural.Bridge.Excercise2.Cars.SportCar;
import Structural.Bridge.Excercise2.Cars.Truck;
import Structural.Bridge.Excercise2.Engines.AutomaticEngine;
import Structural.Bridge.Excercise2.Engines.ManualEngine;

public class Demo {
    public static void main(String[] args) {
        final SportCar camaro = new SportCar(new AutomaticEngine());
        final Driver oscar = new Driver("Oscar", 21, camaro);
        oscar.turnOnCar();
        oscar.pushClutch();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.pushAcelerate();
        oscar.turnOffCar();
        
        System.out.println();
        
        final Truck caminota = new Truck(new ManualEngine());
        final Driver juan = new Driver("Juan", 28, caminota);
        juan.pushClutch();
        juan.turnOnCar();
        juan.leaveClutch();
        juan.pushAcelerate();
        juan.pushAcelerate();
        juan.pushAcelerate();
        juan.pushAcelerate();
        juan.pushClutch();
        juan.changeSpeed(2);
        juan.leaveClutch();
        juan.pushAcelerate();
        juan.pushAcelerate();
        juan.pushAcelerate();
        juan.changeSpeed(3);
    }
}
