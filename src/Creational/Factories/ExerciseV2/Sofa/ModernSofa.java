package Creational.Factories.ExerciseV2.Sofa;

import Creational.Factories.ExerciseV2.Wood;

public class ModernSofa extends Sofa {
    public ModernSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ModernSofa{" + "wood=" + wood + '}';
    }
}
