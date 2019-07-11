package Creational.Factories.ExerciseV2.CoffeeTable;

import Creational.Factories.ExerciseV2.Wood;

public class ClassicCoffeeTable extends CoffeeTable {
    public ClassicCoffeeTable(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicCoffeeTable{" + "wood=" + wood + '}';
    }
}
