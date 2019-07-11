package Creational.Factories.Exercise;

import Creational.Factories.Exercise.Chair.Chair;
import Creational.Factories.Exercise.CoffeeTable.CoffeeTable;
import Creational.Factories.Exercise.Factories.FurnitureFactory;
import Creational.Factories.Exercise.Sofa.Sofa;

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
