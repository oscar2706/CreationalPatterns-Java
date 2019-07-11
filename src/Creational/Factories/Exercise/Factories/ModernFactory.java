package Creational.Factories.Exercise.Factories;

import Creational.Factories.Exercise.Chair.Chair;
import Creational.Factories.Exercise.Chair.ModernChair;
import Creational.Factories.Exercise.CoffeeTable.CoffeeTable;
import Creational.Factories.Exercise.CoffeeTable.ModernCoffeeTable;
import Creational.Factories.Exercise.Sofa.ModernSofa;
import Creational.Factories.Exercise.Sofa.Sofa;
import Creational.Factories.Exercise.Wood;

public class ModernFactory extends FurnitureFactory {
    
    public ModernFactory() {
    }
    
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
