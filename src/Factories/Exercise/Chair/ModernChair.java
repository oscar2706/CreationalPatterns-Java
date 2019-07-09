package Factories.Exercise.Chair;

import Factories.Exercise.Chair.Chair;
import Factories.Exercise.Wood;

public class ModernChair extends Chair {

    public ModernChair(Wood wood) {
        this.wood = wood;
    }

    @Override
    public void sitOn() {
        System.out.println("You have sitted in a Modern Chair");
    }
    
    @Override
    public String toString() {
        return "ModernChair{" + "wood=" + wood + '}';
    }
}
