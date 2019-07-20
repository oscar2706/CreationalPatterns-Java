package Structural.Decorator.Exercise;

public class ShootingStickDecorator extends FirearmDecorator {
    public ShootingStickDecorator(Firearm gun) {
        super(gun);
    }
    
    @Override
    public String shoot() {
        return useStick(super.shoot());
    }
    
    private String useStick(String s) {
        return "Using stick & " + s;
    }
}
