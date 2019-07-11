package Creational.Factories.Exercise.Sofa;

import Creational.Factories.Exercise.Wood;

public class ClassicSofa extends Sofa{
    public ClassicSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicSofa{" + "wood=" + wood + '}';
    }
}
