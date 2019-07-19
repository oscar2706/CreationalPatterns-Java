package Structural.Composite.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Box implements Purchasable {
    private Size boxSize;
    private List<Box> boxes = new ArrayList<>();
    private List<Article> articles = new ArrayList<>();
    
    public Box(Size boxSize) {
        this.boxSize = boxSize;
    }
    
    @Override
    public int getTotal() {
        return getSubTotal(0);
    }
    
    private int getSubTotal(int acumulado) {
        int total = acumulado;
        if (boxes.isEmpty()) {
            return getArticlesTotal();
        } else {
            for (Box box : boxes) {
                total += box.getSubTotal(total);
            }
            return total + getArticlesTotal();
        }
    }
    
    public int getArticlesTotal() {
        int articlesTotal = 0;
        for (Article a : articles)
            articlesTotal += a.getTotal();
        return articlesTotal;
    }
    
    @Override
    public void delete() {
        for (Box box : boxes) {
            box.delete();
            box.boxes.clear();
            box.articles.clear();
        }
    }
    
    public void addBox(Box box) {
        boxes.add(box);
    }
    
    @Override
    public String toString() {
        return "Box{" +
                "\n\tboxSize=" + boxSize +
                ", \n\tboxes=" + boxes +
                ", \n\tarticles=" + articles +
                "\n}";
    }
    
    public void print() {
        System.out.print("Box{\n\t" + "boxSize=" + boxSize +"\n\t" +"boxes=");
        System.out.println(boxes);
        System.out.println(articles);
    }
    
    public void addArticle(Article article) {
        articles.add(article);
    }
}
