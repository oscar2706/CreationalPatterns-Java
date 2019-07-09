package Factories.Exercise.Factories;

import Factories.Exercise.Chair.Chair;
import Factories.Exercise.CoffeeTable.CoffeeTable;
import Factories.Exercise.Sofa.Sofa;
import Factories.Exercise.Wood;

public abstract class FurnitureFactory {
    protected Wood wood;
    public abstract Chair chair();
    public abstract Sofa sofa();
    public abstract CoffeeTable coffeeTable();
}
