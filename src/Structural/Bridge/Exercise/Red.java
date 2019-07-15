package Structural.Bridge.Exercise;

public class Red extends Color {
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Red{" + "color='" + color + '\'' + '}';
    }
}
