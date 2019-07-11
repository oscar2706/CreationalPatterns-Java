package Creational.Factories.ExerciseV2.CoffeeTable;

import Creational.Factories.ExerciseV2.Wood;

public abstract class CoffeeTable {
    protected Wood wood;
    public void putCoffee() {
        System.out.println("Puso café en la mesa");
    }
}
