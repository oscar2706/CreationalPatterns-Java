package Creational.Factories.Exercise.Factories;

import Creational.Factories.Exercise.Chair.Chair;
import Creational.Factories.Exercise.CoffeeTable.CoffeeTable;
import Creational.Factories.Exercise.Sofa.Sofa;
import Creational.Factories.Exercise.Wood;

public abstract class FurnitureFactory {
    protected Wood wood;
    public abstract Chair chair();
    public abstract Sofa sofa();
    public abstract CoffeeTable coffeeTable();
}
