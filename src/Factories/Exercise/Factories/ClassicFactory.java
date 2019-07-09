package Factories.Exercise.Factories;

import Factories.Exercise.Chair.Chair;
import Factories.Exercise.Chair.ClassicChair;
import Factories.Exercise.CoffeeTable.ClassicCoffeeTable;
import Factories.Exercise.CoffeeTable.CoffeeTable;
import Factories.Exercise.Sofa.ClassicSofa;
import Factories.Exercise.Sofa.Sofa;
import Factories.Exercise.Wood;

public class ClassicFactory extends FurnitureFactory {
    private Wood wood;
    
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
