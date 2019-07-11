package Creational.Factories.Exercise.Sofa;

import Creational.Factories.Exercise.Wood;

public class ModernSofa extends Sofa{
    public ModernSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ModernSofa{" + "wood=" + wood + '}';
    }
}
