package SortingALgoritms.MergeLL;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE MERGE METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////
    public void merge(LinkedList otherList) {
        Node dummy = new Node(0);
        Node curNode = dummy;
        Node i = this.head;
        Node j = otherList.head;
        while (i != null && j != null) {
            if (i.value < j.value) {
                curNode.next = i;
                curNode = curNode.next;
                i = i.next;
            } else {
                curNode.next = j;
                curNode = curNode.next;
                j = j.next;
            }
        }

        while (i != null) {
            curNode.next = i;
            i = i.next;
            curNode = curNode.next;

        }

        while (j != null) {
            curNode.next = j;
            j = j.next;
            curNode = curNode.next;
        }
        head = dummy.next;
    }

}
