package linkedList_1;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length = 0;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length += 1;

    }

    // Append Method

    public void Append(int value) {
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

    // Remove from Last
    public Node removeFromLast() {
        if (length == 0) {
            System.out.println("Linked List is Empty");
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            length--;
        }
        length++;
        return head;
    }

    // Append
    public Node prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }

    // remove from first
    public Node removeFromFirst() {
        if (length == 0) {
            System.out.println("Linked List is already empty");
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
        } else {
            Node temp = head;
            head = temp.next;
            temp.next = null;
        }
        length--;
        return head;
    }

    // Get Method
    public Node get(int index) {
        if (index < 0) {
            return null;
        } else if (index > length) {
            return null;
        } else {
            Node temp = head;
            int i = 0;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            return temp;
        }
    }

    // Set Method

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            System.out.println("Invalid Index");
            return false;
        } else {
            Node temp = head;
            int i = 0;
            while (i != index) {
                temp = temp.next;
                i++;
            }
            temp.value = value;
            printList();
            return true;
        }

    }

    // Insert method

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            length++;
            return true;
        }
        if (index == length) {
            Append(value);
            length++;
            return true;
        } else {
            Node newNode = new Node(value);
            Node temp = head;
            int i = 0;
            while (i < index - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Inserted: ");
            printList();
            length++;
            return true;
        }
    }

    // remove

    public boolean remove(int index) {
        if (index < 0 || index >= length)
            return false;
        if (index == 0) {
            removeFromFirst();
            return true;
        }
        if (index == length - 1) {
            removeFromLast();
            return true;
        } else {
            Node temp = head;
            Node prev = temp;
            int i = 0;
            while (i < index) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
            temp.next = null;
            length--;
            System.out.println("Removed");
            printList();
            return true;
        }
    }

    // reverse

    public Node reverse() {
        int iter = length / 2;
        for (int i = 0; i < iter; i++) {
            Node tempHead = get(i);
            Node tempTail = get(length - i - 1);
            int tempVal = tempHead.value;
            tempHead.value = tempTail.value;
            tempTail.value = tempVal;
        }
        System.out.println("Reversed List: ");
        printList();
        return head;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
