package Behavioral.Iterator.Exercise;

public class Node<T> {
    public T value;
    public Node<T> next;
    
    public Node(T value) {
        this.value = value;
    }
    
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
    
    public T getValue() {
        return value;
    }
}


