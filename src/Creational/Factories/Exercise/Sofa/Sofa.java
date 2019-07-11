package Creational.Factories.Exercise.Sofa;

import Creational.Factories.Exercise.Wood;

public abstract class Sofa {
    protected Wood wood;
    
    public void rest(){
        System.out.println("Estas descansando en el sofa");
    }
}
