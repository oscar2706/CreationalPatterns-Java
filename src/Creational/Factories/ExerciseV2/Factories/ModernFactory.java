package Creational.Factories.ExerciseV2.Factories;

import Creational.Factories.ExerciseV2.Chair.Chair;
import Creational.Factories.ExerciseV2.Chair.ModernChair;
import Creational.Factories.ExerciseV2.CoffeeTable.CoffeeTable;
import Creational.Factories.ExerciseV2.CoffeeTable.ModernCoffeeTable;
import Creational.Factories.ExerciseV2.Sofa.ModernSofa;
import Creational.Factories.ExerciseV2.Sofa.Sofa;
import Creational.Factories.ExerciseV2.Wood;

public class ModernFactory extends FurnitureFactory {
    
    public ModernFactory(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public Chair chair() {
        return new ModernChair(wood);
    }
    
    @Override
    public Sofa sofa() {
        return new ModernSofa(wood);
    }
    
    @Override
    public CoffeeTable coffeeTable() {
        return new ModernCoffeeTable(wood);
    }
}
