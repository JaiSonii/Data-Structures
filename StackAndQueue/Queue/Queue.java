package StackAndQueue.Queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    public void getAll() {
        System.out.println("First-Value: " + getFirst().value);
        System.out.println("Last-Value: " + getLast().value);
        System.out.println("Length: " + getLength());
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0 || getFirst() == null) {
            first = newNode;
            last = newNode;
            length = 1;
            return;
        }

        last.next = newNode;
        last = newNode;
        length++;
    }

    public Node dequeue() {
        if (length == 0 || first == null) {
            System.out.println("Empty Stack");
            return null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void print() {
        System.out.println("Printing Queue...");
        for (Node n = first; n != null; n = n.next) {
            System.out.print(n.value + "->");
        }
        System.out.println();
    }
}
