package Builder.Exercise;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private List<Wall> walls = new ArrayList<Wall>();
    private List<Pool> pools = new ArrayList<Pool>();
    private List<Yard> yards = new ArrayList<Yard>();

    public void addWall(int width, int height) {
        this.walls.add(new Wall(10, 15));
    }

    public void addPool(int width, int height) {
        this.pools.add(new Pool(width, height));
    }

    public void addYard(int width, int height, Ground ground) {
        this.yards.add(new Yard(width, height, ground));
    }

    public House getHouse() {
        return new House(walls, pools, yards);
    }
}
