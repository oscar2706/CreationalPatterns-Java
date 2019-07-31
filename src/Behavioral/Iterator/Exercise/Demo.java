package Behavioral.Iterator.Exercise;

public class Demo {
    public static void main(String[] args) {
        Node<Person> oscar = new Node<>(new Person("Oscar", "Patricio", 21));
        Node<Person> pablo = new Node<>(new Person("Pablo", "García", 21), oscar);
        Node<Person> rootNode = new Node<>(new Person("Juan", "Perez", 18), pablo);
    
        InOrder<Person> inOrder = new InOrder<>(rootNode);
        while (inOrder.hasNext()) {
            System.out.println(inOrder.getNext().getName());
        }
    }
}
