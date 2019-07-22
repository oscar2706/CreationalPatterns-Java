package Structural.Flyweight.Exercise;

public class Demo {
    public static void main(String[] args) {
        final Race race = new Race();
        for (int i = 0; i < 1000000; ++i) {
            race.addCar("Model1", "2001", "white", 0, 0);
        }
        race.start();
    }
}
