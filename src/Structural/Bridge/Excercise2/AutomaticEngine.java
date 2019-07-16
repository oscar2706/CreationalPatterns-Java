package Structural.Bridge.Excercise2;

public class AutomaticEngine implements Engine {
    private int speed = 0;
    private final int maximumSpeed = 7;
    private int acceleration = 0;
    private boolean working = false;
    private final int accelerationSpeedChanger = 3;
    
    @Override
    public void accelerate() {
        if (!isWorking())
            return;
        ++acceleration;
        System.out.println("Engine acceleration = " + acceleration);
        if (acceleration % accelerationSpeedChanger == 0) {
            acceleration = 1;
            changeSpeed(++speed);
        }
    }
    
    @Override
    public void slowDown() {
        if (!isWorking())
            return;
        if (acceleration > 0) {
            --acceleration;
            System.out.println("Engine slowing down, acceleration = " + acceleration);
        }
        else if (speed > 0) {
            changeSpeed(--speed);
        }
        else {
            System.out.println("Engine stopped");
            turnOff();
        }
    }
    
    @Override
    public void turnOn() {
        if (isWorking() == false) {
            working = true;
            System.out.println("Engine turned ON");
        }
        else {
            System.out.println("Engine already working");
        }
    }
    
    @Override
    public void turnOff() {
        if (isWorking()) {
            working = false;
            System.out.println("Engine turned OFF");
        }
        else {
            System.out.println("Engine already turned off");
        }
    }
    
    @Override
    public boolean isWorking() {
        return working;
    }
    
    @Override
    public void changeSpeed(int n) {
        if (n <= maximumSpeed) {
            speed = n;
            System.out.println("Engine speed = " + speed);
        } else {
            System.out.println("MAXIMUM SPEED REACHED speed = " + speed);
        }
    }
}
