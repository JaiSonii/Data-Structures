package linkedList_1;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.Append(1);
        myLinkedList.Append(5);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("Before removing: ");
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.removeFromLast();

        System.out.println("After removing: ");
        System.out.println("\nLinked List:");
        myLinkedList.printList();

    }

}
