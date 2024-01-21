package StackAndQueue.questions.ParanthesisBalanced;

public class Main {

    // WRITE THE ISBALANCEDPARENTHESES METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////////////////
    public static boolean isBalancedParentheses(String paranthesis) {
        Stack<String> checker = new Stack<String>();
        for (int i = 0; i < paranthesis.length(); i++) {
            if (paranthesis.charAt(i) == '(') {
                checker.push("(");
            } else {
                if (!checker.isEmpty()) {
                    checker.pop();
                } else {
                    return false;
                }
            }
        }
        if (checker.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

}
