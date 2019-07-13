package Creational.Prototype.Clonable;

// Cloneable is a marker interface
class Address implements Cloneable {
    public String streetName;
    public int houseNumber;
    
    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }
    
    @Override
    public String toString() {
        return "Address{" + "streetName='" + streetName + '\'' + ", houseNumber=" + houseNumber + '}';
    }
    
    // base class clone() is protected
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Address(streetName, houseNumber);
    }
}
