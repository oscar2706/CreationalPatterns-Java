package Behavioral.Iterator.Exercise;

public interface Iterator<T> {
    boolean hasNext();
    T getNext();
    void reset();
}
