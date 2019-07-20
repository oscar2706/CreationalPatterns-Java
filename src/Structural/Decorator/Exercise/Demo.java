package Structural.Decorator.Exercise;

public class Demo {
    public static void main(String[] args) {
        FirearmDecorator stick = new ShootingStickDecorator(new SilencerDecorator(new Gun()));
        System.out.println(stick.shoot());
        FirearmDecorator silencer = new SilencerDecorator(new ShootingStickDecorator(new Gun()));
        System.out.println(silencer.shoot());
    }
}
