package Structural.Proxy.Examples.Property;

class Property<T> {
    private T value;
    
    public Property(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return (T) value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}
