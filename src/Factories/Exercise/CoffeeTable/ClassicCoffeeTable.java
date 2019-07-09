package Factories.Exercise.CoffeeTable;

import Factories.Exercise.Chair.Chair;
import Factories.Exercise.Wood;

public class ClassicCoffeeTable extends CoffeeTable {
    public ClassicCoffeeTable(Wood wood) {
        this.wood = wood;
    }
    
    @Override
    public String toString() {
        return "ClassicCoffeeTable{" + "wood=" + wood + '}';
    }
}
