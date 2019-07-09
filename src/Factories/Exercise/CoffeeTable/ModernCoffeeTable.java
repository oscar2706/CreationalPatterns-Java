package Factories.Exercise.CoffeeTable;

import Factories.Exercise.Wood;

public class ModernCoffeeTable extends CoffeeTable {
    
    public ModernCoffeeTable(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ModernCoffeeTable{" + "wood=" + wood + '}';
    }
}