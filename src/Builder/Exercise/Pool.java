package Builder.Exercise;

public class Pool {
    private int width;
    private int height;

    public Pool(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pool{" + "width=" + width + ", height=" + height + '}';
    }
}
