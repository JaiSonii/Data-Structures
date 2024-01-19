package StackAndQueue.questions.ReverseString;

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////////

    public static String reverseString(String value) {
        if (value == null || value.length() <= 1)
            return value;

        Stack myStack = new Stack();
        for (int i = 0; i < value.length(); i++) {
            myStack.push(value.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (!myStack.isEmpty()) {
            result.append(myStack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * olleh
         */

    }

}
