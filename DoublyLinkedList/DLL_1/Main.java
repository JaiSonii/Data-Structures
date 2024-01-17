package DoublyLinkedList.DLL_1;

public class Main {
    public static void main(String[] args) {
        DLL myDLL = new DLL(1);

        myDLL.append(4);
        myDLL.append(5);

        myDLL.prepend(7);
        myDLL.append(8);
        myDLL.getAll();
        myDLL.printList();

        // System.out.println('Remove from First: ');
        // myDLL.removeFromFirst();

        // System.out.println("Remove from last: ");
        // myDLL.removeFromLast();
        // myDLL.getAll();
        // myDLL.printList();

        // System.out.println("Value at index 3: " + myDLL.get(3).value);
        // System.out.println("Set value at index 3 as 9");
        // myDLL.set(3, 9);
        // myDLL.printList();

        System.out.println("Insert at index 2: ");
        myDLL.insert(2, 6);
        myDLL.printList();

        myDLL.remove();
        myDLL.printList();
        myDLL.getAll();

    }
}
