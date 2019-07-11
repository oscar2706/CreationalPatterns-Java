package Creational.Factories.Exercise.CoffeeTable;

import Creational.Factories.Exercise.Wood;

public class ClassicCoffeeTable extends CoffeeTable {
    public ClassicCoffeeTable(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicCoffeeTable{" + "wood=" + wood + '}';
    }
}
