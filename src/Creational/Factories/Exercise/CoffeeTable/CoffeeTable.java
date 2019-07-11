package Creational.Factories.Exercise.CoffeeTable;

import Creational.Factories.Exercise.Wood;

public abstract class CoffeeTable {
    protected Wood wood;
    public void putCoffee() {
        System.out.println("Puso café en la mesa");
    }
}
