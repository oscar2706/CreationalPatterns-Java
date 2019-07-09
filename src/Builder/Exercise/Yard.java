package Builder.Exercise;

public class Yard {
    private int widht;
    private int height;
    private Ground kindOfGround;

    public Yard(int widht, int height, Ground kindOfGround) {
        this.widht = widht;
        this.height = height;
        this.kindOfGround = kindOfGround;
    }

    @Override
    public String toString() {
        return "Yard{" + "widht=" + widht + ", height=" + height + ", kindOfGround=" + kindOfGround + '}';
    }
}
