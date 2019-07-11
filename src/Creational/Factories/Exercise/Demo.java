package Creational.Factories.Exercise;

import Creational.Factories.Exercise.Chair.Chair;
import Creational.Factories.Exercise.CoffeeTable.CoffeeTable;
import Creational.Factories.Exercise.Factories.ClassicFactory;
import Creational.Factories.Exercise.Factories.ModernFactory;
import Creational.Factories.Exercise.Sofa.Sofa;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Working with concrete factories");
        final ClassicFactory classicFactory = new ClassicFactory(Wood.OAK);
        Chair classicChair = classicFactory.chair();
        CoffeeTable classicCoffeeTable = classicFactory.coffeeTable();
        Sofa classicSofa = classicFactory.sofa();
        
        final ModernFactory modernFactory = new ModernFactory(Wood.MAPLE);
        Chair modernChair = modernFactory.chair();
        CoffeeTable modernCoffeeTable = modernFactory.coffeeTable();
        Sofa modernSofa = modernFactory.sofa();
        
        System.out.println(modernChair);
        System.out.println(modernCoffeeTable);
        System.out.println(modernSofa);
        System.out.println(classicChair);
        System.out.println(classicCoffeeTable);
        System.out.println(classicSofa);
        System.out.println();
        
        
        System.out.println("Working with object FurnitureMachine");
        FurnitureMachine furnitureMachine = new FurnitureMachine(new ClassicFactory(), Wood.OAK);
        Chair machineChair = furnitureMachine.chair();
        furnitureMachine.setWood(Wood.MAPLE);
        Sofa machineSofa = furnitureMachine.sofa();
        furnitureMachine.setWood(Wood.MAHOGANY);
        CoffeeTable machineCoffeeTable = furnitureMachine.coffeTable();
    
        furnitureMachine = new FurnitureMachine(new ModernFactory(), Wood.WALNUT);
        Chair machineChair2 = furnitureMachine.chair();
        furnitureMachine.setWood(Wood.BEECH);
        Sofa machineSofa2 = furnitureMachine.sofa();
        furnitureMachine.setWood(Wood.FIBREBOARD);
        CoffeeTable machineCoffeeTable2 = furnitureMachine.coffeTable();
        
        System.out.println(machineChair);
        System.out.println(machineSofa);
        System.out.println(machineCoffeeTable);
        System.out.println(machineChair2);
        System.out.println(machineSofa2);
        System.out.println(machineCoffeeTable2);
    }
}
