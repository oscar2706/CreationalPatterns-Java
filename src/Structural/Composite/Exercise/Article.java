package Structural.Composite.Exercise;

public class Article implements Purchasable {
    private int price;
    private String name;
    
    public Article(int price, String name) {
        this.price = price;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Article{" + "price=" + price + ", name='" + name + '\'' + '}';
    }
    
    @Override
    public int getTotal() {
        return price;
    }
    
    @Override
    public void delete() {
    }
}
