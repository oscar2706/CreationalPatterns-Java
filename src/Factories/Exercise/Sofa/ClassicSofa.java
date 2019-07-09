package Factories.Exercise.Sofa;

import Factories.Exercise.Wood;

public class ClassicSofa extends Sofa{
    public ClassicSofa(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicSofa{" + "wood=" + wood + '}';
    }
}
