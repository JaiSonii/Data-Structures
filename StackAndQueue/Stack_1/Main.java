package StackAndQueue.Stack_1;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.push(1);
        myStack.push(5);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);

        System.out.println("Printing Stack...");
        myStack.printStack();

        System.out.println("performing Pop");
        myStack.pop();
        System.out.println("\nPrinting After Popping an Element\n");
        myStack.printStack();

        myStack.getAll();
    }
}
