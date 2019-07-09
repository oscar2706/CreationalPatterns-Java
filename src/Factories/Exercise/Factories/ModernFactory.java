package Factories.Exercise.Factories;

import Factories.Exercise.Chair.Chair;
import Factories.Exercise.Chair.ModernChair;
import Factories.Exercise.CoffeeTable.CoffeeTable;
import Factories.Exercise.CoffeeTable.ModernCoffeeTable;
import Factories.Exercise.Sofa.ModernSofa;
import Factories.Exercise.Sofa.Sofa;
import Factories.Exercise.Wood;

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
