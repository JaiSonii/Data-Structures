package DoublyLinkedList.questions.SwapPairs;

public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    // WRITE THE SWAPPAIRS METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////

    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node back = dummy;
        Node mid = back.next;
        Node front = mid.next;
        while (front != null) {
            mid.next = front.next;
            mid.prev = front;
            back.next = front;
            front.next = mid;
            front.prev = back;

            if (mid.next == null) {
                head = dummy.next;
                return;
            }

            back = mid;
            mid = mid.next;
            front = mid.next;
        }
        head = dummy.next;
    }

}
