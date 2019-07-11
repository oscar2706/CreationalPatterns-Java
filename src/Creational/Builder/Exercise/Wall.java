package Creational.Builder.Exercise;

public class Wall {
    private int height;
    private int widht;

    public Wall(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

    @Override
    public String toString() {
        return "Wall{" + "height=" + height + ", widht=" + widht + '}';
    }
}
