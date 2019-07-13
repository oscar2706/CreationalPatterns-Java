package Creational.Prototype.Exercise;

public class Demo {
    public static void main(String[] args) {
        final Head head = new Head("White", "Cuadrada");
        final Arm leftArm = new Arm(30, "Black");
        final Arm rightArm = new Arm(30, "Black");
        final Leg leftLeg = new Leg("Orange", 50);
        final Leg rightLeg = new Leg("Orange", 50);
        
        final Robot robot = new Robot("Azul", head, leftArm, rightArm, leftLeg, rightLeg);
        final Robot robot1 = (Robot) robot.clone();
        
        robot1.rightArm.length = 10;
        robot1.leftArm.length = 12;
        
        System.out.println(robot);
        System.out.println(robot1);
    }
}
