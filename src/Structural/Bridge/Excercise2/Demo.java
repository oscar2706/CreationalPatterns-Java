package Structural.Bridge.Excercise2;

import Structural.Bridge.Excercise2.Cars.SportCar;
import Structural.Bridge.Excercise2.Engines.AutomaticEngine;

public class Demo {
    public static void main(String[] args) {
        final SportCar camaro = new SportCar(new AutomaticEngine());
        final Driver oscar = new Driver("Oscar", 21, camaro);
        oscar.turnOnCar();
        oscar.pushAcelerate();
        oscar.pushBreak();
        oscar.turnOffCar();
    }
}
