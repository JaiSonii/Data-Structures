package SortingALgoritms.BasicSorts.questions.SelectionSort;

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

    // WRITE SELECTIONSORT METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////
    public void selectionSort() {
        if (this.length < 2) {
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            Node minNode = curNode;
            for (Node tempNode = curNode; tempNode != null; tempNode = tempNode.next) {
                if (minNode.value > tempNode.value) {
                    minNode = tempNode;
                }
            }
            int tempVal = curNode.value;
            curNode.value = minNode.value;
            minNode.value = tempVal;
            curNode = curNode.next;
        }
    }

}
