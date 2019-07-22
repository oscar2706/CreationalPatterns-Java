package Structural.Proxy.Examples.Property;

public class Demo {
    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setProxyAgility(19);
        creature.setProxyAgility(1);
        creature.setProxyAgility(13);
        creature.setProxyAgility(8);
        creature.setProxyAgility(18);
        creature.setProxyAgility(82);
        System.out.println("Cambios realizados en proxyAgility = " + creature.changesInProxyAgility);
    }
}

