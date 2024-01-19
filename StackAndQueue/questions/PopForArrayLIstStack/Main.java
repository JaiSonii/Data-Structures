package StackAndQueue.questions.PopForArrayLIstStack;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        myStack.pop();
        myStack.printStack();

        /*
         * EXPECTED OUTPUT:
         * 2
         * 1
         * 
         */

    }

}
