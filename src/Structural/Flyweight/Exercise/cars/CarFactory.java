package Structural.Flyweight.Exercise.cars;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    static Map<String, CarType> carTypes = new HashMap<>();
    
    public static CarType getCarType(String name, String color, String model) {
        CarType carType = carTypes.get(name);
        if (carType != null)
            return carType;
        else
            return new CarType(name, model, color);
    }
}
