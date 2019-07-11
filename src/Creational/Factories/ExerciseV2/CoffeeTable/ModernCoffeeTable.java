package Creational.Factories.ExerciseV2.CoffeeTable;

import Creational.Factories.ExerciseV2.Wood;

public class ModernCoffeeTable extends CoffeeTable {
    
    public ModernCoffeeTable(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ModernCoffeeTable{" + "wood=" + wood + '}';
    }
}