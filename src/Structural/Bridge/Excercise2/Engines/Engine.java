package Structural.Bridge.Excercise2.Engines;

public interface Engine {
    void accelerate();
    void slowDown();
    void turnOn();
    void turnOff();
    boolean isWorking();
    void changeSpeed(int n);
    void restartEngine();
}
