package DoublyLinkedList.DLL_1;

import java.util.Scanner;

public class DLL {
    private Node head;
    private Node tail;
    private int length;

    Scanner sc = new Scanner(System.in);

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void getAll() {
        System.out.println("Head: " + getHead().value);
        System.out.println("Tail: " + getTail().value);
        System.out.println("Length: " + getLength());
    }

    public DLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        Node temp = getTail();
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        Node temp = getHead();
        newNode.next = temp;
        temp.prev = newNode;
        head = newNode;
        length++;
    }

    public void printList() {
        Node temp = head;
        System.out.println();
        while (temp.next != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print(temp.value);
        System.out.println();
    }

    public void removeFromFirst() {
        if (head == tail || length == 1) {
            head = tail = null;
            length = 0;
            return;
        }
        Node temp = getHead().next;
        temp.prev = null;
        head = temp;
        length--;
    }

    public void removeFromLast() {
        if (head == tail || length == 1) {
            head = tail = null;
            length = 0;
            return;
        }
        Node temp = getTail().prev;
        temp.next = null;
        tail = temp;
        length--;
    }

    public Node get(int index) {
        if (index >= length || index < 0)
            return null;
        Node temp = head;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        if (index >= length || index < 0) {
            System.out.println("Invalid Index");
            return false;
        }
        Node temp = get(index);
        temp.value = value;
        return true;
    }

    public void insert(int index, int value) {
        if (index >= length || index < 0) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == length - 1) {
            append(value);
            return;
        }
        Node newNode = new Node(value);
        Node pre = get(index - 1);
        Node current = pre.next;
        newNode.next = current;
        pre.next = newNode;
        newNode.prev = pre;
        current.prev = newNode;
        length++;
    }

    public void remove() {
        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        if (index >= length || index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            removeFromFirst();
            return;
        }
        if (index == length - 1) {
            removeFromLast();
            return;
        }

        Node front = get(index + 1);
        Node back = get(index - 1);

        back.next = front;
        front.prev = back;
        length--;

    }

}
