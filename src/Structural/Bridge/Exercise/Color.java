package Structural.Bridge.Exercise;

public abstract class Color {
    protected String color;
    public abstract void setColor(String color);
    public String getColor() {
        return this.color;
    }
    public abstract String toString();
}
