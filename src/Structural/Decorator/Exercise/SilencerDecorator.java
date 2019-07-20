package Structural.Decorator.Exercise;

public class SilencerDecorator extends FirearmDecorator {
    public SilencerDecorator(Firearm gun) {
        super(gun);
    }
    
    @Override
    public String shoot() {
        return useSilencer(super.shoot());
    }
    
    public String useSilencer(String s) {
        return "Using silencer & "+ s;
    }
}
