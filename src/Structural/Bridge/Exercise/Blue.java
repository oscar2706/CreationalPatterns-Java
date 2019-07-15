package Structural.Bridge.Exercise;

public class Blue extends Color{
    public Blue() {
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Blue{" + "color='" + color + '\'' + '}';
    }
}
