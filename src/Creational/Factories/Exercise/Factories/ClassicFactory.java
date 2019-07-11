package Creational.Factories.Exercise.Factories;

import Creational.Factories.Exercise.Chair.Chair;
import Creational.Factories.Exercise.Chair.ClassicChair;
import Creational.Factories.Exercise.CoffeeTable.ClassicCoffeeTable;
import Creational.Factories.Exercise.CoffeeTable.CoffeeTable;
import Creational.Factories.Exercise.Sofa.ClassicSofa;
import Creational.Factories.Exercise.Sofa.Sofa;
import Creational.Factories.Exercise.Wood;

public class ClassicFactory extends FurnitureFactory {
    
    public ClassicFactory() {
    }
    
    public ClassicFactory(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public Chair chair() {
        return new ClassicChair(wood);
    }
    
    @Override
    public Sofa sofa() {
        return new ClassicSofa(wood);
    }
    
    @Override
    public CoffeeTable coffeeTable() {
        return new ClassicCoffeeTable(wood);
    }
}
