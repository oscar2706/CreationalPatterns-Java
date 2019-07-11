package Creational.Factories.ExerciseV2.Sofa;

import Creational.Factories.ExerciseV2.Wood;

public abstract class Sofa {
    protected Wood wood;
    
    public void rest(){
        System.out.println("Estas descansando en el sofa");
    }
}
