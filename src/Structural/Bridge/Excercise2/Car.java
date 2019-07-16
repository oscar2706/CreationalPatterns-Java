package Structural.Bridge.Excercise2;

abstract class Car {
    private int kmHr = 0;
    private int speed = 0;
    private int acceleration= 0;
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void accelerate();
    public abstract boolean openDors();
    public abstract boolean isTurnedOn();
    public abstract void pushBreak(int intensity);
    public abstract void changeSpeed(int speedChange);
}
