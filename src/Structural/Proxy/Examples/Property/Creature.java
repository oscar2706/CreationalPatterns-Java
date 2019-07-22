package Structural.Proxy.Examples.Property;

class Creature {
    private int agility;
    private Property<Integer> proxyAgility = new Property<>(0);
    public int changesInProxyAgility;
    
    public Creature() {
        changesInProxyAgility = 0;
    }
    
    public int getProxyAgility() {
        return proxyAgility.getValue();
    }
    
    public void setProxyAgility(int proxyAgility) {
        ++changesInProxyAgility;
        this.proxyAgility.setValue(proxyAgility);
    }
    
    public int getAgility() {
        return agility;
    }
    
    public void setAgility(int agility) {
        this.agility = agility;
    }
}
