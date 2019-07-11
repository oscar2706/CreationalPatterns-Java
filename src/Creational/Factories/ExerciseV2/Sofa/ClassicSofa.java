package Creational.Factories.ExerciseV2.Sofa;

import Creational.Factories.ExerciseV2.Wood;

public class ClassicSofa extends Sofa {
    public ClassicSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicSofa{" + "wood=" + wood + '}';
    }
}
