package linkedList_1;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        // for (int i = 1; i <= 5; i++) {
        // myLinkedList.Append(i);
        // }
        // myLinkedList.removeFromFirst();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // System.out.println("Before removing: ");
        System.out.println("\nLinked List:");
        myLinkedList.printList();

        // myLinkedList.insert(4, 91);

        // myLinkedList.remove(3);

        myLinkedList.reverse();

        // System.out.println("Node from index 3");
        // System.out.println(myLinkedList.get(3).value);

        // System.out.println("Node from index -1");
        // System.out.println(myLinkedList.get(-1));

        // System.out.println("Node from index 7");
        // System.out.println(myLinkedList.get(7));

        // System.out.println("Set Method: ");
        // myLinkedList.set(-1, 4);
        // myLinkedList.set(9, 0);
        // myLinkedList.set(4, 0);

        // System.out.println("Prepend :");
        // myLinkedList.prepend(12);
        // System.out.println("After removing: ");
        // System.out.println("\nLinked List:");
        // myLinkedList.removeFromLast();
        // myLinkedList.printList();
        // myLinkedList.removeFromFirst();
        // System.out.println("\nLinked List after remove from first:");
        // myLinkedList.printList();
        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();

    }

}
