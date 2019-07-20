package Structural.Decorator.Exercise;

public class FirearmDecorator implements Firearm {
    private Firearm gun;
    
    public FirearmDecorator(Firearm gun) {
        this.gun = gun;
    }
    
    @Override
    public String shoot() {
        return gun.shoot();
    }
}
