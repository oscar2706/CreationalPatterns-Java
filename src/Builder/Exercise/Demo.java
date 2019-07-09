package Builder.Exercise;

public class Demo {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.addWall(4, 5);
        houseBuilder.addWall(10, 10);
        houseBuilder.addWall(10, 10);
        houseBuilder.addWall(10, 10);

        houseBuilder.addPool(1, 1);
        houseBuilder.addYard(10, 10, Ground.PAVEMENT);
        House house = houseBuilder.getHouse();
        System.out.println(house);
    }
}
