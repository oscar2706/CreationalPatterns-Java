package Structural.Bridge.Excercise2.Cars;

public abstract class Car {
    private int kmHr = 0;
    private int speed = 0;
    private int acceleration= 0;
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void openDors();
    public abstract boolean isTurnedOn();
    public abstract void pushAccelerator();
    public abstract void pushBreak(int intensity);
    public abstract void pushClutch();
    public abstract void leaveClutch();
    public abstract void changeSpeed(int speedChange);
    public abstract boolean hasClutch();
}
