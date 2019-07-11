package Creational.Factories.ExerciseV2.Chair;

import Creational.Factories.ExerciseV2.Wood;

public class ClassicChair extends Chair {

    public ClassicChair(Wood wood){
        this.wood = wood;
    }

    @Override
    public void sitOn() {
        System.out.println("You have sitted in a Modern Chair");
    }

    @Override
    public String toString() {
        return "ClassicChair{" + "wood=" + wood + '}';
    }
}
