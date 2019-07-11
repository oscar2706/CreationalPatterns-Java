package Creational.Factories.ExerciseV2;

import Creational.Factories.ExerciseV2.Chair.Chair;
import Creational.Factories.ExerciseV2.CoffeeTable.CoffeeTable;
import Creational.Factories.ExerciseV2.Factories.FurnitureFactory;
import Creational.Factories.ExerciseV2.Sofa.Sofa;

public class FurnitureMachine {
    private FurnitureFactory furnitureFactory;
    private Wood wood;
    
    public FurnitureMachine(FurnitureFactory furnitureFactory, Wood wood) {
        this.furnitureFactory = furnitureFactory;
    }
    
    public Chair chair(){
        return furnitureFactory.chair();
    }
    
    public CoffeeTable coffeTable(){
        return furnitureFactory.coffeeTable();
    }
    
    public Sofa sofa(){
        return furnitureFactory.sofa();
    }
}
