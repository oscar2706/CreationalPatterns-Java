package Builder.Exercise;

import java.util.List;

public class House {
    private List<Wall> walls;
    private List<Pool> pools;
    private List<Yard> yards;

    public House() {
    }

    public House(List<Wall> walls, List<Pool> pools, List<Yard> yards) {
        this.walls = walls;
        this.pools = pools;
        this.yards = yards;
    }

    @Override
    public String toString() {
        return "House{\n" + "\tWalls=" + walls + ",\n \tPools=" + pools + ",\n \tYards=" + yards + "\n}";
    }
}
