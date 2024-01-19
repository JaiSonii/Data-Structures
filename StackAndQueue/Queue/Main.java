package StackAndQueue.Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.getAll();

        // myQueue.enqueue(4);
        // myQueue.enqueue(7);
        // myQueue.enqueue(6);
        // myQueue.enqueue(9);
        // myQueue.enqueue(1);

        myQueue.print();

        System.out.println("Dequeueing: ");
        System.out.println(myQueue.dequeue());

        System.out.println("Enqueue: ");
        myQueue.enqueue(7);

        myQueue.print();
        myQueue.getAll();

    }
}
