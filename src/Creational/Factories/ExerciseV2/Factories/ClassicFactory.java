package Creational.Factories.ExerciseV2.Factories;

import Creational.Factories.ExerciseV2.Chair.Chair;
import Creational.Factories.ExerciseV2.Chair.ClassicChair;
import Creational.Factories.ExerciseV2.CoffeeTable.ClassicCoffeeTable;
import Creational.Factories.ExerciseV2.CoffeeTable.CoffeeTable;
import Creational.Factories.ExerciseV2.Sofa.ClassicSofa;
import Creational.Factories.ExerciseV2.Sofa.Sofa;
import Creational.Factories.ExerciseV2.Wood;

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
