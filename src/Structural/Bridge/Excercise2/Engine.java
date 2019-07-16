package Structural.Bridge.Excercise2;

public interface Engine {
    public void accelerate();
    public void slowDown(); //TODO: implement it with intensity
    public void turnOn();
    public void turnOff();
    public boolean isWorking();
    public void changeSpeed(int n);
}
