package Creational.Factories.ExerciseV2.Factories;

import Creational.Factories.ExerciseV2.Chair.Chair;
import Creational.Factories.ExerciseV2.CoffeeTable.CoffeeTable;
import Creational.Factories.ExerciseV2.Sofa.Sofa;
import Creational.Factories.ExerciseV2.Wood;

public abstract class FurnitureFactory {
    protected Wood wood;
    public abstract Chair chair();
    public abstract Sofa sofa();
    public abstract CoffeeTable coffeeTable();
}
