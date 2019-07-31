package Behavioral.Iterator.Exercise;

public class InOrder<T> implements Iterator<T> {
    private Node<T> current, root;
    
    public InOrder(Node<T> root) {
        this.root = root;
    }
    
    @Override
    public boolean hasNext() {
        if (current == null && root != null)
            return true;
        else
            return current.next != null ? true : false;
    }
    
    @Override
    public T getNext() {
        if (current == null) {
            current = root;
        } else {
            current = current.next;
        }
        return current.value;
    }
    
    @Override
    public void reset() {
    
    }
}
