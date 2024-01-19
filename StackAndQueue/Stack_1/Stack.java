package StackAndQueue.Stack_1;

public class Stack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void push(int value) {
        if (top == null || height == 0)
            new Stack(value);
        else {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public int getHeight() {
        return height;
    }

    public Node getTop() {
        return top;
    }

    public void getAll() {
        System.out.println("Height: " + getHeight());
        System.out.println("Top value: " + getTop().value);
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node pop() {
        if (top == null || height == 0) {
            System.out.println("No elements in stack to pop");
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
