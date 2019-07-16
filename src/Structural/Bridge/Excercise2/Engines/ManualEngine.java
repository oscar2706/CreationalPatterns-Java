package Structural.Bridge.Excercise2.Engines;

public class ManualEngine implements Engine {
    private int speed = 0;
    private final int maximumSpeed = 6;
    private int acceleration = 0;
    private boolean working = false;
    private boolean clutchPressed = false;
    
    public void pushClutch() {
        if (!clutchPressed) {
            clutchPressed = true;
        }
        else {
            System.out.println("Clutch already pushed");
        }
    }
    
    public void leaveClutch() {
        if (clutchPressed) {
            clutchPressed = false;
        }
        else {
            System.out.println("Clutch still");
        }
    }
    
    @Override
    public void accelerate() {
        if (!isWorking())
            return;
        ++acceleration;
        System.out.println("Engine acceleration = " + acceleration);
    }
    
    @Override
    public void slowDown() {
        if (!isWorking())
            return;
        --acceleration;
        System.out.println("Engine slowing down = " + acceleration);
    }
    
    @Override
    public void turnOn() {
        if (!isWorking()) {
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
        if (n <= maximumSpeed && clutchPressed) {
            speed = n;
            System.out.println("Engine speed = " + speed);
        }
        else {
            System.out.println("MAXIMUM SPEED REACHED speed = " + speed);
        }
    }
}
