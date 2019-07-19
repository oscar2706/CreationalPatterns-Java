package Structural.Composite.Exercise;

import static Structural.Composite.Exercise.Size.*;

public class Demo {
    public static void main(String[] args) {
        final Box mainBox = new Box(LARGE);
        mainBox.addArticle(new Article(100, "Tenis Adidas"));
        mainBox.addArticle(new Article(500, "Tenis Nike"));
        mainBox.addArticle(new Article(10, "Tenis Rayo"));
        final Box mediumBox = new Box(MEDIUM);
        mediumBox.addArticle(new Article(50,"Juguete1"));
        mediumBox.addArticle(new Article(10,"Juguete2"));
        mediumBox.addArticle(new Article(230,"Juguete3"));
        final Box smallBox = new Box(SMALL);
        smallBox.addArticle(new Article(10,"Chicle1"));
        smallBox.addArticle(new Article(10,"Chicle2"));
        smallBox.addArticle(new Article(10,"Chicle3"));
        final Box extraSmallBox = new Box(EXTRA_SMALL);
        extraSmallBox.addArticle(new Article(30, "Paleta1"));
        extraSmallBox.addArticle(new Article(30, "Paleta2"));
        extraSmallBox.addArticle(new Article(30, "Paleta3"));
        System.out.println("");
        
        mainBox.addBox(mediumBox);
        mediumBox.addBox(smallBox);
        smallBox.addBox(extraSmallBox);
        
        //System.out.println(mainBox);
        mainBox.print();
        System.out.println("total = " + mainBox.getTotal());
        System.out.println("total = " + mediumBox.getTotal());
        System.out.println("total = " + smallBox.getTotal());
    }
}
