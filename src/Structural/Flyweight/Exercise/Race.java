package Structural.Flyweight.Exercise;

import Structural.Flyweight.Exercise.cars.Car;
import Structural.Flyweight.Exercise.cars.CarFactory;
import Structural.Flyweight.Exercise.cars.CarType;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Car> cars = new ArrayList<>();
    
    public void addCar(String name, String model, String color, int x, int y) {
        CarType carType = CarFactory.getCarType(name, color, model);
        cars.add(new Car(x, y, carType));
    }
    
    public void start() {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        System.out.println();
        for (Car car : cars) {
            car.run();
        }
    }
}
