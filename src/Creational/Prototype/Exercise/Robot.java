package Creational.Prototype.Exercise;

public class Robot implements Prototype {
    private String color;
    
    public Robot(String color, Head head, Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg) {
        this.color = color;
        this.head = head;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
    }
    
    public Robot(Robot originRobot) {
        color = originRobot.color;
        head = (Head) originRobot.head.clone();
        leftArm = (Arm) originRobot.leftArm.clone();
        rightArm = (Arm) originRobot.rightArm.clone();
        leftLeg = (Leg) originRobot.leftLeg.clone();
        rightLeg = (Leg) originRobot.rightLeg.clone();
    }
    
    public Head head;
    public Arm leftArm;
    public Arm rightArm;
    public Leg leftLeg;
    public Leg rightLeg;
    
    @Override
    public String toString() {
        return "Robot{" + "color='" + color + '\'' + ", head=" + head + ", leftArm=" + leftArm + ", rightArm=" + rightArm + ", leftLeg=" + leftLeg + ", rightLeg=" + rightLeg + '}';
    }
    
    @Override
    public Prototype clone() {
        return new Robot(this);
    }
}
