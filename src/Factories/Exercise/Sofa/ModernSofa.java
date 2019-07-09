package Factories.Exercise.Sofa;

import Factories.Exercise.Wood;

public class ModernSofa extends Sofa{
    public ModernSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ModernSofa{" + "wood=" + wood + '}';
    }
}
