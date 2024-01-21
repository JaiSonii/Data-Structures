package StackAndQueue.questions.SortStack;

import java.util.ArrayList;

public class Main {

    // WRITE THE SORTSTACK METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<Integer>();
        for (int i = 0; i < stack.size(); i++) {
            sortedStack.push(stack.pop());
            while (!stack.isEmpty()) {
                Integer temp = stack.pop();
                if (sortedStack.peek() > temp) {
                    stack.push(sortedStack.pop());
                    sortedStack.push(temp);
                } else {
                    sortedStack.push(temp);
                }
            }
            while (!sortedStack.isEmpty()) {
                stack.push(sortedStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * Before sorting:
         * 4
         * 1
         * 5
         * 2
         * 3
         * 
         * After sorting:
         * 1
         * 2
         * 3
         * 4
         * 5
         * 
         */

    }

}
